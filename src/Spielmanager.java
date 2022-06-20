 
class Spielmanager {
        
    public static void main(String[] args) {
        Spieleinstellungen einstellungen = Spieleinstellungen.standardWerte();

        //Spieler-Array initialisieren
        spieler = new Spieler[einstellungen.getMaxSpieleranzahl()];

        //Alle Spieler, die "benötigt" werden, als Objekte erzeugen und das Array damit füllen
        for (int i = 0; i < spieler.length; i++) {
            spieler[i] = new Spieler(einstellungen.getStartguthaben());
        }

        //Neue GUI-Instanz erzeugen, die später verwendet wird
        gui = new GUI();

        initGame();
    }

    static void initGame() {
        
    }

}