package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class etsysearchpom {
	
	WebDriver driver;
	  
	//constructor is not a method but a special type of method.
		// constructor name should be same as class name.constactor has no return type.	  
		 
		public  etsysearchpom (WebDriver driver) {
		     this.driver=driver;
		    
		     PageFactory.initElements(driver, this);
		    }
	
	@FindBy(id="global-enhancements-search-query")
	//@FindBy(xpath="//*[@id="\global-enhancements-search-query\"]")
	WebElement edit_serchbox;
	   public WebElement Search(){
	  
	return edit_serchbox;
		    
		  }
	   
	   @FindBy(xpath="//*[@id=\"gnav-search\"]/div/div[1]/button/span/svg\"]")
	//@FindBy(xpath="//*[@id=\"gnav-search\"]")
	   
	   WebElement click_searchbutton;
	   public WebElement searchbutton(){
	   return click_searchbutton;
	    
     }	   

}

//*[@id="gnav-search"]/div/div[1]/button/span/svg