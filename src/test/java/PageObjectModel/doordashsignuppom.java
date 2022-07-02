package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doordashsignuppom {
WebDriver driver;
	
	public doordashsignuppom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="FieldWrapper-6")
	WebElement edit_firstname;
	public WebElement firstname() {
		return edit_firstname;
	}
	
	@FindBy(id="FieldWrapper-7")
	WebElement edit_lastname;
	public WebElement lastname() {
		return edit_lastname;
	}
	
	@FindBy(id="FieldWrapper-8")
	WebElement edit_email;
	public WebElement email() {
		return edit_email;
	}
	
	
	@FindBy(id="FieldWrapper-10")
	WebElement edit_mobilenumber;
	public WebElement mobilenumber() {
		return edit_mobilenumber;
	}
	@FindBy(id="FieldWrapper-11")
	WebElement edit_passward;
	public WebElement passward() {
		return edit_passward;
	}
	
	@FindBy(id="FieldWrapper-9")
	public WebElement click_country;
	
	
}
