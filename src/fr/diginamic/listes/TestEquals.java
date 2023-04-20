package fr.diginamic.listes;

import fr.diginamic.testenumeration.Continent;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Nice", 343000,Continent.EUROPE);
		Ville ville2 = new Ville("Nice", 343000,Continent.EUROPE);
		Ville ville3 = new Ville("Nice", 53400,Continent.EUROPE);
		Ville ville4 = new Ville("Lyon", 343000,Continent.EUROPE);
		Ville ville5 = new Ville("Foix", 9700,Continent.EUROPE);
		
		System.out.println(ville1.equals(ville2));
		System.out.println(ville1.equals(ville3));
		System.out.println(ville1.equals(ville4));
		System.out.println(ville1.equals(ville5));
		

	}

}
