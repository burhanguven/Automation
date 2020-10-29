package Exercise;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PaginationScenariosToSearchTheData {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<String> price;
		//beans e ait bir kayit var beans i bulana kadar ariyor
		//size 1 oldugunda beans i bulmus demektir
		do {
			//sayfa yenilendigi icin her seferinde tekrardan cekiyorum
			List<WebElement> rows=driver.findElements(By.xpath("//tr//td[1]"));
			
			//scan  the name column with getText->rice->print the price og the rice
			price=rows.stream().filter(s->s.getText().contains("Apple")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if (price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size()<1);
		
	}
	
	private static String  getPriceVeggie(WebElement s) {
		//elementList "//tr//td[1]" alani alindi daha sonra price içinde sonuna following-sibling::td[1] ekleyince price kolonunu cekiyoruz.
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}		

}
