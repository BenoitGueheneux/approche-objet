package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeClass {

	public static void main(String[] args) {
		List<Ville> list = new ArrayList<>();
		Ville ville1 = new Ville("Nice", 343000);
		list.add(ville1);
		Ville ville2 = new Ville("Carcasonne", 47800);
		list.add(ville2);
		Ville ville3 = new Ville("Narbone", 53400);
		list.add(ville3);
		Ville ville4 = new Ville("Lyon", 484000);
		list.add(ville4);
		Ville ville5 = new Ville("Foix", 9700);
		list.add(ville5);
		Ville ville6 = new Ville("Pau", 77200);
		list.add(ville6);
		Ville ville7 = new Ville("Marseille", 850700);
		list.add(ville7);
		Ville ville8 = new Ville("Tarbes", 40600);
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
		
	}

}
