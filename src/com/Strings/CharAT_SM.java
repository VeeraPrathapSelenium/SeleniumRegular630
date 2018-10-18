package com.Strings;

public final class CharAT_SM {

	public static void main(String[] args) {
		String str="Welcome to selenium world";


		//System.out.println("The charcater of a string is "+str.charAt(2));
		
		
		//print each character
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			System.out.println("The charcater  at the position "+i+ " is "+str.charAt(i));
			
		}
		
		System.out.println("====================================");
		//Print in reverse order
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			System.out.println(str.charAt(i));
			
		}
		

	}

}
