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
 * //TODO: namen einfügen ._.
 * @version (eine Versionsnummer oder ein Datum)
 * //TODO: Versionsnummer einfügen ._.
 */
public class GUI implements ActionListener
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JFrame frame = new JFrame("Verflixte Sieben");
    private JPanel panel1 = new JPanel(new GridBagLayout());
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel(new GridBagLayout());
    private GridBagConstraints c = new GridBagConstraints();
    
    private JButton hochzaehlen1=new JButton("+10");
    private JButton runterzaehlen1=new JButton("-10");
    private JButton hochzaehlen2=new JButton("+10");
    private JButton runterzaehlen2=new JButton("-10");
    private JTextField namenEingabe1 = new JTextField(8);
    private JTextField namenEingabe2 = new JTextField(8);
    
    private JLabel einsatz1= new JLabel("0");
    private JLabel einsatz2= new JLabel("0");
    private JLabel punkteAnzahl1=new JLabel("0");
    private JLabel punkteAnzahl2= new JLabel("0");
    private JLabel bild=new JLabel("nichts");
    

    private JButton start = new JButton("Würfeln");
    
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
        frame.setTitle("Rechner");
        frame.setSize(1000, 800);
        frame.add(panel2,BorderLayout.PAGE_END);
        frame.add(panel1,BorderLayout.LINE_START);
        frame.add(panel3,BorderLayout.LINE_END);

        frame.add(panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.gridx=0;
        c.gridy=0;
        panel1.add(namenEingabe1, c);
        c.gridx=0;
        c.gridy=2;
        panel1.add(einsatz1,c);
        c.gridx=0;
        c.gridy=2;
        panel1.add(hochzaehlen1);
        c.gridx=0;
        c.gridy=2;
        panel1.add(runterzaehlen1);
        
        panel2.add(start,c);
        
        c.gridx=0;
        c.gridy=0;
        panel3.add(namenEingabe2, c);
        c.gridx=0;
        c.gridy=2;
        panel3.add(einsatz2,c);
        c.gridx=1;
        c.gridy=2;
        panel3.add(hochzaehlen2);
        c.gridx=2;
        c.gridy=2;
        panel3.add(runterzaehlen2);
        
        
        
        
        frame.setBackground(Color.white);
        start.addActionListener((e) -> {System.out.println(e.toString());});
        hochzaehlen1.addActionListener(this);
        runterzaehlen1.addActionListener(this);
        hochzaehlen2.addActionListener(this);
        runterzaehlen2.addActionListener(this);
    }
    public void bilder(){
        try {
            BufferedImage myPicture=ImageIO.read(new File("würfeleins.png"));
            JLabel picLabel=new JLabel(new ImageIcon(myPicture));
            picturePanel.add(picLabel);
        }
        catch(Exception e){
            
        }
    }
    public void actionPerformed(ActionEvent a){
         if (a.getSource()==this.hochzaehlen1){
            einsatzDesErstenSpielers=einsatzDesErstenSpielers+10 ;
            einsatz1.setText((""+einsatzDesErstenSpielers));
        }
         else if (a.getSource()==this.runterzaehlen1){
            einsatzDesErstenSpielers=einsatzDesErstenSpielers-10 ;
            einsatz1.setText((""+einsatzDesErstenSpielers));
        }
        else if (a.getSource()==this.hochzaehlen2){
            einsatzDesZweitenSpielers=einsatzDesZweitenSpielers+10 ;
            einsatz2.setText((""+einsatzDesZweitenSpielers));
        }
         else if (a.getSource()==this.runterzaehlen2){
            einsatzDesZweitenSpielers=einsatzDesZweitenSpielers-10 ;
            einsatz2.setText((""+einsatzDesZweitenSpielers));
        }
    }
    /**
     * //TODO: coole Lambda-Ausdrücke (._.)
     * Ich habe gehört, du brauchst action listener? Imagine
     * 
     * ein Lambda-Ausdruck macht es deutlich einfacher, ActionEvents zu binden:
     * start.addActionListener((e) -> {
     *      //hier deinen Code einfügen, e ist ein ActionEvent
     *      //Testweise das Event ausgeben
     *      System.out.println(e.toString());
     * });
     */

}
