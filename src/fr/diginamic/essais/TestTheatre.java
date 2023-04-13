package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre1 = new Theatre("Comedie",200,53,1023.0);
		theatre1.inscrire(100, 50);
		theatre1.inscrire(50, 20);
		System.out.println(theatre1.getTotalClientInscrit());
		System.out.println(theatre1.getRecetteTotalEtablissement());
	}

}
