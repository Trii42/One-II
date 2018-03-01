import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    	
    //Init Entrant
    Entrant ent	= new Entrant();
    //Init Sortie
    Map<Voiture, ArrayList<Trajet>> res = new HashMap();
    for(int i = 0; i <= 10; i++/*ent.NbStep*/) {
    	//Assignation trajet aux voitures
    	assignerTrajetVoiture(ent, res);
    	// maj des positions des voitures
    	deplacerVoitures(ent);
    	
    }
    // generer le fichier de sortie
        
    }
    
    public static void deplacerVoitures(Entrant ent) {
    	Map<Integer, ArrayList<Trajet>> res = new HashMap();
    	for(int i = 0; i<= ent.voitures.size();i++) {
    		Trajet cible = res.get(i).get(res.get(i).size() - 1); // trajet en cours
    		ent.voitures.get(i).setCoordonnee(
    				deplacementVers(ent.voitures.get(i).getCoordonnee(), cible.getCoordArrive()));
    	}
    	
    }
    
   private static void assignerTrajetVoiture(Entrant ent, Map<Integer, ArrayList<Trajet>> map) {

    }
   
   private static boolean checkIfVoitureIsFree(Voiture v, Trajet t) {
	   return v.coordonnee.equals(t.coordArrive);
   }
   

    
    private static Coordonnee deplacementVers(Coordonnee voiture, Coordonnee destination) {
    	if (voiture.getX() < destination.getX()){
    		return new Coordonnee(voiture.getX()+1,voiture.getY());
    	}
    	if (voiture.getX() > destination.getX()){
    		return new Coordonnee(voiture.getX()+1,voiture.getY());
    	}
    	if (voiture.getY() < destination.getY()){
    		return new Coordonnee(voiture.getX()+1,voiture.getY());
    	}
    	if (voiture.getY() > destination.getY()){
    		return new Coordonnee(voiture.getX()+1,voiture.getY());
    	}
		return destination;
    }

 
    
}
 