package com.ConditionalStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("==================================");
		
		System.out.println("Enter a number between 1-7");
		
		
		Scanner sc=new Scanner(System.in);
		
		int daynumber=sc.nextInt();
		
		//int daynumber=22;
		
		switch (daynumber) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("invalid entry");
			break;
		}
		

	}

}
