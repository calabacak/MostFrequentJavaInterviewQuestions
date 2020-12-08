package SpecialTopics;
import java.util.*;

public class interviewTest {
	public static void main(String[] args) {
		/*
		 * test your result here
		 */
		
//		String a=findUnique("cengiz alabacak");
////		System.out.println(a);
		String b=findDublicate("cengiz alabacakk");
		System.out.println(b);
		String c= findDublicateonly("cengiz alabacakk");
		System.out.println(c);
		
		swapValues(10,5);
		System.out.println(reverse("cengiz alabacak"));
		
		int [] nums= {5,7,3,9,11,45};
		System.out.println(Arrays.toString((nums)));
		System.out.println(Arrays.toString(reverseArray(nums)));
		
	}
	
	/*
	 * write your method here
	 */
	
	public static String findUnique(String str){
	    String result="";

	    for(int i=0; i<str.length(); i++){
	        if(!result.contains(""+str.charAt(i))){
	        result+=str.charAt(i);
	        }
	    }

	    return result;
	}
	
	//this method finds the dublicate(apperance twice) characters and build a string
	public static String findDublicate(String str){
	    String result1="";

	    for(int i=0; i<str.length(); i++){
	        if(!result1.contains(""+str.charAt(i))){
	        result1+=str.charAt(i);
	        }
	    }
	
	    String result2="";
	    for(int i=0; i<result1.length();i++){
	        int count=0;
	        for(int j=0; j<str.length();j++){
	        if(result1.charAt(i)==(str.charAt(j))){
	            count++;
	        }
	        }
	        result2+=result1.charAt(i)+""+count;
	    }
	    return result2;
	    
	}
	
	public static String findDublicateonly(String str){
		String result1="";

	    for(int i=0; i<str.length(); i++){
	        if(!result1.contains(""+str.charAt(i))){
	        result1+=str.charAt(i);
	        }
	    }
	
	    String result2="";
	    for(int i=0; i<result1.length();i++){
	        int count=0;
	        for(int j=0; j<str.length();j++){
	        if(result1.charAt(i)==(str.charAt(j))){
	            count++;
	        }
	        }
	        if(count==2) {
	        	result2+=result1.charAt(i)+"";
	        }
	    }
	    return result2;	    
	}
	
	public static void swapValues(int a, int b){
	    System.out.println("Before");
	    System.out.println(a+" | "+b);

	    //10
	    //5
	    a=a+b;//15
	    b=a-b;//10
	    a=a-b;//5
	    System.out.println("After");
	    System.out.println(a+" | "+b);

	}
	
	public static String reverse(String str){
	    String result="";
	    for(int i=str.length()-1; i>0;i--){
	        result+=str.charAt(i);
	    }
	    return result;
	}
	
	public static int[] reverseArray(int []arr){
	    
	    int temp=arr[0];
	    for(int i=0; i<arr.length/2; i++){
	        temp=arr[i];
	        arr[i]= arr[arr.length-1-i];
	        arr[arr.length-1-i]=temp;
	    }
	    return arr;
	}

}
