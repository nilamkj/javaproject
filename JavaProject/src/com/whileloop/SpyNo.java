package com.whileloop;
import java.util.Scanner;

public class SpyNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		int product=1;
		while(num!=0)
		{
			num=num/10;
			count++;
			sum=sum+count;
			product=product*count;
		}
			if(sum==product)
			{
				System.out.println("Sum of digits and product of digits are equal. It is spy no.");
				
			}
			else
			{
				System.out.println("Sum of digits and product of digits are not equal.It is not spy no.");
			}
		
		System.out.println("Number of digits:"+count);
		System.out.println("Sum of digits:"+sum);
		System.out.println("Product of digits:"+product);
			
	
	}
}
