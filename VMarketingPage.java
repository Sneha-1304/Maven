package VtigerPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VMarketingPage {
    
	@FindBy(xpath="(//span[@class='app-icon fa fa-bars'])[1]")
	private WebElement threedot;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement clickonmarketing;
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement campaings;

	public WebElement getThreedot() {
		return threedot;
	}

	public WebElement getClickonmarketing() {
		return clickonmarketing;
	}

	public WebElement getCampaings() {
		return campaings;
	}
	
	
}
