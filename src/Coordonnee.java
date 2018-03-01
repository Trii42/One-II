
public class Coordonnee {

    public int x;
    public int y;

    public Coordonnee(final int x, final int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Coordonnee() {
        super();
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordonnee other = (Coordonnee) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
