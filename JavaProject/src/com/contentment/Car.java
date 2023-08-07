package com.contentment;

class Engine
{
	private String etype;
	
	public void setEtype(String etype)
	{
		this.etype=etype;
	}
	public String getEtype()
	{
		return etype;
	}
}

public class Car {
	
	private int modelno;
	private String cname;
	private double price;
	private Engine eng;
	
	public void setModelNo(int modelno)
	{
		this.modelno=modelno;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setEngine(Engine eng)
	{
		this.eng=eng;
	}
	public int getModelNo()
	{
		return modelno;
	}
	public String getCname()
	{
		return cname;
	}
	public double getPrice()
	{
		return price;
	}
	public Engine getEng()
	{
		return eng;
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.setModelNo(111);
		c.setCname("i20");
		c.setPrice(2000000.0);
		c.setEngine(new Engine());
		c.getEng().setEtype("Disel");
		//Bag b=new Bag();
		System.out.println(Bag.count);

		System.out.println("Car Details:");
		System.out.println(c.getModelNo());
		System.out.println(c.getCname());
		System.out.println(c.getPrice());
		System.out.println(c.getEng().getEtype());
	}

}
