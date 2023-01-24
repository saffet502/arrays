package arrayprobe;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		arrayListeleri();
			
	}
	
	public static void arrayListeleri() {
		int arr[] = {1,45,3,89};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 1));
	}

}
