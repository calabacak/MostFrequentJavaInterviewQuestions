package Most_Frequent_Coding_Questions;

import java.util.ArrayList;

public class Test {
	String name;
	int age=25;
	
	public Test(String name) {
		setName(name);
		
	}
	
	
	public Test(String name, int age) {
		setAge(age);
		this.name=name;
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}

public String show() {
	return name+" | " +age;
}


	public static void main(String[] args) {
		
		//Test p1= new Test("cengiz");
		Test p2= new Test("cengiz",42);
	//System.out.println(	p1.show());
	System.out.println(	p2.show());
	
	
	

		
	}

	

}
