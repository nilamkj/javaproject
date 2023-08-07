package com.javaproject;
import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
				
		if(num%3==0)
		{
			System.out.println("hii..!");
		}
		if(num%5==0)
		{
			System.out.println("hello..!");
		}
		if(num%3==0 && num%5==0)
		{
			System.out.println("Welcome..");
		}
	}

}
