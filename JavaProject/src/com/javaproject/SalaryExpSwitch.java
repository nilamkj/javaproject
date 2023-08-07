package com.javaproject;
import java.util.Scanner;

public class SalaryExpSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		
		System.out.println("Enter the experience of person:");
		String exp=sc.next();
		
		 switch(exp)
		 {
		 case "Beginner":System.out.println("It has no experience");
		 		  			System.out.println("Salary of beginners is 3 lakh per year");
		 break;		  
		 case "Intermidiate":System.out.println("It has intermidiate experience");
		 						System.out.println("Salary of intermidiate is 10 lakh per year");	
		 break; 		  
		 case "Expert":System.out.println("It is expert");
 		  		  		System.out.println("Salary of Expert is 20 lakh per year");	 		  
		 break;
		 default:System.out.println("Unemployed..");
		 }
	}

}
