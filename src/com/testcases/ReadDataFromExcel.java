package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\tm\\Desktop\\ExcelWrite.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("readData");
		
		int rowCount = sheet.getLastRowNum()+1;
		System.out.println("No.of rows :" +rowCount);
		
		for(int i =0; i<rowCount; i++)  {
			int columnsCount=sheet.getRow(i).getLastCellNum();
			for(int j = 0; j<=columnsCount-1; j++) {
				
				String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
			}
		}
		fis.close();
		wb.close();
	}
}
