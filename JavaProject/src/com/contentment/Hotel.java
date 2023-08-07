package com.contentment;

class MenuItem
{
	 int mi_id;
	 String Miname;
	 double price;
	
	public void setMI_id(int mi_id)
	{
		this.mi_id=mi_id;
	}
	public void setMiname(String Miname)
	{
		this.Miname=Miname;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getMI_id()
	{
		return mi_id;
	}
	public String getMiname()
	{
		return Miname;
	}
	public double getPrice()
	{
		return price;
	}

	
	
}

class Menu
{
	int m_id;
	String Mname;
	MenuItem mItem;
	
	public void setM_id(int m_id)
	{
		this.m_id=m_id;
	}
	public void setMname(String Mname)
	{
		this.Mname=Mname;
	}
	public void setMenuItem(MenuItem mItem)
	{
		this.mItem=mItem;
	}
	public int getM_id()
	{
		return m_id;
	}
	public String getMname()
	{
		return Mname;
	}
	public MenuItem getMenuItem()
	{
		return mItem;
	}
}



public class Hotel
{
	 int h_id;
	 String hname;
	 Menu m;
	 int mi_id;
	
	public void setH_id(int h_id)
	{
		this.h_id=h_id;
	}
	public void setHname(String hname)
	{
		this.hname=hname;
	}
	public void setMenu(Menu m)
	{
		this.m=m;
	}
	public int getH_id()
	{
		return h_id;
	}
	public String getHname()
	{
		return hname;
	}
	public Menu getMenu()
	{
		return m;
	}
	
		

	public static void main(String[] args) {
		//Hotel h=new Hotel(1001,"Taj",new Menu(1,"south indian",new MenuItem(10,"dosa",1000.0)));
		

	}

}
