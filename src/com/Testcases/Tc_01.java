package com.Testcases;

import java.io.IOException;

import com.ExcelPlugin.ReadExcel;

public class Tc_01 {

	public static void main(String[] args) throws IOException {
		
		
		ReadExcel excl=new ReadExcel();
		
		excl.loadExcelFile();
		
		String data=excl.getData("Tc_05", "Firstname", "Testdata");
		
		System.out.println(data);
		
		String lastname=excl.getData("Tc_05", "LastName", "Testdata");
		
		System.out.println(lastname);
		
		
		
	}

}
