import java.io.*;
import java.util.HashSet;

public class Lehrer extends Mitarbeiter
{
    private String kuerzel, name;
    
    public Lehrer(String kuerzel, String name)
    {
        super(name);
        this.kuerzel = kuerzel;
    }
    
    public String getKuerzel()
    {
        return kuerzel;
    }


    public void exportStundenplan()
    {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(name + "_Stundenplan.txt"), "utf-8"));



            for(int i = 0; i < Raum.alleräume.size(); ++i)
            {
                Belegung[] belegungen = (Belegung[])Raum.alleräume.get(i).GetalleBelegungen().toArray();
                for(int j = 0; j < belegungen.length; ++j)
                {
                    if(belegungen[j].getLehrer().equals(this))
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
