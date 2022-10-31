package array;

public class Example15_lexi {
	
	static void sort(String a[], int n){
		
		for(int i = 0;i < n;i++){
			for(int j = i + 1;j < n;j++){
				
				if((a[i] + a[j]).compareTo(a[j] + a[i]) > 0){
					String s = a[i];
					a[i] = a[j];
					a[j] = s;
				}
			}
		}
	}
	
static String lexsmallest(String a[], int n){
	sort(a,n);
	String answer = "";
	for (int i = 0; i < n; i++)
		answer += a[i];

	return answer;
}

public static void main(String args[]){
	String a[] = {"c", "cb", "cba"};
	int n = 3;
	System.out.println("lexicographically smallest string = "
									+ lexsmallest(a, n));
	}
}
