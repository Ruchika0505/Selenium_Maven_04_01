package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(3000);
		
	WebElement desktop	=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));  //desktop
	Thread.sleep(3000);
	
	WebElement mac	=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")); //mac
	
	Actions act=new Actions(driver);
	
	Thread.sleep(3000);
	
	act.moveToElement(desktop).moveToElement(mac).click().build().perform();
	
	

	}

}
