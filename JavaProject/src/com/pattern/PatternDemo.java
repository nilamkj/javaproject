package com.pattern;
//Pattern:
//1
//22
//333
//4444

public class PatternDemo {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
