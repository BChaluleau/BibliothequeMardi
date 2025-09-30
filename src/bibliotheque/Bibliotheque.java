package bibliotheque;

public class Bibliotheque {

	private int nbMaxOuvrages;
	private int nbOuvrages = 0;

	private Ouvrage[] ouvrages = null;

	public Bibliotheque(int nbMaxOuvrages) {
		this.nbMaxOuvrages = nbMaxOuvrages;
		ouvrages = new Ouvrage[nbMaxOuvrages]; // VLA
	}

	public int getNbOuvrages() {
		return nbOuvrages;
	}

	public Ouvrage[] getOuvrages() {
		return ouvrages;
	}

}
