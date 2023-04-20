package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		List<Ville> list = new ArrayList<>();
		Ville ville1 = new Ville("New York", 343000,Continent.AMERIQUE);
		list.add(ville1);
		Ville ville2 = new Ville("Paris", 47800,Continent.EUROPE);
		list.add(ville2);
		Ville ville3 = new Ville("Pékin", 53400,Continent.ASIE);
		list.add(ville3);
		Ville ville4 = new Ville("Moscou", 484000,Continent.ASIE);
		list.add(ville4);
		Ville ville5 = new Ville("Berlin", 9700,Continent.EUROPE);
		list.add(ville5);
		Ville ville6 = new Ville("Sydney", 77200,Continent.OCEANIE);
		list.add(ville6);
		Ville ville7 = new Ville("Sao Paulo", 850700,Continent.AMERIQUE);
		list.add(ville7);
		Ville ville8 = new Ville("Tarbes", 40600,Continent.AFRIQUE);
		list.add(ville8);
		
		for (Ville ville : list) {
			System.out.println(ville);
		}

	}

}
