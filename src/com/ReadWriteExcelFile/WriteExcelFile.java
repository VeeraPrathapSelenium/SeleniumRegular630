package com.ReadWriteExcelFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {


		File f=new File("C:\\Users\\Hanshik\\Desktop\\Excel\\MyExcel.xlsx");
		
		
		XSSFWorkbook wrkbook=new XSSFWorkbook();
		
		XSSFSheet sheet=wrkbook.createSheet("Test");
		
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cell= row.createCell(0);
		
		cell.setCellValue("Hello i am writing data into an excel file");
		
		FileOutputStream fis=new FileOutputStream(f);
		
		wrkbook.write(fis);
		
		fis.flush();
		fis.close();
		

	}

}
