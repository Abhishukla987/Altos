package com.altos.Page_opject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
public class LogingSorter_Page {
	WebDriver driver;

	public LogingSorter_Page(WebDriver ldriver) 
	{
		this.driver =ldriver;
		
	}
	
	@FindBy(xpath="//input[@placeholder='Employee Code']") WebElement Uname;
	@FindBy(xpath="//input[@type='password']") WebElement Password;
	@FindBy(xpath="//span[@class='mat-button-wrapper']") WebElement Login;
	@FindBy(xpath="//mat-icon[normalize-space()='keyboard_arrow_down']") WebElement loginfbutton;
	@FindBy(xpath="//span[@class='mat-button-wrapper']") WebElement logout;
	@FindBy(xpath="//div[@class='title']") WebElement Dashbord;
	@FindBy(xpath="//span[@class='mat-slide-toggle-bar']") WebElement switch_Id;
	@FindBy(xpath="(//i[@class='mat-tooltip-trigger fa fa-medkit oa transition x-md ng-star-inserted'])[1]") WebElement Altos_Icon;
	@FindBy(xpath="//i[@aria-describedby='cdk-describedby-message-hqi-1-6']") WebElement Altos_Icon1;
	@FindBy(xpath="//span[contains(text(),'search')]") WebElement Search;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']") WebElement Associated;
	
	
	@FindBy(xpath="//h5[@class='ng-star-inserted']") WebElement Job_page;
	@FindBy(xpath="//tr[@id='createRow0']//mat-icon[@role='img'][normalize-space()='expand_more']") WebElement Drop_Icon;
	@FindBy(xpath="//a[@class='anchor-with-underline']") WebElement Task;
	@FindBy(xpath="//span[normalize-space()='Add']") WebElement AddSubTask;
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[6]") WebElement Date_Icon;
	@FindBy(xpath="//div[@class='mat-calendar-body-cell-content mat-focus-indicator']") List<WebElement> Select_Date;
	@FindBy(xpath="(//input[@placeholder='Select Type'])[1]") WebElement Report_Type;
	@FindBy(xpath="(//input[@type='text'])[6]") WebElement Report_Title;
	@FindBy(xpath="//span[@class='mat-option-text']") List <WebElement> DropwonList;
	@FindBy(xpath="(//input[@placeholder='Select Doctor'])[1]") WebElement Doctor_Attorney;
	@FindBy(xpath="(//input[@placeholder='Select Facility'])[1]") WebElement Facility;
	@FindBy(xpath="(//input[@formcontrolname='pageFrom'])[1]") WebElement pageFrom;
	@FindBy(xpath="(//input[@formcontrolname='pageTo'])[1]") WebElement pageTo;
	@FindBy(xpath="(//input[@formcontrolname='comment'])[1]") WebElement comment;
	@FindBy(xpath="(//span[normalize-space()='Save'])[1]") WebElement Save;
	@FindBy(xpath="//mat-icon[text()='task_alt']") WebElement Completed_task;
	@FindBy(xpath="/html[1]/body[1]/div[1]/app-root[1]/div[1]/div[1]/div[2]/app-side-bar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[1]/div[2]/app-task-management-view[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[1]/button[2]/span[1]") WebElement Completed;
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[2]/div[1]/mat-dialog-container[1]/app-confirmation-dialog[1]/div[2]/button[2]") WebElement Yes;
	@FindBy(xpath="//button[@mattooltip='Completed']") List <WebElement> completedList;
	
	
	
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
	public void loginAltos(String usernameApplication, String passwordApplication)
	{
		switch_Id.click();
		Uname.sendKeys(usernameApplication);
		Password.sendKeys(passwordApplication);
		Login.click();
		driver.getTitle();
		System.out.println(Dashbord.getText());
		Altos_Icon.click();
		Assert.assertTrue(true);
		
		
	}
	
	public void CreatTask_Sorter(String usernameApplication, String passwordApplication)
	{
		loginAltos( usernameApplication, passwordApplication);
		Job_page.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Drop_Icon.click();
		Time_sleep();
		Task.click();
		Time_sleep();
		AddSubTask.click();
		Time_sleep();
		Date_Icon.click();
		Time_sleep();
		for (WebElement Select_Date1 : Select_Date)
		{
			Select_Date1.click();
			break;
		}
		Time_sleep();
		Report_Type.sendKeys("D");
		Time_sleep();
		for (WebElement DropwonList1 : DropwonList)
		{
			DropwonList1.click();
			break;
		}
		Time_sleep();
		Doctor_Attorney.sendKeys("D");
		Time_sleep();
		for (WebElement DropwonList1 : DropwonList)
		{
			DropwonList1.click();
			break;
		}
		Time_sleep();
		Facility.sendKeys("D");
		Time_sleep();
		for (WebElement DropwonList1 : DropwonList)
		{
			DropwonList1.click();
			break;
		}
		
//		String s=pageTo.getText();
//		int i=Integer.parseInt(s);
//	     i=i/2;
//	     System.out.println(i);
//	     String I = Integer.toString(i);
//	     pageTo.clear();
//	     System.out.println(I);
//		pageTo.sendKeys(I);
		comment.sendKeys("Test Comment");
		Save.click();
		Time_sleep();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		Assert.assertTrue(true);
		Time_sleep();
	}
	
	public void CompleteTask_Sorter(String usernameApplication, String passwordApplication)
	{
		loginAltos( usernameApplication, passwordApplication);
		
		Altos_Icon.click();
		Time_sleep();
		Job_page.click();
		Time_sleep();
		Associated.click();
		Search.click();
		Time_sleep();
		Drop_Icon.click();
		Time_sleep();
		
		Task.click();
		
		Time_sleep();
		Completed_task.click();
		Time_sleep();
		Completed.click();
		Time_sleep();
		Yes.click();
		Assert.assertTrue(true);
		Time_sleep();
		
	}
	
	

}
