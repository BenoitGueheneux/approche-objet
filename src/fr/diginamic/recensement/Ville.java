package fr.diginamic.recensement;

public class Ville {
	private int codeRegion;
	private String nomDeLaRegion;
	private String codeDepartement;
	private int codeDeLaCommune;
	private String nomDeLaCommune;
	private int PopulationTotale;
	
	public Ville(int codeRegion, String nomDeLaRegion, String codeDepartement, int codeDeLaCommune, String nomDeLaCommuen,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomDeLaRegion = nomDeLaRegion;
		this.codeDepartement = codeDepartement;
		this.codeDeLaCommune = codeDeLaCommune;
		this.nomDeLaCommune = nomDeLaCommuen;
		this.PopulationTotale = populationTotale;
	
	
	
	}

	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomDeLaRegion=" + nomDeLaRegion + ", codeDepartement="
				+ codeDepartement + ", codeDeLaCommune=" + codeDeLaCommune + ", nomDeLaCommuen=" + nomDeLaCommune
				+ ", PopulationTotale=" + PopulationTotale + "]";
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomDeLaRegion() {
		return nomDeLaRegion;
	}

	public void setNomDeLaRegion(String nomDeLaRegion) {
		this.nomDeLaRegion = nomDeLaRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getCodeDeLaCommune() {
		return codeDeLaCommune;
	}

	public void setCodeDeLaCommune(int codeDeLaCommune) {
		this.codeDeLaCommune = codeDeLaCommune;
	}

	public String getNomDeLaCommune() {
		return nomDeLaCommune;
	}

	public void setNomDeLaCommune(String nomDeLaCommuen) {
		this.nomDeLaCommune = nomDeLaCommuen;
	}

	public int getPopulationTotale() {
		return PopulationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.PopulationTotale = populationTotale;
	}
	
	
}
