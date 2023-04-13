package fr.diginamic.operations;

public class CalculMoyenne {
	private double[] tableauDeDouble;

	public CalculMoyenne(double[] tableauDeDouble) {
		super();
		this.tableauDeDouble = tableauDeDouble;
	}

	public void ajout(double nouveauDouble) {
		double[] nouveauTableau = new double[tableauDeDouble.length + 1];
		for (int i = 0; i < tableauDeDouble.length; i++) {
			nouveauTableau[i] = tableauDeDouble[i];
		}
		nouveauTableau[tableauDeDouble.length] = nouveauDouble;
		setTableauDeDouble(nouveauTableau);
	}

	public double calcul() {
		double somme = 0;
		for (double d : tableauDeDouble) {
			somme += d;
		}
		somme /= tableauDeDouble.length;
		return somme;
	}

	public double[] getTableauDeDouble() {
		return tableauDeDouble;
	}

	public void setTableauDeDouble(double[] tableauDeDouble) {
		this.tableauDeDouble = tableauDeDouble;
	}

}
