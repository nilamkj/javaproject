package com.loop;
import java.util.Scanner;

public class PrimeNumb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		boolean isprime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
			}
		}	
				if(isprime==true)
				{
					System.out.println("prime number");
				}
				else
				{
					System.out.println("Not prime number");
				}
		
	}

}
