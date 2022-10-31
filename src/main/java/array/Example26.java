package array;

public class Example26 {

	public static void main(String[] args) {
		int[] arr = {10, 22, 5, 75, 65, 80};
		int n = arr.length;
		buySell2(arr, n);
	}
	
	public static void buySell(int[] arr, int n) {
		int profit [] = new int[n];
		for(int i=0; i<n; i++) {
			profit[i] = 0;
			
		}
		int max_price = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			if(arr[i] > max_price) {
				max_price = arr[i];
			}
			profit[i] = Math.max(profit[i+1], max_price-arr[i]);
		}
		
		int min_price = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]<min_price) {
				min_price = arr[i];
			}
			profit[i] = Math.max(profit[i-1], profit[i]+(arr[i]-min_price));
		}
		int result = profit[n-1];
		System.out.println(result);
	}
	
	public static void buySell2(int[] arr, int n) {
		int first_buy = Integer.MIN_VALUE;
	      int first_sell = 0;
	      int second_buy = Integer.MIN_VALUE;
	      int second_sell = 0;
	       
	      for(int i = 0; i < n; i++) {
	         
	          first_buy = Math.max(first_buy,-arr[i]);
	          first_sell = Math.max(first_sell,first_buy+arr[i]);
	          second_buy = Math.max(second_buy,first_sell-arr[i]);
	          second_sell = Math.max(second_sell,second_buy+arr[i]);
	       
	    }
	     System.out.println(second_sell);
		
	}
}
