package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AfterClassTest {
	
	@Test
	public void one() {
		System.out.println("7");
	}
	@Test
	public void two() {
		System.out.println("8");
	}
	@Test
	public void three() {
		System.out.println("9");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After executing all methods in the class");
	}
}
