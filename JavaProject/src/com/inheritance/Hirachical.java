package com.inheritance;

class Fruit
{
	String color;
	String taste;
}

class Orange extends Fruit
{
	public void showDetails()
	{
		color="MangoColor";
		taste="sweet";
		System.out.println(color+" "+taste);
	}
}
class Mango extends Fruit
{
	public void showMango()
	{
		color="Orange";
		taste="sour";
		System.out.println(color+" "+taste);
	}
}
public class Hirachical {
		

	public static void main(String[] args) {
		Orange o=new Orange();
		o.showDetails();
		Mango m=new Mango();
		m.showMango();

	}

}
