package src;



/**
 * Beschreiben Sie hier die Klasse topf.
 * 
 * @author YS
 * @version 03.06.22
 */
public class topf
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int einsatz; 

    /**
     * Konstruktor für Objekte der Klasse topf
     */
    public topf()
    {
        // Instanzvariable initialisieren
        einsatz = 0;
    }
    /** 
     * Die Methode ermöglicht dem Spieler eine Zahl als Einsatz anzugeben. Ist schon eine andere Zahl vorhanden, wird sie mit dieser addiert.
     */
    public void einsatzAufnehmen(int pEinsatz) 
    {
        einsatz += pEinsatz;

    }
    /** 
     * Die Methode zeigt den eingegebenen Ansatz an. 
     */
    public int einsatzAbgeben()
    {

       return einsatz ;
    }
}

