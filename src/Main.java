public class Main
{
	public static void main(String[] args)
	{
		Schule HTL = new Schule();
		Abteilung EL = HTL.addAbteilung("Elektronik", "EL");
		Lehrer lehr1 = new Lehrer("ABAK", "aopefjm rg");
		Fach fach1 = new Fach("Mathe", 3, Raumtyp.KLASSENZIMMER);
		EL.addLehrer(lehr1);
		
		Schueler schueler1 = new Schueler("S 1");
		Raum W120 = new Raum("W120");
		Klasse HELS = EL.addKlasse("4BHELS",4,W120);
		
		Klasse _4BHELS = new Klasse("4BHELS", 4, W120);
		Klasse _4AHELS = new Klasse("4AHELS", 4, W120, EL);

		_4BHELS.addSchueler(schueler1);
		//_4BHELS.exportStundenplan();
	}
}
