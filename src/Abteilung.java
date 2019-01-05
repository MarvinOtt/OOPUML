import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Abteilung
{
	private String kuerzel;
	private String name;
	private Lehrer Abteiluingsvorstand;
	private ArrayList<Lehrer> alllehrer;
	private HashSet<Schueler> allschueler;
	
	public Abteilung()
	{
		alllehrer = new ArrayList<>();
	}
	
	public String getName(){return name;}
	public String Kuerzel(){return kuerzel;}
	public ArrayList<Schueler> getSchueler()
	{
		return new ArrayList<Schueler>(allschueler);
	}
	public boolean addLehrer(Lehrer lehrer)
	{
		alllehrer.add(lehrer);
		return true;
	}
	public boolean setAbteilungsvorstand(Lehrer lehrer)
	{
		Abteiluingsvorstand = lehrer;
		return true;
	}
	
}
