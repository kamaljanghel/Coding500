package array;

import java.util.HashMap;
import java.util.Map;

public class Example25 {
	
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
		int k = 4;
		
		moreTime(arr, k);
	}
	
	public static void moreTime(int[] arr, int k) {
		int n = arr.length;
		int x = n/k;
		
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			if(!hMap.containsKey(arr[i])) {
				hMap.put(arr[i], 1);
			}else {
				int val = hMap.get(arr[i]);
				hMap.put(arr[i], val+1);
			}
		}
		
		for(Map.Entry mEntry : hMap.entrySet()) {
			Integer tempInteger = (Integer) mEntry.getValue();
			//System.out.println(tempInteger);
			if(tempInteger > x) {
				System.out.println(mEntry.getKey() );
			}
		}
		
	}
	
	public static void moreTime2(int[] arr, int k) {
		
		
		
		
		
		
	}

}
