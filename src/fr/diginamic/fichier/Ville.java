package fr.diginamic.fichier;

public class Ville{
	private String nom;
	private String codeDepartement;
	private String nomDeLaRegion;
	private int populationTotale;
	
	public Ville(String nom, String codeDepartement, String nomDeLaRegion, int populationTotale) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomDeLaRegion = nomDeLaRegion;
		this.populationTotale = populationTotale;
	}
	
	public String toString() {
		return getNom() +" " + getCodeDepartement()+" " + getNomDeLaRegion()+" " + getPopulationTotale();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomDeLaRegion() {
		return nomDeLaRegion;
	}

	public void setNomDeLaRegion(String nomDeLaRegion) {
		this.nomDeLaRegion = nomDeLaRegion;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	


}
