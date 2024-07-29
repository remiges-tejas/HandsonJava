package Experiment;

public class ExmpClassesObj {
	
	
	private String name;
	private int age;

	ExmpClassesObj(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void display(){
		System.out.println("Name is : " + name + " |  " +  "Age is :" + age);
	}
	
	public static void main(String[]args) {
		
		ExmpClassesObj a1=  new ExmpClassesObj("Tejas",22);
		a1.display();
		
	}



}
