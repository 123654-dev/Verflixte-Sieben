class Spielmanager {
        
    static Spieler[] spieler;
    static GUI gui;
    static int aktuellerSpieler;

    public static void main(String[] args) {
        Spieleinstellungen einstellungen;        
        einstellungen = Spieleinstellungen.standardWerte();
        
        //Spieler-Array initialisieren
        spieler = new Spieler[2];

        //Alle Spieler, die "benötigt" werden, als Objekte erzeugen und das Array damit füllen
        for (int i = 0; i < spieler.length; i++) {
            spieler[i] = new Spieler(einstellungen.getStartguthaben());
        }

        //Neue GUI-Instanz erzeugen, die später verwendet wird
        gui = new GUI();
        initGame();
    }

    static void initGame() {
        //erster Spieler ist dran
    }

    public static void einsatzCallback() {
        //jetzt: Würfeln
    }

    public static void wuerfelCallback() {
        
    }

    public static void rundeAbschliessen() {
        //nächster Spieler
    }

}