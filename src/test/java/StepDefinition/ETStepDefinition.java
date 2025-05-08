package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjectModule.ETPageObjectModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ETStepDefinition {
	
	WebDriver driver;
	ETPageObjectModule Demo;

@Given("Launch the Browser and Open the Expandtesting Page")
public void launch_the_browser_and_open_the_expandtesting_page() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Stephen\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://practice.expandtesting.com/login");
	Demo = new ETPageObjectModule(driver);
}
@When("I enter the User Name")
public void i_enter_the_user_name()throws InterruptedException {
    Demo.Enter_User_Name("practice");
}
@And("I enter the Password")
public void i_enter_the_password() {
    Demo.Enter_The_Password("SuperSecretPassword!");
}
@Then("I click on Login")
public void i_click_on_login()throws InterruptedException {
   Demo.Click_on_Login();
}
@And("Click on Logout")
public void click_on_logout()throws InterruptedException {
   Demo.Close_The_Browser();
}



}
