import java.util.HashSet;
import java.util.Iterator;

public class Klasse
{
    private Schueler Klassensprecher;
    private HashSet<Schueler> schueler;

    private String bezeichnung;
    private int schulstufe;


    public Klasse()
    {
         schueler= new HashSet<>();
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
        return Klassensprecher;
    }

    public boolean setKlassensprecher(Schueler newKlassensprecher)
    {
        Klassensprecher=newKlassensprecher;
        return true;
    }

    public boolean addSchueler(Schueler newschueler)
    {
        schueler.add(newschueler);
        return true;
    }
    public float getDurchschnittsalter()
    {

        float gAlter = 0;
        Iterator itr = this.schueler.iterator();
        while(itr.hasNext())
        {
            gAlter = gAlter + ((Schueler)itr.next()).getAlter();
        }
    }
    public void getStundenplan()
    {

    }

}
