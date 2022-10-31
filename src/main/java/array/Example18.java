package array;

import java.util.HashMap;

import javax.swing.text.AbstractDocument.LeafElement;

public class Example18 {
	public static void main(String[] args) {
		int [] arr = {1,5,7,1,5};
		int target = 6;
		countPair2(arr, target);
			
	}
	
	public static void countPair(int[] arr, int target) {
		int value = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			 value = target - arr[i];
			 for(int j=i+1; j<arr.length; j++) {
				 if(value == arr[j]) {
					 count++;
				 }
			 }
		}
		System.out.println(count);
		
	}
	
	public static void countPair2(int[] arr, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(hashMap.containsKey(target - arr[i])) {
				count = count + hashMap.get(target-arr[i]);
				System.out.println(arr[i]);
				System.out.println(hashMap.get(target-arr[i]) + "-->");
			}
			if(hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
				
			}else {
				hashMap.put(arr[i], 1);
			}
			
		}
		System.out.println(count);
	}

}
