package VtigerPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VAddCampaings {
  
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addcamp;

	public WebElement getAddcamp() {
		return addcamp;
	}
	
	
	
}
