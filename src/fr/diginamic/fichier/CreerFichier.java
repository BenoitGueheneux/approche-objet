package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Benlo/Downloads/recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<String> lines2 = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			System.out.println(lines.get(i));
			lines2.add(lines.get(i));

		}
		Path path2 = Paths.get("C:/Users/Benlo/Downloads/test.csv");
		Files.deleteIfExists(path2);
		Files.createFile(path2);
		Files.write(path2, lines2, StandardCharsets.UTF_8);
	}

}
