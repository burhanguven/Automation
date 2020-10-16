package Exercise;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTheWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CAN\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys("Rice");
		
		List<WebElement> veggies=driver.findElements(By.xpath("//tr//td[1]"));
		
		List<WebElement> filter=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(), filter.size());
		
		filter.forEach(s->System.out.println(s.getText()));
		
	}
}