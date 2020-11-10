package TestNG;

import org.testng.annotations.Test;

public class day4 {

	@Test(enabled=false)
	public void WebLoginHomeLoan()
	{
		//selenium
		System.out.println("WebLoginHomeLoan");
	}
	@Test(dependsOnMethods = {"LoginAPIHomeLoan","Logout"})
	public void MobileLoginHomeLoan()
	{
		//appium
		System.out.println("MobileLoginHomeLoan");
	}
	@Test(timeOut=400)
	public void LoginAPIHomeLoan() 
	{
		//rest api automation
		System.out.println("LoginAPIHomeLoan");
	}
	@Test
	public void Logout() 
	{
		//rest api automation
		System.out.println("logout");
	}
	
}
