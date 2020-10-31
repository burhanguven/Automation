package TestNG;

import org.testng.annotations.AfterSuite;

public class AfterSuiteTest {
	
	//tum testler icin en sonda calisir
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am no 1 from last ");
	}

}
