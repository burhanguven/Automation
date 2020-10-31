package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassTest {
	
	@Test
	public void one() {
		System.out.println("4");
	}
	@Test
	public void two() {
		System.out.println("5");
	}
	@Test(groups = {"smoke"})
	public void three() {
		System.out.println("6");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing all methods in the class");
	}
}
