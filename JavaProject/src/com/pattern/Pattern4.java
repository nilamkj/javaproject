package com.pattern;
//1
//10
//101
//1010

public class Pattern4 {

	public static void main(String[] args) {
		int i,j;
		int n=4,num;
		
		for(i=1;i<=n;i++)
		{
			//num=1;
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
				{
				System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}
