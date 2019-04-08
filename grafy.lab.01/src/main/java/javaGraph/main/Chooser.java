package javaGraph.main;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chooser {

	public Graf getFile() throws IOException {
			List<String> lines = new ArrayList<>();

			URL url = getClass().getResource("/grafen.txt");
			
			Files.lines(Paths.get(url.getPath().substring(1))).forEach(lines::add);
		
			int idx = 0, edges = 0, vortexes = 0;
			int[][] matrix = null;
			
			for (String line : lines) {
				Scanner scanner = new Scanner(line);
				
				if (edges == 0) {
					vortexes = scanner.nextInt();
					edges = scanner.nextInt();
					
					matrix = new int[edges][2];
				} else {
					matrix[idx][0] = scanner.nextInt();
					matrix[idx++][1] = scanner.nextInt();
				}
				scanner.close();
			}

			return new Graf(matrix, edges, vortexes);
	}

}
