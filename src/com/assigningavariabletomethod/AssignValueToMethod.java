package com.assigningavariabletomethod;

public class AssignValueToMethod {

	public static void main(String[] args) {
	
		
		int result=add();
		
		System.out.println("Sum of two numbers is "+result);
		

	}
	
	
	
	
	
public static int add() {
		
		//local variables
		int a=10;
		
		int b=20;
		
	    int c=a+b;

		return c;
		
	}
	
	
	

}
