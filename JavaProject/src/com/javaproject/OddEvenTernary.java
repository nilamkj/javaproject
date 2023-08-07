package com.javaproject;
import java.util.Scanner;

public class OddEvenTernary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();

		String result=(num%2==0)?"num is even":"num is odd";
		System.out.println("The result is:"+result);
	}

}
