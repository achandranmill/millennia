package com.access.pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
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
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[1]/div[1]/div/div[1]/span/button[2]")
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
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div[1]/div/div[2]/button")
	@CacheLookup
	WebElement Configurelist;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[1]/div[1]/div/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement  EditDepartFillter;
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@id,\"9b0eb0a4-edc5-40c9-ae10-7d19ed0e7f25\")]")
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
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[1]/div[1]/div/div[2]/ul/li[4]/a")
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
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[1]/div[9]/jfh-patient-flags/div/div/div[2]/ul/li[2]/a")
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
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[2]/div/table/tbody/tr[1]/td[23]/div/ul/li[4]/a")
	@CacheLookup
	WebElement ThreDotSetUnconfirmed;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[2]/div/table/tbody/tr[1]/td[23]/div/ul/li[3]/a")
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
	
	@FindBy(how=How.ID,using="appointment-type-chooser")
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
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[3]/patient-conversations/div/div[2]/div/div/div[1]/textarea")
	@CacheLookup
	WebElement StartMessage;
	
	public void StartMessage(String m)
	{
		StartMessage.sendKeys(m);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[3]/patient-conversations/div/div[2]/div/div/div[2]/button")
	@CacheLookup
	WebElement SendMessage;
	
	public void SendMessage()
	{
		SendMessage.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[3]/patient-conversations/div/div[2]/div/div[2]/uib-accordion/div/div/div[1]")
	@CacheLookup
	WebElement Paneltitle;
	
	public void Paneltitle()
	{
		Paneltitle.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[3]/patient-conversations/div/div[2]/div/div[2]/uib-accordion/div/div/div[2]/div/div/div[1]/div[3]/span")
	@CacheLookup
	WebElement Reply;
	
	public void Reply()
	{
		Reply.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[3]/patient-conversations/div/div[2]/div/div[2]/uib-accordion/div/div/div[2]/div/div/div[1]/div[3]/div/div[1]/textarea")
	@CacheLookup
	WebElement MessageReply;
	
	public void MessageReply(String rp)
	{
		MessageReply.sendKeys(rp);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[3]/patient-conversations/div/div[2]/div/div[2]/uib-accordion/div/div/div[2]/div/div/div[1]/div[3]/div/div[2]/button[2]")
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
		DepartFillterSelect.click();
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
}
