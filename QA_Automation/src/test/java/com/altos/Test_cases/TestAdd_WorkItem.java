package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingTL_page;
import com.altos.Utility.ConfingLoginData;

public class TestAdd_WorkItem extends BaseClass
{

	@Test
	public void loginAltos_TL() 
	{
		
		logger=report.createTest(" MT Assign Task should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page loginAltos_TL= PageFactory.initElements(driver, LogingTL_page.class);
		loginAltos_TL.loginAltos_TL(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The MT Assign Task is Complete shows Success");
		
		
	}

	@Test(dependsOnMethods = {"loginAltos_TL"})
	public void Add_workItem() 
	{
		
		logger=report.createTest(" MT Assign Task should be Complete");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Add_workItem();
		logger.pass("The MT Assign Task is Complete shows Success");
		
		
	}

}
