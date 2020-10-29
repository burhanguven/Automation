package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboBoxSelect {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		//dropdown
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");
		//s.selectByIndex(4);
		//s.selectByVisibleText("5 Adults");
		//seçimi kaldýrmak için
		//s.deselectByIndex(4);
	}

	

}
