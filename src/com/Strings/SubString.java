package com.Strings;

public class SubString {

	public static void main(String[] args) {
		String str="The voucher number is : 1089";
		
		//System.out.println(str.substring(0,3));
		
		//System.out.println(str.substring(5));
		
		int pos=str.indexOf(":")+1;
		
		
		System.out.println(str.substring(pos).trim());
		
		
		
		
		
		

	}

}
