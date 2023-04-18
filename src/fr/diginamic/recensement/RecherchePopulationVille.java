package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
	private int populationVille;
	
	

	public RecherchePopulationVille() {
		super();
	}



	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Enter le nom d'une ville");
		String scan = scanner.next();
		
		for (Ville ville : recensement.getVilles()) {
			if(ville.getNomDeLaCommune().equals(scan)) {
				this.populationVille = ville.getPopulationTotale();
			}
			
		}

	}



	public int getPopulationVille() {
		return populationVille;
	}



	public void setPopulationVille(int populationVille) {
		this.populationVille = populationVille;
	}

}
