public class Heap {
	public static void main(String args[])
	{
		int[] arr = new int[100];
		arr[0] = 60;
		arr[1] = 50;
		arr[2] = 40;
		arr[3] = 30;
		int n = arr.length;
		int val = 55;
		buildHeap(arr,val);
		
	}
	
	public static void buildHeap(int[] arr, int val) {
		arr[5] = val;
		int size = 5;
		
		while(size>1) {
			int parent = size/2;
			if(arr[parent] < arr[size]) {
				System.out.println(arr[parent] + " " + arr[size]);
				
				System.out.println(swap(arr[parent], arr[size]));
				size = parent;
				System.out.println(size + " " + parent);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
	
	public static int swap(int parent, int size) {
		int temp = parent;
		parent = size;
		size = parent;
		return 0;
		
	}
	
	
		
		
}
