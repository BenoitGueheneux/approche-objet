package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Nice");
		liste1.add("Carcassonne");
		liste1.add("Narbonne");
		liste1.add("Lyon");
		liste1.add("Foix");
		liste1.add("Pau");
		liste1.add("Marseille");
		liste1.add("Tarbes");
		Integer maxLettre = 0;
		Integer maxIndice = 0;
		for (int i = 0; i < liste1.size(); i++) {
			if (maxLettre < liste1.get(i).length()) {
				maxLettre = liste1.get(i).length();
				maxIndice = i;
			}
		}
		System.out.println(liste1.get(maxIndice));
		for (int i = 0; i < liste1.size(); i++) {
			liste1.set(i, liste1.get(i).toUpperCase());
		}
		Iterator<String> iterator1 = liste1.iterator();
		while (iterator1.hasNext()) {
			String string = iterator1.next();
			if (string.charAt(0) == 'N') {
				iterator1.remove();
			}
		}
		System.out.println(liste1);

	}
}
