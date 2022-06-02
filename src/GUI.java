package src;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Beschreiben Sie hier die Klasse GUI.
 * 
 * @author (Ihr Name)
 * //TODO: namen einfügen ._.
 * @version (eine Versionsnummer oder ein Datum)
 * //TODO: Versionsnummer einfügen ._.
 */
public class GUI
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JFrame frame = new JFrame("Verflixte Sieben");
    private JPanel panel = new JPanel(new GridBagLayout());
    private JPanel panelBild = new JPanel();
    private GridBagConstraints c = new GridBagConstraints();

    private JTextField einsatzEingabe1 = new JTextField(8);
    private JTextField einsatzEingabe2 = new JTextField(8);
    private JTextField namenEingabe1 = new JTextField(8);
    private JTextField namenEingabe2 = new JTextField(8);
    
    private JLabel einsatz1= new JLabel();
    private JLabel einsatz2= new JLabel();
    private JLabel punkteAnzahl1=new JLabel("0");
    private JLabel punkteAnzahl2= new JLabel("0");
    

    private JButton start = new JButton("Würfeln");
    
    //private Spielmanager manager;
    private Wuerfel wuerfel;
    
    

    /**
     * Konstruktor für Objekte der Klasse GUI
     */
    public GUI() {
        frame.setVisible(true);
        frame.setTitle("Rechner");
        frame.setSize(1000, 800);

        frame.add(panel);

        panel.add(einsatzEingabe1, c);
        panel.add(einsatzEingabe2, c);
        panel.add(namenEingabe1, c);
        panel.add(namenEingabe2, c);
        panel.add(einsatz1,c);
        panel.add(einsatz2,c);
        panel.add(start,c);
        
        frame.setBackground(Color.white);
        start.addActionListener((e) -> {System.out.println(e.toString());});
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
