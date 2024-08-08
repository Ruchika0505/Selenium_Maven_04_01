package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_DropDownAutoSuggested {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
List <WebElement> drp = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]//span"));

Thread.sleep(3000);

System.out.println("The no of elements in autodropdown is :" + drp.size());


for(int i=0;i<drp.size();i++)
{
	
	System.out.println(drp.get(i).getText());
	Thread.sleep(2000);
}
for(int i=0;i<drp.size();i++)
{
 if(drp.get(i).getText().equals("selenium tutorial"))
 {
	 drp.get(i).click();
	 break;
 }
}
	}

}
