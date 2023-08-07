package com.contentment;

class Pen
{
	
	private String p_brand;
	private double p_price;
	private String p_color;
				
	public void setP_brand(String p_brand)
	{
		this.p_brand=p_brand;
	}
	public void setP_price(double p_price)
	{
		this.p_price=p_price;
	}
	public void setP_color(String p_color)
	{
		this.p_color=p_color;
	}
	
	public String getP_brand()
	{
		return p_brand;
	}
	public double getP_price()
	{
		return p_price;
	}
	public String getP_color()
	{
		return p_color;
	}
	
}


public class Bag {
	private String brandName;
	private double price;
	private String color;
	private Pen p;
	static int count;
//	public Bag(String brandName,double price, String color, Pen p)
//	{
//		this.brandName=brandName;
//		this.price=price;
//		this.color=color;
//		this.p=p;
//		
//	}
	
		public void setBrandName(String brandName)
		{
			this.brandName=brandName;
		}
		public void setPrice(double price)
		{
			this.price=price;
		}
		public void setColor(String color)
		{
			this.color=color;
		}
		
		public String getBrandName()
		{
			return brandName;
		}
		public double getPrice()
		{
			return price;
		}
		public String getColor()
		{
			return color;
		}
		public void setPen(Pen p)
		{
			this.p=p;
		}
		public Pen getPen()
		{
			return p;
		}
	
		

		public static void main(String[] args) {
		Bag b=new Bag();
		b.setBrandName("skybag");
		b.setPrice(2000.0);
		b.setColor("red");
		b.setPen(new Pen());
		b.getPen().setP_brand("cello");
		b.getPen().setP_price(10);
		b.getPen().setP_color("Blue");
		
		System.out.println("Bag Details:");
		System.out.println(b.getBrandName());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
		
		System.out.println("Pen Details:");
		System.out.println(b.getPen().getP_brand());
		System.out.println(b.getPen().getP_price());
		System.out.println(b.getPen().getP_color());
	}

}
