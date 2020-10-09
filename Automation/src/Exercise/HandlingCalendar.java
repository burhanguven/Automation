package Exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CAN\\eclipse-workspace\\Automation\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		Thread.sleep(5000L);
		driver.findElementByCssSelector("input[class='text form-control']").click();
		
		//month select
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("February")) {
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		//List<WebElement> dates=driver.findElements(By.className("day"));

		int size=driver.findElements(By.className("day")).size();
		
		for (int i = 0; i <size; i++) {
			
			String day=driver.findElementsByClassName("day").get(i).getText();
			
			if (day.equalsIgnoreCase("24")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
