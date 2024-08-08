package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_1 {

//	http://www.automationpractice.pl/index.php
//		id
//		name
//		LinkedText
//		PartialLinkedText
//		ClassName
//		TagName

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		WebElement textbox=driver.findElement(By.id("search_query_top"));
		
		
		textbox.sendKeys("tops"); //id
		
		driver.findElement(By.name("submit_search")).click(); //name
		
	//	driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click(); //linkText
		
		driver.findElement(By.partialLinkText("Faded Short")).click();

	}

}
