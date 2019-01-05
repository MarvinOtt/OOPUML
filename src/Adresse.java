public class Adresse
{
	private String ort;
	private String strasse;
	private Integer hausnummer;
	private Integer plz;
	
	public String getOrt(){return ort;}
	
	public String getStrasse(){return strasse;}
	
	public Integer getHausnummer(){return hausnummer;}
	
	public Integer getPlz(){return plz;}
	
	public void printAddresse()
	{
		System.out.println(plz + " " + ort + " " + strasse + " " + hausnummer);
	}
}
