package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = CercleFactory.creerCercle(1.0);
		Cercle cercle2 = CercleFactory.creerCercle(2.0);
		System.out.println(cercle1.obtenirPerimetre() + " cm");
		System.out.println(cercle1.obtenirSurface() + " cm²");
		System.out.println(cercle2.obtenirPerimetre() + " cm");
		System.out.println(cercle2.obtenirSurface() + " cm²");
	}

}
