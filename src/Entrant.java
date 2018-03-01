import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Entrant {

    public Carte carte;
    public ArrayList<Trajet> trajets;
    public ArrayList<Voiture> voitures;
    public int tempsMax;

    public Entrant() {
    }

    public void init(final String nomFichier) throws IOException {
        final List<String> lines = Files.readAllLines(Paths.get(nomFichier), Charset.forName("UTF-8"));
        final String initLigne = lines.get(0);
        final String[] premiereLigne = initLigne.split(" ");
        carte.largeur = Integer.parseInt(premiereLigne[0]);
        carte.longueur = Integer.parseInt(premiereLigne[1]);
        tempsMax = Integer.parseInt(premiereLigne[5]);

        final int nbVoitures = Integer.parseInt(premiereLigne[2]);
        for (int i = 1; i <= nbVoitures; i++) {
            voitures.add(new Voiture(i));
        }

        final int nbTrajets = Integer.parseInt(premiereLigne[3]);
        for (int i = 1; i <= nbTrajets; i++) {
            final String ligne = lines.get(i);
            final String[] detailsLigne = ligne.split(" ");
            trajets.add(new Trajet(new Coordonnee(Integer.parseInt(detailsLigne[0]), Integer.parseInt(detailsLigne[1])),
                    new Coordonnee(Integer.parseInt(detailsLigne[2]), Integer.parseInt(detailsLigne[3])),
                    Integer.parseInt(detailsLigne[2]), Integer.parseInt(detailsLigne[3]), i));
        }

    }

}
