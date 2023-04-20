package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < 100001; i++) {
			builder.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		long debut2 = System.currentTimeMillis();
		String string = new String();
		for (int i = 1; i < 100001; i++) {
			string = string +i;
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));

	}

}
