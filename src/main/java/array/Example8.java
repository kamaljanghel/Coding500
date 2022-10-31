package array;

public class Example8 {

	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println(maxSum(arr));
		
	}
	
	public static int maxSum(int[] arr) {
		
		int max_end = 0;
		int max_so = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			max_end = max_end + arr[i];
			
			if(max_so < max_end) {
				max_so = max_end;
			}
			
			if(max_end < 0) {
				max_end = 0;
			}
		}
		return max_so;
		
		
		
	}
}
