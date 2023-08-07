package com.Extraclass;
//test 3.. abstract & interface
 //Q3
//	interface A 
// 	{ 	 
// 	 	void myMethod(); 
// 	} 
// 	class B 
// 	{ 
// 	 	public void myMethod() 
// 	 	 	{ 	 	 
// 	 	 	 	System.out.println("My Method"); 	 
// 	 	 	} 
// 	} 
//
// 	class C extends B implements A 
// 	{ 	 	 
// 	} 
// public	class OutputChecking 
// 	{ 
// 	 	public static void main(String[] args)  
// 	 	{ 
// 	 		A a = new C(); 
//	 	 	a.myMethod(); 
//	 	} 
//} 

//Q2
//public interface interA {     void aMethod(int aValue) { 
//    System.out.println("Hi Friend"); 
//} 
//} 

//Q4
//interface X
//{    void methodX(); } 
//
//class Y implements X 
//{ 
// 
//    void methodX() 
//    { 
//        System.out.println("Method X"); 
//    } 
//} 

//Q5
//interface P
//{ 
//    String p = "PPPP"; 
//    String methodP(); 
//} 
//interface Q extends P 
//{ 
//    String q = "QQQQ"; 
//    String methodQ(); 
//	 	} 
//class R implements P, Q 
//{ 
//    public String methodP()    {return q+p; }     public String methodQ()    {return p+q; } 
//} 
//public class OutputChecking  
//{ 
//    public static void main(String[] args) 
//    { 
//        R r = new R(); 
//        System.out.println(r.methodP()); 
//        System.out.println(r.methodQ()); 
//    } 
//} 

//Q7
//class Parent { 
//    public void Print() 
//    { 
//        System.out.println("Parent"); 
//    } 
//} 
//  
//class Child extends Parent { 
//    public void Print() 
//    { 
//        System.out.println("Child"); 
//    } 
//} 
//  
//class OutputChecking { 
//    public static void PrintMain(Parent o) 
//    { 
//        o.Print();     } 
//    public static void main(String[] args) 
//    { 
//        Parent x = new Parent(); 
//        Parent y = new Child(); 
//        Child z = new Child(); 
//        PrintMain(x); 
//        PrintMain(y); 
//        PrintMain(z); 
//    } 
//} 

//Q 8
//class CodeA 
//{ 
//    public String type = "A "; 
//    public CodeA() {   
//        System.out.print("CodeA ");  
//    } 
//}    
//public class CodeB extends CodeA 
//{ 
//    public CodeB() { 
//        System.out.print("CodeB "); 
//    } 
//   
//    void go() 
//    { 
//        type = "B "; 
//        System.out.print(this.type + super.type); 
//    } 
//   
//    public static void main(String[] args) 
//    { 
//        new CodeB().go(); 
//    } 
//} 
