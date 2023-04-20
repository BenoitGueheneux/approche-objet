package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie1 = new Salarie("G","Ben",1500);
		Pigiste pigiste1 = new Pigiste("G","oit",100,5);
		salarie1.getSalaire();
		pigiste1.getSalaire();

	}

}
