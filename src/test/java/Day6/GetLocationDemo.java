package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationDemo {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement	logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		
		System.out.println("The value of element before max:" +logo.getLocation()); //(276, 88)
		driver.manage().window().maximize();
		System.out.println("The value of element after max:" +logo.getLocation()); //(476, 72)
		driver.manage().window().minimize();
		System.out.println("The value of element after minimize:" +logo.getLocation()); //(276, 49)
		
		driver.manage().window().fullscreen();
		System.out.println("The value of element after fullscreen:" +logo.getLocation()); //(476, 125)
		
		Point p=new Point(84,35);
		driver.manage().window().setPosition(p);
		System.out.println("The value of element after setting the position of webpage :" +logo.getLocation()); //(277, 50)
		
		p=new Point(100,200);
		driver.manage().window().setPosition(p);
		System.out.println("The value of element after setting the position of webpage :" +logo.getLocation());//(277, 50)
	
	}

}
