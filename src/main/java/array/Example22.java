package array;

import java.math.BigInteger;

public class Example22 {
	public static void main(String[] args) {
		int val = 1220;
		//factNum(val);
		System.out.println(factNum2(val));
	}
	public static void factNum(int val) {
		int res[] = new int[10000];
		res[0] = 1;
		int res_size = 1;
		
		for(int x = 2; x<=val; x++) {
			res_size = multiply(x, res, res_size);
		}
		System.out.println("result");
		
		for(int i=res_size-1; i>=0; i--) {
			System.out.print(res[i]);
		}
	}
	
	public static int multiply(int x, int res[], int res_size) {
		int carry = 0;
		for(int i=0; i<res_size; i++) {
			int prod = res[i] * x + carry;
			
			res[i] = prod%10;
			carry = prod/10;
		}
		
		while(carry!= 0) {
			res[res_size] = carry%10;
			carry = carry/10;
			res_size++;
		}
		return res_size;
	}
	
	public static BigInteger factNum2(int val) {
		BigInteger bigInteger = new BigInteger("1");
		for(int i=2; i<= val; i++) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
		}
		return bigInteger;
		
	}
	
}
