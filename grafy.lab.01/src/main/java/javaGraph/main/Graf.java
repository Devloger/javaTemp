package javaGraph.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Graf {
	
	private int edges, vortexes;
	private int[][] matrix;
	
	public Graf(int[][] matrix, int edges, int vortexes) {
		
		this.matrix = matrix;
		this.edges = edges;
		this.vortexes = vortexes;
	}

	public int getVortexes() {
		return vortexes;
	}

	public String getVortexesList() {
		Set<Integer> list = new HashSet<>();
		
		for (int[] i : matrix) 
			for (int j : i) 
				list.add(j);	
		
		String vortexes = "";
		
		for (int i : list) {
			if (vortexes.length() > 0) vortexes += ", ";
			vortexes += i;
		}	
		return vortexes;
	}
	
	public int getEdges() {
		return edges;
	}

	public String getEdgesList() {
		String edges = "";
		
		for (int[] i : matrix) {
			if (edges.length() > 0) edges += ", ";		
			edges += (i[0] +"-"+ i[1]);
		}
		return edges;
	}
	
	public String getAdjMatrix() {
		int[][] matrix = new int[vortexes][vortexes];
		
		for (int[] i : this.matrix) {
			matrix[i[0] - 1][i[1] - 1]++;
			matrix[i[1] - 1][i[0] - 1]++;
		}
		
		String adjMatrix = "";
		
		for (int x = 0; x < vortexes; x++) {
			adjMatrix += "| ";
			for (int y = 0; y < vortexes; y++) {
				adjMatrix += (matrix[x][y] +" ");
			}
			adjMatrix += "|\n";
		}
		return adjMatrix;
	}
	
	public String getIncMatrix() {
		int[][] matrix = new int[vortexes][edges];
		int idx = 0;
		
		for (int[] i : this.matrix) {
			matrix[i[0] - 1][idx]++;
			matrix[i[1] - 1][idx++]++;
		}
		
		String incMatrix = "";
		
		for (int x = 0; x < vortexes; x++) {
			incMatrix += "| ";
			for (int y = 0; y < edges; y++) {
				incMatrix += (matrix[x][y] +" ");
			}
			incMatrix += "|\n";
		}
		return incMatrix;
	}
	
	public String getDegreesList() {
		int[] degree = new int[vortexes];
		
		for (int[] i : this.matrix) {
			degree[i[0] - 1]++;
			if (i[0] != i[1]) degree[i[1] - 1]++;
		}
		String degreeList = "";
		
		for (int i = 0; i < degree.length; i++) {
			degreeList += ("\ndeg("+ (i + 1) +") = "+ degree[i]);
		}

		return degreeList;
	}
	
	public String getDegrees() {
		int[] degree = new int[vortexes];
		
		for (int[] i : this.matrix) {
			degree[i[0] - 1]++;
			if (i[0] != i[1]) degree[i[1] - 1]++;
		}
		
		Arrays.sort(degree);

		return Arrays.toString(degree);
	}
	
	public String getType() {
		for (int[] i : this.matrix) {
			if (i[0] == i[1]) return "ogólnym";
		}
		return "prostym";
	}
	
	public String getType2() {
		int[][] matrix = new int[vortexes][vortexes];
		
		for (int[] i : this.matrix) {
			matrix[i[0] - 1][i[1] - 1]++;
			matrix[i[1] - 1][i[0] - 1]++;
		}
		
		String string = "";
		
		int count = 0;
		
		for (int x = 0; x < vortexes; x++) {
			for (int y = x + 1; y < vortexes; y++) {
				if (matrix[x][y] == 0) {
					if (string.length() > 0) string += ", ";
					else string = "Graf G nie jest grafem pe³nym.\n\nKrawêdzie dope³nienia grafu G: ";
					
					string += ((x + 1) +" - "+ (y + 1));
					
					count++;
				}
			}
		}
		if (count > 0) {
			
		} else {
			string = "Graf G jest grafem pe³nym.";
		}
		return string;
	}
	
	public String getList() {
		int[][] matrix = new int[vortexes][vortexes];
		
		for (int[] i : this.matrix) {
			matrix[i[0] - 1][i[1] - 1]++;
			matrix[i[1] - 1][i[0] - 1]++;
		}
		
		String string = "";
		
		for (int x = 0; x < vortexes; x++) {
			string += ("\n"+ (x + 1) +" ->");

			for (int y = 0; y < vortexes; y++) {
				if (matrix[x][y] > 0) {
					if (string.charAt(string.length() - 1) != '>') {
						string += ",";
					}
					string += " "+ (y + 1);
				}
			}
		}
		return string;
	}	
	
}
