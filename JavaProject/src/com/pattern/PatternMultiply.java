package com.pattern;

public class PatternMultiply {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=(i*2)-1;j++)
			{
				if(i==1||j==4||j==i)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
