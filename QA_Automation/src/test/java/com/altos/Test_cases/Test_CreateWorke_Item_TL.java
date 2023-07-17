package com.altos.Test_cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingTL_page;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.altos.Utility.BrowserFactory;
import com.altos.Utility.ConfingDataProvider;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.ExcelDataProvider;

public class Test_CreateWorke_Item_TL extends BaseClass
{
	
	@Test
	public void loginApp()
	{
		//ExcelDataProvider excel =new ExcelDataProvider();
		logger=report.createTest("Loging TL");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page Loging_page= PageFactory.initElements(driver, LogingTL_page.class);
		//Loging_page.loginAltos(excel.getStringData("Login_Data", 0, 0),excel.getStringData("Login_Data", 0, 0));
		Loging_page.loginAltos_TL(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}
	
//	@Test(dependsOnMethods = {"loginApp"})
//	public void CreateNew_WorkItem() 
//	
//	{
//		logger=report.createTest("the TL Create New Work-Item");
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.CreateNew_WorkItem();
//		logger.pass("The TL Create New Work-Item shows Success");
//	}

	@Test(dependsOnMethods = {"loginApp",})
	public void CreateNew_Job() 
	
	{
		logger=report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.CreateNew_Job();
		logger.pass("The TL Create New Work-Item shows Success");
	}
	

}
