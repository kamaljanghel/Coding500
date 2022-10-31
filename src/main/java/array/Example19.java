package array;

import java.util.ArrayList;

public class Example19 {
	public static void main(String[] args) {
		int [] arr1 = {1, 5, 10, 10, 20, 40, 80};
		int [] arr2 = {6, 7, 10, 20, 80, 100};
		int [] arr3 = {3, 4, 10, 15, 20, 30, 70, 80,120};
		commonVal2(arr1, arr2, arr3);
		
	}
	public static void commonVal(int[] arr1, int[] arr2, int[] arr3) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		int n = arr1.length;
		int m = arr2.length;
		int k = arr3.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}
			}
		}
		
		
		
		for(int i=0; i<k; i++) {
			for(int j: list) {
				if(arr3[i] == j) {
					list1.add(arr3[i]);
				}
			}
		}
		
		for(int i : list1) {
			System.out.print (i + " " );
		}
	}
		
	public static void commonVal2(int[] arr1, int[] arr2, int[] arr3) {
		int n = arr1.length;
		int m = arr2.length;
		int p = arr3.length;
		int i=0, j=0, k=0;
		
		while(i<n && j<m && k<p) {
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				k++;
			}else if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr2[j]<arr3[k]) {
				j++;
			}else {
				k++;
			}
			
			
		}
		
		
	}	
	
	public static void commonVal3(int[] arr1, int[] arr2, int[] arr3) {
		/// HashSet value for all values
	}
		

		
	}
	
	
