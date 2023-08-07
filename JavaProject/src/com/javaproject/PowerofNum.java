package com.javaproject;
import java.util.Scanner;

public class PowerofNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base value");
		int base=sc.nextInt();
		
		System.out.println("Enter the exponent value");
		int exponent=sc.nextInt();
		
		int power=base*exponent;
		System.out.println(base+" to the power"+exponent+ " is "+power);

	}

}
