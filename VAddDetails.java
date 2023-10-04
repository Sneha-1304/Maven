package VtigerPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VAddDetails {
  
	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	private WebElement fname ;
	
	@FindBy(id="Campaigns_editView_fieldName_targetsize")
	private WebElement targetsize;
	
	@FindBy(id="Campaigns_editView_fieldName_closingdate")
	private WebElement date;
	
	public WebElement getDate() {
		return date;
	}

	@FindBy(id="Campaigns_editView_fieldName_targetaudience")
	private WebElement targetaudience;
	
	@FindBy(id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponser;
	
	@FindBy(id="Campaigns_editView_fieldName_numsent")
	private WebElement numset;
	
	@FindBy(id="Campaigns_editView_fieldName_budgetcost")
	private WebElement budgetcost;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement salescount;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedresponsecount")
	private WebElement responsecount;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedroi")
	private WebElement expectedroi;
	
	@FindBy(id="Campaigns_editView_fieldName_actualcost")
	private WebElement actualcost;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedrevenue")
	private WebElement revenue;
	
	@FindBy(id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actualsalescount;
	
	@FindBy(id="Campaigns_editView_fieldName_actualresponsecount")
	private WebElement actualresponsecount;
	
	@FindBy(id="Campaigns_editView_fieldName_actualroi")
	private WebElement actualroi;
	
	@FindBy(id="Campaigns_editView_fieldName_description")
	private WebElement description;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getTargetsize() {
		return targetsize;
	}

	public WebElement getTargetaudience() {
		return targetaudience;
	}

	public WebElement getSponser() {
		return sponser;
	}

	public WebElement getNumset() {
		return numset;
	}

	public WebElement getBudgetcost() {
		return budgetcost;
	}

	public WebElement getSalescount() {
		return salescount;
	}

	public WebElement getResponsecount() {
		return responsecount;
	}

	public WebElement getExpectedroi() {
		return expectedroi;
	}

	public WebElement getActualcost() {
		return actualcost;
	}

	public WebElement getRevenue() {
		return revenue;
	}

	public WebElement getActualsalescount() {
		return actualsalescount;
	}

	public WebElement getActualresponsecount() {
		return actualresponsecount;
	}

	public WebElement getActualroi() {
		return actualroi;
	}

	public WebElement getDescription() {
		return description;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
