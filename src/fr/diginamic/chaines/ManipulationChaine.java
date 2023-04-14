package fr.diginamic.chaines;

public class ManipulationChaine {
	public static String chaine = "Durand;Marcel;2 523.5";
	public static String[] tableau = chaine.split(";");
	
	public static void main(String[] args) {
	char premierCaractere = chaine.charAt(0);
	System.out.println("Premier caractère: " + premierCaractere);
	System.out.println(chaine.length());
	System.out.println(chaine.indexOf(";"));
	System.out.println(chaine.substring(0,chaine.indexOf(";")));
	System.out.println(chaine.substring(0,chaine.indexOf(";")).toUpperCase());
	System.out.println(chaine.substring(0,chaine.indexOf(";")).toLowerCase());
	System.out.println(tableau[0] + " " + tableau[1] + " " + tableau[2]);
	}
}
