import java.util.Date;

public abstract class Person
{
    private Adresse adresse;
    private Long svnr;
    private String vorname;
    private String nachname;
    private Date geburtsdatum;
    private String email;
    private int alter;
    
    public Person(String name)
    {
        if(name.contains(" "))
        {
            String[] parts = name.split(" ");
            vorname = parts[0];
            nachname = parts[1];
        }
        else
            throw new IllegalArgumentException("Name is not valid");
    }

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

    private Adresse getAdresse()
    {
        return adresse;
    }

    public int getAlter()
    {
        return alter;
    }
}

