package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogicToProcessItemsinArray {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\CAN\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//id-xpath vs bulana kadar 5 sn bekle
		//tüm ögelerde bekleme uygulanır.
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//bekleme yalnızca hedeflenen öğelere uygulanır.
		WebDriverWait wait=new WebDriverWait(driver,5);
		
		String[] itemsNeeded = {"Cucumber","Cauliflower","Carrot"};
		String promoCode="rahulshettyacademy";
		String codeInfoText="Code applied ..!";
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		LogicToProcessItemsinArray item=new LogicToProcessItemsinArray();
		item.addItem(driver, itemsNeeded);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys(promoCode);
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		String promoCodeInfo=driver.findElement(By.cssSelector("span.promoInfo")).getText();
		
		if (codeInfoText.contains(promoCodeInfo)) {
			driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		}
		else {
			System.out.println("failll");
		}
	}
	
	public static void addItem(WebDriver driver,String[] itemsNeeded) {
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if (j==itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
