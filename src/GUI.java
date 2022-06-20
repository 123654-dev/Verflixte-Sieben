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
    private JPanel panel4 = new JPanel();
    private GridBagConstraints c = new GridBagConstraints();
    
    private JSpinner spinner1= new JSpinner();
    private JSpinner spinner2= new JSpinner();
    
    private JTextField namenEingabe1 = new JTextField(8);
    private JTextField namenEingabe2 = new JTextField(8);
    
    private JLabel einsatz1= new JLabel("0");
    private JLabel einsatz2= new JLabel("0");
    private JLabel punkteAnzahl1=new JLabel("0");
    private JLabel punkteAnzahl2= new JLabel("0");
    private JLabel bild=new JLabel("nichts");
    private JLabel name1=new JLabel("NAME");
    private JLabel name2=new JLabel("NAME");
    

    private JButton start = new JButton("Würfeln");
    private JButton fertig= new JButton("Fertig");
    private JLabel wurf= new JLabel("");
    
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
        frame.add(panel4,BorderLayout.PAGE_START);

        frame.add(panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.gridx=0;
        c.gridy=0;
        panel1.add(namenEingabe1, c);
        c.gridx=0;
        c.gridy=2;
        panel1.add(einsatz1,c);
        panel1.add(spinner1);
        panel1.add(name1);
        
        panel2.add(start,c);
        panel2.add(fertig);
        
        c.gridx=0;
        c.gridy=0;
        panel3.add(namenEingabe2, c);
        c.gridx=0;
        c.gridy=2;
        panel3.add(einsatz2,c);
        c.gridx=1;
        c.gridy=2;
        panel3.add(spinner2);
        panel3.add(name2);
        
        
        
        
        
        frame.setBackground(Color.white);
        start.addActionListener((e) -> {System.out.println(e.toString());});
        fertig.addActionListener(this);
        start.addActionListener(this);
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
        String erstePerson= namenEingabe1.getText();
        String zweitePerson= namenEingabe2.getText();
                try {
        spinner1.commitEdit();
        } catch ( java.text.ParseException e ) {  }
        int value1 = (Integer) spinner1.getValue();
                try {
        spinner2.commitEdit();
        } catch ( java.text.ParseException e ) {  }
        int value2 = (Integer) spinner2.getValue();
        
        name1.setText((""+erstePerson));
        name2.setText((""+zweitePerson));
        
        if (a.getSource()==this.start){
            
            wurf.setText((""+einsatzDesErstenSpielers));
        }
        else if (a.getSource()==this.fertig){
            name1.setText((""+erstePerson));
            name2.setText((""+zweitePerson));
            einsatz1.setText((""+value1));
            einsatz2.setText((""+value2));
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
