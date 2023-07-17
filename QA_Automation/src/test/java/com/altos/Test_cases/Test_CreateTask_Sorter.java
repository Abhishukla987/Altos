package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.altos.Page_opject.LogingSorter_Page;
import com.altos.Page_opject.LogingTL_page;
import com.altos.Utility.ConfingLoginData;
import org.openqa.selenium.WebDriver;

import com.altos.Page_opject.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.altos.Utility.BrowserFactory;
import com.altos.Utility.ConfingDataProvider;
import com.altos.Utility.ExcelDataProvider;
import com.altos.Utility.Helper;

public class Test_CreateTask_Sorter extends BaseClass
{
//
//		@Test
//		public void loginApp()
//		{
//			
//			logger=report.createTest("The Loging Sorter");
//			ConfingLoginData ConfigLogin = new ConfingLoginData();
//			logger.info("Starting Applicaton");
//			LogingSorter_Page LogingSorter_Page= PageFactory.initElements(driver, LogingSorter_Page.class);
//			LogingSorter_Page.loginAltos(ConfigLogin.getSortarID(), ConfigLogin.getPassword());
//			logger.pass("The Sorter Loging shows Success");
//			
//		}
	
		
		@Test
		public void CreatTask_Sorter() 
		
		{
			logger=report.createTest("Verify the Creat Sorter Task ");
			ConfingLoginData ConfigLogin = new ConfingLoginData();
			logger.info("Starting Applicaton");
			LogingSorter_Page LogingSorter_Page= PageFactory.initElements(driver, LogingSorter_Page.class);
			LogingSorter_Page.CreatTask_Sorter(ConfigLogin.getSortar_ID(), ConfigLogin.getPassword());
			logger.pass("The Created Sorter task shows Success");
		}
		
	

}
