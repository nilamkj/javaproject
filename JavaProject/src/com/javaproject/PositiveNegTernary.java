package com.javaproject;
import java.util.Scanner;

public class PositiveNegTernary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		double num=sc.nextDouble();

		String result=(num>0)?"num is positive":"num is negative or zero";
		System.out.println("The result is:"+result);


	}

}
