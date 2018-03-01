
public class Trajet {

    public Coordonnee coordDepart;
    public Coordonnee coordArrive;
    public int tempsDepart;
    public int tempsArrive;
    public int id;

    public Trajet(final Coordonnee coordDepart, final Coordonnee coordArrive, final int tempsDepart, final int tempsArrive, final int id) {
        super();
        this.coordDepart = coordDepart;
        this.coordArrive = coordArrive;
        this.tempsDepart = tempsDepart;
        this.tempsArrive = tempsArrive;
        this.id = id;
    }

    public Coordonnee getCoordDepart() {
        return coordDepart;
    }

    public void setCoordDepart(final Coordonnee coordDepart) {
        this.coordDepart = coordDepart;
    }

    public Coordonnee getCoordArrive() {
        return coordArrive;
    }

    public void setCoordArrive(final Coordonnee coordArrive) {
        this.coordArrive = coordArrive;
    }

    public int getTempsDepart() {
        return tempsDepart;
    }

    public void setTempsDepart(final int tempsDepart) {
        this.tempsDepart = tempsDepart;
    }

    public int getTempsArrive() {
        return tempsArrive;
    }

    public void setTempsArrive(final int tempsArrive) {
        this.tempsArrive = tempsArrive;
    }

}
