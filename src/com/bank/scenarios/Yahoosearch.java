package com.bank.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoosearch {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.search.yahoo.com/");
		WebElement Text_Xpath = driver.findElement(By.xpath("//div[@id='sbq-wrap']/input"));
		Text_Xpath.sendKeys("hello");
	
		System.out.println("entered Text in search bar is: "+Text_Xpath.getAttribute("value"));
		
		List<WebElement> autoSuggestions_list = driver.findElements(By.xpath("//div[@id='sbq-wrap']//li"));
		System.out.println("Size of autosuggestions: "+autoSuggestions_list.size());
		
		for(WebElement autoSuggestions_item: autoSuggestions_list)
		{
			System.out.println(autoSuggestions_item.getText());
		}
	}

}
