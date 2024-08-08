package Day10;

import org.testng.annotations.*;

public class annoinationdemo {

	
	//@BeforeMethod
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before suite");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is Before Test");
	}
	
	
	
	
	@Test(priority=1)
	void Search()
	{
		System.out.println("This is search method");
	}
	
	@Test(priority=2)
	void AdvancedSearch()
	{
		System.out.println("This is Advancedsearch method");
	}
	
	//@AfterMethod
	@AfterSuite
	void as()
	{
		System.out.println("This is AfterSuite");
	}
}


