package javaprogramlamadersleri;

public class Main {

	public static void main(String[] args) {
	
		int arr1 []  = {10,20,30,40,50};
		int arr2 [] = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		System.out.println("Array 2'in birinci elemani: " + arr2[0]);
		System.out.println("Array 1'in ikinci elemani: "+ arr1[1]);
		
		for(int i= 0; i < arr1.length; i++) {
			System.out.println("Eleman: "+arr1[i]);
		}
		
		
	}

}
