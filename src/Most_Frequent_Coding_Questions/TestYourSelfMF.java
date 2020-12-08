package Most_Frequent_Coding_Questions;

import java.util.*;

public class TestYourSelfMF {
	public static void main(String[] args) {
		
		// write a descending method
		
		for(int i=5; i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int faktoriel= 1;
		int number=5;
		
		for(int i=1; i<=number;i++) {
			faktoriel=faktoriel*i;
		}
		
		System.out.println("The faktories of "+number+" is: "+faktoriel);
		
		

	}

}
