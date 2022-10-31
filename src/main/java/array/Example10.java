package array;

import java.awt.desktop.AppReopenedEvent;

public class Example10 {
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = arr.length;
		System.out.println(minJump2(arr, 0, n));
	}
	
	
	public static int minJump(int[] arr, int start, int end) {
		
		if(start == end) return 0;
		if(arr[start] == 0) return Integer.MAX_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=start+1; i<= end && i<=start+arr[start]; i++) {
			int jumps = minJump(arr, i, end);
			if(jumps != Integer.MAX_VALUE && jumps+1<min) {
				min = jumps+1;
			}
		}
		return min;
	}
	
	public static int minJump2(int[] arr, int start, int end) {
		
		int[] jump = new int[end];
		if(end == 0 || arr[0] == 0) return Integer.MAX_VALUE;
		
		jump[0] = 0;
		
		
		for(int i=1; i<end; i++) {
			jump[i] = Integer.MAX_VALUE;
			for(int j=0; j<i; j++) {
				if(i <= j+arr[j] && jump[j] != Integer.MAX_VALUE) {
					jump[i] = Math.min(jump[i], jump[j]+1);
					break;
				}
			}
		}
		return jump[end-1];
	}
	

}
