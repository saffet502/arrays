package javaprogramlamadersleri;

import java.util.Arrays;

public class Main4 {

	public static void main(String[] args) {
		
		// *************
	    // *20*40*10*80*
		// *************
		// *30*15*34*45*
		// *************
		int arr1 [][] = new int [2][4];               //{{20,40,10,80},{30,15,34,45}};
		arr1 [0][0] = 20;
		arr1 [0][1] = 40;
		arr1 [0][2] = 10;
		arr1 [0][3] = 80;
		arr1 [1][0] = 30;
		arr1 [1][1] = 15;
		arr1 [1][2] = 34;
		arr1 [1][3] = 45;
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				System.out.println("Erste Array: "+arr1[i][j]);
				
			}
			
		}
		
		int arr [][] = {{10,20,30},{40,50,60}};
		System.out.println("für Element 40 Ergebnis: "+ arr[1][0]);
		
		
		System.out.println("0 a 0 : "+arr[0][0]);
		System.out.println("1 e 2: "+arr[1][2]);
		// Olmayan index yazdirilmaya calisilirsa ArrayBoundOfException hatasi alinir.
		
		//dimentional arraylarin elemanlarini yazdirmak icin nextedFor döngüsü kullanilir. 
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Array :"+arr[i][j]);
			}
		}
		
	}

}






