package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import VtigerPOM.VAddCampaings;
import VtigerPOM.VAddDetails;
import VtigerPOM.VLoginPage;
import VtigerPOM.VMarketingPage;

public class VtigerBase 
{

	WebDriver driver;

	@Test
	public void vtiger() throws IOException, InterruptedException
	{   
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Vtiger1.properties");
		Properties p = new Properties();
		
		p.load(fis);
	    String BROWSER = p.getProperty("browser");
	    
	    if(BROWSER.equals("Chrome"))
	    {
	    	driver = new ChromeDriver();
	    }
	    else if(BROWSER.equals("Firefox"))
	    {
	    	driver = new FirefoxDriver();
	    }
	    else
	    {
	    	driver= new EdgeDriver();
	    }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String URL = p.getProperty("url");
		String NAME = p.getProperty("CampaignName");
		String SIZE = p.getProperty("TargetSize");
		String DATE = p.getProperty("Date");
		String AUDIENCE = p.getProperty("Audience");
		String SPONSER = p.getProperty("sponser");
		String NUMSET = p.getProperty("numset");
		String BUDGETCOST = p.getProperty("budgetcost");
		String ACTUALCOST = p.getProperty("actualcost");
		String REVENUE = p.getProperty("expectedrevenue");
		String SALESCOUNT = p.getProperty("expectedsalescount");
		String ASALSECOUNT = p.getProperty("actualsalescount");
		String ERCOUNT = p.getProperty("expectedresponsecount");
		String ARCOUNT = p.getProperty("actualresponsecount");
		String EROI = p.getProperty("expectedroi");
		String AROI = p.getProperty("actualroi");
		String DESCRIPTION = p.getProperty("description");
		
		driver.get(URL);
		
		VLoginPage lp = new VLoginPage();
		PageFactory.initElements(driver, lp);
		lp.getSignin().click();
		
		VMarketingPage vp = new VMarketingPage();
		PageFactory.initElements(driver, vp);
		vp.getThreedot().click();
		Actions a = new Actions(driver);
		a.moveToElement(vp.getClickonmarketing()).perform();
		vp.getCampaings().click();
		
		VAddCampaings ac = new VAddCampaings();
		PageFactory.initElements(driver, ac);
		ac.getAddcamp().click();
		
		VAddDetails add = new VAddDetails();
		PageFactory.initElements(driver, add);
		add.getFname().sendKeys(NAME);
		add.getTargetsize().sendKeys(SIZE);
		add.getDate().sendKeys(DATE);
		add.getDate().sendKeys(Keys.ENTER);
		add.getTargetaudience().sendKeys(AUDIENCE);
		add.getSponser().sendKeys(SPONSER);
		add.getNumset().sendKeys(NUMSET);
		add.getBudgetcost().sendKeys(BUDGETCOST);
		add.getActualcost().sendKeys(ACTUALCOST);
		add.getRevenue().sendKeys(REVENUE);
		add.getSalescount().sendKeys(SALESCOUNT);
		add.getActualsalescount().sendKeys(ASALSECOUNT);
		add.getResponsecount().sendKeys(ERCOUNT);
		add.getExpectedroi().sendKeys(EROI);
		add.getActualroi().sendKeys(AROI);
		add.getDescription().sendKeys(DESCRIPTION);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}
