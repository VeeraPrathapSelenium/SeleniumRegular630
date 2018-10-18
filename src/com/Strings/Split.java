package com.Strings;

public class Split {

	public static void main(String[] args) {
String str="The voucher number is : 1089";
		
		
		
	String[] arr=str.split(":");
	
	
	System.out.println(arr[0].trim());
	
	System.out.println(arr[1].trim());
	
		

	}

}
