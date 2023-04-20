package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) throws IOException {
		Recensement recensement = new Recensement();
		int choix =0;
		do {
		Scanner monNombre = new Scanner(System.in);
		System.out.println("1. Population d’une ville donnée");
		System.out.println("2. Population d’un département donné");
		System.out.println("3. Population d’une région donnée");
		System.out.println("4. Afficher les 10 régions les plus peuplées");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
		System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
		System.out.println("8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Sortir");
		System.out.println("Enter number from 0 to 9");

		choix = Integer.parseInt(monNombre.next());
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
		}} while(choix!=9);
	}

	}


