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
	private HashSet<Klasse> allklassen;

	public Abteilung(String name, String kuerzel)
	{
		alllehrer = new ArrayList<>();
		allklassen = new HashSet<>();
		allschueler = new HashSet<>();
		this.name = name;
		this.kuerzel = kuerzel;
	}
	public Klasse addKlasse(String name, int schulstufe, Raum stammraum)
	{
		Klasse newKlasse = new Klasse(name, schulstufe, stammraum,this);
		allklassen.add(newKlasse);
		return newKlasse;
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