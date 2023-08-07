package com.javaproject;
import java.util.Scanner;

public class OddEvenSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		switch(num%2)
		{
		case 0:System.out.println("It is even number");
		break;
		default:System.out.println("It is odd number");
		}
	}

}
