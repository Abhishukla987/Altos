package com.altos.Test_cases;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingTL_page;
import com.altos.Utility.ConfingLoginData;

public class Test_Association_Page extends BaseClass {
	@Test
	public void loginApp()
	{
		logger=report.createTest("Loging TL");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page Loging_page= PageFactory.initElements(driver, LogingTL_page.class);
		Loging_page.loginAltos_TL(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}

	@Test(dependsOnMethods = {"loginApp",})
	public void Association_Page() throws InterruptedException, AWTException {
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
}
