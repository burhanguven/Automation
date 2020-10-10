package Exercise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CAN\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//screenshot için aþaðýda verilen kütüphaneyi eklemek gerekiyor
		//https://commons.apache.org/proper/commons-io/download_io.cgi
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new SoftAssert();
		
		for (WebElement link : links) {
			
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400,"the link with Text"+link.getText()+"is broken with code"+respCode );
			
			/*if (respCode>400) {
				System.out.println("the link with Text"+link.getText()+"is broken with code"+respCode);
				Assert.assertTrue(false);
			}*/
		}
		
		
	}

}
