package SpecialTopics;

import java.util.ArrayList;
import java.util.Arrays;

public class ST_31_RemoveFromArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1= new ArrayList<>();
		
		list1.add(21);
		list1.add(12);
		list1.add(2);
		list1.add(32);
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(52);
		list1.add(2);
		
list1.removeAll(Arrays.asList(2));

System.out.println(list1);

System.out.println("============================= ");
		
		for(int i= 0; i<list1.size();i++) {
			if(list1.get(i)==2) {
				list1.remove(list1.get(i));
				if(i==0) {
					continue;
				}
				i--;
			}
		}
		

System.out.println(list1);

ArrayList <String> str = new ArrayList<String>();
str.add("Mehmet");
str.add("Ahmed");
str.add("Ahmed");
str.add("Veli");
str.add("Ali");
str.add("Ahmed");
System.out.println(removeAhmed(str));


		
		
	}
	
	public static ArrayList<String> removeAhmed(ArrayList<String> names){
		
		for(int i=0; i<names.size();i++) {
			if(names.get(i).equals("Ahmed")) {
				names.remove("Ahmed");
				i--;//this is very important, try to understand why?
			}
		}
		
		return names;
	}

}
