package codingbat;

public class Array1_9 {

	public static void main(String[] args) {
		
		int nums[] = {0,1,0,1,1,0};
		evenOdd(nums);
		
	}
	
	public static int[] evenOdd(int[] nums) {
		int [] sonuc = new int[nums.length];
		
		int baslangic, son;
		
		baslangic = 0;
		son = nums.length-1;
		
		for (int i = 0; i < sonuc.length; i++) {
			if(nums[i]%2==0) {
				sonuc[baslangic] = nums[i]; 
				baslangic++;
			}
			else {
				sonuc[son] = nums[i];
				son--;
			}
		}
		for (int i : sonuc) {
			System.out.print(i+" ");
		}
		return nums;
		
	}

}
