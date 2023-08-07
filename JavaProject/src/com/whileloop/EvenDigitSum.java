package com.whileloop;

import java.util.Scanner;

public class EvenDigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		
		
		while(num!=0)
		{
			
			//num=num/10;
			count=num%10;
			count++;
		
			if(count%2==0)
			{
				sum=sum+count;
		
				num=num/10;
				System.out.println("Even digit sum: "+sum);
							}
		}
				System.out.println("Not even digit in sum");
			
	}
	}


