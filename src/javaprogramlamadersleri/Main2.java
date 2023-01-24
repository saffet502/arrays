package javaprogramlamadersleri;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int arr1 []  = {10,20,30,40,50};
		int arr2 [] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Array 2'in degerlerini giriniz");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
			System.out.println("Array 2'in degerleri yaziliyor");
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Array 2'in elemanlari: "+arr2[i]);
		}
		// Yukaridaki for döngüsü asagidaki gibi for each döngüsü ile de yazilabilir. 
		for(int i : arr1) {		
			System.out.println("Eleman: "+i);
		}
	}
	

}
