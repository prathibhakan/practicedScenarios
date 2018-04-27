package testng;

import org.testng.annotations.Test;

public class Child extends Parent{

	@Test
	public void TC01()
	{
		System.out.println("TC01 - Test Method");
	}
	
	@Test
	public void TC02()
	{
		System.out.println("Test case - 02");
	}
}
