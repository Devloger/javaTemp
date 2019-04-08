package lista1;

import java.io.IOException;

import javaGraph.main.Chooser;
import javaGraph.main.Graf;

public class zadanie1 {

	public static void main(String[] args) throws IOException {
		
		Chooser chooser = new Chooser();
		Graf graf = chooser.getFile();
		
		
		System.out.println("Liczba wierzcho�k�w grafu G wynosi: " + graf.getVortexes());
		System.out.println("Zbi�r wierzcho�k�w V = {" + graf.getVortexesList());
		System.out.println("Liczba kraw�dzi grafu G wynosi: " + graf.getEdges());
		System.out.println("Zbi�r kraw�dzi E = {" + graf.getEdgesList());
		System.out.println("Macierz s�siectwa A = \n " + graf.getAdjMatrix());
		System.out.println("Macierz incydencji A = \n: " + graf.getIncMatrix());	
		
	}

}
