package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	//declaration
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadsElement;
	
	public WebElement getLeadsElement() {
		return leadsElement;
	}


	@FindBy(xpath = "(//a[text()='Leads'])[2]")
	private WebElement leadsElementlink;
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement plusIconbtn;
	
	@FindBy(xpath = "//img[@title='Search in Leads...']")
	private WebElement searchIconbtn;
	
	
	@FindBy(xpath = "//img[@title='Open Calendar...']")
	private WebElement calendarIconbtn;
	
	@FindBy(xpath = "//b[text()='World Clock']")
	private WebElement clockIconbtn;
	
	@FindBy(xpath = "//img[@title='Open Calculator...']")
	private WebElement calculatorIconbtn;
	
	@FindBy(xpath = "//img[@title='Chat...']")
	private WebElement chatIconbtn;
	
	@FindBy(xpath = "//img[@title='Last Viewed']")
	private WebElement lastViewedIconbtn;
	
	@FindBy(xpath = "//img[@title='Import Leads']")
	private WebElement importLeadsIconbtn;
	
	@FindBy(xpath = "//img[@title='Export Leads']")
	private WebElement exportLeadsIconbtn;
	
	@FindBy(xpath = "//img[@title='Find Duplicates']")
	private WebElement findDuplicatesIconbtn;
	
	@FindBy(xpath = "//img[@title='Leads Settings']")
	private WebElement leadsSettingsIconbtn;
	
	@FindBy(id = "bas_searchfield")
	private WebElement searchFieldDropdown;
	
	@FindBy(name = "submit")
	private WebElement searchNowCLickableBtn;
	
	@FindBy(name = "search_text")
	private WebElement searchfortxtbx;
	
	@FindBy(xpath = "(//input[@value='Delete'])[2]")
	private WebElement deleteBtn;
	
//	@FindBy(name = "submit")
//	private WebElement searchNowCLickableBtn;
	
	@FindBy(name = "salutationtype")
	private WebElement firstnameDropMenu;
	
	@FindBy(name = "firstname")
	private WebElement firstnametxtbx;

	@FindBy(name = "lastname")
	private WebElement lastnametxtbx;

	@FindBy(name = "phone")
	private WebElement phonetxtbx;

	@FindBy(id = "mobile")
	private WebElement mobiletxtbx;

	@FindBy(name = "company")
	private WebElement comtxtbx;

	@FindBy(id = "email")
	private WebElement emailtxtbx;

	@FindBy(name = "leadsource")
	private WebElement leadSourceDropdown;

	@FindBy(name = "industry")
	private WebElement industryDropdown;

	@FindBy(name = "leadstatus")
	private WebElement leadStatusDrpdown;

	@FindBy(name = "assigntype")
	private WebElement assignRadiobtn;

	@FindBy(id = "city")
	private WebElement citytxtbx;

	@FindBy(id = "code")
	private WebElement postalcodetxtbx;

	@FindBy(id = "country")
	private WebElement countrytxtbx;

	@FindBy(id = "state")
	private WebElement statetxtbx;
	
	@FindBy(name = "description")
	private WebElement desctxtbx;
	
	@FindBy(name = "button")
	private WebElement savetxtbx;
	
	@FindBy(name = "button")
	private WebElement canceltxtbx;

	@FindBy(name = "assigned_user_id")
	private WebElement assignDropmenu;

	@FindBy(name = "assigntype")
	private WebElement assigngroupRadiobtn;
	
	@FindBy(name = "assigned_group_id")
	private WebElement assigngroupListbx;
	
	
	
	
	
	//Initialization
	
	

	public LeadsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	//utilization
	public WebElement getLeadsElementlink() {
		return leadsElementlink;
	}

	public WebElement getPlusIconbtn() {
		return plusIconbtn;
	}

	public WebElement getSearchIconbtn() {
		return searchIconbtn;
	}

	public WebElement getCalendarIconbtn() {
		return calendarIconbtn;
	}

	public WebElement getClockIconbtn() {
		return clockIconbtn;
	}

	public WebElement getCalculatorIconbtn() {
		return calculatorIconbtn;
	}

	public WebElement getChatIconbtn() {
		return chatIconbtn;
	}

	public WebElement getLastViewedIconbtn() {
		return lastViewedIconbtn;
	}

	public WebElement getImportLeadsIconbtn() {
		return importLeadsIconbtn;
	}

	public WebElement getExportLeadsIconbtn() {
		return exportLeadsIconbtn;
	}

	public WebElement getFindDuplicatesIconbtn() {
		return findDuplicatesIconbtn;
	}

	public WebElement getLeadsSettingsIconbtn() {
		return leadsSettingsIconbtn;
	}

	public WebElement getSearchFieldDropdown() {
		return searchFieldDropdown;
	}

	public WebElement getSearchNowCLickableBtn() {
		return searchNowCLickableBtn;
	}

	public WebElement getSearchfortxtbx() {
		return searchfortxtbx;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}


	public WebElement getFirstnameDropMenu() {
		return firstnameDropMenu;
	}


	public WebElement getFirstnametxtbx() {
		return firstnametxtbx;
	}


	public WebElement getLastnametxtbx() {
		return lastnametxtbx;
	}


	public WebElement getPhonetxtbx() {
		return phonetxtbx;
	}


	public WebElement getMobiletxtbx() {
		return mobiletxtbx;
	}


	public WebElement getComtxtbx() {
		return comtxtbx;
	}


	public WebElement getEmailtxtbx() {
		return emailtxtbx;
	}


	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}


	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}


	public WebElement getLeadStatusDrpdown() {
		return leadStatusDrpdown;
	}


	public WebElement getAssignRadiobtn() {
		return assignRadiobtn;
	}


	public WebElement getCitytxtbx() {
		return citytxtbx;
	}


	public WebElement getPostalcodetxtbx() {
		return postalcodetxtbx;
	}


	public WebElement getCountrytxtbx() {
		return countrytxtbx;
	}


	public WebElement getStatetxtbx() {
		return statetxtbx;
	}


	public WebElement getDesctxtbx() {
		return desctxtbx;
	}


	public WebElement getSavetxtbx() {
		return savetxtbx;
	}


	public WebElement getCanceltxtbx() {
		return canceltxtbx;
	}
	
	public WebElement getAssignDropmenu() {
		return assignDropmenu;
	}


	public WebElement getAssigngroupRadiobtn() {
		return assigngroupRadiobtn;
	}


	public WebElement getAssigngroupListbx() {
		return assigngroupListbx;
	}
	
	
	
	

}
