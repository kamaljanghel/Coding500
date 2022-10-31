package array;

public class Example29 {
	
	public static void main(String[] args) {
		int[] arr = {3, 0, 2, 0, 4};
		int n = arr.length;
		tapWater(arr, n);
	}
	
	public static void tapWater(int[] arr, int n) {
		
		int store = 0;
		
		for(int i=1; i<n-1; i++) {

			int left = arr[i];
			for(int j=0; j<i; j++) {
				left = Math.max(left, arr[j]);
			}
			
			int right = arr[i];
			for(int j= i+1; j<n; j++) {
				right = Math.max(right, arr[j]);
			}
			
			System.out.println(left + " - " + right +" - "+ arr[i]);
			
			store = store + Math.min(left, right) - arr[i];
			System.out.println(store + "<<---");
		}
		
		
	}
	
	public static void tapWater1(int[] arr, int n) {

	}

}
