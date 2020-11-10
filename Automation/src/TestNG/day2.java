package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL"})
	@Test
	public void ploan(String urlName)
	{
		System.out.println("good");
		System.out.println(urlName);
	}

}
