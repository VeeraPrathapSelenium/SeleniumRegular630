package com.CreatingFolder;

import java.io.File;

import org.apache.poi.util.SystemOutLogger;

public class CreateFolder {

	public static void main(String[] args) {


		
		File f=new File("C:\\Users\\Hanshik\\Desktop\\Excel","Abc\\New folder");
		
		//  verify if the file is available
		
		if(f.exists())
		{
		System.out.println("Folder Exist...!!!");
		}else
		{// create only one folder
			//f.mkdir();
			
			f.mkdirs();
			System.out.println("New Folder is created...!!!");
		}
		
		
		

	}

}
