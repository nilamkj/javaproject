package com.pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Enter symbol: ");
		char c=sc.next().charAt(0);
		
		int i,j;
				
		for(i=1;i<=n*2-1;i++)
		{
			if(i!=n)
			for(j=1;j<=n;j++)
			{
				if(j==n)
				{
				 System.out.print(c);
				 System.out.print(" ");
				}
				else
					for(j=1;j<=n*2-1;j++)
					{
						System.out.print(c);
			
					}
			System.out.println();
		}
		}
	}
}

