package com.Crm.CustomerRequirementTool.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtilityClass {
	
		
	public String readDataFromProperties(String key) throws IOException {
			
		FileInputStream fis = new FileInputStream(IpathConstants.propertypath);
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	
	}
	public String readDataFromExcelForStringvalue(String Sheetname, int row ,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(IpathConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String name = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return name;
				
}
	public double readDataFromExcelForNumericvalue(String Sheetname, int row ,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(IpathConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		double data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}

}
