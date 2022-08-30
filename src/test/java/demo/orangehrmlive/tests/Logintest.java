/**
 * 
 */
package demo.orangehrmlive.tests;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import demo.orangehrmlive.pages.BaseClass;


/**
 * @author delphine.muoka
 *
 */
public class Logintest extends BaseClass{
	
	@Test
	public void testValidateLogo() {
		Boolean flag =	loginpage.ValidateLogo();

		Assert.assertEquals(flag, true);
	}
	@Test
	public void testvalidateLogin() throws InterruptedException {
		loginpage.validateLogin("standard_user","secret_sauce");
		
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			String ActualUrl = driver.getCurrentUrl();
			Assert.assertEquals(ActualUrl, expectedUrl);
			   
	}

	@AfterMethod
	public  void Closebrowser() {

		
		driver.close();
		
	} 

}
