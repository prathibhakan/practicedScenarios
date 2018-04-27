package com.testcases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppFileWrite {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/");
		driver.manage().window().maximize();
		
		List<WebElement> features = driver.findElements(By.xpath("//h3[text()='Features']/following-sibling::ul/li"));
		for(WebElement feature:features)
		{			
			String feature_data = feature.getText();
			System.out.println(feature_data);
		}
		
		File f = new File("C:\\Users\\tm\\Desktop\\ReadWritedataFolder","app.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		for(int i = 0; i<features.size(); i++)
		{
			String str = features.get(i).getText();
			pw.println(str);
			pw.flush();
		}
			pw.close();
	}
 }
