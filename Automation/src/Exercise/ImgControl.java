package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImgControl {
	
	ChromeDriver driver=new ChromeDriver();
	
	
	@Test
	public void CheckImage() throws Exception {
		driver.get("https://tr.beinsports.com/haber/a-milli-takimda-4-eksik");
		
		Thread.sleep(10000);
		WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"divSpot\"]/div/img"));
		
	    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
	    if (!ImagePresent)
	    {
	         System.out.println("Image not displayed.");
	    }
	    else
	    {
	        System.out.println("Image displayed.");
	    }
	}
}
