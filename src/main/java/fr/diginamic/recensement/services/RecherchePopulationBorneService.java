package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

/**
 * Recherche et affichage de toutes les villes d'un département dont la
 * population est comprise entre une valeur min et une valeur max renseignées
 * par l'utilisateur.
 * 
 * @author DIGINAMIC
 *
 */
public class RecherchePopulationBorneService extends MenuService {

	@Override
	public void traiter(Recensement rec, Scanner scanner) throws CodeDeptException {

		System.out.println("Quel est le code du département recherché ? ");
		String choix = scanner.nextLine();

		System.out.println("Choississez une population minimum (en milliers d'habitants): ");
		String saisieMin = scanner.nextLine();

		if (!saisieMin.matches("[0-9]+")) {
			throw new CodeDeptException("Veuillez renseigner des chiffres uniquement");
		}
		if (Integer.parseInt(saisieMin) < 0) {
			throw new CodeDeptException("Veuillez renseigner un minimum supérieur à 0");
		}

		System.out.println("Choississez une population maximum (en milliers d'habitants): ");
		String saisieMax = scanner.nextLine();

		if (!saisieMax.matches("[0-9]+")) {
			throw new CodeDeptException("Veuillez renseigner des chiffres uniquement");
		}
		if (Integer.parseInt(saisieMax) < 0) {
			throw new CodeDeptException("Veuillez renseigner un maximum supérieur à 0");
		}
		if (Integer.parseInt(saisieMax) < Integer.parseInt(saisieMin)) {
			throw new CodeDeptException("Veuillez renseigner un maximum supérieur au minimum");
		}

		int min = Integer.parseInt(saisieMin) * 1000;
		int max = Integer.parseInt(saisieMax) * 1000;
		boolean choixInvalide = true;
		List<Ville> villes = rec.getVilles();
		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equalsIgnoreCase(choix)) {
				choixInvalide = false;
				if (ville.getPopulation() >= min && ville.getPopulation() <= max) {
					System.out.println(ville);
				}
			}

		}
		if (choixInvalide == true) {
			throw new CodeDeptException("Veuillez renseigner un code département valide");
		}
	}

}
