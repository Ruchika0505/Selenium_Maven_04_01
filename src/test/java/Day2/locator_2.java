package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_2 {

	public static void main(String[] args) {
     ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//tag # id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
	
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		
		//tag.class
		
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		
		
		//Tag and attribute input[name="q"]
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
		
	//	Tag, class and attribute input.search-box-text[name='q']
		driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("MacBook");
		
		
	}

}
