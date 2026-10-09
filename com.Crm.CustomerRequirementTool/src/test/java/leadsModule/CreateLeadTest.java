package leadsModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Crm.CustomerRequirementTool.GenericLibrary.BaseClass;
import com.Crm.CustomerRequirementTool.GenericLibrary.FileUtilityClass;
import com.Crm.CustomerRequirementTool.GenericLibrary.ListenerImplementation;
import com.Crm.CustomerRequirementTool.GenericLibrary.SeleniumUtility;

import objectRepository.HomePage;
import objectRepository.LeadsPage;
@Listeners(ListenerImplementation.class)
public class CreateLeadTest extends BaseClass {
	@Test
	public void createLead() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.getLeadsElement().click();
		LeadsPage lp = new LeadsPage(driver);
		lp.getPlusIconbtn().click();
		FileUtilityClass f = new FileUtilityClass();
		SeleniumUtility s = new SeleniumUtility();
		WebElement address = lp.getFirstnameDropMenu();
		s.selectFirstName(address,"Ms.");
		String fname = f.readDataFromExcelForStringvalue2("LeadsData", 1, 1);
		lp.getFirstnametxtbx().sendKeys(fname);
		String lname = f.readDataFromExcelForStringvalue2("LeadsData", 1, 2);
		lp.getLastnametxtbx().sendKeys(lname);
		String company = f.readDataFromExcelForStringvalue2("LeadsData", 1, 3);
		lp.getComtxtbx().sendKeys(company);
		long phone = f.readDataFromExcelForNumericvalue2("LeadsData", 1, 4);
		lp.getPhonetxtbx().sendKeys(String.valueOf(phone));
		long mobile = f.readDataFromExcelForNumericvalue2("LeadsData", 1, 5);
		lp.getMobiletxtbx().sendKeys(String.valueOf(mobile));
		String email = f.readDataFromExcelForStringvalue2("LeadsData", 1, 11);
		lp.getEmailtxtbx().sendKeys(email);
		WebElement add = lp.getLeadSourceDropdown();
		s.selectLeadSource(add,"Self Generated");
		WebElement ind = lp.getIndustryDropdown();
		s.selectIndustry(ind, "Communications");
		WebElement leadstatus = lp.getLeadStatusDrpdown();
		s.selectIndustry(leadstatus, "Contacted");
		lp.getAssignRadiobtn().isSelected();
		WebElement assign = lp.getAssignDropmenu();
		s.selectIndustry(assign, "Administrator");
		//lp.getAssignRadiobtn().isSelected();
		long postalcode = f.readDataFromExcelForNumericvalue2("LeadsData", 1, 6);
		lp.getPostalcodetxtbx().sendKeys(String.valueOf(postalcode));
		String city = f.readDataFromExcelForStringvalue2("LeadsData", 1, 7);
		lp.getCitytxtbx().sendKeys(city);
		String country = f.readDataFromExcelForStringvalue2("LeadsData", 1, 9);
		lp.getCountrytxtbx().sendKeys(country);
		String state = f.readDataFromExcelForStringvalue2("LeadsData", 1, 8);
		lp.getStatetxtbx().sendKeys(state);
		String desc = f.readDataFromExcelForStringvalue2("LeadsData", 1, 8);
		lp.getDesctxtbx().sendKeys(desc);
		
		Thread.sleep(5000);
		lp.getSavetxtbx().click();
		
	}

}
