package com.javaproject;
import java.util.Scanner;

public class GreatestNoNested {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number2:");
		int num2=sc.nextInt();

		System.out.println("Enter the number3:");
		int num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("number1 is greater");
			}
		}
			else if(num2>num1)
			{
				if(num2>num3)
				{
					System.out.println("number2 is greater");
				}
			}
				else if(num3>num1)
				{
					if(num3>num2)
					{
						System.out.println("number3 is greater");
					}

				}
	}

}
