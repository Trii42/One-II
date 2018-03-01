import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sortant {

    public Map<Integer, ArrayList<Trajet>> res;

    public Sortant(final Map<Integer, ArrayList<Trajet>> res) {
        this.res = res;
    }

    public void genereFichier(final String nom) throws IOException {
        final BufferedWriter out = new BufferedWriter(new FileWriter(nom));
        final Set cles = res.keySet();
        final Iterator it = cles.iterator();
        String b = "";
        while (it.hasNext()) {
            final Integer cle = (Integer) it.next(); // tu peux typer plus finement ici
            final ArrayList<Trajet> valeur = res.get(cle); // tu peux typer plus finement ici

            b = b + cle;
            for (final Trajet trajet : valeur) {
                b = b + " " + trajet.id;
            }
            b = b + "\n";

        }

        out.write(b);
        out.close();
    }

}
