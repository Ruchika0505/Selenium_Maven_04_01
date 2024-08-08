package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_First {
	
	ChromeDriver driver;
	
  @Test(priority=1)
   void tearUp() {
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
  }
  @Test(priority=2)
  void logo() throws InterruptedException
  {
	  Thread.sleep(3000);
	 Boolean logo= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  //System.out.println(logo);
	  if(logo)
	  {
		  System.out.println("Logo Displayed");
	  }
	  else 
	  {
		  System.out.println("Logo Not Displayed");
	  }
  }
  @Test(priority=3)
  void Login() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test(priority=4)
  void tearDown()
  {
	  driver.close();       //closing the browser
  }
}
