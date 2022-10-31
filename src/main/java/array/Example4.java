package array;

import java.util.Arrays;

public class Example4 {
	
	public static void main(String[] args) {
		
		int arr[] = {0,2,1,1,2,0};
		
		sortArray(arr);
		 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] sortArray(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}
	
	public static int[] sortArray1(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}
	
	public static int[] sortArray2(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}
	
	
	
	

}
