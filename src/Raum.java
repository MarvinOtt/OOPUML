public class Raum
{
    private String raumNummer;
    private int maxSitzplätze;
    private enum Raumtyp
    {
       KLASSENZIMMER, LABORRAUM
    }
    private Raumtyp raumtyp;


    public String getRaumNummer()
    {
        return raumNummer;
    }

    public int getMaxSitzplätze()
    {
        return maxSitzplätze;
    }

    public Raumtyp getRaumtyp()
    {
        return raumtyp;
    }
}
