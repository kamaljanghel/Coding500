package array;

import java.util.HashSet;

public class Example11 {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 4, 5, 2, 3, 1};
		int n = arr.length;
		
		repeatNum3(arr, n);
		
	}
	
	public static void repeatNum(int[] arr, int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
		
	
		
	}
	
	public static void repeatNum2(int[] arr, int n) {
		int[] count = new int[n];
		
		for(int i=0; i<n; i++) {
			if(count[arr[i]] == 1) {
				System.out.println(arr[i]);
			}else {
				count[arr[i]]++;
			}
		}
		
	}
	
	public static void repeatNum3(int[] arr, int n) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<n; i++) {
			if(!hs.isEmpty() && hs.contains(arr[i])) {
				System.out.println(arr[i]);
			}
			hs.add(arr[i]);
		}
		
	}


}
