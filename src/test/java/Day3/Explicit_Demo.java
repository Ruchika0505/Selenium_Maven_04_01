package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Demo {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		//Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2)); //declarati
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(2)); //declaration
		
		
	
	
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
         driver.findElement(By.name("username")).sendKeys("Admin");
		
         mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
         
		driver.findElement(By.name("password")).sendKeys("admin123");
	
		
	   // wait.until(d -> revealed.isDisplayed());
}
}