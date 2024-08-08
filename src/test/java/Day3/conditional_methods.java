package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_methods {

	public static void main(String[] args) {
		
	ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		
		//isDisplayed()
		
	//	Boolean logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		
		//System.out.println("the logo is displayed   " +   logo ); //true
		
		//isenabled()
		
		
//		Boolean textbox =driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println("the textbox is enabled   " +   textbox);
		
		//isselected()
		
	WebElement	Male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement Female=driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	System.out.println("Before select");

	System.out.println(Male.isSelected());
	System.out.println(Female.isSelected());
	
	Male.click();
	
	System.out.println("After select");
	
	System.out.println(Male.isSelected());
	System.out.println(Female.isSelected());

	}

}
