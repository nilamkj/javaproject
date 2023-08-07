package com.oops;

public class Student {
	int stud_id;
	String Sname;
	//String Subject;
	double Smarks;
	double perc;
	String grade;
	double java;
	double Cpp;
	double Php;
	
	public Student(int s_id, String nm, double j, double c, double p)
	{
		stud_id=s_id;
		Sname=nm;
		//Smarks=mark;
		//perc=percent;
		java=j;
		Cpp=c;
		Php=p;
	}
	public void show_Details()
	{
		System.out.print(stud_id+" "+Sname+" "+java+" "+Cpp+" "+Php+" ");
		
	}
	public void Calculation()
	{
		double total=java+Cpp+Php;
		System.out.println("\nTotal marks= "+total);
		perc=(total/300)*100;
		System.out.println("\nPercentage= "+perc);
		if(perc>=70)
		{
			System.out.println("Grade A");
		}
		else
			if(perc>=60)
			{
				System.out.println("Grade B");
			}
			else
				if(perc>=50)
				{
					System.out.println("Grade C");
				}
	}
	
	public static void main(String[] args) {
		
		Student s=new Student(1,"Ankita",70.00,79.45,78.20);
		s.show_Details();
		s.Calculation();

	}

}
