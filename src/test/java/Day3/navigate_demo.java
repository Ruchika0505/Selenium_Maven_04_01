package Day3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_demo {

	
public static void main(String[] args) throws MalformedURLException {
		
		
        ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/"); // String
		
		
		//driver.navigate().to("https://www.amazon.in/");
		
		URL url=new URL("https://www.amazon.in/");
		
		
		driver.navigate().to(url);
		
		System.out.println(driver.getCurrentUrl()); //https://www.amazon.in/
		
		driver.get("https://www.flipkart.com/");
		
			
		
}}
