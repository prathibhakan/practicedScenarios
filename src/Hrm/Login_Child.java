package Hrm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Child extends Login_Parent{
	
	//Invalid Credentials
	@Test
	public void TC01(){
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		try {
			String welcome_name = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
			System.out.println(welcome_name);
			if(welcome_name.contains("Welcome"))
			{
				System.out.println("Login Successful");
			}
		} catch (Exception e) {
			System.out.println("Login Failed");
		}
	}

	//Invalid Credentials
	@Test
	public void TC02(){
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user11111");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1555");		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		try {
			String welcome_name = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
			if(welcome_name.contains("Welcome"))
			{
				System.out.println("Login Successful");
			}
		} catch (Exception e) {
			System.out.println("Login Failed");
		}
		
	}
}
