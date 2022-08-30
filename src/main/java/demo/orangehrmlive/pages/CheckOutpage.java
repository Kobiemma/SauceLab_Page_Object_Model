/**
 * 
 */
package demo.orangehrmlive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author delphine.muoka
 *
 */
public class CheckOutpage extends BaseClass{
	
	@FindBy(id ="checkout")WebElement CheckOut;
	@FindBy(id ="continue-shopping")WebElement continueShop;
	@FindBy(id ="remove-sauce-labs-backpack")WebElement removeItem;
	
	@FindBy(id ="first-name")WebElement Firstname;
	@FindBy(id ="last-name")WebElement Lastname;
	@FindBy(id ="postal-code")WebElement Postalcode;
	@FindBy(id ="continue")WebElement continueCheckOut;
	@FindBy(id ="cancel")WebElement cancel;
	
	@FindBy(id ="finish")WebElement Finish;
	
	public CheckOutpage() {
		
		PageFactory.initElements(driver, this);
	}
 
	public CheckoutCompletepage checkout(String firstname, String lastname, String postalcode) {
		
		
		CheckOut.click();
		Firstname.sendKeys(firstname);
		Lastname.sendKeys(lastname);
		Postalcode.sendKeys(postalcode);
		continueCheckOut.click();
		
		Finish.click();
		
		return new CheckoutCompletepage();
	}
	
	public Homepage continueShoping() {
		
		continueShop.click();
		
		return new Homepage();
	}
}
