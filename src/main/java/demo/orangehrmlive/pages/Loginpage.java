/**
 * 
 */
package demo.orangehrmlive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author delphine.muoka
 *
 */
public class Loginpage extends BaseClass{
	
	
	@FindBy(id = "user-name") WebElement username;
	
	@FindBy(id ="password") WebElement password;
	
	@FindBy (id = "login-button") WebElement loginbtn;
	
	@FindBy(css = ".login_logo") WebElement logo;
	
	
	public Loginpage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public Boolean ValidateLogo() {
		
	Boolean Logo =	logo.isDisplayed();
	
		 return Logo;
	}
	
	public Homepage validateLogin(String Username, String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginbtn.click();
		
		return new Homepage();
	}
	

}


