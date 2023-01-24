package uebungen;

public class Uebung3 {
	
	public static void main(String[] args) {
		
		int sort[] = {3,11,1,5,45,7};
		for (int i = 0; i < sort.length; i++) {	
			int temp = 0;
			for (int j = i+1; j < sort.length; j++) {
				if(sort[i]>sort[j]) {
					temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
			System.out.println(sort[i]);			
		}
	}

}
