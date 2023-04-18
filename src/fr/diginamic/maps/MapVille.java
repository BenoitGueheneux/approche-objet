package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.listes.Ville;

public class MapVille {

	public static void main(String[] args) {
		HashMap<String, Ville> map1 = new HashMap<String, Ville>();
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
		for (int i = 0; i < list.size(); i++) {
			map1.put(list.get(i).getNom(), list.get(i));
		}
		Integer min = Integer.MAX_VALUE;
		String minKey = "";
		for (String key : map1.keySet()) {
			if (min > map1.get(key).getNombreHabitant()) {
				min = map1.get(key).getNombreHabitant();
				minKey = key;
			}
		}
		map1.remove(minKey);
		System.out.println(map1);
	}
}
