package Exercise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CAN\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//screenshot için aþaðýda verilen kütüphaneyi eklemek gerekiyor
		//https://commons.apache.org/proper/commons-io/download_io.cgi
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessioKey");
		driver.get("https://www.google.com.tr/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\CAN\\eclipse-workspace\\Automation\\Screenshot\\screenshot.png"));
	}
}
