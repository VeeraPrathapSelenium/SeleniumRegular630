package com.acessStaticAndNonStatic;

public class StaticVsinstance {

	// global of type instance
	int a=10;
	
	// global of type static
	static int b=40;
	
	//static
	public static void main(String[] args) {
		m1();
		
		// creating an object
		
		StaticVsinstance obj=	new StaticVsinstance();
		
		
		obj.m2();
		
		
		System.out.println(obj.a);
	}
	
	//static 
	public static void m1()
	{
		System.out.println("Static method");
	}

	//instance
	public  void m2()
	{
		System.out.println("instance method");
	}
}
