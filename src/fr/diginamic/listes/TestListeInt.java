package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);
		System.out.println(liste1);
		System.out.println(liste1.size());
		Integer max = 0;
		for (Integer integer : liste1) {
			if (integer > max) {
				max = integer;
			}
		}
		System.out.println(max);
		Integer min = 0;
		for (int i = 0; i < liste1.size(); i++) {
			if (min > liste1.get(i)) {
				min = liste1.get(i);
			}
		}
		liste1.remove(min);
		System.out.println(liste1);
		for (int i = 0; i < liste1.size(); i++) {
			if (0 > liste1.get(i)) {
				liste1.set(i, -liste1.get(i));
			}

		}
		System.out.println(liste1);
	}
}
