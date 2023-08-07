package com.overloading;

public class AreaOverload {
	static double pi=3.14;
	public void area(double r,double pi)
	{
		this.pi=pi;
		double circle=pi*r*r;
		System.out.println("area of circle= "+circle);
		
	}
	public void area(int l,int w)
	{
		int rectangle=l*w;
		System.out.println("area of reactangle= "+rectangle);
	}
	public void area(float base,float height)
	{
		double triangle=(base*height)/2;
		System.out.println("area of triangle= "+triangle);
	}
	public void area(double s)                                         
	{
		double square=s*s;
		System.out.println("area of square= "+square);
	}
	

	public static void main(String[] args) {
		AreaOverload a=new AreaOverload();
		a.area(4,2);
		a.area(6.0);
		a.area(4.5f,3.8f);
		a.area(pi,7.2);
	}

}
