package VtigerPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VLoginPage {
  
	
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signin;

	

	public WebElement getSignin() {
		return signin;
	}
	
	
}
