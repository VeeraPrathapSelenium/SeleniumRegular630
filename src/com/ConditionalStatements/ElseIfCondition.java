package com.ConditionalStatements;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		int a=10;
		
		int b=20;
		
		if((a>=b))
		{
			//body will get execute only on true statement
			System.out.println("A is greater than B");
		}else if (a>=2 && a<=5)
		{
			System.out.println("A is not greater than B but it is in the range between 2 & 5");
		}else
		{
			System.out.println("A is not greater than B and also not in the range between 2 & 5");	
		}
		
		
		

	}

}
