package fr.diginamic.formes;

public class Rectangle extends Forme {
	private double longueur;
	private double largueur;
	
	
	
	public Rectangle(double longueur, double largueur) {
		super();
		this.longueur = longueur;
		this.largueur = largueur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur*largueur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*(largueur+longueur);
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargueur() {
		return largueur;
	}

	public void setLargueur(double largueur) {
		this.largueur = largueur;
	}
	
}
