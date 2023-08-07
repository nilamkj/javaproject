package com.tostring;



class MenuItem
{
	 int mi_id;
	 String Miname;
	 double price;
	 
	 public MenuItem(int mi_id,String Miname,double price)
	 {
		 this.mi_id=mi_id;
		 this.Miname=Miname;
		 this.price=price;
	 }
	 public String toString()
	 {
		 return mi_id+" "+Miname+" "+price;
	 }
}

class Menu
{
	int m_id;
	String Mname;
	MenuItem mItem;
	
	public Menu(int m_id,String Mname,MenuItem mItem)
	{
		 this.m_id=m_id;
		 this.Mname=Mname;
		 this.mItem=mItem;
	}
	 public String toString()
	 {
		 return m_id+" "+Mname+" "+mItem;
	 }
}
public class Hotel {
	 int h_id;
	 String hname;
	 Menu m;
	  
	 public Hotel(int h_id,String hname,Menu m)
	 {
		 this.h_id=h_id;
		 this.hname=hname;
		 this.m=m;
	 }
	 
	 public String toString()
	 {
		 return h_id+" "+hname+" "+m;
	 }

	public static void main(String[] args) {
		Hotel h=new Hotel(1001,"Taj",new Menu(1,"south indian",new MenuItem(10,"dosa",1000.0)));
		System.out.println(h);
	}

}
