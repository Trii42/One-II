import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(final String[] args) throws IOException {

        System.out.println(FileSystems.getDefault().getPath("source", "a_example.in"));
        // Init Entrant
        final Entrant ent = new Entrant();
        ent.init("a_example.in");
        new HashMap();

    }

    public void DeplacerVoiture(final Entrant ent) {
        final Map<Voiture, ArrayList<Trajet>> res = new HashMap();
        for (int i = 0; i <= ent.voitures.size(); i++) {
            final Trajet cible = res.get(i).get(res.get(i).size() - 1); // trajet en cours
            ent.voitures.get(i).setCoordonnee(
                    this.deplacementVers(ent.voitures.get(i).getCoordonnee(), cible.getCoordArrive()));
        }

    }

    private Coordonnee deplacementVers(final Coordonnee voiture, final Coordonnee destination) {
        if (voiture.getX() < destination.getX()) {
            return new Coordonnee(voiture.getX() + 1, voiture.getY());
        }
        if (voiture.getX() > destination.getX()) {
            return new Coordonnee(voiture.getX() + 1, voiture.getY());
        }
        if (voiture.getY() < destination.getY()) {
            return new Coordonnee(voiture.getX() + 1, voiture.getY());
        }
        if (voiture.getY() > destination.getY()) {
            return new Coordonnee(voiture.getX() + 1, voiture.getY());
        }
        return destination;
    }

}
