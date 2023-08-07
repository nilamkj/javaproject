package com.Extraclass;

public class Prime {

	public static void main(String[] args) {
		int i,count=0;
		int n=34;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("prime no:"+n);
		}
		else
			System.out.println("not prime");

	}

}
