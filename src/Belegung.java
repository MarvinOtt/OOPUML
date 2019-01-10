public class Belegung
{
    int unterrichtseinheit;
    Fach unterrichtsfach;
    Unterrichtstag tag;
    Klasse klasse;
    Lehrer lehrer;
    
    public Belegung(int unterrichtseinheit, Unterrichtstag tag, Fach unterrichtsfach, Klasse klasse, Lehrer lehrer)
    {
        this.unterrichtseinheit = unterrichtseinheit;
        this.tag = tag;
        this.unterrichtseinheit = unterrichtseinheit;
        this.klasse = klasse;
        this.lehrer = lehrer;
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
        return "Fach: " + unterrichtsfach.getName() + " | " + "Tag: " + tag.name() + " | " + "Stunde " + unterrichtseinheit + " | " + "Klasse: " + klasse.getBezeichnung() + " | " + "Lehrer: " + lehrer.getKuerzel();
    }
}
