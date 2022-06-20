import java.util.HashMap;

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
            spieler[i] = new Spieler(new Wuerfel(), new Wuerfel(), new Topf(), einstellungen.getStartguthaben());
        }

        //Neue GUI-Instanz erzeugen, die später verwendet wird
        gui = new GUI();
        initGame();
    }

    static void initGame() {
        //erster Spieler ist dran
        aktuellerSpieler = 0;
    }

    public static void einsatzCallback() {
        //jetzt: Würfeln
    }

    public static void wuerfelCallback() {
        spieler[aktuellerSpieler].wuerfeln();
        gui.refresh();
    }

    public static void rundeAbschliessen() {
        //nächster Spieler
        if(aktuellerSpieler == 0) {
            
        }
    }

    public static int getPunkte1() {
        return spieler[0].punkteStandAnzeigen();
    }

    public static int getPunkte2() {
        return spieler[1].punkteStandAnzeigen();
    }
}