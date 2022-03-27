package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data  {

	public static void read_complete_data() throws IOException {

		File f = new File("D:\\karthi java\\Excel Files\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);  

		Sheet name = wb.getSheetAt(0);

	int NumberOfRows = name.getPhysicalNumberOfRows();
	for (int i = 0; i < NumberOfRows; i++) {
		Row row= name.getRow(i);
			
		
	int NumberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < NumberOfCells; j++) {
			Cell cell = row.getCell(j);
			
			CellType celltype = cell.getCellType();
			
			if (celltype.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
	
			} 
				else if (celltype.equals(CellType.NUMERIC)) {
					double data = cell.getNumericCellValue();
					int number=(int) data;
					System.out.println(number);
					
			}		}
			}
		}	
	
	public static void main(String[] args) throws IOException {
		read_complete_data();
		
		
	}

}
