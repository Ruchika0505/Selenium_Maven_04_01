package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_BootstrapDropDown {


		
		
		public static void main(String[] args) throws InterruptedException {
			
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2#google_vignette");
			
			driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
			
List < WebElement > list=driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul//li"));
			
	System.out.println(	list.size());
	
	for(WebElement li :list)
	{
	String	option= li.getText();
	if(option.equals("Java") || option.equals("Python") )
	{
		li.click();
	}
	
	}
			
			
	}

}
