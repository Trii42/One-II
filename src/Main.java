import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	
	
	
	
    public static void main(String[] args) {
    	
    //Init Entrant
    Entrant ent	= new Entrant();
    //Init Sortie
    Map<Voiture, ArrayList<Trajet>> res = new HashMap();
    /*for(int i = 0; i++; i<= ent.NbStep) {
    	//faire des choses
    	
    }*/
        

    }
    
    
    public void DeplacerVoiture(Entrant ent) {
    	Map<Voiture, ArrayList<Trajet>> res = new HashMap();
    	for(int i = 0; i<= ent.voitures.size();i++) {
    		Trajet cible = res.get(i).get(res.get(i).size() - 1); // trajet en cours
    		ent.voitures.get(i).setCoordonnee(
    				this.deplacementVers(ent.voitures.get(i).getCoordonnee(), cible.getCoordArrive()));
    	}
    	
    }
    
    private Coordonnee deplacementVers(Coordonnee voiture, Coordonnee destination) {
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
 