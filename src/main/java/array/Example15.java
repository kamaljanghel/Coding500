package array;

import java.util.ArrayList;
import java.util.List;

public class Example15 {
	public static void main(String args[]) {
		//Example15 example15 = new Example15();
		int[] arr = {1,3,6,5,1,2};
		int n = arr.length;
		List<List<Integer>> list = getPermutation2(arr);
		
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + " " );
			}
			System.out.println();
		}
		
	}

	public static List<List<Integer>> getPermutation(int[] arr) {
		
		List<List<Integer>> ans = new ArrayList<>();
		recurPer(0, arr, ans);
		return ans;
	}
	
	public static void recurPer(int index, int[] nums, List<List<Integer>> ans) {
		
		if(index == nums.length){
			List<Integer> ds = new ArrayList<>();
			for(int i=0; i<nums.length; i++) {
				ds.add(nums[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i=index; i<nums.length; i++) {
			swap(i, index, nums);
			recurPer(index+1, nums, ans);
			swap(i, index, nums);
		}
		
		
	}
	
	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
		
		
	
	public static void PrintingData(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	
	
	///////////////////--------------------->> Optimize space here
	
	
	public static List<List<Integer>> getPermutation2(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		recurPermute(0, arr, ans);
		return ans;
	}
	
	public static void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
		if(index == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for(int i=0; i<nums.length; i++) {
				ds.add(nums[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i=0; i<nums.length; i++) {
			swap(i, index, nums);
			recurPermute(index+1, nums, ans);
			swap(i, index, nums);
		}
		
	}
	

}
