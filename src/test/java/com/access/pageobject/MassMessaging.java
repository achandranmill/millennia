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

	@FindBy(how=How.XPATH,using="//div[@class=\"modal-content\"]")
	@CacheLookup
	WebElement Message_History_print;

	public void Message_History_print()
	{
		String act = Message_History_print.getText();
		System.out.println(act);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/div/button[2]")
	@CacheLookup
	WebElement MessageHistory_Displays;

	public void MessageHistory_Displays()
	{
		MessageHistory_Displays.isDisplayed();
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

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Apply')]")
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
		SelectAll.click();

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
		SeeingSelectAll.click();
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
		StatusFilterSelect.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/status-filter/div[3]/button[2]")
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

		StatusFilterConfirmed.click();
	}

	@FindBy(how=How.ID,using="Unconfirmed")
	@CacheLookup
	WebElement StatusFilterUnconfirmed;

	public void StatusFilterUnconfirmed()
	{
		StatusFilterUnconfirmed.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[1]/div[1]/input")
	@CacheLookup
	WebElement LastName;

	public void LastName(String ln)
	{
		LastName.click();
		LastName.clear();
		LastName.sendKeys(ln);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[1]/div[2]/input")
	@CacheLookup
	WebElement FirstName;

	public void FirstName(String fn)
	{
		FirstName.click();
		FirstName.clear();
		FirstName.sendKeys(fn);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[1]/form/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement Initial;

	public void Initial(String i)
	{
		Initial.click();
		Initial.clear();
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

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Ineligible for message')]")
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

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[2]/div[2]/div/div[1]/table/thead/tr/th[1]/label/input")
	@CacheLookup
	WebElement Eligible_SelectAll;

	public void Eligible_SelectAll()
	{

		Eligible_SelectAll.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/input")
	@CacheLookup
	WebElement patient1_select;

	public void patient1_select()
	{
		patient1_select.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[2]/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/div/input")
	@CacheLookup
	WebElement patient2_select;

	public void patient2_select()
	{
		patient2_select.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[2]/div[2]/div/div[1]/table/tbody/tr[3]/td[1]/div/input")
	@CacheLookup
	WebElement patient3_select;

	public void patient3_select()
	{
		patient3_select.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[2]/div[2]/div/div[1]/table/tbody/tr[4]/td[1]/div/input")
	@CacheLookup
	WebElement patient4_select;

	public void patient4_select()
	{
		patient4_select.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[2]/div[2]/div/div[1]/table/tbody/tr[5]/td[1]/div/input")
	@CacheLookup
	WebElement patient5_select;

	public void patient5_select()
	{
		patient5_select.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/mass-messaging/div/div/div[1]/div[2]/div[3]/div[2]/button")
	@CacheLookup
	WebElement Send_Message_to_patient;

	public void Send_Message_to_patient()
	{
		Send_Message_to_patient.isDisplayed();
	}

	//-------------------------------------30-12-2022----------------------------------------------------------------------

	@FindBy(how=How.XPATH,using="//button[@id='messages']")
	@CacheLookup
	WebElement Select_Message;

	public void Select_Message()
	{

		Select_Message.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[2]/div[1]/div/div/ul/li")
	@CacheLookup
	WebElement Select_Message_option1;

	public void Select_Message_option1()
	{
		Select_Message_option1.click();
	}

	@FindBy(how=How.ID,using="cancel")
	@CacheLookup
	WebElement Select_Message_Cancel_Appt;

	public void Select_Message_Cancel_Appt()
	{
		Select_Message_Cancel_Appt.click();
	}

	@FindBy(how=How.XPATH,using="//button[@ng-click=\"$ctrl.sendMessage()\"]")
	@CacheLookup
	WebElement Send_Message_Patient;

	public void Send_Message_Patient()
	{
		Send_Message_Patient.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id='nocontact']/table")
	@CacheLookup
	WebElement Ineligible_print;

	public void Ineligible_print()
	{
		String act = Ineligible_print.getText();
		System.out.println(act);
	}

	@FindBy(how=How.XPATH,using="//*[@id='directory']/table")
	@CacheLookup
	WebElement Eligible_print;

	public void Eligible_print()
	{
		String act = Eligible_print.getText();
		System.out.println(act);
	}

	@FindBy(how=How.ID,using="mass-message")
	@CacheLookup
	WebElement Message_to_Send;

	public void Message_to_Send(String s)
	{
		Message_to_Send.click();
		Message_to_Send.clear();
		Message_to_Send.sendKeys(s);
	}
//-----------------------------------06-01-2023-------------------------------------------------------------------------
 
	@FindBy(how=How.XPATH,using="//section[@class=\"messaging-modal\"]")
	@CacheLookup
	WebElement Send_Message_Modal_Print;
	
	public void Send_Message_Modal_Print()
	{
		String act = Send_Message_Modal_Print.getText();
		System.out.println(act);
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Custom Message')]")
	@CacheLookup
	WebElement Free_Text;
	
	public void Free_Text()
	{
		Free_Text.click();
	}
	
	@FindBy(how=How.ID,using="mass-message")
	@CacheLookup
	WebElement Edit_Freetext_Message;
	
	public void Edit_Freetext_Message(String s)
	{
		Edit_Freetext_Message.click();
		Edit_Freetext_Message.sendKeys(s);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[1]")
	@CacheLookup
	WebElement Variable_FirstName;
	
	public void Variable_FirstName()
	{
		Variable_FirstName.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[2]")
	@CacheLookup
	WebElement Variable_LastName;
	
	public void Variable_LastName()
	{
		Variable_LastName.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[3]")
	@CacheLookup
	WebElement Variable_Appointment_Date;
	
	public void Variable_Appointment_Date()
	{
		Variable_Appointment_Date.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[4]")
	@CacheLookup
	WebElement Variable_Appointment_Time;
	
	public void Variable_Appointment_Time()
	{
		Variable_Appointment_Time.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[5]")
	@CacheLookup
	WebElement Variable_Appointment_Location;
	
	public void Variable_Appointment_Location()
	{
		Variable_Appointment_Location.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[6]")
	@CacheLookup
	WebElement Variable_Appointment_Comment;
	
	public void Variable_Appointment_Comment()
	{
		Variable_Appointment_Comment.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[7]")
	@CacheLookup
	WebElement Variable_Appointment_Type;
	
	public void Variable_Appointment_Type()
	{
		Variable_Appointment_Type.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[8]")
	@CacheLookup
	WebElement Variable_Appointment_Reason;
	
	public void Variable_Appointment_Reason()
	{
		Variable_Appointment_Reason.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[9]")
	@CacheLookup
	WebElement Variable_User_Location;
	
	public void Variable_User_Location()
	{
		Variable_User_Location.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[10]")
	@CacheLookup
	WebElement Variable_Visit_Code;
	
	public void Variable_Visit_Code()
	{
		Variable_Visit_Code.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[11]")
	@CacheLookup
	WebElement Variable_Orgnization_Name;
	
	public void Variable_Orgnization_Name()
	{
		Variable_Orgnization_Name.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[12]")
	@CacheLookup
	WebElement Variable_Department_Name;
	
	public void Variable_Department_Name()
	{
		Variable_Department_Name.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"variables\"]/a[15]")
	@CacheLookup
	WebElement Variable_Facility_Id;
	
	public void Variable_Facility_Id()
	{
		Variable_Facility_Id.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"massMessaging\"]/main/div[1]/mass-messaging/div/div/div[1]/div[2]")
	@CacheLookup
	WebElement Select_Message_Dropdown_print;
	
	public void Select_Message_Dropdown_print()
	{
		String act = Select_Message_Dropdown_print.getText();
		System.out.println(act);
	}
}
