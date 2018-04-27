package com.testnglisteners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Banklistener implements ITestListener{

	public static WebDriver driver;

	@Override
	public void onStart(ITestContext arg0) {
		driver = new FirefoxDriver();
		driver.get("http://server/bank/");
		driver.manage().window().maximize();
	}

	
	@Override
	public void onFinish(ITestContext arg0) {
		//driver.close();
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		driver.findElement(By.xpath("//a[text()='Admin ']")).click();
		driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submitBtn']")).click();
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

	
}
