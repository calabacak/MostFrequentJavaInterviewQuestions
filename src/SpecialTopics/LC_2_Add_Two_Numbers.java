package SpecialTopics;
import java.util.Arrays;

public class LC_2_Add_Two_Numbers {
	/*
	 * Input: 	(2 -> 4 -> 3) + 
	 * 			(5 -> 6 -> 4)
		Output:  7 -> 0 -> 8
		Explanation: 342 + 465 = 807.
	 */

	
	
	
	public static int [] add2Nums(int[] arr1, int [] arr2) {
		
		int [] arr = new int[arr1.length];
		
		double k=0;
		for(int i=arr1.length-1; i>=0; i--) {
			
			arr[i]= (arr1[i]+arr2[i]) * (int)Math.pow(10, k);
			k++;
		}
		return arr;
		/*int sum=0;
		 * for(int i=0; i<arr; i++){
		 * sum+=arr[i];
		 * }
		 * return sum;
		 */
	}
	public static void main(String[] args) {
		
		int [] a= {2,4,3}; int [] b = {5,6,4};
		System.out.println(Arrays.toString(add2Nums(a,b)));
	}
}
