package com.Arrays;

public class HomogeniusArrays {

	public static void main(String[] args) {
		
		String[] str_arr=new String[2] ;
		
		str_arr[0]="hello";
		str_arr[1]="world";
		
		
		
		
		
		// print all the values of an array
		
		//step 1. get the length of an array
		
		int elementscount=str_arr.length;
		
		System.out.println("The total items that are avialbale in the array is "+elementscount);
		System.out.println("=================================");
		// use the above count inthe for loop condition
		
		for(int i=0;i<=str_arr.length-1;i++)
		{
			
			System.out.println(str_arr[i]);
		}
		
		//while loop
		System.out.println("==========While loop===========");
		int j=0;
		
		while(j<=str_arr.length-1)
		{
			System.out.println(str_arr[j]);
			j++;
		}
		
		//Do while loop
				System.out.println("==========Do While loop===========");
				int k=0;
				
				do{
					
					System.out.println(str_arr[k]);
					k++;
				}while(k<=str_arr.length-1);

	}
	
	
	
}
