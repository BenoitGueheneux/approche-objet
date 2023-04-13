package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int capaciteMax;
	private int totalClientInscrit;
	private double recetteTotalEtablissement;
	
	public Theatre(String nom, int capaciteMax, int totalClientInscrit, double recetteTotalEtablissement) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalClientInscrit = totalClientInscrit;
		this.recetteTotalEtablissement = recetteTotalEtablissement;
	}
	
	public void inscrire(int nombreDeClient,double prixDeLaPlace){
		if (nombreDeClient+getTotalClientInscrit()<=getCapaciteMax()) {
			setTotalClientInscrit(nombreDeClient+getTotalClientInscrit());
			setRecetteTotalEtablissement(prixDeLaPlace*nombreDeClient+getRecetteTotalEtablissement());
		}
		else {
			System.out.println("Dépassement de la capacité max");
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalClientInscrit() {
		return totalClientInscrit;
	}

	public void setTotalClientInscrit(int totalClientInscrit) {
		this.totalClientInscrit = totalClientInscrit;
	}

	public double getRecetteTotalEtablissement() {
		return recetteTotalEtablissement;
	}

	public void setRecetteTotalEtablissement(double recetteTotalEtablissement) {
		this.recetteTotalEtablissement = recetteTotalEtablissement;
	}
	
	
}
