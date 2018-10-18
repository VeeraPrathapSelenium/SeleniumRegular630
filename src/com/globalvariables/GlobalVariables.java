package com.globalvariables;

public class GlobalVariables {
	
	static int c;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(c);
		
		
		/*
		 * if a variable is created at the class level, but not not inside the method
		 * such variables are called as Global variables
		 * 
		 * these variables can be acess throught out the class or in orther class also 
		 * 
		 * 
		 */
		

	}
	
	
public static void add() {
		
		//local variables
		int a=10;
		
		int b=20;
		
	     c=a+b;
		
		System.out.println(c);
		
		
		// the life time of a varible created in the method will be within it only,
		//can not be acess outside of a method
		
	}
	

}
