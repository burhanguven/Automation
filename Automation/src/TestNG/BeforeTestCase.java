package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestCase {
	
	@Test
	public void web()
	{
		//selenium
		System.out.println("web case");
	}
	@BeforeTest
	public void prerequiste()
	{
		//appium
		System.out.println("I will execute first");
	}

}
 