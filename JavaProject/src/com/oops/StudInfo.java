package com.oops;

public class StudInfo {

		int s_id;
		String name;
		double marks;
		boolean place;
		
		public StudInfo(int s_id,String name,double marks)
		{
			this.s_id=s_id;
			this.name=name;
			this.marks=marks;
		}
		public void display()
		{
			System.out.println(s_id+" "+name+" "+marks+" ");
		}
		public static void main(String[] args) {
			StudInfo s=new StudInfo(1,"neha",78.40);
			s.display();

	}

}
