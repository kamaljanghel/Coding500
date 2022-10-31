package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Example6 {
	public static void main(String args[])
	{
		int arr1[] = { 1, 2,2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };
		int m = arr1.length;
		int n = arr2.length;
//		printUnion(arr1, arr2, m, n);
//		printUnion1(arr1, arr2, m, n);
		printUnion2(arr1, arr2, m, n);
	}
	
	public static void printUnion(int[] arr1, int[] arr2, int m, int n) {
		
		int i=0;
		int j=0;
		
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				System.out.println(arr1[i++]);
			}else if(arr2[j]<arr1[i]) {
				System.out.println(arr2[j++]);
			}else {
				System.out.println(arr2[j++]);
				i++;
			}
			
			
			
		}
		
		while(i<m) {
			System.out.println(arr1[i++]);
		}while(j<n) {
			System.out.println(arr2[j++]);
		}
		
	}
	
	public static void printUnion1(int[] arr1, int[] arr2, int m, int n) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for(int i: arr1) {
			treeSet.add(i);
		}
		for(int j: arr2) {
			treeSet.add(j);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int k : treeSet) {
			list.add(k);
		}
		
		for(int l : treeSet) {
			System.out.print(l + " ");
		}
		
	}
	
	public static void printUnion2(int[] arr1, int[] arr2, int m, int n) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<m; i++ ) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr2[i])) {
				map.put(arr2[i], map.get(arr2[i])+1);
			}else {
				map.put(arr2[i], 1);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i: map.keySet()) {
			list.add(i);
			System.out.print(i + " ");
		}
		
		
	}
}
