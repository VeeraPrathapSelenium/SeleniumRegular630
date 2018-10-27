package com.ReadWriteExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelWriteExcel {

	public static void main(String[] args) throws IOException {


		File f=new File("C:\\Users\\Hanshik\\Desktop\\Excel\\123.xlsx");
		
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wrkbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wrkbook.getSheet("Testdata");
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		
		System.out.println(sheet.getRow(1).getCell(0));
		
		System.out.println(sheet.getRow(1).getCell(2));
		
		
		
		
		
		
		

	}

}
