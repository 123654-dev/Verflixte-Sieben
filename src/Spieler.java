/**
 * Beschreiben Sie hier die Klasse Spieler.
 * 
 * @ Paul P.
 * @ 20.06.2022
 */
public class Spieler {
    private String name;
    private int punkte;
    private int vermoegen;
    private int wurfAnzahl;
    private Topf topf;
    private Wuerfel wuerfel1, wuerfel2;

    /**
     * Konstruktor fuer Objekte der Klasse Spieler
     */
    public Spieler(Wuerfel pWuerfel1, Wuerfel pWuerfel2, Topf pTopf, int vermoegen) {
        wuerfel1 = pWuerfel1;
        wuerfel2 = pWuerfel2;
        topf = pTopf;
        punkte = 0;
        wurfAnzahl = 0;
        vermoegen = 0;
    }

    /**
     * Diese Methode laesst den Spieler den Einsatz in den Topf setzen.
     * 
     * @param: -
     * @return: -
     */
    public void einsatzSetzen(int pEinsatz) {
        topf.einsatzAufnehmen(pEinsatz);
        vermoegen -= pEinsatz;
    }

    /**
     * Diese Methode laesst den Spieler, der an der Reihe ist, wuerfeln.
     * 
     * @param: -
     * @return: -
     */
    public void wuerfeln() {
        wuerfel1.rollen();
        int ergebnis = wuerfel1.randomZahlAusgeben() + wuerfel2.randomZahlAusgeben();
        if (ergebnis == 7) {
            punkte -= 7;
            Spielmanager.gui.showAlert("Du hast einen 7 geworfen und verloren!");
            Spielmanager.rundeAbschliessen();
        } else {
            punkte += ergebnis;
        }
    }

    /**
     * Diese Methode leert den "Topf" in dem das vermoegen der jeweiligen Spieler
     * liegt.
     * 
     * @param: -
     * @return: -
     */
    public void topfLeeren() {
        vermoegen += topf.einsatzAbgeben();
    }

    /**
     * Diese Methode laesst den Spieler die Wurfanzahl einsehen.
     * 
     * @param: -
     * @return: wurfAnzahl
     */
    public int wurfAnzahlAnzeigen() {
        return wurfAnzahl;
    }

    /**
     * Diese Methode laesst den Spieler den Punktestand anzeigen.
     * 
     * @param: -
     * @return: punkte
     */
    public int punkteStandAnzeigen() {
        return punkte;
    }

}