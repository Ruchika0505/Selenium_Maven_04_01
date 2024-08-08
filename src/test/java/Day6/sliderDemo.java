package Day6;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

// min slider element

    WebElement	e1=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
    
	System.out.println(	"Location of element before slider: " +e1.getLocation()); //pixels value for the webElement
	
	Actions act=new Actions(driver);
	 act.dragAndDropBy(e1, 100, 0);
	
	//act.dragAndDropBy(e1, 100, 0).perform();
	
	System.out.println("Location of element After slider: " +e1.getLocation());
	}

}
