package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AfterTestCase {
	
	
	@AfterTest
	public void lastexcution()
	{
		System.out.println("I will execute last");
	}
	//after test xml dosyasindaki bir test tagi icin calisir.
}
