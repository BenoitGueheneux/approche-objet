package fr.diginamic.listes;

public class Ville implements Comparable<Ville> {
	private String nom;
	private int nombreHabitant;

	public Ville(String nom, int nombreHabitant) {
		super();
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
	}

	@Override
//	public int compareTo(Ville ville) {
//		return this.nom.compareTo(ville.getNom());
//		// ArrayList dans TestVille dans essais
//	}
	public int compareTo(Ville ville) {
		return this.nombreHabitant - ville.getNombreHabitant();
		// ArrayList dans TestVille dans essais
	}
	
	
	public String toString() {
		return getNom() +" " + getNombreHabitant();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreHabitant() {
		return nombreHabitant;
	}

	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}

}
