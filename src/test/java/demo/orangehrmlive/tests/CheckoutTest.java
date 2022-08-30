/**
 * 
 */
package demo.orangehrmlive.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import demo.orangehrmlive.pages.BaseClass;
import demo.orangehrmlive.pages.CheckOutpage;
import demo.orangehrmlive.pages.CheckoutCompletepage;
import demo.orangehrmlive.pages.Homepage;
import demo.orangehrmlive.pages.Loginpage;

/**
 * @author delphine.muoka
 *
 */
public class CheckoutTest extends BaseClass{
	

	Homepage homepage = new Homepage();
	CheckOutpage checkoutpage = new CheckOutpage();
	CheckoutCompletepage checkoutcompletepage = new CheckoutCompletepage();
	@Test
	public void checkout() {
		
		homepage = loginpage.validateLogin("standard_user","secret_sauce");
		checkoutpage = homepage.AddtoCart();
		checkoutcompletepage = checkoutpage.checkout("Delphine", "Uche", "10234");
		
		String expectedMessage = checkoutcompletepage.Message();
		String ActualMessage ="THANK YOU FOR YOUR ORDER";
		Assert.assertEquals(expectedMessage, ActualMessage);
		
	
		
	}
	@Test
	public void continueshoppingBtn() {
		
		homepage = loginpage.validateLogin("standard_user","secret_sauce");
		checkoutpage = homepage.AddtoCart();
		checkoutpage.continueShoping();
		
		String expectedUrl = driver.getCurrentUrl();
		String ActualUrl = "https://www.saucedemo.com/inventory.html";
		
		Assert.assertEquals(expectedUrl, ActualUrl);
		
	}

}
