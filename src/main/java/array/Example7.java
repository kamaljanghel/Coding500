package array;

import java.util.Arrays;

public class Example7 {	
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5};

		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));
		
		rotate3(arr);
		
		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotate(int[] arr) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int temp = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = temp;
		}
		
	}
	
	public static void rotate1(int[] arr) {
		int n = arr.length;
		int last = arr[n-1];
		int second = arr[n-2];
		int third = arr[n-3];
		
		for(int i=n-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		//arr[0] = second;
		arr[0] = last;
		//arr[2] = third;
		
	}
	
	public static void rotate3(int[] arr) {
		int n = arr.length-1;
		int left = 0; 
		int right = n;
		
		while(left != right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			
		}
		
	}
}
