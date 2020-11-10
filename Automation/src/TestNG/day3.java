package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

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
	@Parameters({"URL", "APIKey"})
	@Test
	public void MobilesignoutcarLoan(String urlName, String key) 
	{
		//rest api automation
		System.out.println("Mobile SIGNOUT");
		System.out.println(urlName);
		System.out.println(key);
	}
	

}
