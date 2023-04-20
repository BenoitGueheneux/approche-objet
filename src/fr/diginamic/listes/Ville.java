package fr.diginamic.listes;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville> {
	private String nom;
	private int nombreHabitant;
	private Continent continent;


	
	public Ville(String nom, int nombreHabitant, Continent continent) {
		super();
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
		this.continent = continent;
	}


	public boolean equals(Object object ) {
	if (!(object instanceof Ville)) {
	 return false;
	}
	Ville other = (Ville) object;
	if(!(nom.equals(other .getNom()))){
		return false;	
		}
	if(!(nombreHabitant ==other .getNombreHabitant())){
		return false;
	}
	return true;
	}
	

	@Override
//	public int compareTo(Ville ville) {
//		return this.nom.compareTo(ville.getNom());
//		// ArrayList dans TestListeClass dans essais
//	}
	public int compareTo(Ville ville) {
		return this.nombreHabitant - ville.getNombreHabitant();
		// ArrayList dans TestListeClass dans essais
	}
	
	
	public String toString() {
		return getNom() +" " + getNombreHabitant()+" " +getContinent().getLibelle();
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


	public Continent getContinent() {
		return continent;
	}


	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
