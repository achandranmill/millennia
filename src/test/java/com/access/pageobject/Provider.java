package com.access.pageobject;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class Provider

{
	WebDriver ldriver;
	public Provider(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver,20), this);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[2]/span")
	@CacheLookup
	WebElement BackProvider;

	public void BackProvider()
	{
		BackProvider.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"userLocation\"]")
	@CacheLookup
	WebElement LocationPopup;

	@FindBy(how =How.XPATH,using="/html/body/div[1]/div/div/user-location-modal/div[3]/button")
	@CacheLookup
	WebElement OKbutton;

	public void LocationPopup(String l) throws Exception
	{

		LocationPopup.sendKeys(l);
		Thread.sleep(2000);

		OKbutton.click();

	}
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a/span[1]")
	@CacheLookup
	WebElement UserAdmin;

	public void UserAdmin()
	{
		UserAdmin.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Admin')]")
	@CacheLookup
	WebElement Admin;

	public void Admin()
	{
		Admin.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/navbar/header/div/div/div[2]/ul[1]/li[2]/a")
	@CacheLookup
	WebElement Provider;

	public void Provider()
	{
		Provider.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/providers/section/div[1]/div[1]/div/div/input")
	@CacheLookup
	WebElement FindProvider;

	public void FindProvider(String f)
	{
		FindProvider.click();
		FindProvider.sendKeys(f);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/providers/section/div[1]/div[1]/div/div/span/button")
	@CacheLookup
	WebElement Search;


	public void Search()
	{
		Search.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"providers\"]/main/div[1]/providers/section/div[1]/div[1]/div/input")
	@CacheLookup
	WebElement Unpublished;

	public void Unpublished()
	{
		if (!Unpublished.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click();", Unpublished);
			//3) Checking whether first attempt to check the check box worked
			if (!Unpublished.isSelected()) {
				//4) Retrying
				Unpublished.click();
			}
		}
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"providers\"]/main/div[1]/providers/section/div[1]/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement ADDProvider;

	public void ADDProvider()
	{
		ADDProvider.click();
	}

	@FindBy(how=How.NAME,using="firstName")
	@CacheLookup
	WebElement FirstName;

	public void FirstName(String n)
	{
		FirstName.sendKeys(n);

	}

	@FindBy(how=How.NAME,using="middleName")
	@CacheLookup
	WebElement MiddleName;

	public void MiddleName(String M)
	{
		MiddleName.sendKeys(M);
	}

	@FindBy(how=How.NAME,using="lastName")
	@CacheLookup
	WebElement LastName;

	public void LastName(String L)
	{
		LastName.sendKeys(L);
	}

	@FindBy(how=How.NAME,using="credentials")
	@CacheLookup
	WebElement Credentials;

	public void Credentials(String C)
	{
		Credentials.sendKeys(C);
	}

	@FindBy(how=How.NAME,using="emailAddress")
	@CacheLookup
	WebElement EmailAddress;

	public void EmailAddress(String E)
	{
		EmailAddress.sendKeys(E);
	}

	@FindBy(how=How.XPATH,using ="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[5]/div/span/input")
	@CacheLookup
	WebElement SendEmailMessage;

	public void SendEmailMessage()
	{
		if(!SendEmailMessage.isSelected()) {

			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click();",SendEmailMessage);
			if(!SendEmailMessage.isSelected()) {
				SendEmailMessage.click();
			}
		}
	}

	@FindBy(how=How.ID,using="phoneNumber")
	@CacheLookup
	WebElement PhoneNumber;

	public void PhoneNumber(String P)
	{
		PhoneNumber.sendKeys(P);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[6]/div/span/input")
	@CacheLookup
	WebElement SendTextMessage;

	public void SendTextMessage()
	{
		if(!SendTextMessage.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click();", SendTextMessage);

			if(!SendTextMessage.isSelected()) {
				SendTextMessage.click();
			}
		}
	}

	@FindBy(how=How.ID,using="genderDropdown")
	@CacheLookup
	WebElement Gender;

	public void Gender()
	{
		Gender.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[7]/div/ul/li[1]/a")
	@CacheLookup
	WebElement Male;

	public void Male()
	{
		Male.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[7]/div/ul/li[2]/a")
	@CacheLookup
	WebElement Female;

	public void Female()
	{
		Female.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[7]/div/ul/li[3]/a")
	@CacheLookup
	WebElement Unspecified;

	public void Unspecified()
	{
		Unspecified.click();
	}

	@FindBy(how=How.NAME,using="passwordInput")
	@CacheLookup
	WebElement Password;

	public void Password(String P)
	{
		Password.sendKeys(P);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[9]/button")
	@CacheLookup
	WebElement GeneratePassword;



	public void GeneratePassword()
	{

		GeneratePassword.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[11]/div")
	@CacheLookup
	WebElement NewPassword;

	public void NewPassword()
	{

		String act = NewPassword.getText();
		System.out.println("Error message is: "+ act);
	}

	@FindBy(how=How.NAME,using="passwordConfirm")
	@CacheLookup
	WebElement PasswordConfirm;

	public void PasswordConfirm(String CP)
	{
		PasswordConfirm.sendKeys(CP);
	}

	@FindBy(how=How.NAME,using="passwordOnNextLogin")
	@CacheLookup
	WebElement PasswordOnNextLogin;

	public void PasswordOnNextLogin()
	{
		if(!PasswordOnNextLogin.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click();", PasswordOnNextLogin);
			if(!PasswordOnNextLogin.isSelected()) {
				PasswordOnNextLogin.click();
			}
		}
	}

	@FindBy(how=How.NAME,using="file")
	@CacheLookup
	WebElement Choosefile;

	public void Choosefile(String image)
	{
		Choosefile.sendKeys(image);


	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div/div/button[1]")
	@CacheLookup
	WebElement Cancelbtn;

	public void Cancelbtn()
	{
		Cancelbtn.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div/div/button[2]")
	@CacheLookup
	WebElement Savebtn;

	public void Savebtn()
	{
		Savebtn.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"statusDropdown\"]")
	@CacheLookup
	WebElement ProviderSearch;

	public void ProviderSearch()
	{
		ProviderSearch.click();
	}

	@FindBy(how=How.XPATH,using=" /html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[1]/div/ul/li/a")
	@CacheLookup
	WebElement Published;

	public void Published()
	{
		Published.click();
	}

	@FindBy(how=How.ID,using="providerId")
	@CacheLookup
	WebElement ProviderId;

	public void ProviderId(String pid)
	{
		ProviderId.sendKeys(pid);
	}
	
	@FindBy(how=How.ID,using="providerNPI")
	@CacheLookup
	WebElement NationalProviderIdentifier_NPI;
	
	public void NationalProviderIdentifier_NPI(String b)
	{
		NationalProviderIdentifier_NPI.click();
		NationalProviderIdentifier_NPI.clear();
		NationalProviderIdentifier_NPI.sendKeys("b");
	}
	
	
	@FindBy(how=How.ID,using="providerTIN")
	@CacheLookup
	WebElement TaxpayerIdentificationNumber_TIN;
	
	public void TaxpayerIdentificationNumber_TIN(String d)
	{
		TaxpayerIdentificationNumber_TIN.click();
		TaxpayerIdentificationNumber_TIN.clear();
		TaxpayerIdentificationNumber_TIN.sendKeys("d");
	}
	
	@FindBy(how=How.ID,using="fhirProviderId")
	@CacheLookup
	WebElement FHIRProvider_ID;
	
	public void FHIRProvider_ID(String h)
	{
		FHIRProvider_ID.click();
		FHIRProvider_ID.clear();
		FHIRProvider_ID.sendKeys("h");
	}
	

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[6]/div/button")
	@CacheLookup
	WebElement Departments;

	public void Departments()
	{
		Departments.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[6]/div/ul/li[1]/a")
	@CacheLookup
	WebElement CheckAll;

	public void CheckAll()
	{
		CheckAll.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[6]/div/ul/li[2]/a")
	@CacheLookup
	WebElement UncheckAll;

	public void UncheckAll()
	{
		UncheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[3]/div/ul/li[4]/a")
	@CacheLookup
	WebElement Clinic1;

	public void Clinic1()
	{
		if(!Clinic1.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click();", Clinic1);
			if(!Clinic1.isSelected()) {
				Clinic1.click();

			}

		}
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[3]/div/ul/li[5]/a")
	@CacheLookup
	WebElement nextNode1;

	public void nextNode1()
	{
		if(!nextNode1.isSelected()) {
			JavascriptExecutor e =(JavascriptExecutor)ldriver;

			e.executeScript("argument[0].click();", nextNode1);
			if(!nextNode1.isSelected()) {
				nextNode1.click();
			}
		}
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[3]/div/ul/li[6]/a")
	@CacheLookup
	WebElement EmergencyDepartment;

	public void EmergencyDepartment()
	{
		if(!EmergencyDepartment.isSelected()) {
			JavascriptExecutor e =(JavascriptExecutor)ldriver;
			e.executeScript("argument[0].click();", EmergencyDepartment);

			if(!EmergencyDepartment.isSelected())
			{
				EmergencyDepartment.click();
			}
		}
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[3]/div/ul/li[7]/a")
	@CacheLookup
	WebElement Comment;

	public void Comment()
	{
		if(!Comment.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click();", Comment);
			if(!Comment.isSelected())
			{	
				Comment.click();
			}
		}

	}

	@FindBy(how=How.NAME,using="display-name")
	@CacheLookup
	WebElement DisplayName;

	public void DisplayName(String dn)
	{
		DisplayName.sendKeys(dn);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement Provider_Save;
	
	public void Provider_Save()
	{
		Provider_Save.click();
	}

	@FindBy(how=How.ID,using="scheduleTab")
	@CacheLookup
	WebElement Schedule;

	public void Schedule()
	{
		Schedule.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[3]/button")
	@CacheLookup
	WebElement AddSchedule;

	public void AddSchedule()
	{
		AddSchedule.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement NewScheduleTitle;

	public void NewScheduleTitle(String nst)
	{
		NewScheduleTitle.sendKeys(nst);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[2]/div[1]/div/input")
	@CacheLookup
	WebElement StartDate;

	public void StartDate(String D1)
	{
		StartDate.clear();
		StartDate.sendKeys(D1);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement EndDate;

	public void EndDate(String D2)
	{
		EndDate.clear();
		EndDate.sendKeys(D2);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[3]/div[1]/select")
    @CacheLookup
    WebElement  Schedule_Department;
	
	
	public void Schedule_Department()
	{
		Select d = new Select(Schedule_Department);
		d.selectByIndex(1);
	}
    
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[3]/div[2]/select")
    @CacheLookup
    WebElement Schedule_Location;
    
    public void Schedule_Location()
    {
    	Select g = new Select(Schedule_Location);
    	g.selectByIndex(1);
    }
    
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[3]/div[3]/select")
    @CacheLookup
    WebElement Schedule_Appointment_Type;
    
    
    public void Schedule_Appointment_Type1()
    {
    	Select a = new Select(Schedule_Appointment_Type);
    	a.selectByVisibleText( "Appointment 1");
    }
    
    public void Schedule_Appointment_Type_Followup()
    {
    	Select a2 = new Select(Schedule_Appointment_Type);
    	a2.selectByVisibleText("Followup");
    }
    
    public void Schedule_Appointment_Type()
    {
    	Select a3 = new Select(Schedule_Appointment_Type);
    	a3.selectByIndex(1);
    }
    
    @FindBy(how=How.XPATH,using="//div[@class='col-xs-12']//p[@class='add-span']//span[@class='glyphicon glyphicon-plus' ]")
	@CacheLookup
	WebElement Monday;

	public void Monday()
	{
		Monday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement MondayFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement MondayFrom2;

	public void MondayFrom(String t)
	{
		MondayFrom.click();
		MondayFrom.clear();
		MondayFrom.sendKeys(t);

	}

	public void MondayFrom2(String f)
	{
		MondayFrom2.click();
		MondayFrom2.clear();
		MondayFrom2.sendKeys(f);
	}


	@FindBy(how=How.XPATH,using="//td[@class='uib-time am-pm' or  ng-show='showMeridian']//button[@type='button'  or  class='btn btn-default text-center ng-binding']")
	@CacheLookup 
	WebElement MondayPMAM;

	public void MondayPMAM()
	{
		MondayPMAM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement MondayTo;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement MondayTo2;

	public void MondayTo(String ft)
	{
		MondayTo.click();
		MondayTo.clear();
		MondayTo.sendKeys(ft);
	}

	public void MondayTo2(String ft2)
	{
		MondayTo2.click();
		MondayTo2.clear();
		MondayTo2.sendKeys(ft2);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement Mondaypmam;

	public void Mondaypmam()
	{
		Mondaypmam.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement MondayCapacity;

	public void MondayCapacity(String c)
	{
		MondayCapacity.click();
		MondayCapacity.clear();
		MondayCapacity.sendKeys(c);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/div[2]/p")
	@CacheLookup
	WebElement Exception;

	public void Exception()
	{
		Exception.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[2]/div/div/input")
	@CacheLookup
	WebElement ExceptionDate;

	public void ExceptionDate(String ed)
	{
		ExceptionDate.click();
		ExceptionDate.clear();
		ExceptionDate.sendKeys(ed);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"accordiongroup-5055-713-panel\"]/div/div[5]/ul/li/div[2]/div/div/span/input")
	@CacheLookup
	WebElement AllDay;

	public void AllDay()
	{
		AllDay.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[3]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement ExceptionFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[3]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement ExeptionFrom00;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[3]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement ExceptionAMPM;

	public void ExceptionFrom(String f)
	{
		ExceptionFrom.click();
		ExceptionFrom.clear();
		ExceptionFrom.sendKeys(f);


	}

	public void ExeptionFrom00(String f)
	{
		ExeptionFrom00.click();
		ExeptionFrom00.clear();
		ExeptionFrom00.sendKeys(f);
		ExceptionAMPM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[4]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement ExceptionTo;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[4]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement ExceptionTo0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[4]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement ExceptionToAMPM;

	public void ExceptionTo(String t)
	{
		ExceptionTo.click();
		ExceptionTo.clear();
		ExceptionTo.sendKeys(t);
	}

	public void ExceptionTo0(String t)
	{
		ExceptionTo0.click();
		ExceptionTo0.clear();
		ExceptionTo0.sendKeys(t);
		ExceptionToAMPM.click();
	}



	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[7]/div/label/div/input")
	@CacheLookup
	WebElement ShowFullschedule;

	public void ShowFullschedule()
	{
		ShowFullschedule.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[7]/div/label/div/input")
	@CacheLookup
	WebElement ShowFullschedule2;

	public void ShowFullschedule2()
	{
		if(!ShowFullschedule2.isDisplayed()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click();", ShowFullschedule2);
			if(!ShowFullschedule2.isDisplayed()) {
				ShowFullschedule2.click();
			}
		}

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[8]/div[2]/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement Immediately;

	public void Immediately()

	{
		Immediately.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[8]/div[2]/div[1]/div/div[2]/div/div[1]/input")
	@CacheLookup
	WebElement DaysFromCurrentDate;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[8]/div[2]/div[1]/div/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement DaysFromCurrentDateTEXT;


	public void DaysFromCurrentDate(String d)
	{
		DaysFromCurrentDate.click();
		DaysFromCurrentDateTEXT.click();
		DaysFromCurrentDateTEXT.sendKeys(d);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"accordiongroup-200-4366-panel\"]/div/div[3]/div[4]/button")
	@CacheLookup
	WebElement RemoveSchedule;

	public void RemoveSchedule()
	{
		RemoveSchedule.click();
	}

	@FindBy(how=How.NAME,using="314")
	@CacheLookup
	WebElement ScheduleEnd;

	public void ScheduleEnd()
	{
		ScheduleEnd.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[2]/div[2]/div/div/p")
	@CacheLookup
	WebElement Tuesday;

	public void Tuesday()
	{
		Tuesday.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[2]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement TuesdayFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[2]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement TuesdayFrom2;

	public void TuesdayFrom(String tf)
	{
		TuesdayFrom.click();
		TuesdayFrom.clear();
		TuesdayFrom.sendKeys(tf);

	}

	public void TuesdayFrom2(String tf)
	{
		TuesdayFrom2.click();
		TuesdayFrom2.clear();
		TuesdayFrom2.sendKeys(tf);
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'AM')]")
	@CacheLookup
	WebElement TuesdayAM;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'PM')]")
	@CacheLookup
	WebElement TuesdayPM;

	public void AMPM()
	{

		if(!TuesdayAM.isSelected())
		{
			System.out.println("is AM selected");
		}
		else
		{
			System.out.println("is PM selected");
		}

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[2]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement TuesdayTO;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[2]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement TuesdayTO2;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[2]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement TuesdayTOPMAM;

	public void TuesdayTO(String t)
	{
		TuesdayTO.click();
		TuesdayTO.clear();
		TuesdayTO.sendKeys(t);

	}

	public void TuesdayTO2(String t)
	{
		TuesdayTO2.click();
		TuesdayTO2.clear();
		TuesdayTO2.sendKeys(t);
	}

	public void TuesdayTOPMAM()
	{
		TuesdayTOPMAM.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[2]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement TuesdayCapacity;

	public void TuesdayCapacity(String tc)
	{
		TuesdayCapacity.sendKeys(tc);
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div/div/p")
	@CacheLookup
	WebElement WednesdayAddspan;

	public void WednesdayAddspan()
	{
		WednesdayAddspan.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement WednesdayFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement Wednesdayf00;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement WednesdayFromPMAM;

	public void WednesdayFrom(String wf)
	{
		WednesdayFrom.click();
		WednesdayFrom.clear();
		WednesdayFrom.sendKeys(wf);
	}

	public void Wednesdayf00(String wf)
	{
		Wednesdayf00.click();
		Wednesdayf00.clear();
		Wednesdayf00.sendKeys(wf);
		WednesdayFromPMAM.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement WednesdayTo;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement WednesdayTo0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement WednesdayPMAM;

	public void WednesdayTo(String wt)
	{
		WednesdayTo.click();
		WednesdayTo.clear();
		WednesdayTo.sendKeys(wt);
	}

	public void WednesdayTo0(String wt)
	{
		WednesdayTo0.click();
		WednesdayTo0.clear();
		WednesdayTo0.sendKeys(wt);
		WednesdayPMAM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[3]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement WednesdayCapacity;

	public void WednesdayCapacity(String wc)
	{
		WednesdayCapacity.sendKeys(wc);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div/div/p")
	@CacheLookup
	WebElement ThursdayADDspan;

	public void ThursdayADDspan()
	{
		ThursdayADDspan.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement ThursdayFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement ThursdayFrom0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement ThursdayAMPM;


	public void ThursdayFrom(String tf)
	{
		ThursdayFrom.click();
		ThursdayFrom.clear();
		ThursdayFrom.sendKeys(tf);
	}

	public void ThursdayFrom0(String tt)
	{
		ThursdayFrom0.click();
		ThursdayFrom0.clear();
		ThursdayFrom0.sendKeys(tt);
		ThursdayAMPM.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement ThursdayTo;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement ThursdayTo0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement ThursdayPMAM;


	public void ThursdayTo(String tt)
	{
		ThursdayTo.click();
		ThursdayTo.clear();
		ThursdayTo.sendKeys(tt);

	}

	public void ThursdayTo0(String tt)
	{
		ThursdayTo0.click();
		ThursdayTo0.clear();
		ThursdayTo0.sendKeys(tt);
		ThursdayPMAM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[4]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement ThursdayCapacity;

	public void ThursdayCapacity(String tc)
	{
		ThursdayCapacity.click();
		ThursdayCapacity.sendKeys(tc);
	}



	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div/div/p")
	@CacheLookup
	WebElement FridayAddspan;

	public void FridayAddspan()
	{
		FridayAddspan.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement FridayFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement FridayFrom0;


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement FridayFromPMAM;

	public void FridayFrom(String ff)
	{
		FridayFrom.click();
		FridayFrom.clear();
		FridayFrom.sendKeys(ff);
	}

	public void FridayFrom0(String ff)
	{
		FridayFrom0.click();
		FridayFrom0.clear();
		FridayFrom0.sendKeys(ff);
		FridayFromPMAM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement FridayTo;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement FridayTo0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement FridayPMAM;


	public void FridayTo(String ft)
	{
		FridayTo.click();
		FridayTo.clear();
		FridayTo.sendKeys(ft);
	}

	public void FridayTo0(String ft)
	{
		FridayTo0.click();
		FridayTo0.clear();
		FridayTo0.sendKeys(ft);
		FridayPMAM.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[5]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement FridayCapacity;

	public void FridayCapacity(String fc)
	{
		FridayCapacity.sendKeys(fc);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div/div/p")
	@CacheLookup
	WebElement SaturdayAddspan;

	public void SaturdayAddspan()
	{
		SaturdayAddspan.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement SaturdayFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement SaturdayFrom0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement SaturdayFromPMAM;


	public void SaturdayFrom(String sf)
	{
		SaturdayFrom.click();
		SaturdayFrom.clear();
		SaturdayFrom.sendKeys(sf);
	}

	public void SaturdayFrom0(String sf)
	{
		SaturdayFrom0.click();
		SaturdayFrom0.clear();
		SaturdayFrom0.sendKeys(sf);
		SaturdayFromPMAM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement  SaturdayTo;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement SaturdayTo0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement SaturdayToPMAM;

	public void SaturdayTo(String st)
	{
		SaturdayTo.click();
		SaturdayTo.clear();
		SaturdayTo.sendKeys(st);
	}

	public void SaturdayTo0(String st)
	{
		SaturdayTo0.click();
		SaturdayTo0.clear();
		SaturdayTo0.sendKeys(st);
		SaturdayToPMAM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[6]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement SaturdayCapacity;

	public void SaturdayCapacity(String sc)
	{
		SaturdayCapacity.click();
		SaturdayCapacity.sendKeys(sc);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div/div/p")
	@CacheLookup
	WebElement SundayAddspan;

	public void SundayAddspan()
	{
		SundayAddspan.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement SundayFrom;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement SundayFrom0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement SundayFromAMPM;

	public void SundayFrom(String sf)
	{
		SundayFrom.click();
		SundayFrom.clear();
		SundayFrom.sendKeys(sf);

	}

	public void SundayFrom0(String sf)
	{
		SundayFrom0.click();
		SundayFrom0.clear();
		SundayFrom0.sendKeys(sf);
		SundayFromAMPM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement SundayTo;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement SundayTo0;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement SundayToPMAM;

	public void SundayTo(String st)
	{
		SundayTo.click();
		SundayTo.clear();
		SundayTo.sendKeys(st);
		SundayToPMAM.click();
	}

	public void SundayTo0(String st)
	{
		SundayTo0.click();
		SundayTo0.clear();
		SundayTo0.sendKeys(st);
		SundayToPMAM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[7]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement SundayCapacity;

	public void SundayCapacity(String sc)
	{
		SundayCapacity.click();
		SundayCapacity.sendKeys(sc);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"addProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[2]/button")
	@CacheLookup
	WebElement AddSchedule2;

	public void AddSchedule2()
	{
		AddSchedule2.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div[2]/div/button[2]")
	@CacheLookup
	WebElement Schedule_save;
	
	public void Schedule_save()
	{
		Schedule_save.click();
	}
	
	

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/providers/section/div[2]/div[2]/table/tbody/tr[1]/td[5]/div/button")
	@CacheLookup
	WebElement EditProvider;

	public void EditProvider()
	{
		EditProvider.click();
	}

	@FindBy(how=How.ID,using="firstName")
	@CacheLookup
	WebElement EditfirstName;

	public void EditfirstName(String ef)
	{
		EditfirstName.clear();
		EditfirstName.sendKeys(ef);
	}

	@FindBy(how=How.ID,using="middleName")
	@CacheLookup
	WebElement EditmiddleName;

	public void EditmiddleName(String em)
	{
		EditmiddleName.clear();
		EditmiddleName.sendKeys(em);
	}

	@FindBy(how=How.ID,using="lastName")
	@CacheLookup
	WebElement EditlastName;

	public void EditlastName(String el)
	{

		EditlastName.clear();
		EditlastName.sendKeys(el);
	}


	@FindBy(how=How.ID,using="credentials")
	@CacheLookup
	WebElement Editcredentials;

	public void Editcredentials(String ec)
	{
		Editcredentials.clear();
		Editcredentials.sendKeys(ec);
	}

	@FindBy(how=How.ID,using="emailAddress")
	@CacheLookup
	WebElement EditemailAddress;

	public void EditemailAddress(String ee)
	{
		EditemailAddress.clear();
		EditemailAddress.sendKeys(ee);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[5]/div/span/input")
	@CacheLookup
	WebElement EditSendMessage;

	public void EditSendMessage()
	{
		EditSendMessage.click();
	}

	@FindBy(how=How.ID,using="phoneNumber")
	@CacheLookup
	WebElement EditphoneNumber;

	public void EditphoneNumber(String ep)
	{
		EditphoneNumber.sendKeys(ep);
	}

	@FindBy(how=How.ID,using="genderDropdown")
	@CacheLookup
	WebElement EditgenderDropdown;

	public void EditgenderDropdown()
	{
		EditgenderDropdown.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[7]/div/ul/li[1]/a")
	@CacheLookup
	WebElement EditMale;

	public void EditMale()
	{
		EditMale.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[7]/div/ul/li[2]/a/span")
	@CacheLookup
	WebElement  EditFemale;

	public void EditFemale()
	{
		EditFemale.click();
	}

	@FindBy(how=How.NAME,using="file")
	@CacheLookup
	WebElement EditFile;

	public void EditFile(String ef)
	{
		EditFile.sendKeys(ef);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/div[1]/div/div/ui-cropper-modal/div[3]/button[2]")
	@CacheLookup
	WebElement EditFileCrop;

	public void EditFileCrop()
	{
		EditFileCrop.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[8]/image-upload-cropper/div/div[2]/div[2]/button")
	@CacheLookup
	WebElement EditFileDelete;

	public void EditFileDelete()
	{
		EditFileDelete.click();
	}


	@FindBy(how=How.ID,using="statusDropdown")
	@CacheLookup
	WebElement EditPublished;


	public void EditPublished()
	{
		EditPublished.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[1]/div/ul/li/a")
	@CacheLookup
	WebElement EditUnpublished;

	public void EditUnpublished()
	{
		EditUnpublished.click();
	}

	@FindBy(how=How.NAME,using="providerId")
	@CacheLookup
	WebElement EditproviderId;

	public void EditproviderId(String ep)
	{
		EditproviderId.clear();
		EditproviderId.sendKeys(ep);
	}

	@FindBy(how=How.ID,using="providerNPI")
	@CacheLookup
	WebElement EditproviderNPI;

	public void EditproviderNPI(String enpi)
	{
		EditproviderNPI.clear();
		EditproviderNPI.sendKeys(enpi);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[6]/div/button")
	@CacheLookup
	WebElement EditDepartment;

	public void EditDepartment()
	{
		EditDepartment.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[6]/div/ul/li[1]/a")
	@CacheLookup
	WebElement EditCheckAll;

	public void EditCheckAll()
	{
		EditCheckAll.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/div[6]/div/ul/li[2]/a")
	@CacheLookup
	WebElement EditUncheckAll;

	public void EditUncheckAll()
	{
		EditUncheckAll.click();
	}

	@FindBy(how=How.NAME,using="display-name")
	@CacheLookup
	WebElement EditDisplayName;

	public void EditDisplayName(String edn)
	{
		EditDisplayName.clear();
		EditDisplayName.sendKeys(edn);
	}

	@FindBy(how=How.NAME,using="passwordOnNextLogin")
	@CacheLookup
	WebElement EditpasswordOnNextLogin;

	public void EditpasswordOnNextLogin()
	{
		EditpasswordOnNextLogin.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[2]/div/button")
	@CacheLookup
	WebElement EditChangePassword;

	public void EditChangePassword()
	{
		EditChangePassword.click();
	}

	@FindBy(how=How.NAME,using="passwordInput")
	@CacheLookup
	WebElement EditpasswordInput;

	public void EditpasswordInput(String Ep)
	{
		EditpasswordInput.clear();
		EditpasswordInput.sendKeys(Ep);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/div[1]/div/div/password-change-modal/div[2]/div/form/div[2]/button")
	@CacheLookup
	WebElement EditGeneratePassword;

	public void EditGeneratePassword()
	{
		EditGeneratePassword.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/div[1]/div/div/password-change-modal/div[2]/div/form/div[3]/input")
	@CacheLookup
	WebElement EditConfirmPassword;

	public void EditConfirmPassword(String Ecp)
	{
		EditConfirmPassword.clear();
		EditConfirmPassword.sendKeys(Ecp);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/div[1]/div/div/password-change-modal/div[3]/button[2]")
	@CacheLookup
	WebElement EditDone;

	public void EditDone()
	{
		EditDone.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"editProvider\"]/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div/div/button[2]")
	@CacheLookup
	WebElement EditSave;

	public void EditSave()
	{
		EditSave.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/ul/li[2]/a")
	@CacheLookup
	WebElement EditSchedule;

	public void EditSchedule()
	{
		EditSchedule.click();
	}

	@FindBy(how=How.XPATH,using="//input[@placeholder=\"New Schedule\"]")
	@CacheLookup
	WebElement EditScheduleTitle;

	public void EditScheduleTitle(String st)
	{
		EditScheduleTitle.click();
		EditScheduleTitle.clear();
		EditScheduleTitle.sendKeys(st);
	}

	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[3]/button")
	@CacheLookup
	WebElement EditADDSchedule;
	
	public void EditADDSchedule()
	{
		EditADDSchedule.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[2]/div[1]/div/input")
	@CacheLookup
	WebElement EditStartDate;

	public void EditStartDate(String ed)
	{
		EditStartDate.click();
		EditStartDate.clear();
		EditStartDate.sendKeys(ed);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement EditEndDate;

	public void EditEndDate(String eed)
	{
		EditEndDate.click();
		EditEndDate.clear();
		EditEndDate.sendKeys(eed);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[3]/div[1]/select")
	@CacheLookup
	WebElement EditDepartmentnull;

	public void EditDepartmentnull()
	{
		Select drop = new Select(EditDepartmentnull);
		drop.selectByIndex(1);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[3]/div[2]/select")
	@CacheLookup
	WebElement EditLocation;

	public void EditLocation()
	{
		Select location = new Select(EditLocation);
		location.selectByIndex(1);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[3]/div[3]/div/button")
	@CacheLookup
	WebElement    EditAppointmentType;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[3]/div[3]/div/ul/li[1]/a")
	@CacheLookup
	WebElement EditAppointment_Add_All;
	
	
	public void EditAppointmentType() throws Exception
	{
		EditAppointmentType.click();
		Thread.sleep(1000);
		EditAppointment_Add_All.click();
		
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div/div")
	@CacheLookup
	WebElement EditMonaday;

	public void EditMonaday()
	{
		EditMonaday.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement EditMondayFrom;

	public void EditMondayFrom(String ef)
	{
		EditMondayFrom.click();
		EditMondayFrom.clear();
		EditMondayFrom.sendKeys(ef);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement EditMondayFrom0;

	public void EditMondayFrom0(String ef)
	{
		EditMondayFrom0.click();
		EditMondayFrom0.clear();
		EditMondayFrom0.sendKeys(ef);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement EditMondayFromAMPM;

	public void EditMondayFromAMPM()
	{
		EditMondayFromAMPM.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	@CacheLookup
	WebElement EditMondayTo;

	public void EditMondayTo(String et)
	{
		EditMondayTo.click();
		EditMondayTo.clear();
		EditMondayTo.sendKeys(et);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	@CacheLookup
	WebElement EditMondayTo0;

	public void EditMondayTo0(String et)
	{
		EditMondayTo0.click();
		EditMondayTo0.clear();
		EditMondayTo0.sendKeys(et);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/button")
	@CacheLookup
	WebElement EditMondayToAMPM;

	public void EditMondayToAMPM()
	{
		EditMondayToAMPM.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[4]/ul/li[1]/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement EditMondayCapacity;

	public void EditMondayCapacity(String ec)
	{
		EditMondayCapacity.click();
		EditMondayCapacity.clear();
		EditMondayCapacity.sendKeys(ec);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/div[2]/p")
	@CacheLookup
	WebElement EditException;

	public void EditException()
	{
		EditException.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[5]/ul/li/div[2]/div/div/span/input")
	@CacheLookup
	WebElement EditExceptionAllday;

	public void EditExceptionAllday()
	{
		EditExceptionAllday.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[2]/provider-schedule/section/form/div[1]/uib-accordion/div/div/div[2]/div/div[7]/div/label/div/input")
	@CacheLookup
	WebElement  EditShowFullschedule;

	public void EditShowFullschedule()
	{
		EditShowFullschedule.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div/div/button[2]")
	@CacheLookup
	WebElement EditSave2;

	public void EditSave2() {
		EditSave2.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[1]/provider-details/section/form/div[1]/div/div[11]/image-upload-cropper/div/div[2]/div[2]")
	@CacheLookup
	WebElement Provider_Choosefile;

	public void Provider_Choosefile() throws AWTException
	{

		Provider_Choosefile.click();
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Desktop\\sher.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//press enter key

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);


	}



	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/ui-cropper-modal/div[3]/button[2]")
	@CacheLookup
	WebElement Provider_cropimage;
	public void Provider_cropimage()
	{

		Provider_cropimage.click();
	}


 @FindBy(how=How.XPATH,using="//a[contains(text(),'Matching Algorithm')]")
 @CacheLookup
WebElement Provider_MatchingAlgo;
 
 public void Provider_MatchingAlgo()
 {
	 Provider_MatchingAlgo.click();
 }
 
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[4]/eligibility-radio/table/tbody/tr/td[3]/div/label/input")
 @CacheLookup
 WebElement Provider_MatchingFirstname;
 
 public void Provider_MatchingFirstname()
 
 {
	 Provider_MatchingFirstname.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[4]/eligibility-radio/table/tbody/tr/td[2]/div/label/input")
 @CacheLookup
 WebElement Provider_MatchingFirstIN;
 
 public void Provider_MatchingFirstIN()
 {
	 Provider_MatchingFirstIN.click();
 }
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[5]/eligibility-radio/table/tbody/tr/td[3]/div/label/input")
 @CacheLookup
 WebElement Provider_MatchingLastout;
 
 public void Provider_MatchingLastout()
 {
	 Provider_MatchingLastout.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[5]/eligibility-radio/table/tbody/tr/td[3]/div/label/input")
 @CacheLookup
 WebElement Provider_MatchingLastin;
 
 public void Provider_MatchingLastin()
 {
	 Provider_MatchingLastin.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[6]/eligibility-radio/table/tbody/tr/td[2]/div/label/input")
 @CacheLookup
 WebElement Provider_MatchingNewFieldin;
 
 
  public void Provider_MatchingNewFieldin()
 
  {
	  Provider_MatchingNewFieldin.click();
  }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[6]/eligibility-radio/table/tbody/tr/td[3]/div/label/input")
 @CacheLookup
 WebElement Provider_MatchingNewFieldout;
 
 public void Provider_MatchingNewFieldout()
 {
	 Provider_MatchingNewFieldout.click();
 }
 
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div/div/button[2]")
 @CacheLookup
 WebElement Provider_MatchingSave;
 
 public void Provider_MatchingSave()
 {
	 Provider_MatchingSave.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div/div/button[1]")
 @CacheLookup
 WebElement Provider_MatchingCancel;
 
 public void Provider_MatchingCancel()
 {
	 Provider_MatchingCancel.click();
 }
 
 
 @FindBy(how=How.XPATH,using="//a[contains(text(),'Matching Algorithm')]")
 @CacheLookup
 WebElement Edit_MatchingAlgorithm;
 
 public void Edit_MatchingAlgorithm()
 {
	 Edit_MatchingAlgorithm.click();
 }
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[2]/eligibility-radio/table/tbody/tr/td[3]/div/label/input")
 @CacheLookup
 WebElement Edit_Matching_Firstname_out;
 
 
 public void Edit_Matching_Firstname_out()
 {
	 Edit_Matching_Firstname_out.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[2]/eligibility-radio/table/tbody/tr/td[2]/div/label/input")
 @CacheLookup
 WebElement Edit_Matching_Firstname_in;
 
 public void Edit_Matching_Firstname_in()
 {
	 Edit_Matching_Firstname_in.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[3]/eligibility-radio/table/tbody/tr/td[3]/div/label/input")
 @CacheLookup
 WebElement Edit_Matching_Lastname_out;
 
 public void Edit_Matching_Lastname_out()
 {
	 Edit_Matching_Lastname_out.click();
 }
 

 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[3]/eligibility-radio/table/tbody/tr/td[2]/div/label/input")
 @CacheLookup
 WebElement Edit_Matching_Lastname_in;
 
 public void Edit_Matching_Lastname_in()
 {
	 Edit_Matching_Lastname_in.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[5]/eligibility-radio/table/tbody/tr/td[3]/div/label/input")
 @CacheLookup
 WebElement Edit_Matching_Newfield_out;
 
 public void Edit_Matching_Newfield_out()
 {
	 Edit_Matching_Newfield_out.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[3]/questionnaire-eligibility/section/form/div[5]/eligibility-radio/table/tbody/tr/td[2]/div/label/input")
 @CacheLookup
 WebElement Edit_Matching_Newfield_in;
 
 public void Edit_Matching_Newfield_in()
 {
	 Edit_Matching_Newfield_in.click();
 }
 
 @FindBy(how=How.XPATH,using="//button[contains(text(),'Save')]")
 @CacheLookup
 WebElement Edit_Matching_save;
 
 public void Edit_Matching_save()
 {
	 Edit_Matching_save.click();
 }
 
 
 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/add-edit-provider/section/div/div/div[3]/div/div[4]/div/div/button[1]")
 @CacheLookup
 WebElement Edit_Matching_cancel;
 
 public void Edit_Matching_cancel()
 {
	 Edit_Matching_cancel.click();
 }
 
 
 
}













