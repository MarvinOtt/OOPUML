import java.util.HashSet;
import java.util.Iterator;

public class Klasse
{

    private Schueler klassensprecher;
    private Lehrer klassenvorstand;
    private HashSet<Schueler> schuelerlist;
    private HashSet<Fach> stundenplan;

    private String bezeichnung;
    private int schulstufe;


    public Klasse()
    {
         schuelerlist = new HashSet<>();
         stundenplan = new HashSet<>();
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public int getSchulstufe()
    {
        return schulstufe;
    }

    public Schueler getKlassensprecher()
    {
        return klassensprecher;
    }

    public Lehrer getKlassenvorstand()
    {
        return klassenvorstand;
    }

    public boolean setKlassensprecher(Schueler newKlassensprecher)
    {
        this.klassensprecher = newKlassensprecher;
        return true;
    }

    public boolean setKlassenvorstand(Lehrer newKlassenvorstand)
    {
        this.klassenvorstand = newKlassenvorstand;
        return true;
    }

    public boolean addSchueler(Schueler newschueler)
    {
        schuelerlist.add(newschueler);
        return true;
    }

    public boolean addFach(Fach newFach)
    {
        stundenplan.add(newFach);
        return true;
    }
    public float getDurchschnittsalter()
    {
        Iterator itr = schuelerlist.iterator();
        int schuelercount = schuelerlist.size();
        float gAlter = 0;
        while(itr.hasNext())
        {
            gAlter = gAlter + ((Schueler)itr.next()).getAlter();

        }
        return(gAlter/(float)schuelercount);
    }
    public void exportStundenplan()
    {

    }

}
