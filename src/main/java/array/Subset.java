package array;

public class Subset {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,5};
		Subset2(arr, 0, arr.length-1, 0);
		
	}
	
	public static void Subset(int[] arr, int start, int end, int sum) {
		
		if(start>end) {
			System.out.println(sum + "-> if");
			return;
		}
//		System.out.println("->---1-->>");

		
		Subset(arr, start+1, end, sum+arr[start]);
		//System.out.println("--2--->>");
		Subset(arr, start+1, end, sum);
	//	System.out.println("---3-->>");
		
		
	}

	public static void Subset2(int[] arr, int start, int end, int sum) {
		
		int n = arr.length;
		int total = 1 << n;
		System.out.println(total + " -> " + (n));
		for(int i=0; i<total; i++) {
			sum = 0;
			for(int j=0; j<n; j++ ) {
				if((i& (i<<j)) != 0) {
					sum = sum + arr[j];
				}
			}
			System.out.println(sum + " ");
		}
	}
}
