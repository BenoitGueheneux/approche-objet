package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne per1 = new Personne("B","G",new AdressePostale(5,"Clem",34000,"M"));
		Personne per2 = new Personne("B","G",new AdressePostale(6,"Clem",34000,"M"));
	}

}
