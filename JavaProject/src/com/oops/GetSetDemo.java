package com.oops;

public class GetSetDemo {
	private int e_no=1;
	private String ename="neha";
	private int salary=20000;
	
	public GetSetDemo(int eno, String name,int sal)
	{
		int e_no=eno;
		String ename=name;
		int salary=sal;
	}
	public void display()
	{
		System.out.println(e_no+" "+ename+" "+salary+" ");
	}
	public void setEno(int e_no)
	{
		this.e_no=e_no;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getEno()
	{
		return e_no;
	}
	public String getEname()
	{
		return ename;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		GetSetDemo g=new GetSetDemo(11,"nirvi",34000);
				System.out.println(g.getEname());
				g.display();
				
	}

}
