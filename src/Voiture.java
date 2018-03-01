
public class Voiture {

    public Coordonnee coordonnee;
    public int id;

    public Voiture(final int id) {
        super();
        this.id = id;
        coordonnee = new Coordonnee();
    }

    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    public void setCoordonnee(final Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

}
