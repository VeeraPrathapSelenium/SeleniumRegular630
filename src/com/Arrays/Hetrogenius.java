package com.Arrays;

public class Hetrogenius {

	public static void main(String[] args) {
		
		Object[] arr=new Object[2];
		
		arr[0]=123;
		
		arr[1]="hello";
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		for (Object arrobj : arr) {
			System.out.println(arrobj);
		}
		
		

	}

}
