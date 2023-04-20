package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.testenumeration.Continent;

public class TestListeClass {

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
		
		Integer max = 0;
		Ville villemax = null;
		for (Ville ville : list) {
			if (ville.getNombreHabitant() > max) {
				max = ville.getNombreHabitant();
				villemax = ville;
			}
		}
		System.out.println(villemax);
		
		Integer min = Integer.MAX_VALUE;
		Ville villemin = null;
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i).getNombreHabitant()) {
				min = list.get(i).getNombreHabitant();
				villemin = list.get(i);
			}
		}
		System.out.println(villemin);
		list.remove(villemin);
		
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (100000 < list.get(i).getNombreHabitant()) {
				list.get(i).setNom(list.get(i).getNom().toUpperCase());
			}
		}
		System.out.println(list);
		
	}

}
