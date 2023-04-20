package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps",1),
	ETE("Eté",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	private String libelle;
	private Integer ordre;
	
	private Saison(String libelle, Integer ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}
	public String getLibelle() {
		return libelle;
	}
	public Integer getOrdre() {
		return ordre;
	}
	
	public static Saison instance(String libelles) {
		Saison result = null;
		for (Saison saison : Saison.values()) {
			if (saison.getLibelle().equals(libelles)) {
				result = saison;
			}
		}
		return result;
	}

	
	
	
}
