package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Benlo/Downloads/recensement.csv");
		Path path2 = Paths.get("C:/Users/Benlo/Downloads/test2.csv");
		System.out.println(Files.exists(path));
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<Ville> lines2 = new ArrayList<>();
		List<String> lines3 = new ArrayList<>();
		for (int i = 1; i < lines.size(); i++) {
			String[] tokens = lines.get(i).split(";");
			lines2.add(new Ville(tokens[6], tokens[2], tokens[1],
					Integer.parseInt(tokens[9].trim().replaceAll(" ", ""))));

		}
		lines3.add("Nom de la commune;Code du departement;Nom de la region;Population totale;");
		for (Ville ville : lines2) {
			if(ville.getPopulationTotale()>25000) {
				lines3.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";"+ ville.getNomDeLaRegion()
					+  ";" + ville.getPopulationTotale()+ ";");
				}
			
		}
		System.out.println(lines3);
		Files.deleteIfExists(path2);
		Files.createFile(path2);
		Files.write(path2, lines3, StandardCharsets.UTF_8);

	}
}
