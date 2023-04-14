package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class FusionListe {
	public static void main(String args[]) {
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		ArrayList<String> liste3 = new ArrayList<String>();

		Iterator<String> iterator1 = liste1.iterator();
		while (iterator1.hasNext()) {
			liste3.add(iterator1.next());
		}
		Iterator<String> iterator2 = liste2.iterator();
		while (iterator2.hasNext()) {
			liste3.add(iterator2.next());

		}
		System.out.println(liste3);
	}
}
