package fr.diginamic.recensement;

import java.util.HashMap;
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
				map.put(ville.getNomDeLaRegion(), ville.getPopulationTotale()+ temp);
			} else {
				map.put(ville.getNomDeLaRegion(), ville.getPopulationTotale());
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
