package com.switchcase;
import java.util.Scanner;

public class AreaMenuDriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
		System.out.println("\n1.Area of circle\n2.Area of Rectangle\n3.Area of triangle\n4.Area of square\n5.Exit");
		System.out.println("Enter your choice..:");
		choice=sc.nextInt();
		//System.out.println("\n");
		
		switch(choice)
		{
		case 1:System.out.println("Enter radius of circle: ");
				double r=sc.nextDouble();
				float pi=3.14f;
				double circle=pi*r*r;
				System.out.println("Area of Circle: "+circle);
				break;
		case 2:System.out.println("Enter length of rectangle: ");
				int l=sc.nextInt();
				System.out.println("Enter breadth of rectangle: ");
				int b=sc.nextInt();
				int rectangle=l*b;
				System.out.println("Area of rectangle: "+rectangle);
				break;
		case 3:System.out.println("Enter base of triangle: ");
				int base=sc.nextInt();
				System.out.println("Enter height of triangle: ");
				int h=sc.nextInt();
				int triangle=(base*h)/2;
				System.out.println("Area of triangle: "+triangle);
				break;
		case 4:System.out.println("Enter the side of square: ");
				int s=sc.nextInt();
				int square=s*s;
				System.out.println("Area of square: "+square);
				break;
		case 5:System.exit(0);
		
		default:System.out.println("Wrong choice..!");
		
		}
}while(choice<'1'||choice>'5');
}
}