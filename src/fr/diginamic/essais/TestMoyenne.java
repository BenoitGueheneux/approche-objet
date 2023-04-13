package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne moyenne1 = new CalculMoyenne(new double[0]);
		moyenne1.ajout(0);
		moyenne1.ajout(10.5);
		moyenne1.ajout(-10.5);
		System.out.println(moyenne1.calcul());
		CalculMoyenne moyenne2 = new CalculMoyenne(new double[0]);
		moyenne2.ajout(0);
		moyenne2.ajout(10);
		moyenne2.ajout(20);
		System.out.println(moyenne2.calcul());
		
	}

}
