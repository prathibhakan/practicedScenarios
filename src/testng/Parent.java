package testng;

import org.testng.annotations.Test;

public class Parent {

	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void Test()
	{
		System.out.println("Test");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}	

}
