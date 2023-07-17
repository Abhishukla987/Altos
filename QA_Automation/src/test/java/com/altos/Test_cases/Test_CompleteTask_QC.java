package com.altos.Test_cases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingMT_page;
import com.altos.Page_opject.LogingQC_Page;
import com.altos.Utility.ConfingLoginData;
public class Test_CompleteTask_QC extends BaseClass
{

	@Test
	public void Complete_MT_Task() 
	{
		
		logger=report.createTest(" MT Assign Task should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingQC_Page  LogingQAC_Page = PageFactory.initElements(driver, LogingQC_Page.class);
		LogingQAC_Page.Complete_QC_Task(ConfigLogin.getQC_ID(), ConfigLogin.getPassword());
		logger.pass("The MT Assign Task is Complete shows Success");
		
		
 }

}
