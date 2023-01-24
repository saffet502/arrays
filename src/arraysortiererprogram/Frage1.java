package arraysortiererprogram;

import java.util.Arrays;

public class Frage1 {

	public static void main(String[] args) {
		
		double [] zahlen = {9.54, 5.245, 7.123, 3.567, 1.654, 2.986};
		Arrays.sort(zahlen);
		for(double zahl : zahlen) {
			System.out.println(zahl);	
		}
		int[][] zahlen2Dim = {{7,5,4}, {4,9,9}, {5,10,1}};
		int [][] test = arraySort(zahlen2Dim, 0);
		
		for(int i=0; i<test.length; i++) {
			System.out.println(test[i][0] + "-" + test[i][1] + "-" + test[i][2]);
		}
	}

	private static int[][] arraySort(int[][] array, int spalte) {
		
		return null;
	}

	private static double[] arraySort(double[] zahlen) {
		
		return null;
	}

}
