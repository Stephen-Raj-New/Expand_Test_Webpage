package PageObjectModule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ETPageObjectModule {
	
	

	WebDriver driver;
	
   @FindBy(xpath= "//input[@id='username']")
   WebElement UserName_Locator;
   @FindBy(xpath= "//input[@id='password']")
   WebElement Password_Locator;
   @FindBy(xpath= "//button[@class='btn btn-bg btn-primary d-block w-100']")
   WebElement Login_LOcator;
   @FindBy(xpath= "//i[@class='icon-2x icon-signout']")
   WebElement Logout_Locator;

   
   public ETPageObjectModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
   
   public void Enter_User_Name(String Username)throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", Login_LOcator);
   	Thread.sleep(5000);
	   UserName_Locator.sendKeys(Username);
   }
   public void Enter_The_Password(String Password) {
	   Password_Locator.sendKeys(Password);
   }
   public void Click_on_Login() throws InterruptedException{
	   Thread.sleep(5000);
	   Login_LOcator.click();
   }
   public void Close_The_Browser()throws InterruptedException {
	   Thread.sleep(3000);
	   JavascriptExecutor js2 = (JavascriptExecutor) driver;
	   	js2.executeScript("arguments[0].scrollIntoView(true);", Logout_Locator);
	   
	   driver.quit();
   }

}
