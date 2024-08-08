package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardDemo {


		
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://text-compare.com/");
			
			
			
			
			Actions act =new Actions(driver);
			
			driver.findElement(By.xpath("")).sendKeys("Hello");
//			cntrl+A
		
			act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
			
//			Cntrl+C
			
			act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
			
			act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//			cntrl+V
			act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

			

                  //cntrl+shift+A
			act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
			
			
			
	}

}
