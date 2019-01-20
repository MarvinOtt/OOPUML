import java.io.BufferedWriter;
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

    public Raum(String raumnummer, Raumtyp raumtyp)
    {
        this.raumNummer = raumnummer;
        this.raumtyp = raumtyp;
        maxSitzplätze = 30;
        stammklassenverz = new HashSet<>();
        raumbelegung = new HashSet<>();
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
    private boolean CheckBelegung(Belegung belegung)
    {
        Belegung[] belegungen = new Belegung[raumbelegung.size()];
        belegungen = raumbelegung.toArray(belegungen);
        for(int i = 0; i < belegungen.length; ++i)
        {
            if(belegung.tag.equals(belegungen[i].tag) && belegung.unterrichtseinheit == belegungen[i].unterrichtseinheit)
                return false;
        }
        for(int i = 0; i < alleräume.size(); ++i)
        {
            belegungen = new Belegung[Raum.alleräume.get(i).GetalleBelegungen().size()];
            belegungen = Raum.alleräume.get(i).GetalleBelegungen().toArray(belegungen);
            //Belegung[] belegungen = (Belegung[])Raum.alleräume.get(i).GetalleBelegungen().toArray();
            for(int j = 0; j < belegungen.length; ++j)
            {
                if(belegungen[j].getKlasse().equals(belegung.getKlasse()) && belegungen[j].unterrichtseinheit == belegung.unterrichtseinheit && belegungen[j].getTag().equals(belegung.getTag()))
                {
                    return false;
                }
            }
            for(int j = 0; j < belegungen.length; ++j)
            {
                if(belegungen[j].getLehrer().equals(belegung.getLehrer()) && belegungen[j].unterrichtseinheit == belegung.unterrichtseinheit && belegungen[j].getTag().equals(belegung.getTag()))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean addBelegung(Belegung newEinheit)
    {
        newEinheit.SetRaum(this);
        if(CheckBelegung(newEinheit))
            raumbelegung.add(newEinheit);
        else
            return false;
        return true;
    }
    public HashSet<Belegung> GetalleBelegungen()
    {
        return raumbelegung;
    }
}
