package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntiere = new ArrayList<>();
		for(int i = 0; i <100 ;i++) {
			listeEntiere.add(i+1);
		}
		System.out.println(listeEntiere.size());
	}

}
