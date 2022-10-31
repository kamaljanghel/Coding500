package array;
import java.util.*;

public class Example5 {
    
    public static void move(int[] arr)
    {
        Arrays.sort(arr);
    }

    public static void move2(int[] arr)
    {
    	
        int n = arr.length;
        int j = 0;
//        int arr1[] = new int[n];
        for(int i=0; i<n; i++) {
        	if(arr[i]<0) {
        		if(i!=j) {
        			int temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        		
        		j++;
        	}
        }
    }
    
    public static void move3(int[] arr){
    	
    	int left =0;
    	int right = arr.length-1;
    	
    	while(left<=right) {
    		
    		if(arr[left]<0 && arr[right]<0) {
    			left++;
    		}else if(arr[left]>0 && arr[right]<0) {
    			int temp = arr[left];
    			arr[left] = arr[right];
    			arr[right] = temp;
    			left++;
    			right--;
    		}else if(arr[left]>0 && arr[right]>0) {
    			right--;
    		}else {
    			left++;
    			right--;
    		}
    		
    		
    		
    	}
    	
    	
    }

    
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 9, 1 };
        move3(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}