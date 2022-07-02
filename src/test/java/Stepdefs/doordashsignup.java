package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.doordashsignuppom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class doordashsignup {
	WebDriver driver;
	
	@Given("^user visit doordash url$")
	public void user_visit_doordash_url() throws Throwable {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  driver.manage().window().maximize();
			  driver.get("https://bit.ly/3wnvfeG");
			  
			 }
	

	@When("^user will enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_enter_and_and_valid_and_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		doordashsignuppom door=new doordashsignuppom(driver);
		Thread.sleep(2000);
		door.firstname().sendKeys(arg1);
		Thread.sleep(1500);
		door.lastname().sendKeys(arg2);
		Thread.sleep(1500);
		door.email().sendKeys(arg3);
		Thread.sleep(1500);
		door.mobilenumber().sendKeys(arg4);
		Thread.sleep(1500);
		door.passward().sendKeys(arg5);
		Thread.sleep(2500);
		
	}

	@When("^user selects dropdown Country$")
	public void user_selects_dropdown_Country() throws Throwable {
		
		doordashsignuppom door=new doordashsignuppom (driver);
		Select dropdown=new Select(door.click_country);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		//driver.close();
	}
	    

	@Then("^user click on sign up button$")
	public void user_click_on_sign_up_button() throws Throwable {
	    
	}


}
