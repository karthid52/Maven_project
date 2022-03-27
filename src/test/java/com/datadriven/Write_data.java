package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {

	
	
	public static void write_data() throws IOException {
	
		File f=new File("D:\\karthi java\\Excel Files\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		wb.createSheet("data").createRow(0).createCell(0).setCellValue("name");
		wb.getSheet("data").getRow(0).createCell(1).setCellValue("mail_id");
		
		wb.getSheet("data").createRow(1).createCell(0).setCellValue("karthi");
		wb.getSheet("data").getRow(1).createCell(1).setCellValue("karthi@gamil.com");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Write succesfully");
		
	}
	public static void main(String[] args) throws IOException {
		write_data();
	}
}
