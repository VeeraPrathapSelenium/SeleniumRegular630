package com.exceptionalcases_variables;

public class MiscItems {

	static short res;
	
	/*
	 * int----0
	 * float--0.0
	 * boolean--false
	 * double--0.0
	 * short---0
	 * long--0
	 * char--empty
	 * 
	 */
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		add();

	}
public static int add() {
/* when a variables is created inside a method, but not intialized with value
 * 
 * and if this unassigned variable is used, then , java will throw an exception
 * 		
 */
		int a,b,c,d;
		
		a=10;
		
		b=20;
		
	    c=a+b;
	    d=0;
System.out.println(c);

System.out.println(res);


		return c;
		
		
		
		
	}
	
}
