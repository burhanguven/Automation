package PageObjectModelRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By username=By.cssSelector("input[name='email']");
	By password=By.cssSelector("input[name='pass']");
	By submit=By.cssSelector("button[name='login']");*/
	
	@FindBy(css="input[name='email']")
	WebElement userName;
	@FindBy(css="input[name='pass']")
	WebElement password;
	@FindBy(css="button[name='login']")
	WebElement submit;
	
	public WebElement EmailId() 
	{
		return userName;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement Submit()
	{
		return submit;
	}
	
}
