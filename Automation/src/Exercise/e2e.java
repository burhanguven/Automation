package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//full screen
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//o anki gunun tarihini secme
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//donus tarihi alani kapalimi
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		//chechbox sec
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//4 kisi ekle
		for (int i = 1; i <4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//arama
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
