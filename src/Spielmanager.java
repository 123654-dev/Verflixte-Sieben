/**
 * @author arwed walke
 * @version 1.0 // 02. 06. 2022
 */
class Spielmanager {
    //region Attribute

    /** Liste aller teilnehmenden Spieler */
    static Spieler[] spieler;

    /** Referenz zu der GUI-Instanz, die läuft (Frontend?) */
    static GUI gui;

    /**Index des aktuellen Spielers in spieler (0-basiert) */
    static int aktuellerSpieler;

    //endregion


    public static void main(String[] args) {
        //Spieleinstellungen initialisieren (Standardwerte siehe Spieleinstellungen#standardWerte())
        Spieleinstellungen einstellungen = Spieleinstellungen.standardWerte();

        //Spieler-Array initialisieren
        spieler = new Spieler[einstellungen.getMaxSpieleranzahl()];

        //Alle Spieler, die "benötigt" werden, als Objekte erzeugen und das Array damit füllen
        for (int i = 0; i < spieler.length; i++) {
            spieler[i] = new Spieler(einstellungen.getStartguthaben());
        }

        //Neue GUI-Instanz erzeugen, die später verwendet wird
        gui = new GUI();
        
    }
}