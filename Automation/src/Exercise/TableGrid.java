package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-s1-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		//div:nth-child(3) kolon
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i = 0; i <count-2; i++) {
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		
		System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		
	}

}
 