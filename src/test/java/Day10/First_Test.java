package Day10;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class First_Test {

	
	@Test(priority=2)
    void Login()
{
		System.out.println("This is Login ");
}
	//@Test(priority=3)
    void Logout()
{
		System.out.println("This is Logout ");
		
}
    
    @AfterTest
	void At()
	{
		System.out.println("This is after Test");
	}
	
    
    @Test(priority=1)
void OpenURL()
{
	System.out.println("This is Open URL ");
}
}
