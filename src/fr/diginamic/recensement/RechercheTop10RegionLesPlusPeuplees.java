package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class RechercheTop10RegionLesPlusPeuplees extends MenuService {
	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	public RechercheTop10RegionLesPlusPeuplees() {
		super();
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		for (Ville ville : recensement.getVilles()) {
			if (map.containsKey(ville.getNomDeLaRegion())) {
				Integer temp = map.get(ville.getNomDeLaRegion());
				map.put(ville.getNomDeLaRegion(), ville.getPopulationTotale() + temp);
			} else {
				map.put(ville.getNomDeLaRegion(), ville.getPopulationTotale());
			}
		}
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		for (String key : map.keySet()) {
			liste1.add(map.get(key));
			liste1.sort(null);
		}
		for (int i = liste1.size()-10;i<liste1.size();i++) {
			for (String key : map.keySet()) {
				if (map.get(key)==liste1.get(i)) {
					System.out.println(liste1.size() - i +" "+key +" "+ map.get(key));
				}
			}
		}

	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

}
