import java.util.Date;

public class Person
{
    private Adresse adresse;
    private Long svnr;
    private String vorname;
    private String nachname;
    private Date geburtsdatum;
    private String email;

    public Long getSvnr()
    {
        return svnr;
    }

    public Date getGeburtsdatum()
    {
        return geburtsdatum;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String getEmail()
    {
        return email;
    }

    public Adresse getAdresse()
    {
        return adresse;
    }
}

