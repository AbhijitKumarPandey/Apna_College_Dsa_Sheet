package Array;

public class Min_Max_find {
	public static int minimum(int arr[], int n) {
		int minimum = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i]<minimum) {
				minimum = arr[i];
				
			}
		}
		return minimum;
	}
	
	public static int maximum(int arr[], int n) {
		int maximum = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i]>maximum) {
				maximum = arr[i];
			}
		}
		return maximum;
	}
	
	public static void main(String[] args) {
		int arr[] = {23,56,78,65,98,12,};
		int n = arr.length;
		System.out.println("Minimum Number is " + minimum(arr,n));
		
		System.out.println("Maximum Number is " + maximum(arr, n));
	}

}
