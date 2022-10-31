package array;

import java.util.ArrayList;

public class Example20 {
	public static void main(String[] args) {
		int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		int n = arr.length;
		rearrangeVal2(arr, n);
	}
	
	public static void rearrangeVal(int[] arr, int n) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			if(arr[i] < 0) {
				list1.add(arr[i]);
			}else {
				list2.add(arr[i]);
			}
		}
		
		System.out.println(n);
		n= n/2;
		System.out.println(n + "-");
		
		for(int i=0; i<n; i++) {
			if(list1.get(i) != null) {
				System.out.println(list1.get(i));
			}
			if(list2.get(i) != null) {
				System.out.println(list2.get(i));
			}
		}
				
	}
	
	public static void rearrangeVal2(int[] arr, int n) {
		
		for(int i=0; i<n; i++) {
			if(arr[i]>0 && i%2==0) {
				System.out.println(arr[i]);
			}
			if(arr[i]<0 && i%2==1) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
}
