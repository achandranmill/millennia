package com.access.pageobject;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Appointments
{
    WebDriver ldriver;
	public Appointments(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[5]/a")
	@CacheLookup
	WebElement linkAppointment;

	@FindBy (how=How.NAME,using="search")
	@CacheLookup
	WebElement SearchLastName;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[1]/div[1]/div/div[1]/span/button[1]")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(how=How.CSS,using="#appointments > div.row.header-buttons > div:nth-child(1) > div > div:nth-child(1) > span > button:nth-child(2)")
	@CacheLookup
	WebElement AdvanceSearch;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/advanced-search/div[2]/form/div/div[1]/div[1]/input")
	@CacheLookup
	WebElement Advance_Lastname;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/advanced-search/div[2]/form/div/div[1]/div[2]/input")
	@CacheLookup
	WebElement Advance_Firstname;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/advanced-search/div[2]/form/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement Advance_Initial;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/advanced-search/div[2]/form/div/div[2]/div[1]/input")
	@CacheLookup
	WebElement Advance_Phone;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/advanced-search/div[2]/form/div/div[2]/div[2]/input")
	@CacheLookup
	WebElement Advance_Email;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/advanced-search/div[2]/form/div/div[3]/div[1]/date-picker/div/input")
	@CacheLookup
	WebElement Advance_DOB;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder=\"MRN\"]")
	@CacheLookup
	WebElement Advance_Mrn;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/advanced-search/div[3]/button[2]")
	@CacheLookup
	WebElement Searchbtn;
	
	@FindBy(how=How.XPATH,using="//button[@class=\"btn btn-default dropdown-toggle\" and @data-toggle=\"dropdown\"]")
	@CacheLookup
	WebElement Configurelist;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[1]/div[1]/div/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement  EditDepartFillter;
	
	@FindBy(how=How.CSS,using="#appointments > div.modal.ng-scope.ng-isolate-scope.in > div > div > department-filter > div.modal-body > div > div:nth-child(1) > label > input")
	@CacheLookup
	WebElement DepartFillterSelect;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/department-filter/div[3]/button[2]")
	@CacheLookup
	WebElement Departmentsavechange;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[1]/div[1]/div/div[2]/ul/li[2]/a")
	@CacheLookup
	WebElement EditSeeingFillter;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/seeing-filter/div[2]/div[1]/label/input")
	@CacheLookup
	WebElement RemoveProvider;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/seeing-filter/div[3]/button")
	@CacheLookup
	WebElement CloseBtnSeeing;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit List Columns')]")
	@CacheLookup
	WebElement EditListColumns;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement DobColumsAppoint;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[3]/button[3]")
	@CacheLookup
	WebElement ColumnsSaveChange;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[1]/td[1]/i")
	@CacheLookup 
	WebElement ApptDragDrop;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[8]/td[1]/i")
	@CacheLookup
	WebElement DobDragDrop;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[5]/td[1]/i")
	@CacheLookup
	WebElement NameDragDrop;
	
	@FindBy(how=How.XPATH,using="//button[starts-with(@type,'text')]")
	@CacheLookup
	WebElement AppointDATE;
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@name,\"daterangepicker_start\")]")
	@CacheLookup
	WebElement AppointDATE1;
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@name,\"daterangepicker_end\")]")
	@CacheLookup
	WebElement AppointDATE2;
	
	@FindBy(how=How.XPATH,using="//button[starts-with(@class,\"applyBtn btn btn-sm btn-success\")]")
	@CacheLookup
	WebElement AppointDATEAPPLY;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"single-button\"]")
	@CacheLookup
	WebElement ThreeDot;
	
	@FindBy(how=How.LINK_TEXT,using="Edit Appointment")
	@CacheLookup
	WebElement EditAppointment;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[1]/div[5]/div/input")
	@CacheLookup
	WebElement EditDob;
	
	//@FindBy(how=How.XPATH,using="")
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[1]/div[8]/input")
	@CacheLookup
	WebElement EditEmail;
	
	@FindBy(how=How.XPATH,using=" /html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[1]/div[9]/jfh-patient-flags/div/div/div[2]/span")
	@CacheLookup
	WebElement EditFlag;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"patientFlags\"]/div/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement EditFlag1;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/button[3]")
	@CacheLookup
	WebElement EditSave;
	
	@FindBy(how=How.LINK_TEXT,using="Forms on Demand")
	@CacheLookup
	WebElement FormsandDemand;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[2]/div/button")
	@CacheLookup
	WebElement Appointment;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[2]/div/ul/li[5]/a")
	@CacheLookup
	WebElement Appoint2;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[3]/div[1]/label/input")
	@CacheLookup
	WebElement SMSDEMANDS;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[3]/div[2]/label/input")
	@CacheLookup
	WebElement EmailDEMANDS;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[3]/button[2]")
	@CacheLookup
	WebElement SENDDEMANDS;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[23]/td[2]/input")
	@CacheLookup
	WebElement FormsComplete;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div[1]/div/div[2]/ul/li[3]/a")
	@CacheLookup
	WebElement EditStatusFilter;
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@id,\"Confirmed\")]")
	@CacheLookup
	WebElement StatusConfirmed;
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@id,\"Unconfirmed\")]")
	@CacheLookup
	WebElement StatusUnconfirmed;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/status-filter/div[3]/button[2]")
	@CacheLookup
	WebElement StatusSave;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Set to Unconfirmed')]")
	@CacheLookup
	WebElement ThreDotSetUnconfirmed;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Set to Confirmed')]")
	@CacheLookup
	WebElement ThreDotSetConfirmed;
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@id,\"Connect Check-In\")]")
	@CacheLookup
	WebElement StatusConect;
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@id,\"Cancelled\")]")
	@CacheLookup
	WebElement StatusCancelled;
	
	@FindBy(how=How.LINK_TEXT,using="Cancel Appointment")
	@CacheLookup
	WebElement ThreeDotCancel;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/confirm-modal/div[3]/div/button[1]")
	@CacheLookup
	WebElement ThreeDotok;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[1]/div/div/div[3]/button")
	@CacheLookup
	WebElement TreeDotEditCancel;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/confirm-modal/div[3]/div/button[1]")
	@CacheLookup
	WebElement ThreeDotEditYes;
	
	@FindBy(how=How.ID,using="patient-documents-link-text")
	@CacheLookup
	WebElement ThreeDotForms;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/div/button")
	@CacheLookup
	WebElement FormsMakechange;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"formly_1_firstName_0_0\"]")
	@CacheLookup
	WebElement FormsFirstName;
	
	
	
	@FindBy(how=How.ID,using="formly_3_firstName_1_1")
	@CacheLookup
	WebElement FirstName2;
	public void FirstName2(String fn)
	{
		FirstName2.sendKeys(fn);
	}
	
	@FindBy(how=How.ID,using="formly_3_lastName_2_2")
	@CacheLookup
	WebElement LastName;
	
	public void LastName(String ln)
	{
		LastName.sendKeys(ln);
	}
	
	@FindBy(how=How.ID,using="formly_3_middleName_3_3")
	@CacheLookup
	WebElement MidelName;
	
	public void MidelName(String m)
	{
		MidelName.sendKeys(m);
	}
	
	@FindBy(how=How.ID,using="formly_3_streetAddress_4_4")
	@CacheLookup
	WebElement Address;
	
	public void Address(String add)
	{
		Address.sendKeys(add);
	}
	
	@FindBy(how=How.ID,using="formly_3_input_5_5")
	@CacheLookup
	WebElement EmargencyN;
	
	public void EmargencyN(String n)
	{
		EmargencyN.sendKeys(n);
	}
	
	@FindBy(how=How.ID,using="formly_3_streetAddress_6_6")
	@CacheLookup
	WebElement StreetAddress2;
	
	public void StreetAddress2(String s1)
	{
		StreetAddress2.sendKeys(s1);
	}
	
	@FindBy(how=How.ID,using="formly_3_city_7_7")
	@CacheLookup
	WebElement City;
	
	public void City(String c)
	{
		City.sendKeys(c);
	}
	
	@FindBy(how=How.ID,using="formly_3_state_8_8")
	@CacheLookup
	WebElement State;
	
	public void State(String st)
	{
		State.sendKeys(st);
	}
	
	@FindBy(how=How.ID,using="formly_3_postalCode_9_9")
	@CacheLookup
	WebElement Pincode;
	
	public void Pincode(String P)
	{
		Pincode.sendKeys(P);
	}
	
	@FindBy(how=How.NAME,using="Email Address_formly_3_email_10_10, email")
	@CacheLookup
	WebElement EmaileForms;
	
	public void EmaileForms(String email) 
	{
		EmaileForms.sendKeys(email);
	}
	
	@FindBy(how=How.ID,using="formly_3_input_11_11")
	@CacheLookup
	WebElement PatientFullN;
	
	public void PatientFullN(String Fulln)
	{
		PatientFullN.sendKeys(Fulln);
	}
	
	@FindBy(how=How.ID,using="formly_3_date_13_13")
	@CacheLookup
	WebElement PatientAdmitDate;
	
	public void PatientAdmitDate(String A)
	{
		PatientAdmitDate.sendKeys(A);
	}
	
	@FindBy(how=How.ID,using="formly_3_date_14_14")
	@CacheLookup
	WebElement PatientDateBirth;
	
	public void PatientDateBirth(String b)
	{
		PatientDateBirth.sendKeys(b);
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[3]/span/button")
	@CacheLookup
	WebElement FormsSave;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[3]/button[2]")
	@CacheLookup
	WebElement FormsCancel;
	
	@FindBy(how=How.CSS,using="#appointment-type-chooser")
	@CacheLookup
	WebElement AppointmentType;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[3]/div[5]/div/div[2]/div/ul/li[5]/a")
	@CacheLookup
	WebElement Appointment1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[3]/div[5]/div/div[2]/div/ul/li[4]/a")
	@CacheLookup
	WebElement Visit;
	public void Visit()
	{
	               
		Visit.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/ul/li[4]/a")
	@CacheLookup
	WebElement MessageHistory;
	
	public void MessageHistory()
	{
		MessageHistory.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[4]/patient-message-history/div/div[2]/table/tbody[1]/tr[1]/td[1]/button")
	@CacheLookup
	WebElement CheckHistory;
	
	public void CheckHistory()
	{
		CheckHistory.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[3]/button[3]")
	@CacheLookup
	WebElement HistorySaveChange;
	
	
	public void HistorySaveChange()
	{
		HistorySaveChange.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//div[starts-with(@role,\"alert\")]")
	@CacheLookup
	WebElement HistorySaveChangeMessage;
	
	public void HistorySaveChangeMessage()
	{
		HistorySaveChangeMessage.click();
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[3]/button[3]")
	@CacheLookup
	WebElement AppointmentTypeSave;
	
	@FindBy(how=How.LINK_TEXT,using="Conversations")
	@CacheLookup
	WebElement Conversations;
	
	public void Conversations()
	{
		Conversations.click();
	}
	
	@FindBy(how=How.CSS,using="#appointments > div.modal.ng-scope.ng-isolate-scope.in > div > div > patient-details-modal > div.modal-body.ng-scope > div > div.tab-pane.active > patient-conversations > div > div.data-container > div > div > div:nth-child(2) > textarea")
	@CacheLookup
	WebElement StartMessage;
	
	public void StartMessage(String m)
	{
		StartMessage.sendKeys(m);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Send Message')]")
	@CacheLookup
	WebElement SendMessage;
	
	public void SendMessage()
	{
		SendMessage.click();
	}
	
	@FindBy(how=How.ID,using="accordiongroup-7609-7527-tab")
	@CacheLookup
	WebElement Paneltitle;
	
	public void Paneltitle()
	{
		Paneltitle.click();
	}
	
	@FindBy(how=How.CSS,using="#accordiongroup-7609-7527-panel > div > div > div.thread-padding > div.reply-btn > span")
	@CacheLookup
	WebElement Reply;
	
	public void Reply()
	{
		Reply.click();
	}
	
	@FindBy(how=How.CSS,using="#accordiongroup-7609-7527-panel > div > div > div.thread-padding > div.reply-btn > div > div:nth-child(1) > textarea")
	@CacheLookup
	WebElement MessageReply;
	
	public void MessageReply(String rp)
	{
		MessageReply.sendKeys(rp);
	}
	@FindBy(how=How.CSS,using="#accordiongroup-7609-7527-panel > div > div > div.thread-padding > div.reply-btn > div > div.text-right > button.btn.btn-primary.ng-scope")
	@CacheLookup
	WebElement ReplyHere;
	
	public void ReplyHere()
	{
		ReplyHere.click();
	}
	
	
	
	public void AppointmentTypeSave()
	{
		AppointmentTypeSave.click();
	}
	
	
	public void Appointment1()
	{
		Appointment1.click();
	}
	
	public void AppointmentType()
	{
		AppointmentType.click();
	}
	
	public void FormsCancel()
	{
		FormsCancel.click();
	}
	
	public void FormsSave()
	{
		FormsSave.click();
	}
	
	public void FormsFirstName(String n)
	{
		FormsFirstName.sendKeys(n);
	}
	
	public void FormsMakechange()
	{
		FormsMakechange.click();
	}
	
	public void ThreeDotForms()
	{
		ThreeDotForms.click();
	}
	
	
	public void TreeDotEditCancel()
	
	{
		TreeDotEditCancel.click();
		
		ThreeDotEditYes.click();
	}
	
	
	public void ThreeDotCancel()
	{
		ThreeDotCancel.click();
		ThreeDotok.click();
	}
	
	public void StatusCancelled()
	{
		StatusCancelled.click();
	}
	
	public void StatusConect()
	{
		StatusConect.click();
	}
	
	public void ThreDotSetConfirmed()
	{
		ThreDotSetConfirmed.click();
	}
	
	
	public void ThreDotSetUnconfirmed()
	{
		ThreDotSetUnconfirmed.click();
	}
	
	public void StatusSave()
	{
		StatusSave.click();
	}
	
	public void StatusUnconfirmed()
	{
		StatusUnconfirmed.click();
	}
	
	public void StatusConfirmed()
	{
		StatusConfirmed.click();
	}
	public void EditStatusFilter()
	{
		EditStatusFilter.click();
	}
	
	public void FormsComplete()
	{
       JavascriptExecutor js = (JavascriptExecutor)ldriver;
       
		WebElement FormsCompleted=ldriver.findElement(By.xpath("/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[23]/td[2]/input"));
		js.executeScript("arguments[0].scrollIntoviwe();", FormsCompleted);
		
	}
	
	public void SENDDEMANDS()
	{
		
		SENDDEMANDS.click();
	}
	
	public void EmailDEMANDS()
	{
		EmailDEMANDS.click();
	}
	public void SMSDEMANDS()
	{
		SMSDEMANDS.click();
	}
	
	
	public void Appoint2()
	{
		Appoint2.click();
	}
	
	public void Appointment()
	{
		Appointment.click();
	}
	public void FormsandDemand()
	{
		FormsandDemand.click();
	}
	
	public void EditSave()
	{
		EditSave.click();
	}
	
	public void EditFlag1()
	{
		EditFlag1.click();
	}
	public void EditFlag()
	{
		EditFlag.click();
	}
	
	public void EditEmail(String e)
	{
		EditEmail.clear();
		EditEmail.sendKeys(e);
	}
	
	public void EditDob(String d)
	{
		EditDob.clear();
		EditDob.sendKeys(d);
	}
	
	
	
	public void EditAppointment()
	{
		EditAppointment.click();
	}
	
	public void ThreeDot()
	{
		ThreeDot.click();
	}
	
	public void AppointDATEAPPLY()
	{
		AppointDATEAPPLY.click();
	}
	
	public void AppointDATE2(String d2)
	{
		AppointDATE2.clear();
		AppointDATE2.sendKeys(d2);
	}
	
	public void AppointDATE1(String d1)
	{
		AppointDATE1.clear();
		AppointDATE1.sendKeys(d1);
	}
	
	public void AppointDATE()
	{
		AppointDATE.click();
	}
	
	public void ApptDragDrop() throws Exception
	{
		WebElement sourceEle=ldriver.findElement(By.xpath("/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[1]/td[1]/i"));
		Thread.sleep(3000);
		WebElement targetEle=ldriver.findElement(By.xpath("/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[8]/td[1]/i"));
		Thread.sleep(3000);
	Actions action=new Actions(ldriver);
	action.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
				
	}
	
	public void ApptDragDrop1() throws Exception
	{
		WebElement sourceEle=ldriver.findElement(By.xpath("/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[5]/td[1]/i"));
		Thread.sleep(3000);
		WebElement targetEle=ldriver.findElement(By.xpath("/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[1]/td[1]/i"));
		Thread.sleep(3000);
		Actions action1=new Actions(ldriver);
		action1.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
		
		
	}
	public void ApptDragDrop2() throws Exception
	{
		WebElement sourceEle=ldriver.findElement(By.xpath("/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[8]/td[1]/i"));
		Thread.sleep(3000);
		WebElement targetEle=ldriver.findElement(By.xpath("/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[5]/td[1]/i"));
		Thread.sleep(3000);
		Actions action2=new Actions(ldriver);
		action2.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
		
	}
	
	
	
	public void ColumnsSaveChange()
	{
		ColumnsSaveChange.click();
	}
	
	
	public void DobColumsAppoint()
	{
		DobColumsAppoint.click();
	}
	
	public void EditListColumns()
	{
		EditListColumns.click();
	}
	public void CloseBtnSeeing()
	
	
	{
		CloseBtnSeeing.click();
	}
	
	public void RemoveProvider()
	{
		RemoveProvider.click();
	}
	
	public void EditSeeingFillter()
	{
		EditSeeingFillter.click();
	}
	public void Departmentsavechange()
	{
		Departmentsavechange.click();
	}
	
	public void DepartFillterSelect()
	{
		if(DepartFillterSelect.isSelected())
		{
			System.out.println("Selecte All check box allready selected");
		}
		else
		{
			DepartFillterSelect.click();
			System.out.println("Selecte All check box not selected");
		}
	}
	
	public void EditDepartFillter() 
	{
		EditDepartFillter.click();
	}
	
	public void Configurelist()
	{
		Configurelist.click();
	}
	
	
	public void Searchbtn()
	{
		Searchbtn.click();
	}
	
	public void Advance_Mrn(String mrn)
	{
		Advance_Mrn.sendKeys(mrn);
	}
	
	public void Advance_DOB(String dob)
	{
		Advance_DOB.sendKeys(dob);
	}
	
	public void Advance_Email(String e)
	{
		Advance_Email.sendKeys(e);
	}
	
	
	public void Advance_Phone(String p)
	{
		Advance_Phone.sendKeys(p);
	}
	
	public void Advance_Initial(String m)
	{
		Advance_Initial.sendKeys(m);
	}
	
	
	public void Advance_Firstname(String f)
	{
		Advance_Firstname.sendKeys(f);
	}
	
	public void Advance_Lastname(String l)
	{
		Advance_Lastname.sendKeys(l);
	}
	
	
	public void  AdvanceSearch()
	{
		 AdvanceSearch.click();
	}
	
	
	public void SearchButton()
	{
		SearchButton.click();
	}
	
	public void SearchLastName(String l)
	{
		SearchLastName.sendKeys(l);
	}
	
	public void linkAppointment()
	{
		linkAppointment.click();
	}
          
              //---------------12-07-2022-----------------------
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[1]/div[1]/div/div[4]/button")
	@CacheLookup
	WebElement apptdaterange;

	public void apptdaterange()
	{

		apptdaterange.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[1]/div[1]/input")
	@CacheLookup
	WebElement apptdaterangestartdate;

	public void apptdaterangestartdate(String str)
	{
		apptdaterangestartdate.click();
		apptdaterangestartdate.clear();
		apptdaterangestartdate.sendKeys(str);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[1]/input")
	@CacheLookup
	WebElement apptdaterangeenddate;

	public void apptdaterangeenddate(String str)
	{
		apptdaterangeenddate.click();
		apptdaterangeenddate.clear();
		apptdaterangeenddate.sendKeys(str);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[3]/div/button[1]")
	@CacheLookup
	WebElement applybtnclk;

	public void applybtnclk()
	{
		applybtnclk.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr/td[9]/div/button")
	@CacheLookup  
	WebElement threedotclk;

	public void threedotclk()
	{
		threedotclk.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr/td[9]/div/ul/li[1]")
	@CacheLookup
	WebElement editappointmentclk;

	public void editappointmentclk()
	{
		editappointmentclk.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[3]/div[2]/div/date-picker/div/input")
	@CacheLookup
	WebElement appointmentfuturedate;

	public void appointmentfuturedate()
	{
		appointmentfuturedate.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[3]/div[2]/div/date-picker/div/input")
	@CacheLookup
	WebElement selectfuturedate;

	public void selectfuturedate(String str)
	{
		selectfuturedate.clear();
		selectfuturedate.sendKeys(str);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[3]/div[5]/div/div[2]/div/button")
	@CacheLookup
	WebElement changeappointmenttype;

	public void changeappointmenttype()
	{
		changeappointmenttype.click();

	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Visit')]")
	@CacheLookup
	WebElement chooseappointmenttype;

	public void chooseappointmenttype()
	{
		chooseappointmenttype.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/button[3]")
	@CacheLookup
	WebElement savefutureappointment;

	public void savefutureappointment()
	{
		savefutureappointment.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[4]/td[9]/div/button")
	@CacheLookup
	WebElement newthreedotclk;

	public void newthreedotclk()
	{
		newthreedotclk.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[4]/td[9]/div/ul/li[1]")
	@CacheLookup
	WebElement neweditappointment;

	public void neweditappointment()
	{
		neweditappointment.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/ul/li[2]/a")
	@CacheLookup
	WebElement formsclick;

	public void formsclick()
	{
		formsclick.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[2]/td[9]/div/button")
	@CacheLookup
	WebElement threedot;

	public void threedot()
	{
		threedot.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[2]/td[9]/div/ul/li[2]")
	@CacheLookup
	WebElement forms;

	public void forms()
	{
		forms.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[2]/td[9]/div/ul/li[1]")
	@CacheLookup
	WebElement editappt;

	public void editappt()
	{
		editappt.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[3]/div[2]/div/date-picker/div/input")
	@CacheLookup
	WebElement apptdatetime;

	public void apptdatetime(String str)
	{
		apptdatetime.clear();
		apptdatetime.sendKeys(str);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/button[3]")
	@CacheLookup
	WebElement apptsavechanges;

	public void apptsavechanges()
	{
		apptsavechanges.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[5]/td[9]/div/button")
	@CacheLookup
	WebElement gpthreedots;

	public void gpthreedots()
	{
		gpthreedots.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[5]/td[9]/div/ul/li[2]")
	@CacheLookup
	WebElement gpforms;

	public void gpforms()
	{
		gpforms.click();

	}

	//---
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[7]/td[9]/div/button")
	@CacheLookup
	WebElement sjthreedots;

	public void sjthreedots()
	{
		sjthreedots.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[7]/td[9]/div/ul/li[2]")
	@CacheLookup
	WebElement sjforms;

	public void sjforms()
	{
		sjforms.click();

	}

	//--
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[9]/td[9]/div/button")
	@CacheLookup
	WebElement timthreedots;

	public void timthreedots()
	{
		timthreedots.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[9]/td[9]/div/ul/li[2]")
	@CacheLookup
	WebElement timforms;

	public void timforms()
	{
		timforms.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[1]/td[9]/div/ul/li[2]")
	@CacheLookup
	WebElement formsclick1;

	public void formsclick1()
	{
		formsclick1.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[2]/a/span")
	@CacheLookup
	WebElement covidscreeningforms;

	public void covidscreeningforms()
	{
		covidscreeningforms.click();

	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
	@CacheLookup
	WebElement covidscreeningformssave;

	public void covidscreeningformssave()
	{
		covidscreeningformssave.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[1]/td[9]/div/button")
	@CacheLookup
	WebElement threedotclick;

	public void threedotclick()
	{
		threedotclick.click();

	}
	@FindBy(how=How.XPATH,using="//div[@class=\"image-uploader well well-sm ng-scope\" ]//label[@for=\"file-6\"]")
	@CacheLookup
	WebElement choosefile;
	public void choosefile() throws AWTException, InterruptedException
	{


		choosefile.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Desktop\\deep.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//paste operation in clipboard
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		//press enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div[1]/div/select")
	@CacheLookup
	WebElement leftcountry;

	public void leftcountry()
	{
		Select drpdown = new Select(leftcountry);
		drpdown.selectByIndex(1);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div[1]/div/div/div[2]/label/input")
	@CacheLookup
	WebElement difficultybreathing;

	public void difficultybreathing()
	{
		difficultybreathing.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div[1]/div/div/div[2]/label/input")
	@CacheLookup
	WebElement carnberries;

	public void carnberries()
	{
		carnberries.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div[1]/div/select")
	@CacheLookup
	WebElement covidstatus;

	public void covidstatus()
	{
		Select drpdown = new Select(covidstatus);
		drpdown.selectByIndex(1);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/button")
	@CacheLookup
	WebElement printbutton;

	public void printbutton()
	{
		printbutton.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-list/div[3]/button[1]")
	@CacheLookup
	WebElement Columns_Defaultsset;
	
	public void Columns_Defaultsset()
	{
		Columns_Defaultsset.click();
	}
	
// -------------------------------------------------------28/10/2022----------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Send Message')]")
	@CacheLookup
	WebElement  Send_Message_tab;
	
	public void Send_Message_tab()
	{
		Send_Message_tab.click();
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input")
	@CacheLookup
	WebElement Status_SelectAll;
	
	public void Status_SelectAll()
	
	{
		
		Status_SelectAll.click();
		
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/status-filter/div[2]/div/div[2]/label/input")
	@CacheLookup
	WebElement Status_CheckIn;
	
	public void Status_CheckIn()
	{
		Status_CheckIn.click();
	}
	
	@FindBy(how=How.XPATH,using=" //button[contains(text(),'Send Message')]  ")
	@CacheLookup
	WebElement Appoint_SendMessage;
	
	public void Appoint_SendMessage()
	{
		Appoint_SendMessage.click();
	}
	
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input")
	@CacheLookup
	WebElement SelectAll_s;
	
	public void SelectAll_s()
	{
		if(!SelectAll_s.isSelected()) {
			JavascriptExecutor g = (JavascriptExecutor)ldriver;
			g.executeScript("arguments[0].click", SelectAll_s);
			if(!SelectAll_s.isSelected()) {
				SelectAll_s.click();
			}
			else {
				SelectAll_s.click();
			}
				
			
		}
	}
//-------------------------------------23-12-2022------------------------------------------------------------------------------------------------------	
	@FindBy(how=How.CSS,using="#appointments > div.row.header-buttons > div:nth-child(1) > div > div.form-group.dropdown.open > ul")
	@CacheLookup
	WebElement Configure_Displayed;
	
	public void Configure_Displayed()
	{
		String act = Configure_Displayed.getText();
		System.out.println("Configure list" +act);
	}
	
	@FindBy(how=How.CSS,using="#appointments > div:nth-child(2)")
	@CacheLookup
	WebElement Patient_Appointment_Displayed;
	
	public void Patient_Appointment_Displayed()
	{
		String act = Patient_Appointment_Displayed.getText();
		System.out.println(act);
	}
	
	@FindBy(how=How.CSS,using="#appointments > div.modal.ng-scope.ng-isolate-scope.in > div > div > patient-details-modal > div.modal-header > button")
	@CacheLookup
	WebElement Edit_Appointment_Close;
	
	public void Edit_Appointment_Close()
	{
		Edit_Appointment_Close.click();
	}
	
	@FindBy(how=How.CSS,using="#patient-lists-component > div > div > div.tab-pane.ng-scope.active > div > table > tbody > tr:nth-child(9) > td:nth-child(2) > input")
	@CacheLookup
	WebElement Coloums_FormsComplete;
	
	public void Coloums_FormsComplete()
	{
		if(Coloums_FormsComplete.isSelected())
		{
			System.out.println("Forms complete is Selected");
		}
		else
		{
			Coloums_FormsComplete.click();
		}
	}
//---------------------------------------------24-12-2022---------------------------------------------------------------------------------------	

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table")
	@CacheLookup
	WebElement Patient_Displayed;
	
	public void Patient_Displayed()
	{
		String act = Patient_Displayed.getText();
		System.out.println(act);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	@CacheLookup
	WebElement ThreeDot_Cancel_Yes;
	
	public void ThreeDot_Cancel_Yes()
	{
		ThreeDot_Cancel_Yes.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel Appointment')]")
	@CacheLookup
	WebElement Edit_Appointmen_Cancel_btn;
	
	public void Edit_Appointmen_Cancel_btn()
	{
		Edit_Appointmen_Cancel_btn.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	@CacheLookup
	WebElement Edit_Appointmen_Cancel_Yes;
	
	public void Edit_Appointmen_Cancel_Yes()
	{
		Edit_Appointmen_Cancel_Yes.click();
	}
	
	@FindBy(how=How.XPATH,using="//div[@ng-class=\"$ctrl.setModalBodyClass()\"]")
	@CacheLookup
	WebElement Forms_Display;
	
	public void Forms_Display()
	{
		String act = Forms_Display.getText();
		System.out.println(act);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul")
	@CacheLookup
	WebElement Forms_option;
	
	public void Forms_option()
	{
		String act = Forms_option.getText();
		System.out.println(act);
	}
	
	@FindBy(how=How.CSS,using="#appointments > div.modal.ng-scope.ng-isolate-scope.in > div > div > patient-details-modal > div.modal-body.ng-scope.tab-documents")
	@CacheLookup
	WebElement Forms_Display2;
	
	public void Forms_Display2()
	{
		String act = Forms_Display2.getText();
		System.out.println(act);
	}
	
	
	@FindBy(how=How.CSS,using="#appointments > div.modal.ng-scope.ng-isolate-scope.in > div > div > patient-details-modal > div.modal-body.ng-scope.tab-documents > div > div.tab-pane.active > jfh-patient-forms > div > div.col-xs-4.documents-list > ul")
	@CacheLookup
	WebElement Forms_option1;
	
	public void Forms_option1()
	{
		String act = Forms_option1.getText();
		System.out.println(act);
	}
	
	
}


