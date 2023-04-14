package fr.diginamic.entites2;

import fr.diginamic.entites.AdressePostale;

public class Personne {
	private String nom;
	private String prenom;
	private AdressePostale adressepostale;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public AdressePostale getAdressepostale() {
		return adressepostale;
	}
	public void setAdressepostale(AdressePostale adressepostale) {
		this.adressepostale = adressepostale;
	}
	
	public Personne(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne(String nom,String prenom,AdressePostale adressepostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressepostale = adressepostale;
	}
	public void afficherNomPrenom() {
		System.out.println(nom.toUpperCase()+prenom);
	}
	public void modifierNom(String nouveauNom) {
		nom = nouveauNom;
	}
	public void modifierPrenom(String nouveauPrenom) {
		prenom = nouveauPrenom;
	}
	public void modifierAdresse(AdressePostale nouvelleAdresse) {
		adressepostale = nouvelleAdresse;
	}
	public void afficherNom() {
		System.out.println(nom);
	}
	public void afficherPrenom() {
		System.out.println(prenom);
	}
	public void afficherAdresse() {
		System.out.println(adressepostale);
	}
	
	
	
}
