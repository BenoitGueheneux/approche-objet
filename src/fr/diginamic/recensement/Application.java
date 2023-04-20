package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		Recensement recensement = new Recensement();
		Scanner monNombre = new Scanner(System.in);
		System.out.println("1. Population d’une ville donnée");
		System.out.println("2. Population d’un département donné");
		System.out.println("Enter number from 0 to 9");

		int choix = Integer.parseInt(monNombre.next());
		Scanner scanner = new Scanner(System.in);
		switch (choix) {
		case 1:
			RecherchePopulationVille recherche = new RecherchePopulationVille();
			recherche.traiter(recensement, scanner);
			System.out.println(recherche.getPopulationVille());
			break;
		case 2:
			RecherchePopulationDepartement recherche2 = new RecherchePopulationDepartement();
			recherche2.traiter(recensement, scanner);
			System.out.println(recherche2.getPopulationDepartement());
			break;
		case 3:
			RecherchePopulationRegion recherche3 = new RecherchePopulationRegion();
			recherche3.traiter(recensement, scanner);
			System.out.println(recherche3.getPopulationRegion());
			break;
		case 4:
			RechercheTop10RegionLesPlusPeuplees recherche4 = new RechercheTop10RegionLesPlusPeuplees();
			recherche4.traiter(recensement, scanner);
			break;
		case 5:
			RechercheTop10DepartementLesPlusPeuplees recherche5 = new RechercheTop10DepartementLesPlusPeuplees();
			recherche5.traiter(recensement, scanner);
			break;
		case 6:
			RechercheTop10VilleLesPlusPeupleesDUnDepartement recherche6 = new RechercheTop10VilleLesPlusPeupleesDUnDepartement();
			recherche6.traiter(recensement, scanner);
			break;
		case 7:
			RechercheTop10VilleLesPlusPeupleesDUneRegion recherche7 = new RechercheTop10VilleLesPlusPeupleesDUneRegion();
			recherche7.traiter(recensement, scanner);
			break;
		
		case 8:
			RechercheTop10VilleLesPlusPeuplees recherche8 = new RechercheTop10VilleLesPlusPeuplees();
			recherche8.traiter(recensement, scanner);
			break;
		case 9:
			break;
	}

	}

}
