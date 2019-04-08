package lista1;

import java.io.IOException;

import javaGraph.main.Chooser;
import javaGraph.main.Graf;

public class zadanie2 {

	public static void main(String[] args) throws IOException {
		
		Chooser chooser = new Chooser();
		Graf graf = chooser.getFile();
		
		
		System.out.println("Rz¹d grafu G wynosi: " +graf.getVortexes());
		System.out.println("Rozmiar grafu G wynosi: " +graf.getEdges());
		System.out.println("Stopnie wierzcho³ków: " +graf.getDegreesList());
		System.out.println("Ci¹g stopni grafu G: " +graf.getDegrees());
	}

}
