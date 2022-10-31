package array;

public class Example17 {
	
	public static void main(String[] args) {
		int[] arr = {7,6,4,3,9};
		int n = arr.length;
		maxProfit2(arr, n);
	}
	
    public static void maxProfit(int[] arr, int n) {
        int buy = arr[0];
        int profit = 0;
		int sell = 0;
        //int n = arr.length;
        if(arr.length == 1) return ;
		for(int j=1; j<n; j++) {
				if(buy>=arr[j]) {
					buy = arr[j];
					sell = arr[j];
					//System.out.println(buy + "-");
				}
				if(sell<arr[j]  ) {
					sell = arr[j];
					//System.out.println(sell + " -> ");
					
				}
		if(sell != buy && (profit<sell-buy)) {
			profit = sell - buy;
			//System.out.println(profit);
		}
        }
		System.out.println(profit);
        
    }
    
    public static void maxProfit2(int[] arr, int n) {
    	
    	int buy = Integer.MAX_VALUE;
    	int sell = 0;
    	int price = 0;
    	for(int i=0; i<n; i++) {
    		if(arr[i] < buy) {
    			buy = arr[i];
    		}
    		sell = arr[i] - buy;
    		if(price < sell) {
    			price = sell;
    		}
    	}
    	System.out.println(price);
    	
    }

}
