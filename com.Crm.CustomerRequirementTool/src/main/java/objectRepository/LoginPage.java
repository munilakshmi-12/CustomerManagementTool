package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(name = "user_name")
	private WebElement usernametbx;
	
	@FindBy(name = "user_password")
	private WebElement passwordtbx;
	
	
	@FindBy(id = "submitButton")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//a[text()='vtiger']")
	private WebElement vtigerelementLink;
	
	@FindBy(xpath = "//img[@alt='Outlook Plugin']")
	private WebElement outlookPluginLink;
	
	@FindBy(xpath = "//img[@alt='Exchange Connector']")
	private WebElement exchangeConnectorLink;
	
	@FindBy(xpath = "//img[@src='include/images//AppStoreQRCode.png']")
	private WebElement appStoreQrcodeelement;
	
	@FindBy(xpath = "//img[@src='include/images//GooglePlayQRCode.png']")
	private WebElement googlePlayQrcodeelement;
	
	@FindBy(xpath = "//img[@alt = 'vtiger iPhone Application']/preceding-sibling::br")
	private WebElement appStoreElement;
	
	@FindBy(xpath = "//img[@alt = 'vtiger Android Application']/preceding-sibling::br")
	private WebElement googlePlayElement;
	
	@FindBy(xpath = "//img[@alt = 'Facebook']")
	private WebElement facebookLinkElement;
	
	@FindBy(xpath = "//img[@alt = 'Twitter']")
	private WebElement twitterLinkElement;
	
	@FindBy(xpath = "//img[@alt = 'Linkedin']")
	private WebElement linkedinLinkElement;
	
	@FindBy(xpath = "//img[@alt = 'Videos']")
	private WebElement youtubeLinkElement;
	
	@FindBy(xpath = "//img[@alt = 'Blogs']")
	private WebElement blogsLinkElement;
	
	
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUsernametbx() {
		return usernametbx;
	}
	public WebElement getPasswordtbx() {
		return passwordtbx;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getVtigerelementLink() {
		return vtigerelementLink;
	}

	public WebElement getOutlookPluginLink() {
		return outlookPluginLink;
	}

	public WebElement getExchangeConnectorLink() {
		return exchangeConnectorLink;
	}

	public WebElement getAppStoreQrcodeelement() {
		return appStoreQrcodeelement;
	}

	public WebElement getGooglePlayQrcodeelement() {
		return googlePlayQrcodeelement;
	}

	public WebElement getAppStoreElement() {
		return appStoreElement;
	}

	public WebElement getGooglePlayElement() {
		return googlePlayElement;
	}

	public WebElement getFacebookLinkElement() {
		return facebookLinkElement;
	}

	public WebElement getTwitterLinkElement() {
		return twitterLinkElement;
	}

	public WebElement getLinkedinLinkElement() {
		return linkedinLinkElement;
	}

	public WebElement getYoutubeLinkElement() {
		return youtubeLinkElement;
	}

	public WebElement getBlogsLinkElement() {
		return blogsLinkElement;
	}
	
	//BusinessLOgic = one action or one method
	public void login(WebDriver driver,String un, String pwd) {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernametbx().sendKeys(un);
		lp.getPasswordtbx().sendKeys(pwd);
		lp.getLoginbtn().click();
	}
	

}
