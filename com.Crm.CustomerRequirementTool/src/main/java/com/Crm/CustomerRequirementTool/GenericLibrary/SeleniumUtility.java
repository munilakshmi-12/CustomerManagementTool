package com.Crm.CustomerRequirementTool.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	
	public void maximizeBrowser(WebDriver d) {
		d.manage().window().maximize();
	}
	
	public void implitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void navToApplication(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	} 
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	public void selectOptionByContains(WebElement address, String text) {
		Select s = new Select(address);
		s.selectByContainsVisibleText(text);	
		
		
	}
	public void selectTypeDropdown(WebElement address, String text) {
		Select s = new Select(address);
		s.selectByContainsVisibleText(text);	
		
		
	}

	public void alertPopupForOK(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void selectFirstName(WebElement address,String text) {
		Select s = new Select(address);
		s.selectByVisibleText(text);
	}
	public void selectLeadSource(WebElement add,String text) {
		Select s = new Select(add);
		s.selectByVisibleText(text);
	}
	public void selectIndustry(WebElement add,String text) {
		Select s = new Select(add);
		s.selectByVisibleText(text);
	}
	public void selectLeadStatus(WebElement add,String text) {
		Select s = new Select(add);
		s.selectByVisibleText(text);
	}
	public void selectassignedToUser(WebElement add,String text) {
		Select s = new Select(add);
		s.selectByVisibleText(text);
	}
	public void selectassignedTogroup(WebElement add,String text) {
		Select s = new Select(add);
		s.selectByVisibleText(text);
	}

}
