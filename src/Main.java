public class Main
{
	public static void main(String[] args)
	{
		Schule HTL = new Schule();
		Abteilung EL = HTL.addAbteilung("Elektronik", "EL");
		Lehrer lehr1 = new Lehrer("ABAK", "aopefjm rg");
		Fach fach1 = new Fach("Mathe", 3, Raumtyp.KLASSENZIMMER);
		lehr1.addFach(fach1);
		EL.addLehrer(lehr1);
		
		Schueler schueler1 = new Schueler("S 1");
		Raum W120 = new Raum("W120");
		Klasse HELS = EL.addKlasse("BHELS",4,W120);
		
		Klasse _4BHELS = EL.addKlasse("4BHELS", 3, W120);
		Klasse _4AHELS = EL.addKlasse("4AHELS", 3, W120);
		_4BHELS.addFach(fach1);
		_4BHELS.addSchueler(schueler1);
		_4BHELS.exportStundenplan();
	}
}
