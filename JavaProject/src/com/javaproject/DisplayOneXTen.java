package com.javaproject;
import java.util.Scanner;

public class DisplayOneXTen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		//System.out.println("Divided by 3:");
		for(int i=1;i<=20;i++)
		{	
			
			if(num%3==0 && num%5==0)
			{
				System.out.println("OneXTen");
			}
			
			else	
		if(num%3==0)
		{
			System.out.println("OneX");
		}
		else
		//System.out.println("Divided by 5:");
		if(num%5==0)
		{
			System.out.println("Ten");
		}
		
		
		
		}
		
		System.out.println("Number is not divisible by 3 or 5");
		}
	}

