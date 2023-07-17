package com.altos.Page_opject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
public class LogingMT_page 
{
	WebDriver driver;

	public LogingMT_page(WebDriver ldriver) 
	{
		this.driver =ldriver;
	}
	//@FindBy(xpath="//input[@placeholder='Email']") WebElement Uname;
	@FindBy(xpath="//input[@placeholder='Employee Code']") WebElement Uname;
	@FindBy(xpath="//input[@type='password']") WebElement Password;
	@FindBy(xpath="//span[@class='mat-button-wrapper']") WebElement Login;
	@FindBy(xpath="//mat-icon[normalize-space()='keyboard_arrow_down']") WebElement Loginfbutton;
	@FindBy(xpath="//span[@class='mat-button-wrapper']") WebElement logout;
	@FindBy(xpath="//div[@class='title']") WebElement Dashbord;
	@FindBy(xpath="//span[@class='mat-slide-toggle-bar']") WebElement Switch_Id;
	@FindBy(xpath="(//i[@class='mat-tooltip-trigger fa fa-medkit oa transition x-md ng-star-inserted'])[1]") WebElement Altos_Icon;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']") WebElement Associated;
	@FindBy(xpath="//span[contains(text(),'search')]") WebElement Search;
	@FindBy(xpath="//h5[@class='ng-star-inserted']") WebElement Job_page;
	
	
	@FindBy(xpath="(//a[@class='anchor-with-underline ng-tns-c500-268 ng-star-inserted'])") List<WebElement> Job_NoList;
	@FindBy(xpath="//*[@id=\"createRow0\"]/td[1]/a") WebElement Job_NoList1;
	@FindBy(xpath="//a[normalize-space()='Assign to me']") WebElement Assign_to_me;
	@FindBy(xpath="//mat-icon[normalize-space()='expand_more']") WebElement Expand_more;
	@FindBy(xpath="//div[@class='angular-editor-textarea']") WebElement Textarea;
	@FindBy(xpath="(//mat-icon[@role='img'][normalize-space()='task_alt'])[1]") WebElement task_done;
	
		
		@FindBy(xpath="//div[@class='content']") WebElement logout_Icon;
		@FindBy(xpath="//span[normalize-space()='LOG OUT']") WebElement LOG_OUT;

		
		
		public void Time_sleep()
		{

			try
			{
				Thread.sleep(2000);
				
			}
			catch(InterruptedException e)
			{
				
			}
		}
		public void log_out()
		{
			logout_Icon.click();
			Time_sleep();
			LOG_OUT.click();
			Time_sleep();
		}
		public void loginAltos_MT(String usernameApplication, String passwordApplication)
		{
			Switch_Id.click();
			Uname.clear();
			Uname.sendKeys(usernameApplication);
			Password.clear();
			Password.sendKeys(passwordApplication);
			Login.click();
			driver.getTitle();
			System.out.println(Dashbord.getText());
			Altos_Icon.click();
			
		}
		
		public void Complete_MT_Task(String usernameApplication, String passwordApplication)
		{
			loginAltos_MT( usernameApplication, passwordApplication);
			Altos_Icon.click();
			Job_page.click();
			Associated.click();
			Search.click();
			Time_sleep();

			Job_NoList1.click();
			Time_sleep();
			Assign_to_me.click();
			Time_sleep();
			//Expand_more.click();
			Time_sleep();
			Textarea.clear();
			Textarea.sendKeys("A cardiac surgeon is a medical doctor who performs surgery on the heart and the major blood vessels around it. There are several different medical specialties that a cardiac surgeon may fall under");
			Time_sleep();
//			for (WebElement task_done1 : task_dones)
//			{
//				Time_sleep();
//				task_done1.click();
//				System.out.println(task_done1.getText());
//			}
			task_done.click();
			Time_sleep();
			Assert.assertTrue(true);
			
			
			
		}
//		public void loginAltos_QA(String usernameApplication, String passwordApplication)
//		{
//			Switch_Id.click();
//			Uname.clear();
//			Uname.sendKeys(usernameApplication);
//			Password.clear();
//			Password.sendKeys(passwordApplication);
//			Login.click();
//			driver.getTitle();
//			System.out.println(Dashbord.getText());
//			Altos_Icon.click();
//			
//			
//			
//		}
//		
//		
//		public void Complete_QA_Task(String usernameApplication, String passwordApplication)
//		{
//			loginAltos_QA( usernameApplication, passwordApplication);
//			Altos_Icon.click();
//			Job_page.click();
//			Associated.click();
//			Search.click();
//
//			Job_NoList1.click();
//
//			Assign_to_me.click();
//			Time_sleep();
//			//Expand_more.click();
//			Textarea.clear();
//			Textarea.sendKeys("A cardiac surgeon is a medical doctor who performs surgery on the heart and the major blood vessels around it. There are several different medical specialties that a cardiac surgeon may fall under,\"\r\n"
//					+ "					+ \" some of which have overlapping areas of focus.Automation");
//			Time_sleep();
////			for (WebElement task_done1 : task_dones)
////			{
////				task_done1.click();
////			}
//			task_done.click();
//			log_out();
//			Assert.assertTrue(true);
//		}
//		
//		
//		public void loginAltos_QC(String usernameApplication, String passwordApplication)
//		{
//			Switch_Id.click();
//			Uname.clear();
//			Uname.sendKeys(usernameApplication);
//			Password.clear();
//			Password.sendKeys(passwordApplication);
//			Login.click();
//			driver.getTitle();
//			System.out.println(Dashbord.getText());
//			Altos_Icon.click();
//			
//		}
//		
//		public void Complete_QC_Task(String usernameApplication, String passwordApplication)
//		{
//			loginAltos_QC( usernameApplication, passwordApplication);
//			Altos_Icon.click();
//			Job_page.click();
//			Associated.click();
//			Search.click();
//			Time_sleep();
//
//			Job_NoList1.click();
//
//			Assign_to_me.click();
//			Time_sleep();
//			//Expand_more.click();
//			Textarea.clear();
//			Textarea.sendKeys("A cardiac surgeon is a medical doctor who performs surgery on the heart and the major blood vessels around it. There are several different medical specialties that a cardiac surgeon may fall under,"
//					+ " some of which have overlapping areas of focus. Automation");
//			Time_sleep();
////			for (WebElement task_done1 : task_dones)
////			{
////				task_done1.click();
////			}
//			task_done.click();
//			log_out();
//			Time_sleep();
//			Assert.assertTrue(true);
//		}
		
		
}
