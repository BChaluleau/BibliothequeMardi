package bibliotheque;

public class Exemplaire {

	private boolean empruntable = true;
	private boolean consultableEnLigne = false;
	private String cote;

	public Exemplaire(Boolean empruntable, String cote) {
		this.cote = cote;
		this.empruntable = empruntable;
		this.consultableEnLigne = !empruntable;
	}

	public boolean isEmpruntable() {
		return empruntable;
	}

	public String getCote() {
		return cote;
	}

}
