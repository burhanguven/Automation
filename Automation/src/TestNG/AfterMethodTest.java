package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AfterMethodTest {
	
	@Test
	public void one() {
		System.out.println("1");
	}
	@Test
	public void two() {
		System.out.println("2");
	}
	@Test
	public void three() {
		System.out.println("3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I will exceute after every test method	in day 3 class");
	}
}
