import java.util.HashSet;

public class Schule
{
	private String name;
	private Long schulkennzahl;
	private String schultyp;
	private Adresse adresse;
	
	private HashSet<NichtLehrpersonal> allNLP;
	
	public Schule()
	{
		allNLP = new HashSet<>();
	}
	
	public boolean addPersonal(NichtLehrpersonal nlp)
	{
		allNLP.add(nlp);
		return true;
	}
	public Adresse getAdresse(){return adresse;}
	
	
	
}
