package Exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\CAN\\eclipse-workspace\\Automation\\src\\Exercise\\data.properties");
		prop.load(file);
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "Safari");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\CAN\\eclipse-workspace\\Automation\\src\\Exercise\\data.properties");
		prop.store(fout,null);
	}

}
