import java.util.HashSet;
import java.util.Iterator;

public class Raum
{
    private String raumNummer;
    private int maxSitzplätze;
    private Klasse stammklasse;
    private Raumtyp raumtyp;
    static HashSet<Klasse> stammklassenverz;
    private HashSet<Belegung> raumbelegung;

    public Raum()
    {
        stammklassenverz = new HashSet<>();
    }


    public String getRaumNummer()
    {
        return raumNummer;
    }

    public int getMaxSitzplätze()
    {
        return maxSitzplätze;
    }

    public Raumtyp getRaumtyp()
    {
        return raumtyp;
    }
    public boolean setStammklasse(Klasse newStammklasse)
    {
        boolean flag;

       flag = stammklassenverz.add(newStammklasse);
       if(flag)
       {
           this.stammklasse = newStammklasse;
           return true;
       }
        return false;
    }
    public boolean addraumbelegung(Belegung newEinheit)
    {
        raumbelegung.add(newEinheit);
        return true;
    }
}
