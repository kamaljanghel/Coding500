package array;

import java.util.HashSet;

public class Example21 {

	public static void main(String[] args) {
		int [] arr = {4, 2, -3, 1, 6};
		int n = arr.length;
		subSum(arr, n);
	}
	public static void subSum(int[] arr, int n) {
		int sum = 0;
		int count = 0;
		for(int i=0; i<n; i++) {
			sum = arr[i];
			for(int j=i+1; j<n; j++) {
				sum = sum + arr[j];
				if(sum == 0) {
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println(count);
			System.out.println(true);

		}
	}
	
	public static boolean subSum2(int[] arr, int n) {
		HashSet<Integer> hs = new HashSet<>();
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			if(arr[i] ==0 || sum == 0 || hs.contains(sum)) return true;
			else hs.add(sum);
		}
		
		
	return false;		
	}
	}

