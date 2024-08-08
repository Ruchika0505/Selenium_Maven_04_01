package Day7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.*;

public class InteractWithElementJS {

	public static void main(String[] args) {
		
	//ChromeDriver driver=new ChromeDriver();  //Object of chrome class
		
     WebDriver driver =new ChromeDriver(); //Object of chrome class
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//	JavascriptExecutor js= driver;
		
		// Inputbox
		WebElement inputbox =driver.findElement(By.id("name"));
		//js.executeScript("arguments[0].setAttribute('value','John')",inputbox );  //javasrcipt
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
	
		
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		//Radio button
		
		WebElement male_rd=driver.findElement(By.id("male"));;
		
		//male_rd.click(); //
		
		js.executeScript("arguments[0].click();", male_rd);
		
		//checkboxes
		
		 //checkbox
		   
		   WebElement chkbox= driver.findElement(By.id("sunday"));
		   js.executeScript("arguments[0].click();", chkbox);
		   
		   //button
		   
//		   WebElement button=driver.findElement(By.id("FSsubmit"));
//		    js.executeScript("arguments[0].click();",button);
		   
		  //dropdown
		   
		   WebElement dd= driver.findElement(By.xpath("//*[@id=\"country\"]"));
		   js.executeScript("arguments[0].click();", dd);   

	  // Use JavaScript Executor to select an option from the dropdown
	  String optionValue = "canada"; // Change this to the desired option value
	  String script = "arguments[0].value='" + optionValue + "';";
	  
	//  driver.executeScript(script, dd);

	  // Verify selection if needed
	  String selectedOption =  (String) js.executeScript("return arguments[0].value;", dd); //value --attribute
	  System.out.println("Selected option is: " + selectedOption);
		
	}

}
