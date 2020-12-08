package SpecialTopics;

public class ST_32_GetRidOffMultipleSpaces {
	
	public static void main(String[] args) {
		String a= "Try    to    remove   extra   spaces.";
		
		System.out.println(removeMultipleSpaces(a));
		
	}
	
	
	
	public static String removeMultipleSpaces(String input) {
		
		String result="";
		
		String [] strArr = input.split(" ");
		
		for(int i=0; i<strArr.length; i++) {
			if(!strArr[i].equals("")) {
				result+=strArr[i]+" ";
			}
		}
		
		return result.trim();
		
		
	}
	

}
