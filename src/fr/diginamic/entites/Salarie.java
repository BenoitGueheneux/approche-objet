package fr.diginamic.entites;

import fr.diginamic.chaines.ManipulationChaine;

public class Salarie {
	private String nom;
	private String prenom;
	private double salaire;
	
	
	
	public Salarie(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	Salarie salaire1 = new Salarie(ManipulationChaine.tableau[0],ManipulationChaine.tableau[1],Double.parseDouble(ManipulationChaine.tableau[2].replace(" ", "")));
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
