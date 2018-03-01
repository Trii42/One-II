import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(final String[] args) {

        // Init Entrant
        final Entrant ent = new Entrant();
        // Init Sortie
        final Map<Voiture, ArrayList<Trajet>> res = new HashMap();
        for (int i = 0; i <= 10; i++/* ent.NbStep */) {
            // Assignation trajet aux voitures
            assignerTrajetVoiture(ent, res);
            // maj des positions des voitures
            deplacerVoitures(ent);

        }
        // generer le fichier de sortie

    }

    public static void deplacerVoitures(final Entrant ent) {
        final Map<Voiture, ArrayList<Trajet>> res = new HashMap();
        for (int i = 0; i <= ent.voitures.size(); i++) {
            final Trajet cible = res.get(i).get(res.get(i).size() - 1); // trajet en cours
            ent.voitures.get(i).setCoordonnee(
                    deplacementVers(ent.voitures.get(i).getCoordonnee(), cible.getCoordArrive()));
        }

    }

    private static void assignerTrajetVoiture(final Entrant ent, final Map map) {

    }

    private static Coordonnee deplacementVers(final Coordonnee voiture, final Coordonnee destination) {
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
