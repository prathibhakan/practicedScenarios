package TestnglistenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class Testcases{

	public static WebDriver driver;

	@FindBy(how=How.XPATH,using="")
	public static WebElement Username;
	
	

	@Test
	public static void launchApp()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.server.com/bank/");
		driver.manage().window().maximize();
		
	}
}
