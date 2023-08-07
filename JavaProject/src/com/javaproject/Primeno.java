package com.javaproject;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int i, count = 0;
		for (i = 2; i < num; i++) {
			// for(j=1;j<=i;j++)

			if (num % i == 0) {
				count++;
				// break;

			}
		}
		if (count == 0) {
			System.out.println("Prime no:" + i);
		}
		else
			System.out.println("not prime");

	}

}
