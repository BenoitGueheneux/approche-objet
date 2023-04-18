package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
	private int populationRegion;
	
	

	public RecherchePopulationRegion() {
		super();
	}



	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.populationRegion = 0;
		System.out.println("Enter le code d'une region");
		int scan = Integer.parseInt(scanner.next()) ;
		
		for (Ville ville : recensement.getVilles()) {
			if(ville.getCodeRegion() == scan) {
				this.populationRegion += ville.getPopulationTotale();
			}
			
		}

	}



	public int getPopulationRegion() {
		return populationRegion;
	}



	public void setPopulationRegion(int populationRegion) {
		this.populationRegion = populationRegion;
	}

}
