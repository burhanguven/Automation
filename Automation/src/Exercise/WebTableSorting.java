package Exercise;



import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		driver.findElement(By.xpath("//tr//th[1]")).click();
		
		//capture all webelements into list
		List<WebElement> elementList=driver.findElements(By.xpath("//tr//td[1]"));
		
		//capture text of all webelements into new(original) list
		List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3 ->sorted list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		//scan  the name column with getText->rice->print the price og the rice
		List<String> price=elementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		 price.forEach(a->System.out.println(a));
	}
	
	private static String  getPriceVeggie(WebElement s) {
		//elementList "//tr//td[1]" alani alindi daha sonra price içinde sonuna following-sibling::td[1] ekleyince price kolonunu cekiyoruz.
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
