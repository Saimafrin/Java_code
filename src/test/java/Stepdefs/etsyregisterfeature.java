package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.Amazonsearchpom;
import PageObjectModel.etsyregisterpom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class etsyregisterfeature {
	WebDriver driver;
	
		 
	@Given("^user visits Etsy url$")
	public void user_visits_Etsy_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	         
         
  driver.manage().window().maximize();
		   
		  driver.get("https://www.etsy.com/join");
		 }
		
	
	@When("^user will enter valid \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_will_enter_valid_and_and(String arg1, String arg2, String arg3) throws Throwable {
		etsyregisterpom obj1=new etsyregisterpom (driver);
		obj1.email().sendKeys(arg1);
		obj1.firstname().sendKeys(arg2);
		//obj1.password().sendKeys(arg3);
		
		
	    	}

	@Then("^user will be able to click on sign in button$")
	public void user_will_be_able_to_click_on_sign_in_button() throws Throwable {
		etsyregisterpom AS = new etsyregisterpom(driver);
		//AS.searchbutton().click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
	}
}
