package OrganizationModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Crm.CustomerRequirementTool.GenericLibrary.BaseClass;
import com.Crm.CustomerRequirementTool.GenericLibrary.FileUtilityClass;
import com.Crm.CustomerRequirementTool.GenericLibrary.SeleniumUtility;

import objectRepository.HomePage;
import objectRepository.OrganizationPage;

public class CreateOrganization extends BaseClass{
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException, InterruptedException{
		HomePage hp = new HomePage(driver);
		hp.getOrganizationselement().click();
		SeleniumUtility s = new SeleniumUtility();
		OrganizationPage op = new OrganizationPage(driver);
		op.getPlusicon().click();
		FileUtilityClass f = new FileUtilityClass();
		String orgname = f.readDataFromExcelForStringvalue("ORGdata",1, 1);
		op.getOrgname().sendKeys(orgname);
		String email = f.readDataFromExcelForStringvalue("ORGdata",1,2);
		op.getEmailtxtbox().sendKeys(email);
		WebElement address = op.getIndustrytype();
		s.selectOptionByContains(address, "Technology");
		WebElement type = op.getTypedrop();
		s.selectTypeDropdown(type, "Analyst");
		String billingAddress = f.readDataFromExcelForStringvalue("ORGdata",1, 3);
		op.getBilladdress().sendKeys(billingAddress);
		String shippingAddress = f.readDataFromExcelForStringvalue("ORGdata",1, 4);
		op.getShipaddress().sendKeys(shippingAddress);
		String billingCity = f.readDataFromExcelForStringvalue("ORGdata",1, 5);
		op.getBillcity().sendKeys(billingCity);
		String shippingCity = f.readDataFromExcelForStringvalue("ORGdata",1, 6);
		op.getShipcity().sendKeys(shippingCity);
		String billingState = f.readDataFromExcelForStringvalue("ORGdata",1, 7);
		op.getBillstate().sendKeys(billingState);
		String shippingState = f.readDataFromExcelForStringvalue("ORGdata",1, 8);
	    op.getShipstate().sendKeys(shippingState);
	    String billingCountry = f.readDataFromExcelForStringvalue("ORGdata",1, 9);
	     op.getBillcountry().sendKeys(billingCountry);
	     String shippingCountry = f.readDataFromExcelForStringvalue("ORGdata",1, 10);
	    op.getShipcountry().sendKeys(shippingCountry);
	    String desc = f.readDataFromExcelForStringvalue("ORGdata", 1, 11);
	    op.getDesp().sendKeys(desc);
	    op.getSavebtn().click();
	
	  Thread.sleep(50000);
	
	}
	@Test
	public void deleteOrg()
	{
		HomePage hp = new HomePage(driver);
		hp.getOrganizationselement().click();
		driver.findElement(By.xpath("(//a[text()='Google'])[2]/parent::td/preceding-sibling::td/child::input")).click()	;
		driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
		SeleniumUtility s = new SeleniumUtility();
		s.alertPopupForOK(driver);		
	}

	
	
	
	
		
	}


