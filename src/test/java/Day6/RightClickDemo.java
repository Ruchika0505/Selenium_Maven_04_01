package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
				Thread.sleep(3000);
				
				WebElement button =driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	
				Actions act=new Actions(driver);
				
				act.contextClick(button).perform();
				
				driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
				
				driver.switchTo().alert().accept();
	}		
								
}
