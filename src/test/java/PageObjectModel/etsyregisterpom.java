package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class etsyregisterpom {
	WebDriver driver;
	  
	//constructor is not a method but a special type of method.
		// constructor name should be same as class name.constactor has no return type.	  
		 
		public etsyregisterpom(WebDriver driver) {
		     this.driver=driver;
		    
		     PageFactory.initElements(driver, this);
		    }
		   
		  // @FindBy(id="global-enhancements-search-query")
		   @FindBy(id="join_neu_email_field")
		   WebElement edit_email;
		   public WebElement email() {
		   return  edit_email;
		   }
		   @FindBy(id="join_neu_first_name_field")
		   WebElement edit_firstname;
		  public WebElement firstname() {
		   return edit_firstname;
		     
		   
		  //@FindBy(id="join_neu_password_field")
		   //@FindBy(xpath="//*[@id=\"join_neu_password_field\"]")
		  // WebElement edit_password;
		   //public WebElement password() {
			// return edit_password;

		}
		  
		  }


