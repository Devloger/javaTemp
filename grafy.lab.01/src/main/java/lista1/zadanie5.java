package lista1;

import java.io.IOException;

import javaGraph.main.Chooser;
import javaGraph.main.Graf;

public class zadanie5 {

	public static void main(String[] args) throws IOException {
		
		Chooser chooser = new Chooser();
		Graf graf = chooser.getFile();
		
		System.out.println("Lista wierzcho³ków grafu G: " +graf.getList());
	}

}
