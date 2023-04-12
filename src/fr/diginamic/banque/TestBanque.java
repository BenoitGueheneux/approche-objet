package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte("123", 0);
		System.out.println(compte1);
		Compte[] tb = new Compte[2];
		tb[0] = new Compte("123", 0.0);
		tb[1] = new CompteTaux("123", 0.0, "épargne");
		for (Compte compte : tb) {
			System.out.println(compte);
		}
	}

}
