package com.pattern;
//10101
//10101
//10101
//10101
//10101

public class Pattern8 {

	public static void main(String[] args) {
		int i,j;
		int n=5,num;
		
		for(i=1;i<=n;i++)
		{
			//num=1;
			for(j=1;j<=n;j++)
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
