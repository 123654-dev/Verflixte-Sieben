import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

/**
 * Beschreiben Sie hier die Klasse GUI.
 * 
 * @author (Kevin)
 *         //TODO: namen einfügen ._.
 * @version (eine Versionsnummer oder ein Datum)
 *          //TODO: Versionsnummer einfügen ._.
 */
public class GUI implements ActionListener {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JFrame frame = new JFrame("Verflixte Sieben");
    private JPanel panel1 = new JPanel(new GridBagLayout());
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel(new GridBagLayout());
    private JPanel panel4 = new JPanel();
    private GridBagConstraints c = new GridBagConstraints();

    private JSpinner spinner1 = new JSpinner();

    private JTextField namenEingabe1 = new JTextField(8);
    private JTextField namenEingabe2 = new JTextField(8);

    private JLabel einsatz1 = new JLabel("0");
    private JLabel punkteAnzahl1 = new JLabel("0");
    private JLabel punkteAnzahl2 = new JLabel("0");
    private JLabel bild = new JLabel("nichts");
    private JLabel name1 = new JLabel("NAME");
    private JLabel name2 = new JLabel("NAME");
    private JLabel punkte1 = new JLabel("Punktzahl");
    private JLabel punkte2 = new JLabel("Punktzahl");

    private JButton start = new JButton("Wuerfeln");
    private JButton fertig = new JButton("Fertig");
    private JButton stop = new JButton("Stop");
    private JLabel wurf = new JLabel("");

    private Spielmanager manager;
    private Wuerfel wuerfel;

    private JPanel picturePanel;

    private int einsatzDesErstenSpielers = 0;
    private int einsatzDesZweitenSpielers = 0;

    /**
     * Konstruktor für Objekte der Klasse GUI
     */
    public GUI() {
        frame.setVisible(true);
        frame.setTitle("VerflixteSieben");
        frame.setSize(400, 200);
        frame.add(panel2, BorderLayout.PAGE_END);
        frame.add(panel1, BorderLayout.LINE_START);
        frame.add(panel3, BorderLayout.LINE_END);
        frame.add(panel4, BorderLayout.PAGE_START);

        frame.add(panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.gridx = 0;
        c.gridy = 0;
        panel1.add(name1, c);
        c.gridx = 1;
        c.gridy = 0;
        panel1.add(namenEingabe1, c);
        c.gridx = 0;
        c.gridy = 1;
        panel1.add(einsatz1, c);
        c.gridx = 1;
        c.gridy = 1;
        panel1.add(spinner1, c);
        c.gridx = 1;
        c.gridy = 2;
        panel1.add(punkteAnzahl1, c);
        c.gridx = 0;
        c.gridy = 2;
        panel1.add(punkte1, c);
        panel1.setBackground(new Color(105, 105, 105));

        panel2.add(start);
        panel2.add(fertig);
        panel2.add(stop);

        panel2.setBackground(new Color(105, 105, 105));

        c.gridx = 0;
        c.gridy = 0;
        panel3.add(name2, c);
        c.gridx = 1;
        c.gridy = 0;
        panel3.add(namenEingabe2, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridx = 1;
        c.gridy = 1;
        c.gridx = 1;
        c.gridy = 2;
        panel3.add(punkteAnzahl2, c);
        c.gridx = 0;
        c.gridy = 2;
        panel3.add(punkte2, c);
        panel3.setBackground(new Color(105, 105, 105));

        panel4.setBackground(new Color(105, 105, 105));

        Font fontABC = new Font("Linux Libertine G", Font.PLAIN, 15);
        name1.setFont(fontABC);
        name1.setForeground(Color.white);

        name2.setFont(fontABC);
        name2.setForeground(Color.white);
        punkteAnzahl1.setFont(fontABC);
        punkteAnzahl1.setForeground(Color.white);
        punkteAnzahl2.setFont(fontABC);
        punkteAnzahl2.setForeground(Color.white);

        punkteAnzahl1.setFont(fontABC);
        punkteAnzahl1.setForeground(Color.white);
        punkteAnzahl2.setFont(fontABC);
        punkteAnzahl2.setForeground(Color.white);
        einsatz1.setFont(fontABC);
        einsatz1.setForeground(Color.white);
        start.setFont(fontABC);
        start.setForeground(Color.white);
        start.setBackground(new Color(105, 105, 105));
        fertig.setFont(fontABC);
        fertig.setForeground(Color.white);
        fertig.setBackground(new Color(105, 105, 105));
        stop.setFont(fontABC);
        stop.setForeground(Color.white);
        stop.setBackground(new Color(105, 105, 105));

        frame.setBackground(Color.white);
        /*
         * try {
         * Image img = ImageIO.read(new File("wuerfel.png"));
         * wuerfel.setIcon(new ImageIcon(img));
         * } catch(Exception e) {
         * wuerfel.setText("Wuerfeln");
         * }
         */
        start.addActionListener((e) -> {
            Spielmanager.wuerfelCallback();
        });
        fertig.addActionListener(this);
        start.addActionListener(this);
        stop.addActionListener(this);
    }

    public void refresh() {
        punkteAnzahl1.setText("" + Spielmanager.getPunkte1());
        punkteAnzahl2.setText("" + Spielmanager.getPunkte2());
        frame.repaint();
    }

    public void actionPerformed(ActionEvent a) {
        String erstePerson = namenEingabe1.getText();
        String zweitePerson = namenEingabe2.getText();
        try {
            spinner1.commitEdit();
        } catch (java.text.ParseException e) {
        }
        int value1 = (Integer) spinner1.getValue();

        name1.setText(("" + erstePerson));
        name2.setText(("" + zweitePerson));

        if (a.getSource() == this.start) {
            if (value1 <= 0) {
                einsatz1.setText(("ERROR"));
            } else {
                // Spielmanager.wuerfel();
            }

        } else if (a.getSource() == this.fertig) {
            if (value1 <= 0 || value1 > Spielmanager.getEinstellungen().getStartguthaben()) {
                Spielmanager.gui.showAlert("Ungültiger Einsatz. Bitte geben Sie einen gültigen Einsatz zwischen 0 und "
                        + Spielmanager.getEinstellungen().getStartguthaben() + " ein.");
                return;
            }
            einsatz1.setText(("ERROR"));
            Spielmanager.setNamen(erstePerson, zweitePerson);
            name1.setText(("" + erstePerson));
            name2.setText(("" + zweitePerson));

            Spielmanager.einsatzCallback(value1);
            einsatz1.setText(("" + value1));

        } else if (a.getSource() == this.stop) {
            Spielmanager.rundeAbschliessen();
        }
    }

    public void showAlert(String text) {
        JOptionPane.showMessageDialog(frame, text);
    }

}
