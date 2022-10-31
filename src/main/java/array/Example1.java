package array;

import java.security.AccessControlContext;

public class Example1 {
	
	public void swap(int[] arr,int start, int end) {
		if(start>= end) {
			return ;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		swap(arr, start+1, end-1);

	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		
		int start = 0;
		int end = arr.length-1;
	
		Example1 a1 = new Example1();
		a1.swap(arr, start, end);

		for(int i=0; i<n; i++) {
			System.out.println("array " + arr[i]);
		}
	
		
		
	}

}