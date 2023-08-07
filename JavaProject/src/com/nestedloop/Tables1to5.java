package com.nestedloop;

import java.util.Scanner;

public class Tables1to5 {
	
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter the number:");
		//int num=sc.nextInt();
		int num=1;
		int i,j;
					
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=i;j++)
			{
				//if(num<=5)
				{
				
					System.out.println(num*i);
					
				}
			}

		}
	}

}
