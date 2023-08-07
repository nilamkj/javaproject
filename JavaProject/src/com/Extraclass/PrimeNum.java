package com.Extraclass;

//Display prime no between 21 to 30

public class PrimeNum {
		
		public void Prime()
		{
			for(int num=21; num<=30;num++)
			{
				int temp=num;
				boolean isPrime=true;
				
				while(temp>0)
				{
					int digit=temp%10;
					temp=temp/10;
					for(int j=2;j<digit;j++)
					{
						if(digit%j==0)
						{
							isPrime=false;
							break;
						}
					}
					
				}
				
				if(isPrime==true)
				{
					System.out.println(num);
				}
			}
		}
		public static void main(String args[])
		{
			PrimeNum p = new PrimeNum();
			p.Prime();
		}
	}
