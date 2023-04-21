package fr.diginamic.sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> setDeString = new HashSet<String>();
		setDeString.add("USA");
		setDeString.add("France");
		setDeString.add("Allemagne");
		setDeString.add("UK");
		setDeString.add("Italie");
		setDeString.add("Japon");
		setDeString.add("Chine");
		setDeString.add("Russie");
		setDeString.add("Inde");
		int lettremax = 0;
		String lettremaxnom = "";
		for (String string : setDeString) {
			if (lettremax < string.length()) {
				lettremax = string.length();
				lettremaxnom = string;
			}
		}
		setDeString.remove(lettremaxnom);
		System.out.println(setDeString);
		
	}

}
