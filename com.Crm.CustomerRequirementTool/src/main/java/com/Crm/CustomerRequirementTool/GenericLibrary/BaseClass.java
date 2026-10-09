package com.Crm.CustomerRequirementTool.GenericLibrary;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;

import objectRepository.HomePage;
import objectRepository.LoginPage;


public class BaseClass {
	public static WebDriver driver;
	FileUtilityClass f = new FileUtilityClass();
	SeleniumUtility s = new SeleniumUtility();
	@BeforeSuite
	public void dataBaseConnection() {
		Reporter.log("Database connected Successfully",true);
	}
	@BeforeTest
	public void launchBrowser(@Optional("Chrome") String BROWSER) throws IOException {
		if(BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(BROWSER.equals("edge")) {
			driver = new EdgeDriver();
	    }else {
	    	driver = new ChromeDriver();
	    }
		
		s.maximizeBrowser(driver);
		s.implitWait(driver);
		String url = f.readDataFromProperties("url");
		s.navToApplication(driver, url);
		Reporter.log("Navigated into CMT Application, Browser launched Successfully",true);
		
	}
	@BeforeMethod
	public void loginToApplication() throws IOException {
		String un = f.readDataFromProperties("username");
		String pwd = f.readDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.login(driver, un, pwd);
		
		Reporter.log("Logged in to CMT Application Successfully",true);
		
	}
	@AfterMethod
	public void logoutFromApplication() {
		HomePage hp = new HomePage(driver);
	    hp.logout(driver);
		Reporter.log("Logged out from CMT application Successfully",true);
		
		
	}
	@AfterTest
	public void closeBrowser() {
		s.closeBrowser(driver);
		Reporter.log("Closed the CMT application Successfully",true);
		
	}
	@AfterSuite
	public void disconnectWithDataBase() {
		Reporter.log("DataBase disconnected Successfully",true);
	}
	

}
