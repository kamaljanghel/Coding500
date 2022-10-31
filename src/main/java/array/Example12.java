package array;

import java.util.Arrays;

public class Example12 {
	
	public static void main(String[] args) {
		int[] arr1 = {1,4,8,10};
		int[] arr2 = {2,6,9};
		
		sortArray2(arr1, arr2);
		
	}
	
	public static void sortArray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		
		int k = 0;
		int[] arr = new int[m+n];
		
		for(int i=0; i<n; i++) {
			arr[k++] = arr1[i]; 
		}
		//k = n-1;
		for(int j=0; j<m; j++) {
			arr[k++] = arr2[j];
			
		}
		Arrays.sort(arr);
		
		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void sortArray2(int[] arr1, int[] arr2) {
		
		int left1 = 0; int right1 = arr1.length;
		int left2 = 0; int right2 = arr2.length;
		int m = arr1.length;
		int n = arr2.length;
		int [] arr = new int[m+n];
		
		for(int k=0; k<m+n; k++) {
			if(arr1[left1] < arr2[left2] && left1<m) {
				arr[k] = arr1[left1];
				left1++;
			}else {
				arr[k] = arr2[left2];
				left2++;
			}
		}
		
		for(int k=0; k<m+n; k++) {
			System.out.println(arr[k]);
		}
		
	}
	
	
	

}
