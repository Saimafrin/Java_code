package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBsignuppom {
WebDriver driver;
	
	public FBsignuppom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	   WebElement edit_firstname;
	   public WebElement firstname() {
	   return edit_firstname;
	     }
	   @FindBy(name="lastname")
	   WebElement edit_lastname;
	   public WebElement lastname() {
	   return  edit_lastname;
	      }
	        
	   @FindBy(name="reg_email__")
	   WebElement edit_email;
	   public WebElement email() {
	   return  edit_email;
	   }
	   @FindBy(id="password_step_input")
	   WebElement edit_password;
	   public WebElement password() {
		   return edit_password;
	   }
	   
	   @FindBy(id="month")
	   //@FindBy(xpath="//*[@id=\"month\"]")
      public WebElement click_month;
	   	  
	   
	   
	   @FindBy(id="day")
	  public WebElement click_day; 
	  
	   @FindBy(id="year")
	
	   public WebElement click_year;
		

	
	  // @FindBy (id="u_0_6_B2")
   @FindBy(xpath="(//input[@name='sex'])[2]")
	 //@FindBy(id="u_3_5_Ay")
	 WebElement Gender_female;
		public WebElement female() {
			return Gender_female;
	
	
		}
}




	
	   // @FindBy(xpath="//*[@id=\"u_0_w_zF\"]")
	   
	  // public WebElement Female() {
	  // WebElement click_Female;
	   // return  click_Female;
	//   }
	   
	  // @FindBy(name="websubmit")
	   //WebElement click_signup;
	   //public WebElement signup() {
		  // return click_signup;
	   


	