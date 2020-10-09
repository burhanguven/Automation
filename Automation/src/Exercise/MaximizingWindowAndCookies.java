package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingWindowAndCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CAN\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessioKey");
		driver.get("https://www.google.com.tr/");

	}

}
