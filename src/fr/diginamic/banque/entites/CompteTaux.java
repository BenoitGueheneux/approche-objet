package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private String tauxDeRemuneration;

	public CompteTaux(String numeroDuCompte, double soldeDuCompte, String tauxDeRemuneration) {
		super(numeroDuCompte, soldeDuCompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	public String toString() {
		String compte = super.toString();
		return (compte + " " + tauxDeRemuneration);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(String tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

}
