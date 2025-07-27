package Array;

public class Contains_Duplicate {
	public static boolean ContainsDuplicate(int [] arr) {
		int n = arr.length;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,1};
		
		boolean result = ContainsDuplicate(arr);
		System.out.println("Contains Duplicate is " + true);
	}

}
