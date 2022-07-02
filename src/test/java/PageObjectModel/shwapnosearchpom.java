package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shwapnosearchpom {

	WebDriver driver;
	
	 public shwapnosearchpom  (WebDriver driver) {
		    this.driver=driver;
		   
		    PageFactory.initElements(driver, this);
		   }
		  
	 @FindBy(xpath="//input[@placeholder='Search']")
	 WebElement edit_serachbox;
	 public WebElement Search() {
	 	return edit_serachbox;
	 }

 }
 
