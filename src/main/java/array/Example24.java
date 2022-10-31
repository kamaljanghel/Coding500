package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Example24 {
	public static void main(String[] args) {
		int[] arr = {1, 9, 3, 10, 4, 20, 2};
		int n = arr.length;
		longestSum3(arr, n);
	}
	
	public static void longestSum(int[] arr, int n) {
	
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<n; i++) {
			if(arr[i-1] != arr[i]) {
				list.add(arr[i]);
			}	
		}
		
		int count = 0;
		int ans = 0;
		for(int j=0; j<list.size(); j++) {
			if(j>0 && list.get(j) == list.get(j-1)+1) {
				count++;
			}else {
				count = 1;
			}
			
			ans = Math.max(ans, count);
			
		}
		System.out.println(ans);
	}
	
	public static void longestSum2(int[] arr, int n) {
		HashSet<Integer> hSet = new HashSet<>();
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			hSet.add(i);
		}
		
		for(int i=0; i<n; ++i) {
			if(!hSet.contains(arr[i]-1)) {
				int j = arr[i];
				while(hSet.contains(j)) {
					j++;
				}
				
				if(ans<j-arr[j]) {
					ans = j-arr[i];
				}
			}
		}
		System.out.println(ans);		
	}
	
	public static void longestSum3(int[] arr, int n) {
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		for(int i=0; i<n; i++) {
			pQueue.add(arr[i]);
		}
		
		int prev = pQueue.poll();
		int count = 1;
		int max = 1;
		
		for(int i=0; i<n; i++) {
			if((pQueue.peek()-prev) > 1) {
				count = 1;
				prev = pQueue.poll();
			}else if(pQueue.peek()-prev == 0) {
				prev = pQueue.poll();
			}else {
				count++;
				prev = pQueue.poll();
			}
			
			if(max<count) {
				max = count;
			}
		}
		System.out.println(max);
		
		
		
		
		
	}
		
		
		
		
		
	 
}
