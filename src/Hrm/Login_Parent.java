package Hrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Login_Parent {

	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
