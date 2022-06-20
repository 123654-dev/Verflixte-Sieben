import java.util.HashMap;

class Spielmanager {
    static Spieler[] spieler;
    static GUI gui;
    static int aktuellerSpieler;
    static Topf topf;
    static Spieleinstellungen einstellungen;

    public static void main(String[] args) {
        einstellungen = Spieleinstellungen.standardWerte();

        // Spieler-Array initialisieren
        spieler = new Spieler[2];

        topf = new Topf();

        // Alle Spieler, die "benötigt" werden, als Objekte erzeugen und das Array damit
        // füllen
        for (int i = 0; i < spieler.length; i++) {
            spieler[i] = new Spieler(new Wuerfel(), new Wuerfel(), topf, einstellungen.getStartguthaben());
        }

        // Neue GUI-Instanz erzeugen, die später verwendet wird
        gui = new GUI();
        initGame();
    }

    static void initGame() {
        // erster Spieler ist dran
        aktuellerSpieler = 0;
    }

    public static void einsatzCallback(int value) {
        spieler[aktuellerSpieler].einsatzSetzen(value);
    }

    public static void wuerfelCallback() {
        spieler[aktuellerSpieler].wuerfeln();
        gui.refresh();
    }

    public static void setNamen(String pName1, String pName2) {
        spieler[0].setName(pName1);
        spieler[1].setName(pName2);
    }

    public static void rundeAbschliessen() {
        // nächster Spieler
        if (aktuellerSpieler == 0) {
            aktuellerSpieler = 1;
        } else {
            if (getPunkte1() > getPunkte2()) {
                Spielmanager.gui.showAlert(
                        spieler[0].getName() + " hat " + topf.getEinsatz() + " VerflixteSiebenBux gewonnen!");
            } else if (getPunkte1() < getPunkte2()) {
                Spielmanager.gui.showAlert(
                        spieler[1].getName() + " hat " + topf.getEinsatz() + " VerflixteSiebenBux gewonnen!");
            } else {
                Spielmanager.gui.showAlert("Unentschieden!");
            }
        }
    }

    public static int getPunkte1() {
        return spieler[0].punkteStandAnzeigen();
    }

    public static int getPunkte2() {
        return spieler[1].punkteStandAnzeigen();
    }

    public static void ohohSiebenGewuerfelt(Spieler pSpieler) {
        pSpieler.punktestandRuinieren();
        rundeAbschliessen();
    }

    public static Spieleinstellungen getEinstellungen() {
        return einstellungen;
    }
}