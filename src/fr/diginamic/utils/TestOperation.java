package fr.diginamic.utils;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] monTableau = { new Credit("21/04", 1.23), new Credit("26/06", 3500.0), new Debit("06/10", 25.0),
				new Debit("11/11", 3001.0) };
		double somme = 0;
		for (Operation operation : monTableau) {
			System.out.println(operation.getDateOperation());
			System.out.println(operation.getMontantOperation());
			System.out.println(operation.getType());
			if (operation.getType().equals("CREDIT")) {
				somme += operation.getMontantOperation();
			} else if (operation.getType().equals("DEBIT")) {
				somme -= operation.getMontantOperation();
			}
		}
		System.out.println("Le montant global des opérations est : " + somme);
	}
}
