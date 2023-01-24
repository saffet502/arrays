package javaprogramlamadersleri;

import java.util.Scanner;

public class Main3 {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr2 [] = new int[5];
			System.out.println("Array 2'in degerlerini giriniz");
			for(int i=0; i<arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}
			mean(arr2);		
			sc.close();
		}		
		
		public static void mean( int arr []) {
			
			int total = 0;
			
			for(int i=0; i < arr.length; i++) {
				total += arr[i];
			}
			System.out.println("Ortalama: "+ (double)total/arr.length);
		}

	}


