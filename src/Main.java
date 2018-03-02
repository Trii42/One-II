import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(final String[] args) throws IOException {

        // Init Entrant
        final Entrant ent = new Entrant();
        final ArrayList<String> entrant = new ArrayList<>();
        entrant.add("a_example.in");
        entrant.add("b_should_be_easy.in");
        entrant.add("c_no_hurry.in");
        entrant.add("d_metropolis.in");
        entrant.add("e_high_bonus.in");
        for (int y = 1; y <= 5; ++y) {
            ent.init(entrant.get(y - 1));
            // Init Sortie
            final Map<Integer, ArrayList<Trajet>> res = new HashMap();
            for (int i = 0; i < ent.voitures.size(); ++i) {
                res.put(i, new ArrayList<>());
            }
            int i = 0;
            for (final Trajet t : ent.trajets) {
                res.get(i).add(t);
                i++;
                if (i == ent.voitures.size()) {
                    i = 0;
                }
            }

            // generer le fichier de sortie
            final Sortant s = new Sortant(res);
            s.genereFichier("res" + y + ".txt");
        }
    }

}

/*
 * public static void assignerTrajet(Entrant ent, Map<Voiture, ArrayList<Trajet>> map ) {
 *
 * for(Voiture v : ent.voitures) { map.get(v).add(ent.) }
 *
 *
 *
 * /*List<Trajet> minTrajet; for(int i=0; i < trajets.size(); i++) { if(trajets.get(i).tempsDepart <= i) {
 * for(int j=0; j < voitures.size(); j++) {
 *
 * } } } }
 */

/*
 * public static void deplacerVoitures(final Entrant ent) { final Map<Integer, ArrayList<Trajet>> res = new
 * HashMap(); for (int i = 0; i <= ent.voitures.size(); i++) { final Trajet cible =
 * res.get(i).get(res.get(i).size() - 1); // trajet en cours ent.voitures.get(i).setCoordonnee(
 * deplacementVers(ent.voitures.get(i).getCoordonnee(), cible.getCoordArrive())); }
 *
 * }
 */

/*
 * private static boolean checkIfVoitureIsFree(final Voiture v, final Trajet t) { return
 * v.coordonnee.equals(t.coordArrive); }
 *
 * private static Coordonnee deplacementVers(final Coordonnee voiture, final Coordonnee destination) { if
 * (voiture.getX() < destination.getX()) { return new Coordonnee(voiture.getX() + 1, voiture.getY()); } else
 * if (voiture.getX() > destination.getX()) { return new Coordonnee(voiture.getX() + 1, voiture.getY()); }
 * else if (voiture.getY() < destination.getY()) { return new Coordonnee(voiture.getX() + 1, voiture.getY());
 * } else if (voiture.getY() > destination.getY()) { return new Coordonnee(voiture.getX() + 1,
 * voiture.getY()); } else { return null; } }
 *
 * }
 */
