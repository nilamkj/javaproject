package com.inheritance;

class Teacher
{
	String name="Anaya";
	
	
}
class Student extends Teacher
{
	public void show()
	{
		System.out.println(name);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Student s=new Student();
		s.show();

	}

}
