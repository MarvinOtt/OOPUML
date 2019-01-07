import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class Klasse
{

    private Schueler klassensprecher;
    private Lehrer klassenvorstand;
    private HashSet<Schueler> schuelerlist;
    private HashSet<Fach> stundenplan;
    private Raum stammklasse;

    private String bezeichnung;
    private int schulstufe;


    public Klasse(String bezeichnung, int schulstufe, Raum stammklasse)
    {
        this.bezeichnung = bezeichnung;
        this.schulstufe = schulstufe;
        
        // Checking Stammklasse
        if(stammklasse.setStammklasse(this))
            this.stammklasse = stammklasse;
        else
            throw new IllegalArgumentException("Stammklasse ist schon belegt!");
        schuelerlist = new HashSet<>();
        stundenplan = new HashSet<>();
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public int getSchulstufe()
    {
        return schulstufe;
    }

    public Schueler getKlassensprecher()
    {
        return klassensprecher;
    }

    public Lehrer getKlassenvorstand()
    {
        return klassenvorstand;
    }

    public boolean setKlassensprecher(Schueler newKlassensprecher)
    {
        klassensprecher = newKlassensprecher;
        return true;
    }

    public boolean setKlassenvorstand(Lehrer newKlassenvorstand)
    {
        klassenvorstand = newKlassenvorstand;
        return true;
    }

    public boolean addSchueler(Schueler newschueler)
    {
        schuelerlist.add(newschueler);
        return true;
    }

    public boolean addFach(Fach newFach)
    {
        stundenplan.add(newFach);
        return true;
    }
    public float getDurchschnittsalter()
    {
        Iterator itr = schuelerlist.iterator();
        int schuelercount = schuelerlist.size();
        float gAlter = 0;
        while(itr.hasNext())
        {
            gAlter = gAlter + ((Schueler)itr.next()).getAlter();

        }
        return(gAlter/(float)schuelercount);
    }
    public void exportStundenplan()
    {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(bezeichnung + "_Stundenplan.txt"), "utf-8"));
    
    
    
            for(int i = 0; i < Raum.alleräume.size(); ++i)
            {
                Belegung[] belegungen = (Belegung[])Raum.alleräume.get(i).GetalleBelegungen().toArray();
                for(int j = 0; j < belegungen.length; ++j)
                {
                    if(belegungen[j].getKlasse().equals(this))
                    {
                        writer.write(belegungen[j].getBelegungsstring());
                        ((BufferedWriter) writer).newLine();
                    }
                }
            }
            
            
        } catch (IOException ex) {
            // Report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
        
    }
    

}
