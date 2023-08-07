package com.overloading;

public class SwappingIC {
	int x;
	int y;
	char a;
	char b;
	public SwappingIC(int x1, int y1 )
	{
	x=x1;
	y=y1;
	int temp=x;
	x=y;
	y=temp;
	
	}
	public void display()
	{
		System.out.println(x+" "+y);
	}
	public SwappingIC(char a1,char b1)
	{
		a=a1;
		b=b1;
		char temp=a;
		a=b;
		b=temp;
	}
	public void display1()
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		
		SwappingIC s=new SwappingIC(1,2);
		s.display();
		SwappingIC s1=new SwappingIC('c','d');
		s1.display1();
	}

}
