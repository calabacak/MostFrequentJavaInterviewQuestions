package Most_Frequent_Coding_Questions;
import java.util.*;

public class Test2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(23);
		list.add(213);
		list.add(231);
		list.add(123);
		list.add(213);
		list.add(2343);
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		//list.removeIf(n->n>100);
		
		for(int i=0; i<list.size();i++) {
			
			if(list.get(i)>100) {
				list.remove(list.get(i));
				i--;
				
			}
		}
		
		
		System.out.println(list);
		
		
				
		
		
		
		
		
	}


}
	

	
	
	
	
	

