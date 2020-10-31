package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodTest {
	
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
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will exceute before every test method	in day 3 class");
	}

}
