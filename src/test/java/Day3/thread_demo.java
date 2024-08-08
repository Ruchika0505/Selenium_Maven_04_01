package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread_demo {

	
public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("userName")).sendKeys("admin");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		
	//	login
		
		
		
}}
