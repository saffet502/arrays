package techproed;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProbe {

	public static void main(String[] args) {
		arrayExistProbe();	
	}
	public static void arrayExistProbe() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("array icin eleman sayisi secin");
		int length1 = sc.nextInt();
		int arr1 [] = new int[length1];
		
		System.out.println("Array rakamlarini girin");
		
		for(int i=0; i<length1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("diger array icin eleman sayisi secin");
		int length2 = sc.nextInt();
		int arr2 [] = new int[length2];
		System.out.println("Ikinci array rakamlarini girin");
	
		for(int j=0; j<length2; j++) {
			arr2[j] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i<length1; i++) {
			for(int j =0; j<length2; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+"-"+arr2[j]);
				}
			}
		}
	}
}
