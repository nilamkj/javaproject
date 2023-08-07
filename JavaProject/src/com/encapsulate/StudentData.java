package com.encapsulate;

class StudentValid
{
	int s_id;
	String name;
	double marks;
	boolean placed;
	
	public StudentValid(int id,String nm,double mrk, boolean p)
	{
		s_id=id;
		name=nm;
		marks=mrk;
		placed=p;
	}
	public void display()
	{
		System.out.println(s_id+" "+name+" "+marks+" "+placed+" ");
	}
	
}
public class StudentData {

	public static void main(String[] args) {
		StudentValid s=new StudentValid(122,"Anaya",70.77,true);
		s.display();
	
	}

}
