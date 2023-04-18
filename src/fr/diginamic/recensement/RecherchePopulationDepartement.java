package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
	private int populationDepartement;
	
	

	public RecherchePopulationDepartement() {
		super();
	}



	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.populationDepartement = 0;
		System.out.println("Enter le code d'un departement");
		String scan = scanner.next();
		
		for (Ville ville : recensement.getVilles()) {
			if(ville.getCodeDepartement().equals(scan)) {
				this.populationDepartement += ville.getPopulationTotale();
			}
			
		}

	}



	public int getPopulationDepartement() {
		return populationDepartement;
	}



	public void setPopulationDepartement(int populationDepartement) {
		this.populationDepartement = populationDepartement;
	}

}
