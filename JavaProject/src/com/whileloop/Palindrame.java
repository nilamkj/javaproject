package com.whileloop;
import java.util.Scanner;

public class Palindrame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int reverse=0;
		int temp=num;
		while(num>0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
				
		}
		num=temp;
		System.out.println(reverse);
		if(num==reverse)
		{
			System.out.println("This is polindrame number");
		}
		else
		{
			System.out.println("This is not polindrame number");
		}
	}

}
