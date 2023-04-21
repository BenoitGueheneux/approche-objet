package fr.diginamic.sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> setDePays = new HashSet<Pays>();
		setDePays.add(new Pays("USA", 331449281, 76027.043));
		setDePays.add(new Pays("France", 68042591, 44747.264));
		setDePays.add(new Pays("Allemagne", 84270625, 51103.976));
		setDePays.add(new Pays("UK", 67886004, 49761.126));
		setDePays.add(new Pays("Italie", 58851000, 34777.089));
		setDePays.add(new Pays("Japon", 124971000, 39243.371));
		setDePays.add(new Pays("Chine", 1419936142, 10525));
		setDePays.add(new Pays("Russie", 146170015, 12574.926));
		setDePays.add(new Pays("Inde", 1407564000, 2515.435));
		double maxPIBParHabitant = Double.MIN_VALUE;
		Pays maxPIBParHabitantPays = null;
		for (Pays pays : setDePays) {
			if (maxPIBParHabitant < pays.getPIBParHabitant()) {
				maxPIBParHabitant = pays.getPIBParHabitant();
				maxPIBParHabitantPays = pays;
			}
		}
		System.out.println("Le pays ayant le plus grand PIB par habitant est :" + maxPIBParHabitantPays);
		double maxPIBTotal = Double.MIN_VALUE;
		Pays maxPIBTotalPays = null;
		for (Pays pays : setDePays) {
			if (maxPIBTotal < pays.getPIBParHabitant()*pays.getNombreHabitant()) {
				maxPIBTotal = pays.getPIBParHabitant()*pays.getNombreHabitant();
				maxPIBTotalPays = pays;
			}
		}
		System.out.println("Le pays ayant le plus grand PIB total est :" + maxPIBTotalPays +" avec un PIB total de " + maxPIBTotal +" dollars.");
		double minPIBTotal = Double.MAX_VALUE;
		Pays minPIBTotalPays = null;
		for (Pays pays : setDePays) {
			if (minPIBTotal > pays.getPIBParHabitant()*pays.getNombreHabitant()) {
				minPIBTotal = pays.getPIBParHabitant()*pays.getNombreHabitant();
				minPIBTotalPays = pays;
			}
		}
		System.out.println("Le pays ayant le plus petit PIB total est :" + minPIBTotalPays +" avec un PIB total de " + minPIBTotal +" dollars.");
		for (Pays pays : setDePays) {
			if (minPIBTotalPays.equals(pays)) {
				pays.setNom(minPIBTotalPays.getNom().toUpperCase()); 
			}
		}
		System.out.println(setDePays);
		setDePays.remove(minPIBTotalPays);
		System.out.println(setDePays);
	}

}
