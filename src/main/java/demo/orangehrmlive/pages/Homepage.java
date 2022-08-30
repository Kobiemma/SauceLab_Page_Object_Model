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
public class Homepage extends BaseClass{
	
	
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light") WebElement addToCart;
	
	@FindBy(css=".shopping_cart_link")WebElement Cart;
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public CheckOutpage AddtoCart() {
		
	addToCart.click();
	Cart.click();
	
	return new CheckOutpage();
		
	}

}
