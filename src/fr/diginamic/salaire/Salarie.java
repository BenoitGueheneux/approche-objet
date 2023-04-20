package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private Integer salaireMensuel;
	
	

	public Salarie(String nom, String prenom, Integer salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}



	@Override
	public void getSalaire(){
		System.out.println(getSalaireMensuel());

	}



	public Integer getSalaireMensuel() {
		return salaireMensuel;
	}



	public void setSalaireMensuel(Integer salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

}
