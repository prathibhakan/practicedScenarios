package testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(com.testnglisteners.TestngListener.class)
public class Assertions {
	
	public static SoftAssert sa = new SoftAssert();
	
	
	@Test
	public static void assertions()
	{
		sa.assertEquals("a", "b");
		//sa.assertEquals("b", "b");
		
		System.out.println("Next Steps after assertequals method");
	
		
		
		sa.assertAll();

	}

}
