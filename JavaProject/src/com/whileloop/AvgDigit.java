package com.whileloop;
import java.util.Scanner;

public class AvgDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		int avg=0;
		while(num!=0)
		{
			
			num=num/10;
			count++;
			sum=sum+count;
			avg=sum/count;
			//avg
		}
		System.out.println("Number of digits:"+count);
		
		System.out.println("sum:"+sum);
		System.out.println("avg of digit from number:"+avg);

	}

}
