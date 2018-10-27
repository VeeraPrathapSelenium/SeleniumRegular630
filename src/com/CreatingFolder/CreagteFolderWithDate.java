package com.CreatingFolder;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreagteFolderWithDate {

	public static void main(String[] args) {
		
		
		Date d=new Date();
		
			
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		String crntdate=sdf.format(d);
		
		
		File f=new File("C:\\Users\\Hanshik\\Desktop\\Excel","Results\\"+crntdate);
		
		if(! f.exists())
		{
			f.mkdirs();
		}
		
		
		

	}

}
