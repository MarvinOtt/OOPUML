import java.util.HashSet;

public class Fach
{
    private String name;
    private int wochenstunden;
    private Raumtyp raumanforderung;
    private HashSet<Lehrer> unterrichtendelehrer;
    
    public Fach(String name, int wochenstunden, Raumtyp RT)
    {
        this.name = name;
        this.wochenstunden = wochenstunden;
        this.raumanforderung = RT;
        unterrichtendelehrer = new HashSet<>();
    }

    public String getName()
    {
        return name;
    }

    public int getWochenstunden()
    {
        return wochenstunden;
    }

    public Raumtyp getRaumanforderung()
    {
        return raumanforderung;
    }
}
