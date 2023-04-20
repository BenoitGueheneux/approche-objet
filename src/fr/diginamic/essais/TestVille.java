package fr.diginamic.essais;

import fr.diginamic.listes.ComparatorHabitant;
import fr.diginamic.listes.ComparatorNom;
import fr.diginamic.listes.Ville;
import fr.diginamic.testenumeration.Continent;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestVille {
	public static void main(String[] args) {
		List<Ville> list = new ArrayList<>();
		Ville ville1 = new Ville("Nice", 343000,Continent.EUROPE);
		list.add(ville1);
		Ville ville2 = new Ville("Carcasonne", 47800,Continent.EUROPE);
		list.add(ville2);
		Ville ville3 = new Ville("Narbone", 53400,Continent.EUROPE);
		list.add(ville3);
		Ville ville4 = new Ville("Lyon", 484000,Continent.EUROPE);
		list.add(ville4);
		Ville ville5 = new Ville("Foix", 9700,Continent.EUROPE);
		list.add(ville5);
		Ville ville6 = new Ville("Pau", 77200,Continent.EUROPE);
		list.add(ville6);
		Ville ville7 = new Ville("Marseille", 850700,Continent.EUROPE);
		list.add(ville7);
		Ville ville8 = new Ville("Tarbes", 40600,Continent.EUROPE);
		list.add(ville8);
		Collections.sort(list,new ComparatorHabitant());
		System.out.println(list);
		Collections.sort(list,new ComparatorNom());
		System.out.println(list);
		
		

	}
}
