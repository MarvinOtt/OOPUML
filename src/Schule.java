import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Schule
{
	private String name;
	private Long schulkennzahl;
	private String schultyp;
	private Adresse adresse;
	private Schueler schulsprecher;
	private Lehrer director;
	private HashSet<Abteilung> abteilungen;
	
	
	
	private HashSet<NichtLehrpersonal> allNLP;
	
	public Schule()
	{
		allNLP = new HashSet<>();
		abteilungen = new HashSet<>();
	}
	
	public boolean addPersonal(NichtLehrpersonal nlp)
	{
		return allNLP.add(nlp);
	}
	public Abteilung addAbteilung(String name, String kuerzel)
	{
		Abteilung newabteilung = new Abteilung(name, kuerzel, this);
		abteilungen.add(newabteilung);
		return newabteilung;
	}
	public boolean setDirector(Lehrer director)
	{
		Iterator itr = abteilungen.iterator();
		while(itr.hasNext())
		{
			if(((Abteilung)itr.next()).getAbteilungsvorstand() == director)
			{
				return false;
			}
		}
		this.director = director;
		return true;
	}
	public boolean setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
		return true;
	}
	public boolean setSchulsprecher(Schueler SS)
	{
		schulsprecher = SS;
		return true;
	}
	
	public Lehrer getDirector(){return director;}
	public Long getSchulkennzahl(){return schulkennzahl;}
	public String getName(){return name;}
	public String getSchultyp(){return schultyp;}
	public ArrayList<Mitarbeiter> getPersonal()
	{
		ArrayList<Mitarbeiter> list = new ArrayList<>();
		list.addAll(new ArrayList<Mitarbeiter>(allNLP));
		for(Iterator<Abteilung> itr = abteilungen.iterator(); itr.hasNext();)
		{
			Abteilung abt = itr.next();
			list.addAll(abt.getPersonal());
		}
		return list;
	}
	public ArrayList<Schueler> getSchueler()
	{
		ArrayList<Schueler> list = new ArrayList<>();
		for(Iterator<Abteilung> itr = abteilungen.iterator(); itr.hasNext();)
		{
			Abteilung abt = itr.next();
			list.addAll(abt.getSchueler());
		}
		return list;
	}
	public int getAnzahlSchueler()
	{
		int anz = 0;
		for(Iterator<Abteilung> itr = abteilungen.iterator(); itr.hasNext();)
		{
			Abteilung abt = itr.next();
			anz += abt.getSchueler().size();
		}
		return anz;
	}
	public Adresse getAdresse(){return adresse;}
	public Schueler getSchulsprecher(){return schulsprecher;}
	public Abteilung getAbteilungwithname(String name)
	{
		Abteilung[] abt = new Abteilung[abteilungen.size()];
		abt = abteilungen.toArray(abt);
		for(int i = 0; i < abt.length; ++i)
		{
			if(abt[i].getName().equals(name))
				return abt[i];
		}
		return null;
	}
	
	
	
}
