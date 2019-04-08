package lista1;

import java.io.IOException;

import javaGraph.main.Chooser;
import javaGraph.main.Graf;

public class zadanie3 {

	public static void main(String[] args) throws IOException {
		
		Chooser chooser = new Chooser();
		Graf graf = chooser.getFile();
		
		
		System.out.println("Graf G jest grafem: " +graf.getType());
	}

}
