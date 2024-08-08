package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class loctors_xpath {
  //text
	//tag[text()='text']
	
	//a[text()='Desktop']
	
	//*[normalize-space(text())='Your Text Here']
	//*[normalize-space(@placeholder)='Enter your name']
	
	public static void main(String[] args) throws InterruptedException {
	     ChromeDriver driver =new ChromeDriver();
			
		driver.get("https://automationbookstore.dev/");
			
	//	<img id="pid1_thumb" src="img/paskal.jpg" class="ui-li-thumb">
		
		//WebElement elementAbove = driver.findElement(RelativeLocator.withTagName("div").above(referenceElement));
		
		
	WebElement ele = driver.findElement(By.id("pid1"));
	String text=driver.findElement(RelativeLocator.with(By.tagName("li")).below(ele)).getText();
	    
	System.out.println(text);
	//driver.findElement(RelativeLocator.with(By.tagName("li")).near(book6)).getText();
	
	
	
	//WebElement firstListItem = driver.findElement(RelativeLocator.with(By.tagName("li").toRightOf(By.tagName("li").withId("pid1")));

String firstListItem = driver.findElement(RelativeLocator.with(By.tagName("li")).toRightOf(By.id("pid1"))).getText();

	System.out.println(firstListItem);
	}
}
