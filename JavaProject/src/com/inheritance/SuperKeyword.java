package com.inheritance;

class Vehicle
{
	//String wheels;
	//String type;
	int speed=120;
}
	class Car1 extends Vehicle
	{
		String name="i20";
		int speed=150;
		
		public void show()
	     	{
				System.out.println("Vehicle Speed= "+super.speed+"\nCar Name= "+name+"\nCar Speed= "+speed);
	     	}
}

public class SuperKeyword {
	

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.show();
		

	}

}
