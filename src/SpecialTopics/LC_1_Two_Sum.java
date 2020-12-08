package SpecialTopics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_1_Two_Sum {
	/*
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * 
	 */
	public static List twoSum2(int [] arr, int num) {
		
		//int [] result =  new int[2];
		List<Integer> result = new ArrayList();
		
		for(int i=0; i<arr.length-1;i++) {
			for (int j= i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==num) {
					result.add(i);
					result.add(j);
					
				}
				
			}
			
		}
		
		
		return result;
		
	}
	
	
	
	public static int [] twoSum(int [] arr, int num) {
		
		int [] result = new int [2];
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+arr[i+1]==num) {
				result[0]= arr[i];
				result[1]= arr[i+1];
			}
		}
		return result;
	}

	public static void main(String[]args) {
		
		int [] nums= {2, 7, 11, 15, 7};
		int n= 9;
		
		System.out.println(Arrays.toString(twoSum(nums, n)));
		//System.out.println(Arrays.toString(twoSum2(nums, n)));
		System.out.println(twoSum2(nums, 9));
		
	}
	
	
}
