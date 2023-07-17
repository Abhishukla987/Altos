package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_opject.LogingMT_page;
import com.altos.Utility.ConfingLoginData;
import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingTL_page;
import com.altos.Utility.ConfingLoginData;

public class Test_Case_Basic_WorkItem_page extends BaseClass 
{
	@Test
	public void Column_Header_Name() 
	{
		
		logger=report.createTest(" MT Assign Task should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Column_Header_Name(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The MT Assign Task is Complete shows Success");
		
		
	}
	
	@Test(dependsOnMethods = {"Column_Header_Name"})
	public void Column_Work_Item_ASC() 
	{
		logger=report.createTest(" MT Assign Task should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Column_Work_Item_ASC();
		logger.pass("The MT Assign Task is Complete shows Success");
	}
	
	@Test(dependsOnMethods = {"Column_Header_Name"})
	public void Column_Work_Item_DSC() 
	{
		logger=report.createTest(" MT Assign Task should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Column_Work_Item_DSC();
		logger.pass("The MT Assign Task is Complete shows Success");
	}

	@Test(dependsOnMethods = {"Column_Header_Name"})
	public void FilterBy_workItem_Search() 
	{
		logger=report.createTest(" MT Assign Task should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.FilterBy_workItem_Search();
		logger.pass("The MT Assign Task is Complete shows Success");
	}
//	@Test(dependsOnMethods = {"Column_Header_Name"})
//	public void Client_Name_Search_Search() 
//	{
//		logger=report.createTest(" MT Assign Task should be Complete");
//		ConfingLoginData ConfigLogin = new ConfingLoginData();
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Client_Name_Search_Search();
//		logger.pass("The MT Assign Task is Complete shows Success");
//	}
//	@Test(dependsOnMethods = {"Column_Header_Name"})
//	public void Sub_Client_Name_Search()  
//	{
//		logger=report.createTest(" MT Assign Task should be Complete");
//		ConfingLoginData ConfigLogin = new ConfingLoginData();
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Sub_Client_Name_Search();
//		logger.pass("The MT Assign Task is Complete shows Success");
//	}
//	@Test(dependsOnMethods = {"Column_Header_Name"})
//	public void Patient_Name_Search() 
//	{
//		logger=report.createTest(" MT Assign Task should be Complete");
//		ConfingLoginData ConfigLogin = new ConfingLoginData();
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Patient_Name_Search() ;
//		logger.pass("The MT Assign Task is Complete shows Success");
//	}
//	@Test(dependsOnMethods = {"Column_Header_Name"})
//	public void File_Type_Select()  
//	{
//		logger=report.createTest(" MT Assign Task should be Complete");
//		ConfingLoginData ConfigLogin = new ConfingLoginData();
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.File_Type_Select();
//		logger.pass("The MT Assign Task is Complete shows Success");
//	}
//	@Test(dependsOnMethods = {"Column_Header_Name"})
//	public void Priority_Select() 
//	{
//		logger=report.createTest(" MT Assign Task should be Complete");
//		ConfingLoginData ConfigLogin = new ConfingLoginData();
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Priority_Select();
//		logger.pass("The MT Assign Task is Complete shows Success");
//	}
}
