package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.List;


public class Recensement {
	private List<Ville> villes = new ArrayList<Ville>();

	
	
	public Recensement() throws IOException{
		super();
		creationRecensement();
		
	}
	
	
	public  void creationRecensement() throws IOException {
		Path path = Paths.get("C:/Users/Benlo/Downloads/recensement.csv");

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<Ville> lines2 = new ArrayList<>();
		for (int i = 1; i < lines.size(); i++) {
			String[] tokens = lines.get(i).split(";");
			this.villes.add(new Ville(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[5]),
					tokens[6], Integer.parseInt(tokens[9].trim().replaceAll(" ", ""))));
			
		}

	}


	public List<Ville> getVilles() {
		return villes;
	}





	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
}




//	public static void main(String[] args) throws IOException{
//		Path path = Paths.get("C:/Users/Benlo/Downloads/recensement.csv");
//
//		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//		List<Ville> lines2 = new ArrayList<>();
//		for (int i = 1; i < lines.size(); i++) {
//			String[] tokens = lines.get(i).split(";");
//			lines2.add(
//					new Ville(
//							Integer.parseInt(tokens[0]),
//							tokens[1],
//							tokens[2],
//							Integer.parseInt(tokens[5]),
//							tokens[6],
//							Integer.parseInt(tokens[9].trim().replaceAll(" ", ""))));
//
//		}
//	}
//
//
