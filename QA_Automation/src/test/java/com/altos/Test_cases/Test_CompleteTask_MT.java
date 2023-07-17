package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingMT_page;
import com.altos.Page_opject.LogingQA_page;
import com.altos.Page_opject.LogingQC_Page;
import com.altos.Utility.ConfingLoginData;

public class Test_CompleteTask_MT extends BaseClass
{
		@Test
		public void Complete_MT_Task() 
		{
			
			logger=report.createTest(" MT Assign Task should be Complete");
			ConfingLoginData ConfigLogin = new ConfingLoginData();
			logger.info("Starting Applicaton");
			LogingMT_page Loging_MT= PageFactory.initElements(driver, LogingMT_page.class);
			Loging_MT.Complete_MT_Task(ConfigLogin.getMT_ID(), ConfigLogin.getPassword());
			logger.pass("The MT Assign Task is Complete shows Success");
			
			
		}
		
//		@Test
//		public void Complete_QA_Task() 
//		{
//			
//			logger=report.createTest(" QA Assign Task should be Complete");
//			ConfingLoginData ConfigLogin = new ConfingLoginData();
//			logger.info("Starting Applicaton");
//			LogingMT_QA_QC_page  Loging_QA = PageFactory.initElements(driver, LogingMT_QA_QC_page .class);
//			Loging_QA.Complete_QA_Task(ConfigLogin.getQA_ID(), ConfigLogin.getPassword());
//			logger.pass("The QA Assign Task is Complete shows Success");
//			
//			
//	 }
//		@Test
//		public void Complete_QC_Task() 
//		{
//			
//			logger=report.createTest(" MT Assign Task should be Complete");
//			ConfingLoginData ConfigLogin = new ConfingLoginData();
//			logger.info("Starting Applicaton");
//			LogingMT_QA_QC_page  Loging_QC = PageFactory.initElements(driver, LogingMT_QA_QC_page.class);
//			Loging_QC.Complete_QC_Task(ConfigLogin.getQC_ID(), ConfigLogin.getPassword());
//			logger.pass("The MT Assign Task is Complete shows Success");
//			
//			
//	 }
		
}
