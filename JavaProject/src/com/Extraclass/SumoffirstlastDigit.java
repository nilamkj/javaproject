package com.Extraclass;

import java.util.Scanner;

public class SumoffirstlastDigit {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a num: ");
			int num=sc.nextInt();
			int first=0;
			int last = num%10;
			int sum=0;
			while(num>0)
			{
				first = num%10;
				num=num/10;
			}
			System.out.println("The sum of first and last digit is: "+(last+first));
	}
	}
