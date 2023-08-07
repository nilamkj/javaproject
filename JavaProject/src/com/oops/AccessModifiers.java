package com.oops;

public class AccessModifiers {
	int num=20;
	int num1=30;
	int num2=80;
	int num3=40;
	
	void display_default()
	{
		System.out.println(num);
	}
	
	private void display_private()
	{
		System.out.println(num1);
	}
	protected void display_protected()
	{
		System.out.println(num2);
	}
	public void display_public()
	{
		System.out.println(num3);
	}

	public static void main(String[] args) {
		AccessModifiers a=new AccessModifiers();
		a.display_default();
		a.display_private();
		a.display_protected();
		a.display_public();
		
	}

}
