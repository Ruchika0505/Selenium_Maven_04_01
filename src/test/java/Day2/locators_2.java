package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Three requirements:
//1) How many total no of sliders on the page .
//2) Find the total no of images available on the page.
//3) Find total no of links available on the page .

public class locators_2 {

	public static void main(String[] args) {
      ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
	List <WebElement>	slider =driver.findElements(By.className("homeslider-container"));
		
	System.out.println("The total no of sliders are " + slider.size());

	
	List <WebElement > images=driver.findElements(By.tagName("img"));
	
	System.out.println("The no of images are " + images.size());
	
List <WebElement > links=driver.findElements(By.tagName("a"));
	
	System.out.println("The no of images are " + links.size());
	}

}
