package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testnglisteners.Banklistener;

@Listeners(com.testnglisteners.Banklistener.class)


public class Bankassertion extends Banklistener{

	public static SoftAssert sa = new SoftAssert();
	
	
	@Test
	public static void launchApplication()
	{
		WebElement launchapp_text_Ele = driver.findElement(By.xpath("//h3[text()='PERSONAL BANKING']"));
		String launchapp_text = launchapp_text_Ele.getText();
		
		sa.assertEquals("PERSONAL BANKING",launchapp_text);
		System.out.println("Application launched with home page successfully");
		sa.assertAll();
	}

	@Test
	public static void loginCredentials()
	{
		WebElement login_ele = driver.findElement(By.xpath("//u[text()='Admin']"));
		String login_text = login_ele.getText();
		sa.assertEquals("Admin", login_text);
		System.out.println("Login successfull");
	}
	
}
