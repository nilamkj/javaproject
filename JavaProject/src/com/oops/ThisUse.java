package com.oops;

public class ThisUse {
	int a;
	public void input(int a)
	{
		this.a=a;
	}
	public void display()
	{
		System.out.println(a);
	}
	public void show()
	{
		System.out.println("Student");
	}
	public void demo()
	{
		this.show();
		System.out.println("Hello....!");
	}
	

	public static void main(String[] args) {
		ThisUse t=new ThisUse();
		t.input(50);
		t.display();
		t.demo();
		t.show();
	}

}
