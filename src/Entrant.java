import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Entrant {

    public Carte carte;
    public ArrayList<Trajet> trajets;
    public ArrayList<Voiture> voitures;

    public Entrant() {
    }

    public void init(final String nomFichier) throws FileNotFoundException {
        final FileInputStream fis = new FileInputStream(new File(nomFichier));
        
    }

}
