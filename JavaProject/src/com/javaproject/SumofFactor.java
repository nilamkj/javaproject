package com.javaproject;
import java.util.Scanner;

public class SumofFactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			if(num%2==0)
			{
				fact=fact*i;
				System.out.println(fact);
			}
		}
	}

}
