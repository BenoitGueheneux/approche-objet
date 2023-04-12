package entites;

import entites2.Personne;


public class TestPersonne {

	public static void main(String[] args) {
		Personne per1 = new Personne("Gueheneux","B",new AdressePostale(5,"Clem",34000,"M"));
		Personne per2 = new Personne("G","B",new AdressePostale(6,"Clem",34000,"M"));
		
		per1.modifierNom("Bloup");
		per1.afficherNomPrenom();
		per1.modifierAdresse(new AdressePostale(6,"Clem",34000,"M"));
		per1.afficherAdresse();
		
	}
	
	
}
