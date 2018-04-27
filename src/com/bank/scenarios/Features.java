package com.bank.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Features {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/");
		
		List<WebElement> features_list=driver.findElements(By.xpath("//h3[text()='Features']/following-sibling::ul/child::li"));
		for(WebElement feautures_item: features_list)
		{
			System.out.println(feautures_item.getText());
		}
	}
}