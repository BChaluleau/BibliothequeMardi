package bibliotheque;

public class Scenario {

	public static void main(String[] args) {
		System.out.println("Test de la bibliothèque");
		Bibliotheque bibli = new Bibliotheque(50);
		Ouvrage o = new Ouvrage("Titre", "Auteurs", "Editeurs", 2000, "ISBN_1");
		Exemplaire ex = new Exemplaire(true, "COTE");
	}

}
