import java.util.HashSet;

public class Lehrer extends Mitarbeiter
{
    private String kuerzel, name;
    private HashSet<Fach> zuunterrichtendefächer;
    
    public Lehrer(String kuerzel, String name)
    {
        super(name);
        this.kuerzel = kuerzel;
        zuunterrichtendefächer = new HashSet<>();
    }
    
    public String getKuerzel()
    {
        return kuerzel;
    }
    
    public void addFach(Fach fach)
    {
        zuunterrichtendefächer.add(fach);
    }
    public void exportStundenplan()
    {
    
    }
}
