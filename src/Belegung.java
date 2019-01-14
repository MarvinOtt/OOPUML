public class Belegung
{
    int unterrichtseinheit;
    Fach unterrichtsfach;
    Unterrichtstag tag;
    Klasse klasse;
    Lehrer lehrer;
    Raum raum;
    
    public Belegung(int unterrichtseinheit, Unterrichtstag tag, Fach unterrichtsfach, Klasse klasse, Lehrer lehrer)
    {
        this.unterrichtseinheit = unterrichtseinheit;
        this.tag = tag;
        this.unterrichtsfach = unterrichtsfach;
        this.klasse = klasse;
        this.lehrer = lehrer;
    }

    public boolean SetRaum(Raum raum)
    {
        this.raum = raum;
        return true;
    }

    public Lehrer getLehrer()
    {
        return lehrer;
    }

    public Klasse getKlasse()
    {
        return klasse;
    }

    public Unterrichtstag getTag()
    {
        return tag;
    }
    
    public String getBelegungsstring()
    {
        return "Tag: " + tag.name() + " | " + "Stunde " + unterrichtseinheit + " | " + "Raum:" + raum.getRaumNummer() + " | " + "Klasse: " + klasse.getBezeichnung() +  " | " + "Fach: " + unterrichtsfach.getName() + " | "     + "Lehrer: " + lehrer.getKuerzel();
    }
}
