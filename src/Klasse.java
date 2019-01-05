import java.util.HashSet;

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
    public void getStundenplan()
    {

    }

}
