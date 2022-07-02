package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ebaysearchpom {
	
	WebDriver driver;
	
	public ebaysearchpom(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		//@FindBy(xpath="//*[@id=\"gh-ac\"]")
		//@FindBy(xpath="//*[@class="gh-tb ui-autocomplete-input"]")
	}

}
