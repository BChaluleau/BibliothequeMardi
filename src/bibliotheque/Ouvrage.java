package bibliotheque;

public class Ouvrage {

	private static final int NB_MAX_EXEMPLAIRES = 50;

	private String titre;
	private String auteurs;
	private String editeurs;
	private int annee;
	private String numISBN;

	private Exemplaire[] exemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES];
	private int nbExemplaires = 0;

	public Ouvrage(String titre, String auteurs, String editeurs, int annee, String numISBN) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeurs = editeurs;
		this.annee = annee;
		this.numISBN = numISBN;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteurs() {
		return auteurs;
	}

	public String getEditeurs() {
		return editeurs;
	}

	public int getAnnee() {
		return annee;
	}

	public String getNumISBN() {
		return numISBN;
	}

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

}
