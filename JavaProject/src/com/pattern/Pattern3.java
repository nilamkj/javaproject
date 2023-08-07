package com.pattern;
//1234
//123
//12
//1

public class Pattern3 {

	public static void main(String[] args) {
		int i,j,num;
		int n=4;
		//num=1;
		for(i=1;i<=n;i++)
		{
			num=1;
			for(j=4;j>=i;j--)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}

}
