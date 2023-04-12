package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOperation;
	private double montantOperation;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public Operation(String dateOperation, double montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

	

}
