package TestNG;

import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLoginCarLoan()
	{
		//selenium
		System.out.println("WebLoginCarLoan");
	}
	@Test(groups = {"smoke"})
	public void MobileLoginCarLoan()
	{
		//appium
		System.out.println("MobileLoginCarLoan");
	}
	@Test(groups = {"smoke"})
	public void MobilesignincarLoan() 
	{
		//rest api automation
		System.out.println("Mobile SIGIN");
	}
	@Test
	public void MobilesignoutcarLoan() 
	{
		//rest api automation
		System.out.println("Mobile SIGNOUT");
	}
	

}
