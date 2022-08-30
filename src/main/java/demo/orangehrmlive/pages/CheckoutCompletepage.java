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
public class CheckoutCompletepage extends BaseClass{
	
	
	@FindBy(css=".complete-header")WebElement Message;
	@FindBy(id="back-to-products")WebElement BackHome;

	public CheckoutCompletepage() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	public Homepage returnToHome() {
		BackHome.click();
		
		
		return new Homepage();
		
	}
	
	public String Message() {
		
		String message = Message.getText();
		
		return message;
	}
}
