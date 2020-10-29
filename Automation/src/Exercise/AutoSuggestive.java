package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromCity")).click();
		WebElement source=driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
		source.clear();
		source.sendKeys("MUM");
		
		
	}

}
