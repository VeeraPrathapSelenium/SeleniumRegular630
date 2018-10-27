package com.CreatingFolder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunction {

	public static void main(String[] args) {


		Date d=new Date();
		
		System.out.println(d);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		
		System.out.println(sdf.format(d));
		

	}

}
