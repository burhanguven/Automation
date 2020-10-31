package TestNG;

import org.testng.annotations.BeforeSuite;

public class BeforeSuiteTest {
	
	//tum testler icin en basta calisir
	@BeforeSuite
	public void buforeStuite()
	{
		System.out.println("I am no 1");
	}

}
