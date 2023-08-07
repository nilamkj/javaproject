package com.inheritance;


	class Laptop
	{
		int price=50000;
		
		public void showLaptop()
		{
			String ramSize="8GB";
			System.out.println(ramSize);
		}
	}
	class Dell extends Laptop
	{
		int price=78000;
		public void showPrice()
		{
			int price=90000;
			System.out.println(super.price+" "+this.price+" "+price);
			super.showLaptop();
		}
		public void showLaptop()
		{
			
			System.out.println("This is Dell");
		
		}
	}

	public class Superkey {

		
		public static void main(String[] args) {
			
			Dell d=new Dell();
			d.showPrice();
			d.showLaptop();
}
}