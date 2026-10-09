package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Crm.CustomerRequirementTool.GenericLibrary.SeleniumUtility;

public class HomePage {
	//declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileelement;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutelement;
	
	@FindBy(xpath = "//a[text()='Organizations']/parent::td[@class='tabUnSelected']")
	private WebElement organizationselement;
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadsElement;
	
	public WebElement getLeadsElement() {
		return leadsElement;
	}
	

	//initialization
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization

	public WebElement getProfileelement() {
		return profileelement;
	}

	public WebElement getSignoutelement() {
		return signoutelement;
	}

	public WebElement getOrganizationselement() {
		return organizationselement;
	}
	
	
	//Business Logic
	public void logout(WebDriver driver ) {
		HomePage hp = new HomePage(driver);
		SeleniumUtility s = new SeleniumUtility();
		WebElement element1 = hp.getProfileelement();
			s.mouseHover(driver, element1);
			hp.getSignoutelement().click();
	}
	
	
	
	

}
