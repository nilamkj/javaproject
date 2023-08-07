package com.pattern;
//1
//12
//123
//1234

public class Pattern2 {

	public static void main(String[] args) {
		int i,n=4;
		int j,num;
		for(i=0;i<n;i++)
		{
			num=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}


	}

}
