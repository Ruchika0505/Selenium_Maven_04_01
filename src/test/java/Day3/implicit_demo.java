package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_demo {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 //implicity
	
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
}
}