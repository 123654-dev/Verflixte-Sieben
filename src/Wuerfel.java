import java.util.Random;

import java.util.Random;
/**
 * Beschreiben Sie hier die Klasse Wuerfel.
 * 
 * @author Flemming Salchow
 * @version 31.05.2022
 */
<<<<<<< HEAD
public class Wuerfel
{
    private int points;
    private Random randomZahl;
    public Wuerfel()
    {
        randomZahl = new Random();
    }
    public void testen()
    {
        randomZahlAusgeben();
        System.out.println(points);
    }
    public int pointsZahlAngeben()
    {
        return points;
    }
    public int randomZahlAusgeben()
    {
        int pMaximum = 5;
        points = 1+ randomZahl.nextInt(pMaximum);
        return points;
    }
    public void rollen()
    {
        randomZahlAusgeben();
=======
public class Wuerfel {
    private int points;
    private Random randomZahl;

    public Wuerfel() {
        randomZahl = new Random();
    }

    public void testen() {
        randomZahlAusgeben();
        System.out.println(points);
>>>>>>> f956aafaef42e119d8bd96b4f48231d0a0a1191f
    }

    public int pointsZahlAngeben() {
        return points;
    }

    public int randomZahlAusgeben() {
        int pMaximum = 5;
        points = 1 + randomZahl.nextInt(pMaximum);
        return points;
    }

    public int rollen() {
        return randomZahlAusgeben();
    }
}