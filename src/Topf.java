/**
 * Beschreiben Sie hier die Klasse topf.
 * 
 * @author YS
 * @version 03.06.22
 */
public class Topf {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int einsatz;

    /**
     * Konstruktor f�r Objekte der Klasse topf
     */
    public Topf() {
        // Instanzvariable initialisieren
        einsatz = 0;
    }

    /**
     * Die Methode erm�glicht dem Spieler eine Zahl als Einsatz anzugeben. Ist schon
     * eine andere Zahl vorhanden, wird sie mit dieser addiert.
     */
    public void einsatzAufnehmen(int pEinsatz) {
        einsatz += pEinsatz;
    }

    /**
     * Die Methode zeigt den eingegebenen Ansatz an.
     */
    public int einsatzAbgeben() {
        return einsatz;
    }

    public int getEinsatz() {
        return einsatz;
    }
}
