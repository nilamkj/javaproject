package com.javaproject;
import java.util.Scanner;

public class DivisibleTernary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();

		String result=(num%5==0)?"num is divisible by 5":"num is not divisible by 5";
		System.out.println("The result is:"+result);

	}

}
