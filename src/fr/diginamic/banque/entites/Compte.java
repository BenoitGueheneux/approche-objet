package fr.diginamic.banque.entites;

public class Compte {
	private String numeroDuCompte;
	private double soldeDuCompte;
	
	

	public Compte(String numeroDuCompte, double soldeDuCompte) {
		this.numeroDuCompte = numeroDuCompte;
		this.soldeDuCompte = soldeDuCompte;
	}

	public String getNumeroDuCompte() {
		return numeroDuCompte;
	}


	public void setNumeroDuCompte(String numeroDuCompte) {
		this.numeroDuCompte = numeroDuCompte;
	}


	public double getSoldeDuCompte() {
		return soldeDuCompte;
	}


	public void setSoldeDuCompte(double soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}
	public String toString() {
		return (numeroDuCompte + " " + soldeDuCompte);
	}

}
