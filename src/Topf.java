<<<<<<< HEAD
package src;



=======
>>>>>>> f956aafaef42e119d8bd96b4f48231d0a0a1191f
/**
 * Beschreiben Sie hier die Klasse topf.
 * 
 * @author YS
 * @version 03.06.22
 */
<<<<<<< HEAD
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

=======
public class Topf {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int einsatz;

    /**
     * Konstruktor fÃ¼r Objekte der Klasse topf
     */
    public Topf() {
        // Instanzvariable initialisieren
        einsatz = 0;
    }

    /**
     * Die Methode ermÃ¶glicht dem Spieler eine Zahl als Einsatz anzugeben. Ist schon
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

    public void einsatzLeeren() {
        einsatz = 0;
    }
}
>>>>>>> f956aafaef42e119d8bd96b4f48231d0a0a1191f
