package src;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Beschreiben Sie hier die Klasse GUI.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GUI //implements ActionListener
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JFrame frame= new JFrame("Verflixte Sieben");
    private JPanel panel= new JPanel(new GridBagLayout());
    private JPanel panelBild= new JPanel();
    private GridBagConstraints c = new GridBagConstraints();
    
    private JTextField einsatz1= new JTextField(8);
    private JTextField einsatz2= new JTextField(8);
    private JTextField namenEingabe1= new JTextField(8);
    private JTextField namenEingabe2= new JTextField(8); 
    
    private JButton start= new JButton("Würfeln");
    
    
    

    
    
    
    
    /**
     * Konstruktor für Objekte der Klasse GUI
     */
    public GUI()
    {
        frame.setVisible(true);
        frame.setTitle("Rechner");
        frame.setSize(1000,800);
        
        frame.add(panel);
        
        panel.add(einsatz1,c);
        panel.add(einsatz2,c);
        panel.add( namenEingabe1,c);
        panel.add(namenEingabe2,c);
        frame .setBackground(Color.white);
        
    }

    
}
