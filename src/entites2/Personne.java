package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse_postale;
	public Personne(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne(String nom,String prenom,AdressePostale adresse_postale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse_postale = adresse_postale;
	}
}
