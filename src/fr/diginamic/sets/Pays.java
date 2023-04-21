package fr.diginamic.sets;

public class Pays {
	private String nom;
	private int nombreHabitant;
	private double PIBParHabitant;

	public Pays(String nom, int nombreHabitant, double pIBParHabitant) {
		super();
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
		PIBParHabitant = pIBParHabitant;
	}
	
	

	@Override
	public String toString() {
		return nom + " " + nombreHabitant + " " + PIBParHabitant + " ";
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

	public double getPIBParHabitant() {
		return PIBParHabitant;
	}

	public void setPIBParHabitant(double pIBParHabitant) {
		PIBParHabitant = pIBParHabitant;
	}



}
