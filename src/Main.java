import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Main
{
	public static void ClearScreen()
	{
		for(int i = 0; i < 1; ++i)
			System.out.println();
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		Random r = new Random();
		
		String[] person_names = {"Jonathon Saunders", "Ron Schmidt", "Allan Santos", "Eula Moss", "Sonya Hunt", "Alfonso Butler", "Rafael Smith", "Naomi Owen", "Kyle Kelley", "Teri Guzman"};
		String[] lehrer_names = {"Molly Leonard", "Alicia Gilbert", "Jennie Olson", "Rene Barton", "Genevieve Stephens", "Vicky Hall", "Christy Graham", "Roderick Cummings", "Aaron Lawrence", "Shannon Miles"};
		String[] lehrer_kuerzel = {"MOLE", "ALGI", "JEOL", "REBA", "GEST", "VIHA", "CHRA", "ROCU", "ARLA", "SHMI"};
		String[] Abteilung_names = {"Elektronik und Technische Informatik", "Elektrotechnik", "Informatik", "Maschinenbau", "Wirtschafts Ingenieure"};
		String[] Abteilung_kuerzel = {"EL", "ET", "IF", "MB", "WI"};
		String[] Klassen_names = {"1AHELS", "1BHELS", "2AHELS", "2BHELS", "3AHELS", "3BHELS", "4AHELS", "4BHELS", "5AHELS", "5BHELS"};
		String[] Fach_Names = {"AM", "D", "E", "NW", "FSST", "HWE", "DIC", "RK", "GGP", "KSN", "WIR", "BESP", "PBE", "LA"};
		Fach[] faecher = new Fach[Fach_Names.length];
		for(int i = 0; i < faecher.length; ++i)
		{
			faecher[i] = new Fach(Fach_Names[i], r.nextInt(5) + 1, Raumtyp.KLASSENZIMMER);
		}
		Raum[] Raeume = new Raum[20];
		for(int i = 0; i < Raeume.length; ++i)
		{
			Raeume[i] = new Raum("W" + (i / 10) + (i % 10), Raumtyp.KLASSENZIMMER);
		}
		
		// Generating HTL
		Schule HTL = new Schule("HTL");
		for(int i = 0; i < Abteilung_names.length; ++i)
		{
			Abteilung currentabteilung = HTL.addAbteilung(Abteilung_names[i], Abteilung_kuerzel[i]);
			if(i == 0) // nur EL Abteilung aufbauen
			{
				// Adding Teachers
				for(int i2 = 0; i2 < lehrer_names.length; ++i2)
				{
					currentabteilung.addLehrer(new Lehrer(lehrer_kuerzel[i2], lehrer_names[i2]));
				}
				Lehrer[] allteachers = currentabteilung.getAlllehrer().toArray(new Lehrer[0]);
				HTL.setDirector(allteachers[0]);
				currentabteilung.setAbteilungsvorstand(allteachers[1]);
				// Adding Classes
				for(int i2 = 0; i2 < Klassen_names.length; ++i2)
				{
					Klasse currentclass = currentabteilung.addKlasse(Klassen_names[i2],1 + i2 / 2, Raeume[i2]);
					int schueleranz = r.nextInt(10) + 20;
					// Adding Students to Class
					for(int i3 = 0; i3 < schueleranz; ++i3)
					{
						currentclass.addSchueler(new Schueler(person_names[r.nextInt(person_names.length)]));
					}
					// Adding Belegungen
					for(int x = 0; x < 5; ++x) // Tage
					{
						for(int y = 0; y < 10; ++y) // Stunde
						{
							currentclass.addBelegung(new Belegung(y, Unterrichtstag.values()[r.nextInt(5)], faecher[r.nextInt(faecher.length)], currentclass, allteachers[r.nextInt(allteachers.length)]), Raeume[r.nextInt(Raeume.length)]);
						}
					}
					currentclass.exportStundenplan();
				}
				for(int i2 = 0; i2 < allteachers.length; ++i2)
				{
					allteachers[i2].exportStundenplan();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		//Schule HTL = new Schule();
		/*Lehrer lehr1 = new Lehrer("ABAK", "aopefjm rg");
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
		W220.addraumbelegung(new Belegung(5, Unterrichtstag.DIENTSTAG, fach1, _4BHELS, lehr1));
		_4BHELS.exportStundenplan();
		lehr1.exportStundenplan();*/

	}
}
