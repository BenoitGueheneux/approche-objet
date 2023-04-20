package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private Integer salaireJournalier;
	private Integer jourTravailler;

	public Pigiste(String nom, String prenom, Integer salaireJournalier, Integer jourTravailler) {
		super(nom, prenom);
		this.salaireJournalier = salaireJournalier;
		this.jourTravailler = jourTravailler;
	}

	@Override
	public void getSalaire() {
		System.out.println(getSalaireJournalier() * getJourTravailler());
	}

	public Integer getSalaireJournalier() {
		return salaireJournalier;
	}

	public void setSalaireJournalier(Integer salaireJournalier) {
		this.salaireJournalier = salaireJournalier;
	}

	public Integer getJourTravailler() {
		return jourTravailler;
	}

	public void setJourTravailler(Integer jourTravailler) {
		this.jourTravailler = jourTravailler;
	}

}
