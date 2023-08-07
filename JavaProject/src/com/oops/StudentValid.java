package com.oops;

public class StudentValid {
	private int s_id;
	private String name;
	private double marks;
	private boolean placed;
	
		public void setS_id(int s_id)
		{
			this.s_id=s_id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setMarks(double marks)
		{
			this.marks=marks;
		}
		public void setPlaced(boolean placed)
		{
			this.placed=placed;
		}
		public int getS_id()
		{
			return s_id;
		}
		public String getName()
		{
			return name;
		}
		public double getMarks()

		{
			return marks;
		}
		public boolean getPlaced()
		{
			return placed;
		}
	public static void main(String[] args) {
		StudentValid s=new StudentValid();//1,"neha",78.40);
//		s.display();
		System.out.println(s.getName());
		double m=s.getMarks();
		System.out.println(m);
	}
}

