import java.util.HashSet;

public class Lehrer extends Mitarbeiter
{
    private String kuerzel, name;
    
    public Lehrer(String kuerzel, String name)
    {
        super(name);
        this.kuerzel = kuerzel;
    }
    
    public String getKuerzel()
    {
        return kuerzel;
    }
    

    public void exportStundenplan()
    {
    
    }
}
