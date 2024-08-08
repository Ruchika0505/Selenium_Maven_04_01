package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		driver.switchTo().frame("iframeResult"); //name
		
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear(); //clear text
		f1.sendKeys("Welcome"); 
		
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']//button[@ondblclick='myFunction()']"));
		
	  Actions act=new Actions(driver);
	  act.doubleClick(button).perform();
	  
	  //validate
	  
	  
		

	}

}
