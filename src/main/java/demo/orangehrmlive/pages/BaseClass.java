/**
 * 
 */
package demo.orangehrmlive.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * @author delphine.muoka
 *
 */
public class BaseClass {
	
	protected static WebDriver driver; 

	public Loginpage loginpage;
	
@BeforeMethod()
	public void setup(){

		String chromePath =	System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", chromePath+"\\drivers\\Chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		loginpage = new Loginpage();
	}
@AfterMethod
public void closeBrowser() {
	
	driver.quit();
}

}
