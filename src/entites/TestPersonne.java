package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne per1 = new Personne();
		per1.nom = "B";
		per1.prenom = "G";
		per1.adresse_postale = new AdressePostale();
		per1.adresse_postale.numeroRue = 5;
		per1.adresse_postale.libelleRue = "Clem";
		per1.adresse_postale.codePostal = 34000;
		per1.adresse_postale.ville = "Montp";
		Personne per2 = new Personne();
		per2.nom = "B";
		per2.prenom = "G";
		per2.adresse_postale = new AdressePostale();
		per2.adresse_postale.numeroRue = 6;
		per2.adresse_postale.libelleRue = "Clem";
		per2.adresse_postale.codePostal = 34000;
		per2.adresse_postale.ville = "Montp";
		

	}

}
