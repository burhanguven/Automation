package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutorJavascript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\CAN\\eclipse-workspace\\Automation\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://ksrtc.in/");
				driver.manage().window().maximize();
				
				
				driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
				driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
				
				System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
				
				
				//javascript DOM can extract hidden elements
				//because selenium cannot identify hidden elements
				//investigate the properties of object if it have any hidden text
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				String script="return document.getElementById(\"fromPlaceName\").value;";
				String text=(String) js.executeScript(script);
				System.out.println(text);
				
				int i=0;
				//aranan yer bulana kadar donucek bulamazsa sýnýr koyuldu
				while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
					i++;
					driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
					text=(String) js.executeScript(script);
					System.out.println(text);
					if (i>10) {
						break;
					}
				}
				if (i>10) {
					System.out.println("Element not found");
				}
				else {
					System.out.println("Element found");
				}

	}

}
