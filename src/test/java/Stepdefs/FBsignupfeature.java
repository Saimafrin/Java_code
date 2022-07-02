package Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import PageObjectModel.FBsignuppom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBsignupfeature {
	
	WebDriver driver;
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/r.php");
		 }
 
	

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
			FBsignuppom obj=new FBsignuppom(driver);
			  obj.firstname().sendKeys(arg1);
			  obj.lastname().sendKeys(arg2);
			  obj.email().sendKeys(arg3);
			  obj.password().sendKeys(arg4);
		
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	    
		//FBsignuppom se1=new FBsignuppom (driver);
		
		FBsignuppom obj=new FBsignuppom(driver);
		  Select dropdown =new Select (obj.click_month);
		  //dropdown.selectByValue("6");
		  dropdown.selectByIndex(5);
		  
		   Select dropdown1 =new Select (obj.click_day);
				 
		   dropdown1.selectByValue("6");
		  
		  
		  Select dropdown2= new Select (obj.click_year);
		  
		  dropdown2.selectByVisibleText("1999");

	}
	
	
	@Then("^user click gender$")
	public void user_click_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		FBsignuppom obj=new FBsignuppom(driver);
		obj.female().click();
	}

	
	//@Then("^user click gender$")
	//public void user_click_gender() throws Throwable {
		//FBsignuppom AS = new FBsignuppom (driver);
       //AS.Female().click();
       //WebDriverWait wait=new WebDriverWait(driver, 20);
	//}
	
	//@Then("^user will click on sign up button$")
	//public void user_will_click_on_sign_up_button() throws Throwable {
	//	FBsignuppom AS = new FBsignuppom (driver);
		//AS.signup().click();
		//WebDriverWait wait=new WebDriverWait(driver, 20);

	}

