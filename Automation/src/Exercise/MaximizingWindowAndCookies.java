package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingWindowAndCookies {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessioKey");
		driver.get("https://www.google.com.tr/");

	}

}
