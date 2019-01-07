import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Abteilung
{
	private String kuerzel;
	private String name;
	private Lehrer Abteilungsvorstand;
	private ArrayList<Lehrer> alllehrer;
	private HashSet<Schueler> allschueler;
	private Schule schule;
	
	public Abteilung(String name, String kuerzel)
	{
		alllehrer = new ArrayList<>();
		this.name = name;
		this.kuerzel = kuerzel;
	}
	
	public boolean addLehrer(Lehrer lehrer)
	{
		alllehrer.add(lehrer);
		return true;
	}
	public boolean setAbteilungsvorstand(Lehrer lehrer)
	{
		Abteilungsvorstand = lehrer;
		return true;
	}
	
	public String getName(){return name;}
	public String getKuerzel(){return kuerzel;}
	public HashSet<Schueler> getSchueler()
	{
		return allschueler;
	}
	public ArrayList<Mitarbeiter> getPersonal()
	{
		return new ArrayList<Mitarbeiter>(alllehrer);
	}
	public Lehrer getAbteilungsvorstand(){return Abteilungsvorstand;}
	
}