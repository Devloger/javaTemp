package lista1;

import java.io.IOException;

import javaGraph.main.Chooser;
import javaGraph.main.Graf;

public class zadanie4 {

	public static void main(String[] args) throws IOException {
		
		Chooser chooser = new Chooser();
		Graf graf = chooser.getFile();
		
		System.out.println(graf.getType2());
	}

}
