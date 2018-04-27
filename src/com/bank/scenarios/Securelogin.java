package com.bank.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Securelogin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/");
		
		List<WebElement> allInputs= driver.findElements(By.xpath("//table//input"));
		for(int i=0; i<allInputs.size()-1;i++)
		{
			String inputsType = allInputs.get(i).getAttribute("type");
			if(inputsType.equals("text")||(inputsType.equals("password")))
			{
				allInputs.get(i).sendKeys("admin");
			}
			else if(inputsType.equals("submit"))
			{
				allInputs.get(i).click();
			}
		}
	}
}
