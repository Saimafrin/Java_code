package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.Amazonsearchpom;
import PageObjectModel.etsysearchpom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class etsysearchfeature {
	WebDriver driver;
	
	
	
	@Given("^user visit etsy home page$")
	public void user_visit_etsy_home_page() throws Throwable {
 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("http://www.etsy.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	}

	@Given("^user searched  by \"([^\"]*)\"$")
	public void user_searched_by(String arg1) throws Throwable {
		etsysearchpom ES=new etsysearchpom(driver);
    ES.Search().sendKeys(arg1);
    WebDriverWait wait=new WebDriverWait(driver,20);
    

	}

	

	@Then("^user  click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
		
		etsysearchpom  AS = new etsysearchpom  (driver);
		AS.searchbutton().click();
		WebDriverWait wait=new WebDriverWait(driver, 20);

	}
}
