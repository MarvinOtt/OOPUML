public class Main
{
	public static void main(String[] args)
	{
		Schule HTL = new Schule();
		Lehrer lehr1 = new Lehrer("ABAK", "aopefjm rg");
		Abteilung EL = HTL.addAbteilung("Elektronik", "EL");
		boolean bbb = EL.setAbteilungsvorstand(lehr1);
		boolean aaa = HTL.setDirector(lehr1);
		Fach fach1 = new Fach("Mathe", 3, Raumtyp.KLASSENZIMMER);
		EL.addLehrer(lehr1);
		
		Schueler schueler1 = new Schueler("S 1");
		Raum W120 = new Raum("W120");
		Raum W220 = new Raum("W220");
		Klasse _4BHELS = EL.addKlasse("_4BHELS", 4, W120);
		Klasse _4AHELS = EL.addKlasse("_4AHELS", 4, W220);
		_4BHELS.addSchueler(schueler1);
		W120.addraumbelegung(new Belegung(3, Unterrichtstag.DIENTSTAG, fach1, _4BHELS, lehr1));
		W120.addraumbelegung(new Belegung(4, Unterrichtstag.MITTWOCH, fach1, _4BHELS, lehr1));
		W120.addraumbelegung(new Belegung(1, Unterrichtstag.DIENTSTAG, fach1, _4BHELS, lehr1));
		_4BHELS.exportStundenplan();
		lehr1.exportStundenplan();

	}
}
