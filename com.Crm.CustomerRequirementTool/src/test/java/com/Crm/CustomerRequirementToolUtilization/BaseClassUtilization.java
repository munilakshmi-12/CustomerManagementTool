package com.Crm.CustomerRequirementToolUtilization;

import org.testng.annotations.Test;

import com.Crm.CustomerRequirementTool.GenericLibrary.BaseClass;

import objectRepository.HomePage;

public class BaseClassUtilization extends BaseClass {
	@Test
	public void searchTheCustomization() {
		HomePage hp = new HomePage(driver);
		hp.getOrganizationselement().click();
		
		
	}
}
