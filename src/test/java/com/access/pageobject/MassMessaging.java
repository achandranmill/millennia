package com.access.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MassMessaging
{
	WebDriver ldriver;
	
	public MassMessaging(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}
	
@FindBy(how=How.LINK_TEXT,using="Mass Messaging")
@CacheLookup
WebElement MassMessaging;

public void MassMessaging()
{
	MassMessaging.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/div/button[2]")
@CacheLookup
WebElement MessageHistory;

public void MessageHistory()
{
	MessageHistory.click();
}

@FindBy(how=How.ID,using="massMessaging")
@CacheLookup
WebElement MessageHistoryCancel;

public void MessageHistoryCancel()
{
	MessageHistoryCancel.click();
}
	
@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/div/button[1]")
@CacheLookup
WebElement Date;

public void Date()
{
	Date.click();
}
	@FindBy(how=How.NAME,using="daterangepicker_start")
	@CacheLookup
	WebElement Date1;
	
	public void Date1(String d1)
	{
		Date1.clear();
		Date1.sendKeys(d1);
	}
	
	@FindBy(how=How.NAME,using="daterangepicker_end")
	@CacheLookup
	WebElement Date2;
	
	public void Date2(String d2)
	{
		Date2.clear();
		Date2.sendKeys(d2);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[2]/div[3]/div/button[1]")
	@CacheLookup
	WebElement Btn_Apply;
	
	public void Btn_Apply()
	{
		Btn_Apply.click();
	}
		@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[1]/button[1]")
		@CacheLookup
		WebElement DepartmentFilter;
		
		public void DepartmentFilter()
		{
			DepartmentFilter.click();
		}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/department-filter/div[2]/div/div[1]/label/input")
	@CacheLookup
	WebElement SelectAll;
	
	public void SelectAll()
	{
		 
	if(!SelectAll.isSelected()) {
		JavascriptExecutor as = (JavascriptExecutor)ldriver;
		as.executeScript("arguments[0].click", SelectAll);
		if(!SelectAll.isSelected()) {
			SelectAll.click();
		}
	}
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"9b0eb0a4-edc5-40c9-ae10-7d19ed0e7f25\"]")
	@CacheLookup
	WebElement Clinic;
	
	public void Clinic()
	{
		if(!Clinic.isSelected()) {
			JavascriptExecutor g = (JavascriptExecutor)ldriver;
			g.executeScript("arguments[0].click", Clinic);
			if(!Clinic.isSelected()) {
				Clinic.click();
			}
		}
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/department-filter/div[3]/button[2]")
	@CacheLookup
	WebElement DepartmentSave;
	
	public void DepartmentSave()
	{
		DepartmentSave.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/department-filter/div[3]/button[1]")
	@CacheLookup
	WebElement DepartmentCancel;
	public void DepartmentCancel()
	{
		DepartmentCancel.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[1]/button[2]")
	@CacheLookup
	WebElement SeeingFilter;
	
	public void SeeingFilter()
	{
		SeeingFilter.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/seeing-filter/div[2]/div[1]/label/input")
	@CacheLookup
	WebElement SeeingSelectAll;
	
	public void SeeingSelectAll()
	{
		if(!SeeingSelectAll.isSelected()) {
			JavascriptExecutor g = (JavascriptExecutor)ldriver;
			g.executeScript("arguments[0].click", SeeingSelectAll);
			if(!SeeingSelectAll.isSelected()) {
				SeeingSelectAll.click();
			}
		}
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/seeing-filter/div[2]/input")
	@CacheLookup
	WebElement SeeingSearch;
	
	public void SeeingSearch(String s)
	{
		SeeingSearch.sendKeys(s);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/seeing-filter/div[3]/button")
	@CacheLookup
	WebElement SeeingCancel;
	
	public void SeeingCancel()
	{
		SeeingCancel.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[1]/button[3]")
	@CacheLookup
	WebElement StatusFilter;
	
	public void StatusFilter()
	{
		StatusFilter.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input")
	@CacheLookup
	WebElement StatusFilterSelect;
	
	public void StatusFilterSelect()
	{
	  if(!StatusFilterSelect.isSelected()) {
		  JavascriptExecutor j = (JavascriptExecutor)ldriver;
		  j.executeScript("arguments[0].click", StatusFilterSelect);
		  if(!StatusFilterSelect.isSelected())
		  {
			  StatusFilterSelect.click();
		  }
	  }
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/status-filter/div[3]/button[2]")
	@CacheLookup
	WebElement StatusFilterSave;
	
	public void StatusFilterSave()
	{
		StatusFilterSave.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/div[1]/div/div/status-filter/div[3]/button[1]")
	@CacheLookup
	WebElement StatusFilterCancel;
	
	public void StatusFilterCancel()
	{
		StatusFilterCancel.click();
	}
	
	@FindBy(how=How.ID,using="Confirmed")
	@CacheLookup
	WebElement StatusFilterConfirmed;
	
	public void StatusFilterConfirmed()
	{
	    
		 for(int i=0;i<=2;i++)
 		{
 		try
 		{
 			StatusFilterConfirmed.click();
 		}
 		catch(Exception e)
 		{
 			System.out.println("e.gettextmassage");
 		}
 		}
	}
	
	@FindBy(how=How.ID,using="Unconfirmed")
	@CacheLookup
	WebElement StatusFilterUnconfirmed;
	
	public void StatusFilterUnconfirmed()
	{
		
		  
		 for(int i=0;i<=2;i++)
	 		{
	 		try
	 		{
	 			StatusFilterUnconfirmed.click();
	 		}
	 		catch(Exception e)
	 		{
	 			System.out.println("e.gettextmassage");
	 		}
	 		}  
	
	    

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[1]/div[1]/input")
	@CacheLookup
	WebElement LastName;
	
	public void LastName(String ln)
	{
		LastName.sendKeys(ln);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[1]/div[2]/input")
	@CacheLookup
	WebElement FirstName;
	
	public void FirstName(String fn)
	{
		FirstName.sendKeys(fn);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement Initial;
	
	public void Initial(String i)
	{
		Initial.sendKeys(i);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[2]/div[1]/input")
	@CacheLookup
	WebElement PhoneNumber;
	
	public void PhoneNumber(String p)
	{
		PhoneNumber.sendKeys(p);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[2]/div[2]/input")
	@CacheLookup
	WebElement Email;
	
	public void Email(String e)
	{
		Email.sendKeys(e);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[3]/div[1]/date-picker/div/input")
	@CacheLookup
	WebElement DOB;
	
	public void DOB(String dob)
	{
		DOB.sendKeys(dob);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[3]/div[2]/input")
	@CacheLookup
	WebElement MRN;
	
	public void MRN(String mrn)
	{
		MRN.sendKeys(mrn);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[4]/div[1]/button")
	@CacheLookup
	WebElement Btn_Clear;
	
	public void Btn_Clear()
	{
		Btn_Clear.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[4]/div[2]/button")
	@CacheLookup
	WebElement Search1;
	
	public void Search1()
	{
		Search1.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[2]/div[2]/ul/li[2]/a")
	@CacheLookup
	WebElement ineligible;
	
	public void ineligible()
	{
		ineligible.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[2]/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement Eligible;
	
	public void Eligible()
	{
		Eligible.click();
	}
}
