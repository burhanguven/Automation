package PageObjectModelRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSearch {
	
	WebDriver driver;
	public HomePageSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By username=By.cssSelector("input[name='email']");
	By password=By.cssSelector("input[name='pass']");
	By submit=By.cssSelector("button[name='login']");*/
	
	@FindBy(css="input[type='search']")
	WebElement searcInput;
	
	public WebElement SearchInput() 
	{
		return searcInput;
	}
}
