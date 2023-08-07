package com.oops;

import java.util.Scanner;

public class Account {
	String Cust_name;
	int Accnt_no;
	double balance;
	
	public void cDetails(String c_name,int a_no, double bal )
	{
		Cust_name=c_name;
		Accnt_no=a_no;
		balance=bal;
	}
	public void display()
	{
		System.out.println(Cust_name+" "+Accnt_no+" "+balance+" ");
	}
	public void deposite()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amt=sc.nextInt();
		double deposite=amt+balance;
		System.out.println("Total balance after deposite: "+deposite);
	}
	public void withdrawl()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Total Balance: "+balance);
		System.out.println("Enter withdrawl amount: ");
		int wd=sc.nextInt();
        double withdrawl=balance-wd;
        System.out.println("Total balance after withdrawl: "+withdrawl);
	}
	public void checkBalance()
	{
		System.out.println("Total Balance: "+balance);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		Account a=new Account();
		System.out.println("Enter name ,accnt no. ,balance");
		a.cDetails(sc.next(),sc.nextInt(),sc.nextDouble());
		do
		{
		
		System.out.println("\n1.Display Details \n2.Deposite\n3.Withdrawl \n4.Check Balance\n5.Exit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:a.display();
			   break;
		case 2:a.deposite();
				break;
		case 3:a.withdrawl();
				break;
		case 4:a.checkBalance();
				break;
		case 5:System.exit(0);			
		}
		}while(ch>'1'||ch<'5');
       sc.close();
	}

}
