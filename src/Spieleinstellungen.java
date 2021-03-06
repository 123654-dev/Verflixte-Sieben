/**
 * @author arwed walke
 * @version 1.0 // 02. 06. 2022
 * 
 * Die Klasse Spieleinstellungen speichert die Einstellungen des Spiels. Sie wird vom Spielmanager erstellt und hauptsächlich von ihm genutzt.
 */

public class Spieleinstellungen {
    
    //region Attribute und Konstruktoren
    int startguthaben;
    int maxWurfanzahl;

    /**
     * Konstruktor der Klasse Spieleinstellungen
     * @param pStartguthaben Startguthaben des Spielers
     * @param pMaxWurfanzahl maximale Wurfanzahl
     * @param pMaxSpieleranzahl maximale Spieleranzahl
     */
    public Spieleinstellungen(int pStartguthaben, int pMaxWurfanzahl) {
        startguthaben = pStartguthaben;
        maxWurfanzahl = pMaxWurfanzahl;
    }

    /**
     * Default-Konstruktor der Klasse Spieleinstellungen.
     * Legt automatisch alle Werte auf Standardwerte fest.
     */
    public static Spieleinstellungen standardWerte() {
        return new Spieleinstellungen(1000, 2);
    }
    //endregion

    //region Getter und Setter
    /**
     * Getter für das Startguthaben
     * @return Startguthaben
     */
    public int getStartguthaben() {
        return startguthaben;
    }
 
    /**
     * Getter für die maximale Wurfanzahl
     * @return maximale Wurfanzahl
     */
    public int getMaxWurfanzahl() {
        return maxWurfanzahl;
    }
    
    /**
     * Setter für das Startguthaben
     * @param pStartguthaben Startguthaben
     */
    public void setStartguthaben(int pStartguthaben) {
        startguthaben = pStartguthaben;
    }

    /**
     * Setter für die maximale Wurfanzahl
     * @param pMaxWurfanzahl maximale Wurfanzahl
     */
    public void setMaxWurfanzahl(int pMaxWurfanzahl) {
        maxWurfanzahl = pMaxWurfanzahl;
    }
    
    //endregion
}
