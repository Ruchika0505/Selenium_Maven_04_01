package Day9;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
 
		
		String file=System.getProperty("user.dir")+"\\ExcelFiles\\caldata.xlsx"; //path of excel sheet
		
		int rows =ExcelUtils.getRowCount(file, "Sheet1"); // no of rows from Excel table
		
		
		//read the data from excel
		
		for(int i=1;i<=rows;i++)
		{
			
			String princ =ExcelUtils.getCellData(file, "Sheet1", i, 0);
			String rateofinterest=ExcelUtils.getCellData(file, "Sheet1", i, 1);
			String per1=ExcelUtils.getCellData(file, "Sheet1", i,2); //textbox
			String per2=ExcelUtils.getCellData(file, "Sheet1", i, 3); //dropdown
			String fre=ExcelUtils.getCellData(file, "Sheet1", i, 4);
			String exp_mvalue=ExcelUtils.getCellData(file, "Sheet1", i, 5); //compare
			
			//pass the data to application
			driver.findElement(By.name("principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
		
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			
			// clicking on calculate  button 
			
			//driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click(); //element click intercepted
			
			 JavascriptExecutor js= driver;
		     WebElement	calculate_btn=driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
			 js.executeScript("arguments[0].click();", calculate_btn);
			
			
			String act_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			
		if(	Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
		{
			System.out.println("Test Passed"); //printing on console
			
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "Passed");
			ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
			
		}
		
		else
		{
			System.out.println("Test Failed");
		    ExcelUtils.setCellData(file, "Sheet1", i, 7, "Failed");
		    ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
			
		}
		
		
		Thread.sleep(5000);
		// clicking on clear button
		
	//	driver.findElement(By.xpath("//img[@class='PL5']")).click();
		
		
		WebElement clear_btn=driver.findElement(By.xpath("//img[@class='PL5']"));
		js.executeScript("arguments[0].click();", clear_btn);
			
		//pass the data to application
		
		//validation and write the data to table 
	}

}}
