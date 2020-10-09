package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHTTPScertifications {

	public static void main(String[] args) {
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//belows to your local browser
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver=new ChromeDriver();
	}

}
