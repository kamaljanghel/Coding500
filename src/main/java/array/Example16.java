package array;

import java.util.Arrays;
import java.util.HashSet;

public class Example16 {
	public static void main(String[] args) {
		int[] arr = { 1, 20, 6, 4, 5};
		int n = arr.length;
		int start = 0;
		int end = 0;
		countInversion2(arr,start, end );
	}
	
	public static void countInversion(int[] arr, int n) {
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				
				if(arr[i] > arr[j]) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
	}
	
	public static int countInversion2(int[] arr, int start, int end) {
		
		int count = 0;
		
		if(start<end) {
			int mid = (start + end)/2;
			count += countInversion2(arr, start, mid);
			count += countInversion2(arr, mid+1, end);
			count += mergeAndCount2(arr, start, mid, end);
		}
		return count;	
	}
	
	public static int mergeAndCount2(int[] arr, int start, int mid, int end) {
		
		int[] left = Arrays.copyOfRange(arr, start, mid);
		int[] right = Arrays.copyOfRange(arr, mid, end);
		
		int i=0; 
		int j=0; 
		int k=start; 
		int swap=0 ; 
			
		while (i<left.length && j<right.length) {
			if(left[i]<right[i]) {
				arr[k++] = right[j++];
				
			}else {
				arr[k++] = right[j-1];
				swap = swap + ((mid+1)-(left[1] +1));
			}
			
			
		}
		
		while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swap;
			

		}
		
		
	}


