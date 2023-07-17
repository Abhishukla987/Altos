package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingTL_page;
import com.altos.Utility.ConfingLoginData;

public class Test_Create_Job_On_JobPage extends BaseClass
{

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
	public void Create_job_onJobPage() 
	
	{
		logger=report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Create_job_onJobPage();
		logger.pass("appointment create");
	}
	
}
