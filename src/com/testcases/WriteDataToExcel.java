package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException, Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/");
		driver.manage().window().maximize();
		List<WebElement> featuresList = driver.findElements(By.xpath("//h3[text()='Features']/following-sibling::ul/li"));
		for(int i =0; i<featuresList.size(); i++)
		{
			String str = featuresList.get(i).getText();
		}
		
		File f = new File("C:\\Users\\tm\\Desktop\\ExcelWrite.xlsx");
		FileInputStream finput=new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(finput);
		XSSFSheet sheet = wb.getSheet("writeData");
		
		int listCount=featuresList.size();
		System.out.println(listCount);
		
		for(int i=1,j=0;i<listCount;i++)  {
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(j);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(featuresList.get(i).getText());
		}
		FileOutputStream fout=new FileOutputStream(f);
		wb.write(fout);
		finput.close();
		fout.close();
		wb.close();
	}

}
