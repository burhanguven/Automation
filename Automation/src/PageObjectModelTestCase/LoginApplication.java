package PageObjectModelTestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModelRepository.HomePageSearch;
import PageObjectModelRepository.LoginPage;


public class LoginApplication {
	
	@Test
	public void Login() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginPage lp=new LoginPage(driver);
		HomePageSearch search=new HomePageSearch(driver);
		
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\CAN\\eclipse-workspace\\Automation\\src\\PageObjectModelTestCase\\LoginData.properties");
		prop.load(file);
		
		lp.EmailId().sendKeys(prop.getProperty("email"));
		lp.Password().sendKeys(prop.getProperty("password"));
		lp.Submit().click();
		
		search.SearchInput().sendKeys("Fenerbahçe");
	}
}
