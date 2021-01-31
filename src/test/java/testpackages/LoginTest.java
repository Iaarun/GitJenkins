package testpackages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
  
	@BeforeMethod
	public  void browserSetup() {
		System.out.println("Launching browser");
	}
	
	@Test
	public void logintest() {
		System.out.println("Login test ");
		Assert.assertTrue(true);
	}
	
	@Test
	public void logoTest() {
		System.out.println("Logo test ");
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing browser");
	}
}
