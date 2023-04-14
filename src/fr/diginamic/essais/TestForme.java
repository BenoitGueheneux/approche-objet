package fr.diginamic.essais;

import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;
import fr.diginamic.essais.AffichageForme;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(1.0);
		Rectangle rectangle = new Rectangle(1.0,2.0);
		Carre carre = new Carre(1.0);
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);
		
		// TODO Auto-generated method stub

	}

}
