import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Raum
{
    private String raumNummer;
    private int maxSitzplätze;
    private Klasse stammklasse;
    private Raumtyp raumtyp;
    static HashSet<Klasse> stammklassenverz;
    static ArrayList<Raum> alleräume = new ArrayList<>();
    private HashSet<Belegung> raumbelegung;

    public Raum(String raumnummer)
    {
        this.raumNummer = raumnummer;
        stammklassenverz = new HashSet<>();
        alleräume.add(this);
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
       if(flag && stammklasse == null)
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
    public HashSet<Belegung> GetalleBelegungen()
    {
        return raumbelegung;
    }
}
