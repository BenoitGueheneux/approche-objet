package fr.diginamic.entites;

public class AdressePostale {
	private int numeroRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
	
	
	
	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public AdressePostale() {
		
	}
	
	public AdressePostale(int numeroRue,String libelleRue,int codePostal,String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue =libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
		
		
	}

}
