package com.whileloop;
import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number:");
		//int num=sc.nextInt();
		int a=1;
		int s=0;
		for(int i=1;i<=5;i++)
		{
			//while(i>0)
			{
				a=a*i;
				//i--;
			}
			s=s+a;
		}System.out.println("Factorial Sum of 5: "+s);
			
			
		}
		
	}

