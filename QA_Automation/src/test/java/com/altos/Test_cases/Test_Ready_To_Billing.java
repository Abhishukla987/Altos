package com.altos.Test_cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingQA_page;
import com.altos.Page_opject.LogingTL_page;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.altos.Utility.BrowserFactory;
import com.altos.Utility.ConfingDataProvider;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.ExcelDataProvider;

public class Test_Ready_To_Billing extends BaseClass
{
	@Test
	public void Ready_For_Billing() 
	{
		
		logger=report.createTest(" Verify Ready_For Billing should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page  LogingTL_page = PageFactory.initElements(driver,LogingTL_page .class);
		LogingTL_page.Ready_For_Billing(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass(" The Ready For Billing is shows Success");
		
		
 }
	

}
