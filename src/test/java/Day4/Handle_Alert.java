package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
//		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//		
//	Alert alert =	driver.switchTo().alert();
//	
//	Thread.sleep(5000);
//	alert.sendKeys("Hello");
//	Thread.sleep(5000);
//	alert.accept();
//	Thread.sleep(5000);
//	System.out.println(	driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());

	}

}
