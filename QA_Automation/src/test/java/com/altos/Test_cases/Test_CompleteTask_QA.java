package com.altos.Test_cases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingQA_page;
import com.altos.Utility.ConfingLoginData;
public class Test_CompleteTask_QA extends BaseClass
{

	@Test
	public void Complete_QA_Task() 
	{
		
		logger=report.createTest(" QA Assign Task should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingQA_page  LogingQA_page = PageFactory.initElements(driver, LogingQA_page .class);
		LogingQA_page.Complete_QA_Task(ConfigLogin.getQA_ID(), ConfigLogin.getPassword());
		logger.pass("The QA Assign Task is Complete shows Success");
		
		
 }
}
