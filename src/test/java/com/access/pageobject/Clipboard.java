package com.access.pageobject;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class Clipboard {
	WebDriver ldriver;

	public Clipboard(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 20), this);
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Clipboard')]")
	@CacheLookup
	WebElement LinkClipboard;
	
	@FindBy(how = How.ID, using ="nameLast")
	@CacheLookup
	WebElement txtnameLast;

	@FindBy(how = How.ID, using ="firstName")
	@CacheLookup
	WebElement txtfirstName;

	@FindBy(how = How.ID, using ="middleInit")
	@CacheLookup
	WebElement txtmiddleInit;

	@FindBy(how = How.XPATH, using = "//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/date-picker[1]/div[1]/span[1]/button[1]")
	@CacheLookup
	WebElement button;
	
	@FindBy(how = How.NAME, using ="dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.ID, using ="phoneNumber")
	@CacheLookup
	WebElement txtphoneNumber;

	@FindBy(how = How.ID, using ="email")
	@CacheLookup
	WebElement txtemail;

	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/time-picker[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txttime;
	
	@FindBy(how = How.XPATH, using = "//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/date-picker[1]/div[1]/span[1]/button[1]")
	@CacheLookup
	WebElement button1;
	
	@FindBy(how = How.NAME, using = "appointmentDate")
	@CacheLookup
	WebElement txtappointmentDate;

	@FindBy(how = How.ID, using ="location-dropdown")
	@CacheLookup
	WebElement txtlocationdropdown;
	
	@FindBy(how = How.ID, using ="/html[1]/body[1]/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/ul[1]/div[1]/input[1]")
	@CacheLookup
	WebElement searchdep;
	
	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	@CacheLookup
	WebElement selectdep;
	
	@FindBy(how = How.ID, using ="seeing-dropdown")
	@CacheLookup
	WebElement txtseeingdropdown;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Test_2, Provider')]")
	@CacheLookup
	WebElement selectdepseeingdropdown;

	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[3]/div[5]/div[1]/jfh-patient-flags[1]/div[1]/div[1]/div[2]/span[1]/span[1]")
	@CacheLookup
	WebElement txtflag;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'covisit')]")
	@CacheLookup
	WebElement flagselect;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Admin')]")
	@CacheLookup
	WebElement flagselect1;
	

	@FindBy(how = How.ID, using ="comments")
	@CacheLookup
	WebElement txtcomments;

	@FindBy(how = How.ID, using ="reason")
	@CacheLookup
	WebElement txtreason;

	/*@FindBy(how = How.ID, using ="newClearButton")
	@CacheLookup
	WebElement button;*/

	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Appointment Type TITLE')]")
	@CacheLookup
	WebElement txtAppointment;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'New Appointment')]")
	@CacheLookup
	WebElement selectAppointment;

	@FindBy(how = How.ID, using ="copay")
	@CacheLookup
	WebElement txtcopay;

	@FindBy(how = How.ID, using ="custom1")
	@CacheLookup
	WebElement txtcustom1;

	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Add and Check In')]")
	@CacheLookup
	WebElement btnaddcheckin;

	@FindBy(how = How.ID, using ="sendSmsMessages")
	@CacheLookup
	WebElement Checkbox1;

	@FindBy(how = How.ID, using ="sendEmailMessages")
	@CacheLookup
	WebElement Checkbox2;

	@FindBy(how = How.ID, using ="printAccessPass")
	@CacheLookup
	WebElement Checkbox3;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Link Connect Account')]")
	@CacheLookup
	WebElement Accountconnect;
	
	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement relation;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Patient is Self')]")
	@CacheLookup
	WebElement Self;
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'1-john Thomson Robin')]")
	@CacheLookup
	WebElement patientdetails;
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Undo Check In')]")
	@CacheLookup
	WebElement UndoCheckIn;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div/undo-check-in-modal/div[3]/button[2]")
	@CacheLookup
	WebElement ConfirmUndoCheckIn;
	
	
	//change
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[1]/a")
	@CacheLookup
	WebElement LinkclickBoard;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[2]/div[4]/div/date-picker/div/input")
	@CacheLookup
	WebElement DOB;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"gender\"]")
	@CacheLookup
	WebElement Gender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Time;
	
	@FindBy(how=How.ID,using="seeing-dropdown")
	@CacheLookup
	WebElement Fillterprovider;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/ul/li[3]/a/span")
	@CacheLookup
	WebElement provider;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btn-append-to-single-button\"]")
	@CacheLookup
	WebElement Flag1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"patientFlags\"]/div/div[2]/ul/li[2]/a/span")
	@CacheLookup
	WebElement FlagSelect;
	
	@FindBy(how=How.ID,using="ssn")
	@CacheLookup
	WebElement SSN;
	
	@FindBy(how=How.ID,using="appointmentContactNumber")
	@CacheLookup
	WebElement  appointmentContactNumber;
	
	
	@FindBy(how=How.ID,using="mrn")
	@CacheLookup
	WebElement mrn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"appointmentContactName\"]")
	@CacheLookup
	WebElement appointmentContactName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div[2]/date-picker/div/input")
	@CacheLookup
	WebElement Date;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[2]/div[1]/div")
	 @CacheLookup
	 WebElement Undocheckin;
	
	public void Date(String d2)
	{
		Date.sendKeys(d2);
	}
	
	
	public void appointmentContactName(String n1)
	{
		appointmentContactName.sendKeys(n1);
	}
	
	public void mrn(String m)
	{
		mrn.sendKeys(m);
	}
	
	public void appointmentContactNumber(String n)
	{
		appointmentContactNumber.sendKeys(n);
	}
	
	public void SSN(String s)
	{
		SSN.sendKeys(s);
	}
	
	public void FlagSelect()
	{
		FlagSelect.click();
	}
	
	public void Flag1() {
		Flag1.click();
	}
	
	public void Fillterprovider()
	{
		Fillterprovider.click();
	}
	
	public void provider()
	{
		provider.click();
	}
	
	public void Time(String t)
	{
		Time.sendKeys(t);
	}
	
	
	public void Gender(String g)
	{
		Gender.sendKeys(g);
	}
	public void textemail(String e)
	{
		txtemail.sendKeys(e);
	}
	public void DOB(String d)
	{
		DOB.click();
		DOB.clear();
		DOB.sendKeys(d);
	}
	public void LinkclickBoard()
	{
		LinkclickBoard.click();
	}
	
	
	public void lname(String lname) {
		txtnameLast.sendKeys(lname);
	}
	public void fname(String fname) {
		txtfirstName.sendKeys(fname);
	}
	public void mname(String mname) {
		txtmiddleInit.sendKeys(mname);
	}
	public void dob()
	{
		button.click();
	}
	public void dob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void pnumber(String pnumber) {
		txtphoneNumber.sendKeys(pnumber);
	}
	public void pemailid(String pemailid) {
		txtemail.sendKeys(pemailid);
	}	
	public void ptime(String ptime) {
		txttime.clear();
		txttime.sendKeys(ptime);
	}
	/*public void ptime(String hh, String mm) {
		txttime.sendKeys(hh);
		txttime.sendKeys(mm);*/
	
	public void adate(String adate) {
		txtappointmentDate.clear();
		txtappointmentDate.sendKeys(adate);
	}	
	public void searchdep(String depname)
	{
		txtlocationdropdown.click();
		selectdep.click();
	}
	public void seeingdropdown(String seeingname)
	{
		txtseeingdropdown.click();
		selectdepseeingdropdown.click();	
	}
	public void flag (){
		txtflag.click();
		flagselect.click();
	}
	public void comments(String comments) {
		txtcomments.sendKeys(comments);
	}
	public void reason(String reason) {
		txtreason.sendKeys(reason);
	}
	public void Appointment() {
		txtAppointment.click();
		selectAppointment.click();
	}
	public void copay(String copay) {
		txtcopay.sendKeys(copay);
	}
	public void custom1(String custom1)
	{
		txtcustom1.sendKeys(custom1);
	}
	public void sendSmsMessages()
	{
		Checkbox1.click();
	}
	public void sendEmailMessages()
	{
		Checkbox2.click();
	}
	public void printAccessPass()
	{
		Checkbox3.click();
	}
	
	public void newClearButton() 
	{
		button.click();
	}

	public void connect()
	{
		Accountconnect.click();
	}
	
	public void relation()
	{
		relation.click();
		Self.click();
	}
	public void addcheckin() {
	btnaddcheckin.click();
//		if(btnaddcheckin.isEnabled())
//			Assert.assertTrue(true);
//		else
//		Assert.assertTrue(false);
//		btnaddcheckin.click();
	}

	public void pdetails()
	{
		patientdetails.click();
	}
	public void UCheckIn()
	{
		UndoCheckIn.click();
	}
	public void CUCheckIn()
	{
		Actions at = new Actions(ldriver);
		at.moveToElement(ConfirmUndoCheckIn).build().perform();
		
	}
	
	 public void Undocheckinnew()
	 {
		 Undocheckin.click();
	 }
	
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[2]/div/div/time-picker/div/input")
	 @CacheLookup
	 WebElement Clip_AppointTime;
	 
	 public void Clip_AppointTime(String at)
	 {
		 Clip_AppointTime.click();
		 Clip_AppointTime.clear();
		 Clip_AppointTime.sendKeys(at);
	 }
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[3]/div/div/button")
	 @CacheLookup
	 WebElement Clip_Location;
	 
	 public void Clip_Location()
	 {
		 Clip_Location.click();
	 }
	 
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[3]/div/div/ul/li/a")
	 @CacheLookup
	 WebElement Clip_Location_option;
	 
	 public void Clip_Location_option()
	 {
		 Clip_Location_option.click();
	 }
	 
	 
	 @FindBy(how=How.CSS,using="#type-dropdown")
	 @CacheLookup
	 WebElement Clip_Appointment_Type;
	 
	 public void Clip_Appointment_Type()
	 {
		 Clip_Appointment_Type.click();
	 }
	 
	//---------ACCORDING Appointment_Type DROP-DOWN USED THE New Appointment OPTION---IF CHANGES IN THIS OPTION AND NOT AVAILABLE New Appointment SO IS FAILD--------------------
	 @FindBy(how=How.CSS,using="#clipboard > main > div:nth-child(1) > clipboard1 > div:nth-child(1) > div > form > div:nth-child(3) > div:nth-child(4) > div > div > ul > li:nth-child(1) > a")
	 @CacheLookup
	 WebElement Clip_Appointment_option;
	 
	 public void Clip_Appointment_option()
	 {
		 Clip_Appointment_option.click();
	 }
	 
	 @FindBy(how=How.ID,using="seeing-dropdown")
	 @CacheLookup
	 WebElement Clip_Seeing;
	 
	 public void Clip_Seeing()
	 {
		 Clip_Seeing.click();
	 }
	 
//---------ACCORDING SEEING DROP-DOWN USED THE TEST_2,PROVIDER OPTION---IF CHANGES IN THIS OPTION AND NOT AVAILABLE TEST_2,PROVIDER SO IS FAILD--------------------
	 @FindBy(how=How.CSS,using="#clipboard > main > div:nth-child(1) > clipboard1 > div:nth-child(1) > div > form > div:nth-child(3) > div:nth-child(10) > div > div > ul > li:nth-child(2) > a")
	 @CacheLookup
	 WebElement Clip_Thoms;
	 
	 public void Clip_Thoms()
	 {
		 Clip_Thoms.click();
	 }
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[6]/div/div/input")
	 @CacheLookup
	 WebElement Clip_Comment;
	 
	 public void Clip_Comment(String cc)
	 {
		 Clip_Comment.click();
		 Clip_Comment.clear();
		 Clip_Comment.sendKeys(cc);
	 }
	 
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[8]/div/div/input")
	 @CacheLookup
	 WebElement Clip_Reason;
	 
	 public void Clip_Reason(String cr)
	 {
		 Clip_Reason.click();
		 Clip_Reason.clear();
		 Clip_Reason.sendKeys(cr);
	 }
	 
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[9]/div/div/input")
	 @CacheLookup
	 WebElement Clip_Copay;
	 
	 public void Clip_Copay(String cc)
	 {
		 Clip_Copay.click();
		 Clip_Copay.clear();
		 Clip_Copay.sendKeys(cc);
	 }
	 
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add Patient')]")
	@CacheLookup
	WebElement Clip_Addpatient;
	
	public void Clip_Addpatient()
	{
		Clip_Addpatient.click();
	}
	 
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[5]/div/jfh-patient-flags/div/div/div[2]/span")
	@CacheLookup
	WebElement Clip_Flag;
	
	public void Clip_Flag()
	{
		Clip_Flag.click();
	}
	 
	
	@FindBy(how=How.XPATH,using=" //a//span[contains(text(),'covisit')]")
	@CacheLookup
	WebElement Clip_Flag_Option;
	
	public void Clip_Flag_Option()
	
	{
		Clip_Flag_Option.click();
	}
	
	@FindBy(how=How.XPATH,using=" //a//span[contains(text(),' dlj')]")
	@CacheLookup
	WebElement Clip_Flag_Option1;
	
public void Clip_Flag_Option1()
	
	{
	Clip_Flag_Option1.click();
	}
	
	

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Check In')]")
	@CacheLookup
	WebElement Clip_Checkin;
	
	public void Clip_Checkin()
	{
		Clip_Checkin.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/check-in-modal/div[3]/button")
	@CacheLookup
	WebElement Alert_ok;
	
	public void Alert_ok()
	{
		Alert_ok.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/button[1]")
	@CacheLookup
	WebElement Clip_LinkConnectAccount;
	
	public void Clip_LinkConnectAccount()
	{
		Clip_LinkConnectAccount.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/div/div/button")
	@CacheLookup
	WebElement Clip_Linkpatient;
	
	public void Clip_Linkpatient()
	{
		Clip_Linkpatient.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/div/div/button")
	@CacheLookup
	WebElement Clip_LinkSelfoption;
	
	public void Clip_LinkSelfoption()
	{
		Clip_LinkSelfoption.click();
	}
	
	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'Patient is Self')]")
	@CacheLookup
	WebElement Clip_LinkSelf;
	
	public void Clip_LinkSelf()
	{
		Clip_LinkSelf.click();
	}
	
	@FindBy(how=How.XPATH,using= "/html/body/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/div/div/ul/li[2]/a")
	@CacheLookup
	WebElement Clip_LinkChildoption;
	
	public void Clip_LinkChildoption()
	{
		Clip_LinkChildoption.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'Patient is my Parent')]")
	@CacheLookup
	WebElement Clip_LinkPatientismyParent;
	
	public void Clip_LinkPatientismyParent()
	{
		Clip_LinkPatientismyParent.click();
	}
	
	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'I am the guardian of the Patient')]")
	@CacheLookup
	WebElement Clip_LinkIamthe_guardianofthe_Patient;
	
	public void Clip_LinkIamthe_guardianofthe_Patient()
	{
		Clip_LinkIamthe_guardianofthe_Patient.click();
	}
	
	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'Patient is my Grandparent')]")
	@CacheLookup
	WebElement Clip_Link_PatientismyGrandparent;
	
	public void Clip_Link_PatientismyGrandparent()
	{
		Clip_Link_PatientismyGrandparent.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'Patient is my Grandchild')]")
	@CacheLookup
	WebElement Clip_Link_PatientismyGrandchild;
	
	public void Clip_Link_PatientismyGrandchild()
	{
		Clip_Link_PatientismyGrandchild.click();
	}
	
	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'Patient is my Great Grandchild')]")
	@CacheLookup
	WebElement Clip_Link_PatientismyGreatGrandchild;
	
	public void Clip_Link_PatientismyGreatGrandchild()
	{
		Clip_Link_PatientismyGreatGrandchild.click();
	}
	
	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'Patient is my Great Grandparent')]")
	@CacheLookup
	WebElement Clip_Link_PatientismyGreatGrandparent;
	
	public void Clip_Link_PatientismyGreatGrandparent()
	{
		Clip_Link_PatientismyGreatGrandparent.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/check-in-modal/div[2]/h1")
	@CacheLookup
	WebElement Display_message;
	
	public void Display_message()
	{
		String act = Display_message.getText();
		System.out.println("Matching Message is: "+ act);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Close')]")
	@CacheLookup
	WebElement Accesssprint_close;
	
	public void Accesssprint_close()
	{
		Accesssprint_close.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[2]/div/div/h4")
	@CacheLookup
	WebElement patient_namefound;
	
	public void patient_namefound()
	{
		String act = patient_namefound.getText();
		System.out.println("Matching Message is: "+ act);
	}
	
	
	///////---------------------//////////////
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Registration')]")

	@CacheLookup
	WebElement clkregistrationlink;
	public void clkregistrationlink()
	{
		clkregistrationlink.click();


	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Clipboard')]")

	@CacheLookup
	WebElement clkclipboardlink;
	public void clkclipboardlink()
	{
		clkclipboardlink.click();


	}

	@FindBy(how=How.XPATH,using="//*[@id=\"nameLast\"]")

	@CacheLookup
	WebElement cliplastname;
	public void cliplastname(String s)
	{
		cliplastname.click();
		cliplastname.clear();
		cliplastname.sendKeys(s);

	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[2]/div[2]/div/div/input")

	@CacheLookup
	WebElement clipfirstname;
	public void clipfirstname(String s)
	{
		clipfirstname.click();
		clipfirstname.clear();
		clipfirstname.sendKeys(s);
		//clipfirstname.clear();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"middleInit\"]")

	@CacheLookup
	WebElement clipmiddlename;
	public void clipmiddlename(String s)
	{
		clipmiddlename.click();
		clipmiddlename.clear();
		clipmiddlename.sendKeys(s);

	}
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[2]/div[4]/div/date-picker/div/input")

	@CacheLookup
	WebElement clipdateofbirth;
	public void clipdateofbirth(String s)
	{
		clipdateofbirth.click();
		clipdateofbirth.clear();
		clipdateofbirth.sendKeys(s);

	}
	@FindBy(how=How.XPATH,using="//*[@id=\"phoneNumber\"]")

	@CacheLookup
	WebElement clipphone;
	public void clipphone(String s)
	{
		clipphone.click();
		clipphone.clear();
		clipphone.sendKeys(s);

	}
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]")

	@CacheLookup
	WebElement clipemail;
	public void clipemail(String s)
	{
		clipemail.click();
		clipemail.clear();
		clipemail.sendKeys(s);

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[2]/div/div/time-picker/div/input")

	@CacheLookup
	WebElement clipappointment;
	public void clipappointment(String s)
	{
		clipappointment.click();
		clipappointment.clear();
		clipappointment.sendKeys(s);

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"location-dropdown\"]")

	@CacheLookup
	WebElement cliplocation;
	public void cliplocation()
	{
		cliplocation.click();
		

	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[3]/div/div/ul/li/a")

	@CacheLookup
	WebElement cliplocationoption;
	public void cliplocationoption()
	{
		cliplocationoption.click();
		

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"type-dropdown\"]")

	@CacheLookup
	WebElement clipappointmenttype;
	public void clipappointmenttype()
	{
		clipappointmenttype.click();
		

	}
//-----------------------------------------21-12-2022-----------------------------------------------------------------------------------------	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div/ul/li[2]/a")

	@CacheLookup
	WebElement clipappointmenttypeoption;
	public void clipappointmenttypeoption()
	{
		clipappointmenttypeoption.click();
		

	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[3]/div/div/button")

	@CacheLookup
	WebElement clipdepartmenttype;
	public void clipdepartmenttype()
	{
		clipdepartmenttype.click();


	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div/button")
	@CacheLookup
	WebElement Clipappointmenttype;

	public void Clipappointmenttype()
	{
		Clipappointmenttype.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div/ul/li[4]/a/span")
	@CacheLookup
	WebElement Clipappointmenttypetest;

	public void Clipappointmenttypetest()
	{
		Clipappointmenttypetest.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[3]/a/span")
	@CacheLookup
	WebElement Appointform3clk;

	public void Appointform3clk()
	{
		Appointform3clk.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[2]/a/span")
	@CacheLookup
	WebElement Appointform2clk;

	public void Appointform2clk()
	{
		Appointform2clk.click();
	}
	
	

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement from1firstname;

	public void from1firstname(String fname)
	{
		from1firstname.sendKeys(fname);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div[1]/div/input")
	@CacheLookup
	WebElement from1lastname;

	public void from1lastname(String lname)
	{
		from1lastname.sendKeys(lname);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement from1gender;

	public void from1gender()
	{
		from1gender.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/div/input")
	@CacheLookup
	WebElement from1DOB;

	public void from1DOB(String dob)
	{
		from1DOB.sendKeys(dob);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/input")
	@CacheLookup
	WebElement from1address;

	public void from1address(String address)
	{
		from1address.sendKeys(address);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/div/input")
	@CacheLookup
	WebElement from1SSN;

	public void from1SSN(String SSN)
	{
		from1SSN.sendKeys(SSN);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[7]/div/div[1]/div/input")
	@CacheLookup
	WebElement from1email;

	public void from1email(String email)
	{
		from1email.sendKeys(email);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[8]/div/div/div/div/input")
	@CacheLookup
	WebElement from1homephone;

	public void from1homephone(String hphnum)
	{
		from1homephone.sendKeys(hphnum);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[10]/div/div/div/input")
	@CacheLookup
	WebElement from1priinsurancename;

	public void from1priinsurancename(String insu)
	{
		from1priinsurancename.sendKeys(insu);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[11]/div/div/div/input")
	@CacheLookup
	WebElement from1policyholder;

	public void from1policyholder(String phold)
	{
		from1policyholder.sendKeys(phold);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[12]/div/div/div/div/input")
	@CacheLookup
	WebElement from1policyholderdob;

	public void from1policyholderdob(String pholddob)
	{
		from1policyholderdob.sendKeys(pholddob);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[9]/div/div/div/div/input")
	@CacheLookup
	WebElement from1cellphone;

	public void from1cellphone(String cphnum)
	{
		from1cellphone.sendKeys(cphnum);
	}



	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
	@CacheLookup
	WebElement from1clicksavebtn;

	public void from1clicksavebtn()
	{
		from1clicksavebtn.click();
	}
	

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement from2pharmacyname;

	public void from2pharmacyname(String pname)
	{
		from2pharmacyname.sendKeys(pname);

	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/input")
	@CacheLookup
	WebElement from2pharmacyaddress;

	public void from2pharmacyaddress(String paddress)
	{
		from2pharmacyaddress.sendKeys(paddress);

	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/input")
	@CacheLookup
	WebElement from2pharmacyaphone;

	public void from2pharmacyaphone(String pphone)
	{
		from2pharmacyaphone.sendKeys(pphone);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/input")
	@CacheLookup
	WebElement from2priinsurancename;

	public void from2priinsurancename(String iname)
	{
		from2priinsurancename.sendKeys(iname);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/input")
	@CacheLookup
	WebElement from2policyholdername;

	public void from2policyholdername(String phname)
	{
		from2policyholdername.sendKeys(phname);

	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/div/input")
	@CacheLookup
	WebElement from2policyholderdob;

	public void from2policyholderdob(String phdob)
	{
		from2policyholderdob.sendKeys(phdob);

	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
	@CacheLookup
	WebElement from2clicksavebtn;

	public void from2clicksavebtn()
	{
		from2clicksavebtn.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div/ul/li[7]/a/span")
	@CacheLookup
	WebElement Appttype2;

	public void Appttype2()
	{
		Appttype2.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div/ul/li[8]/a/span")
	@CacheLookup
	WebElement Appttype3;

	public void Appttype3()
	{
		Appttype3.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/input")
	@CacheLookup
	WebElement form3firstname;

	public void form3firstname(String name)
	{
		form3firstname.sendKeys(name);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/input")
	@CacheLookup
	WebElement form3lastname;

	public void form3lastname(String lname)
	{
		form3lastname.sendKeys(lname);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement form3gender;

	public void form3gender()
	{
		form3gender.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/input")
	@CacheLookup
	WebElement form3address;

	public void form3address(String adds)
	{
		form3address.sendKeys(adds);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/div/input")
	@CacheLookup
	WebElement form3ssn;

	public void form3ssn(String ssn)
	{
		form3ssn.sendKeys(ssn);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[7]/div/div/div/input")
	@CacheLookup
	WebElement form3email;

	public void form3email(String email)
	{
		form3email.sendKeys(email);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[8]/div/div/div/div/input")
	@CacheLookup
	WebElement form3homephone;

	public void form3homephone(String hphone)
	{
		form3homephone.sendKeys(hphone);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[9]/div/div/div/div/input")
	@CacheLookup
	WebElement form3cellphone;

	public void form3cellphone(String cphone)
	{
		form3cellphone.sendKeys(cphone);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[10]/div/div/div/input")
	@CacheLookup
	WebElement form3primaryinsurance;

	public void form3primaryinsurance(String pinsurance)
	{
		form3primaryinsurance.sendKeys(pinsurance);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[11]/div/div/div/input")
	@CacheLookup
	WebElement form3policyholdername;

	public void form3policyholdername(String phname)
	{
		form3policyholdername.sendKeys(phname);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[12]/div/div/div/div/input")
	@CacheLookup
	WebElement form3policyholderdob;

	public void form3policyholderdob(String phdob)
	{
		form3policyholderdob.sendKeys(phdob);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[13]/div/div/div/input")
	@CacheLookup
	WebElement form3pharmacyname;

	public void form3pharmacyname(String name)
	{
		form3pharmacyname.sendKeys(name);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[14]/div/div/div/input")
	@CacheLookup
	WebElement form3pharmacyaddress;

	public void form3pharmacyaddress(String name)
	{
		form3pharmacyaddress.sendKeys(name);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[15]/div/div/div/div/input")
	@CacheLookup
	WebElement form3pharmacyphone;

	public void form3pharmacyphone(String ph)
	{
		form3pharmacyphone.sendKeys(ph);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button")
	@CacheLookup
	WebElement form3save;

	public void form3save()
	{
		form3save.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/div/button")
	@CacheLookup
	WebElement form3makechangesbtn;

	public void form3makechangesbtn()
	{
		form3makechangesbtn.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/input")
	@CacheLookup
	WebElement form3editfirstname;

	public void form3editfirstname(String edname)
	{
		form3editfirstname.clear();
		form3editfirstname.sendKeys(edname);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/input")
	@CacheLookup
	WebElement form3editlastname;

	public void form3editlastname(String edlname)
	{
		form3editlastname.clear();
		form3editlastname.sendKeys(edlname);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/input")
	@CacheLookup
	WebElement form3editaddress;

	public void form3editaddress(String address)
	{
		form3editaddress.clear();
		form3editaddress.sendKeys(address);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[3]/td[8]/div/button")
	@CacheLookup
	WebElement form2threedotclick;

	public void form2threedotclick()
	{
		form2threedotclick.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[3]/td[8]/div/ul/li[2]")
	@CacheLookup
	WebElement form2formlinkclk;

	public void form2formlinkclk()
	{
		form2formlinkclk.click();

	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/div/button")
	@CacheLookup
	WebElement form2makechangesbtn;

	public void form2makechangesbtn()
	{
		form2makechangesbtn.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/input")
	@CacheLookup
	WebElement form2pharmacyname;

	public void form2pharmacyname(String pname)
	{
		form2pharmacyname.clear();
		form2pharmacyname.sendKeys(pname);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/input")
	@CacheLookup
	WebElement form2pharmacyaddress;

	public void form2pharmacyaddress(String paddresss)
	{
		form2pharmacyaddress.clear();
		form2pharmacyaddress.sendKeys(paddresss);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/input")
	@CacheLookup
	WebElement form2primaryinsurancename;

	public void form2primaryinsurancename(String pinsuname)
	{
		form2primaryinsurancename.clear();
		form2primaryinsurancename.sendKeys(pinsuname);
	}
	
	

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/input")
	@CacheLookup
	WebElement form1editfirstname1;

	public void form1editfirstname1(String fname)
	{
		form1editfirstname1.clear();
		form1editfirstname1.sendKeys(fname);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/input")
	@CacheLookup
	WebElement form1editlastname1;

	public void form1editlastname1(String lname)
	{
		form1editlastname1.clear();
		form1editlastname1.sendKeys(lname);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/div/input")
	@CacheLookup
	WebElement form1editssn;

	public void form1editssn(String ssn)
	{
		form1editssn.clear();
		form1editssn.sendKeys(ssn);

	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/div/input")
	@CacheLookup
	WebElement form1makechanges;

	public void form1makechanges()
	{
		form1makechanges.click();


	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/div/input")
	@CacheLookup
	WebElement form1savebtnclick;

	public void form1savebtnclick()
	{
		form1savebtnclick.click();


	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div/ul/li[6]/a/span")
	@CacheLookup
	WebElement Appttype1;

	public void Appttype1()
	{
		Appttype1.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr/td[8]/div/button")
	@CacheLookup
	WebElement form1threedotclick;

	public void form1threedotclick()
	{
		form1threedotclick.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr/td[8]/div/ul/li[2]")
	@CacheLookup
	WebElement form1clkformlink;

	public void form1clkformlink()
	{
		form1clkformlink.click();

	}


	
	
//-------------------------------END DATE 21-12-2022---------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"btn-append-to-single-button\"]")

	@CacheLookup
	WebElement clipflagbtnclk;
	public void clipflagbtnclk()
	{
		clipflagbtnclk.click();
		

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"patientFlags\"]/div/div[2]/ul/li[1]/a/span")

	@CacheLookup
	WebElement clipflagoption;
	public void clipflagoption()
	{
		clipflagoption.click();
		

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seeing-dropdown\"]")

	@CacheLookup
	WebElement clipseeing;
	public void clipseeing()
	{
		clipseeing.click();
		

	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/ul/li[4]/a/span")

	@CacheLookup
	WebElement clipseeingoption;
	public void clipseeingoption()
	{
		clipseeingoption.click();
		

	}
	@FindBy(how=How.XPATH,using="//*[@id=\"reason\"]")

	@CacheLookup
	WebElement clipvisittitle;
	public void clipvisittitle(String s)
	{
		clipvisittitle.click();
		clipvisittitle.clear();
		clipvisittitle.sendKeys(s);
		

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"copay\"]")

	@CacheLookup
	WebElement copaytitle;
	public void copaytitle(String s)
	{
		copaytitle.click();
		copaytitle.clear();
		copaytitle.sendKeys(s);
		

	}
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/button[1]")

	@CacheLookup
	WebElement cliplinkconnectaccount;
	public void cliplinkconnectaccount()
	{
		cliplinkconnectaccount.click();
		
    }

	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/button")

	@CacheLookup
	WebElement clipaddpatient;
	public void clipaddpatient()
	{
		clipaddpatient.click();
		
    }
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/button")

	@CacheLookup
	WebElement clipcheckin;
	public void clipcheckin()
	{
		clipcheckin.click();
		
    }
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/check-in-modal/div[3]/button")

	@CacheLookup
	WebElement clipcheckinconf;
	public void clipcheckinconf()
	{
		clipcheckinconf.click();
		
    }
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Appointments')]")

	@CacheLookup
	WebElement clkappointmentlink;
	public void clkappointmentlink()
	{
		clkappointmentlink.click();
		

	}
	/////////////---------imesnojay@imenso.com--------//////////////
	@FindBy(how=How.XPATH,using="//*[@id=\"nameLast\"]")

	@CacheLookup
	WebElement cliplastname1;
	public void cliplastname1(String s)
	{
		cliplastname1.click();
		cliplastname1.clear();
		cliplastname1.sendKeys(s);

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"firstName\"]")
    @CacheLookup
	WebElement clipfirstname1;
	public void clipfirstname1(String s)
	{
		clipfirstname1.click();
		clipfirstname1.clear();
		clipfirstname1.sendKeys(s);
    }
	
	@FindBy(how=How.XPATH,using="//*[@id=\"firstName\"]")
    @CacheLookup
	WebElement clipfirstnametest1;
	public void clipfirstnametest1(String s)
	{
		clipfirstnametest1.click();
		clipfirstnametest1.clear();
		clipfirstnametest1.sendKeys(s);
		clipfirstnametest1.clear();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[2]/div[4]/div/date-picker/div/input")
	@CacheLookup
	WebElement clipdateofbirth11;
	public void clipdateofbirth11(String s)
	{
		clipdateofbirth11.click();
		clipdateofbirth11.clear();
		clipdateofbirth11.sendKeys(s);

	}
	@FindBy(how=How.XPATH,using="//*[@id=\"phoneNumber\"]")
	@CacheLookup
	WebElement clipphone1;
	public void clipphone1(String s)
	{
		clipphone1.click();
		clipphone1.clear();
		clipphone1.sendKeys(s);

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]")
	@CacheLookup
	WebElement clipemail1;
	public void clipemail1(String s)
	{
		clipemail1.click();
		clipemail1.clear();
		clipemail1.sendKeys(s);

	}
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[2]/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement clipappointment1;
	public void clipappointment1(String s)
	{
		clipappointment1.click();
		clipappointment1.clear();
		clipappointment1.sendKeys(s);

	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"location-dropdown\"]")
	@CacheLookup
	WebElement clipdeptmillenia1;
	public void clipdeptmillenia1()
	{
		clipdeptmillenia1.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[3]/div/div/ul/li/a/span")
	@CacheLookup
	WebElement clipdeptmilleniaoption1;
	public void clipdeptmilleniaoption1()
	{
		clipdeptmilleniaoption1.click();
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"seeing-dropdown\"]")
	@CacheLookup
	WebElement clipseeing1;
	public void clipseeing1()
	{
		clipseeing1.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/ul/li[1]/a/span")
	@CacheLookup
	WebElement clipseeingoption1;
	public void clipseeingoption1()
	{
		clipseeingoption1.click();
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"btn-append-to-single-button\"]/span")
	@CacheLookup
	WebElement clipflag1;
	public void clipflag1()
	{
		clipflag1.click();
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"patientFlags\"]/div/div[2]/ul/li[1]/a/span")
	@CacheLookup
	WebElement clipflagoption1;
	public void clipflagoption1()
	{
		clipflagoption1.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"type-dropdown\"]")
	@CacheLookup
	WebElement clipdaydemoappointment1;
	public void clipdaydemoappointment1()
	{
		clipdaydemoappointment1.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[7]/div/div/ul/li[2]/a/span")
	@CacheLookup
	WebElement clipdaydemoappointmentoption1;
	public void clipdaydemoappointmentoption1()
	{
		clipdaydemoappointmentoption1.click();		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"copay\"]")
	@CacheLookup
	WebElement clipcopay1;
	public void clipcopay1(String s)
	{
		clipcopay1.click();	
		clipcopay1.clear();
		clipcopay1.sendKeys(s);
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/button[1]")
	@CacheLookup
	WebElement cliplinkconnectaccount1;
	public void cliplinkconnectaccount1()
	{
		cliplinkconnectaccount1.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/button")
	@CacheLookup
	WebElement clipaddpatient1;
	public void clipaddpatient1()
	{
		clipaddpatient1.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[5]/div/button")
	@CacheLookup
	WebElement clipcheckin1;
	public void clipcheckin1()
	{
		clipcheckin1.click();	
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/div[1]/div/div/check-in-modal/div[3]/button")
	@CacheLookup
	WebElement clipcheckinok1;
	public void clipcheckinok1()
	{
		clipcheckinok1.click();	
		
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Appointments')]")
	@CacheLookup
	WebElement clipappointmentlink1;
	public void clipappointmentlink1()
	{
		clipappointmentlink1.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"single-button\"]")
	@CacheLookup
	WebElement appointmentthreedots;
	public void appointmentthreedots()
	{
		appointmentthreedots.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[1]/td[6]/div/ul/li[2]/a")
	@CacheLookup
	WebElement appointmentforms;
	public void appointmentforms()
	{
		appointmentforms.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"single-button\"]")
	@CacheLookup
	WebElement appthreedotsclk;
	public void appthreedotsclk()
	{
		appthreedotsclk.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr/td[23]/div/ul/li[2]")
	@CacheLookup
	WebElement apptointmentformsclk;
	public void apptointmentformsclk()
	{
		apptointmentformsclk.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[1]/a/span")
	@CacheLookup
	WebElement intakedemoform1;
	public void intakedemoform1()
	{
		intakedemoform1.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"checkbox_5\"]")
	@CacheLookup
	WebElement electronicrecordchkbox;
	public void electronicrecordchkbox()
	{
		electronicrecordchkbox.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/div/div/div[2]")
	@CacheLookup
	WebElement digitalsignature;
	public void digitalsignature()
	{
		//WebElement element = ldriver.findElement(By.xpath("xpath of canvas"));

	    Actions builder = new Actions(ldriver);
	     builder.moveToElement(digitalsignature,135,15) //start points x axis and y axis. 
	              .click()
	              .moveByOffset(200, 60) // 2nd points (x1,y1)
	              .click()
	              .moveByOffset(100, 70)// 3rd points (x2,y2)
	              .doubleClick()
	              .build();
	     builder.perform();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/appointments/section/div[2]/div/table/tbody/tr[1]/td[9]/div/ul/li[2]")
	@CacheLookup
	WebElement appointmentformslinkclk;
	public void appointmentformslinkclk()
	{
		appointmentformslinkclk.click();	
		
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[1]/a/span")
	@CacheLookup
	WebElement covidscreeningformsclk;
	public void covidscreeningformsclk()
	{
		covidscreeningformsclk.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/button")
	@CacheLookup
	WebElement clkprintoption;
	public void clkprintoption()
	{
		clkprintoption.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[3]/div/div/button")
	@CacheLookup
	WebElement nextnodedropdown;
	public void nextnodedropdown()
	{
		nextnodedropdown.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[3]/div/div/ul/li/a/span")
	@CacheLookup
	WebElement nextnodedropdownoption;
	public void nextnodedropdownoption()
	{
		nextnodedropdownoption.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/button")
	@CacheLookup
	WebElement seeingoption1;
	public void seeingoption1()
	{
		seeingoption1.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/ul/li[1]/a/span")
	@CacheLookup
	WebElement seeingoptionselect1;
	public void seeingoptionselect1()
	{
		seeingoptionselect1.click();	
		
	}
	///////---------////////////
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement covid19symptomsradio;
	public void covid19symptomsradio()
	{
		covid19symptomsradio.click();	
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div[1]/div/select")
	@CacheLookup
	WebElement leftcountry1;
	public void leftcountry1()
	{
		leftcountry1.click();
		Select drpdown = new Select(leftcountry1);
		drpdown.selectByIndex(0);
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/select/option[4]")
	@CacheLookup
	WebElement leftcountryselect1;
	public void leftcountryselect1()
	{
		leftcountryselect1.click();
		//Select drpdown = new Select(leftcountry1);
		//drpdown.selectByVisibleText("Never");
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement difficultybreathing;
	public void difficultybreathing()
	{
		difficultybreathing.click();
		
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement havecranberry;
	public void havecranberry()
	{
		havecranberry.click();
		
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div[1]/div/select")
	@CacheLookup
	WebElement dohavecovid;
	public void dohavecovid()
	{
		dohavecovid.click();
		//Select dropdown = new Select(dohavecovid);
		//dropdown.selectByIndex(1);
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/select/option[3]")
	@CacheLookup
	WebElement dohavecovidselect;
	public void dohavecovidselect()
	{
		dohavecovidselect.click();
		//Select dropdown = new Select(dohavecovid);
		//dropdown.selectByIndex(1);
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class=\"image-uploader well well-sm ng-scope\" ]//label[@for=\"file-3\"]")
	@CacheLookup
	WebElement choosefile1;
	
	public void choosefile1() throws AWTException, InterruptedException
	{
		
		
		choosefile1.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Desktop\\deep.png");
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
	
	
	@FindBy(how=How.XPATH,using="//div[@class=\"image-uploader well well-sm ng-scope\" ]//label[@for=\"file-4\"]")
	@CacheLookup
	WebElement choosefile2;
	public void choosefile2() throws AWTException, InterruptedException
	{
		
		
		choosefile2.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Desktop\\deep.png");
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
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
	@CacheLookup
	WebElement saveformclk1;
	public void saveformclk1()
	{
		saveformclk1.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default hidden-print']")
    @CacheLookup
    WebElement printbutton1;
    
    public void printbutton1()
    {
    	printbutton1.click();
    }
	/////Digital signature implementation////
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[2]/a/span")
    @CacheLookup
    WebElement mrisafetyform;
    
    public void mrisafetyform()
    {
    	mrisafetyform.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/div/div[1]/label/input")
    @CacheLookup
    WebElement doyouvapefield;
    
    public void doyouvapefield()
    {
    	doyouvapefield.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[1]/label/input")
    @CacheLookup
    WebElement areyoumriready;
    
    public void areyoumriready()
    {
    	areyoumriready.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/div/div[1]/label/input")
    @CacheLookup
    WebElement selectconditions;
    
    public void selectconditions()
    {
    	selectconditions.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div[1]/div/div/div/div[1]/label/input")
    @CacheLookup
    WebElement patientsignaturechkbox;
    
    public void patientsignaturechkbox()
    {
    	patientsignaturechkbox.click();
    }
    
    @FindBy(how=How.XPATH,using="//canvas[@class='signature-canvas' and @id='canvas_5']")
    @CacheLookup
    WebElement MRI_signatureConsent_sign1;

    public void MRI_signatureConsent_sign1()
    {
        Actions builder = new Actions(ldriver);
         builder.contextClick(MRI_signatureConsent_sign1)                      
                .clickAndHold()
                .moveToElement(MRI_signatureConsent_sign1,20,-50)
                .moveByOffset(50, 50)
                .moveByOffset(80,-50)
                .moveByOffset(100,50)
                .release(MRI_signatureConsent_sign1)
                 .build();                       
         builder.perform();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[3]/a/span")
    @CacheLookup
    WebElement rbcreportformclk;
    
    public void rbcreportformclk()
    {
    	rbcreportformclk.click();
    }

    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/div/button")
    @CacheLookup
    WebElement makechanges;
    
    public void makechanges()
    {
    	makechanges.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/div/div/div/a[2]")
    @CacheLookup
    WebElement removeimages1;
    
    public void removeimages1()
    {
    	removeimages1.click();
    }

    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/div/div/div/a[2]")
    @CacheLookup
    WebElement removeimages2;
    
    public void removeimages2()
    {
    	removeimages2.click();
    }

    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[4]/a/span")
    @CacheLookup
    WebElement patientdemographicform;
    
    public void patientdemographicform()
    {
    	patientdemographicform.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div[1]/div/input")
    @CacheLookup
    WebElement firstnamepatient;
    
    public void firstnamepatient(String ss)
    {
    	firstnamepatient.clear();
    	firstnamepatient.sendKeys(ss);
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/input")
    @CacheLookup
    WebElement lastnamepatient;
    
    public void lastnamepatient(String ss)
    {
    	lastnamepatient.clear();
    	lastnamepatient.sendKeys(ss);
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div[1]/div/input")
    @CacheLookup
    WebElement middlenamepatient;
    
    public void middlenamepatient(String ss)
    {
    	middlenamepatient.clear();
    	middlenamepatient.sendKeys(ss);
    }
    
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/div/input")
    @CacheLookup
    WebElement dateselectpatient;
    
    public void dateselectpatient(String rr)
    {
    	dateselectpatient.click();
    	dateselectpatient.sendKeys(rr);
    	
    }
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
    @CacheLookup
    WebElement formsavedemographic;
    
    public void formsavedemographic()
    {
    	formsavedemographic.click();
    	
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/div/button")
    @CacheLookup
    WebElement editmakechanges;
    
    public void editmakechanges()
    {
    	editmakechanges.click();
    	
    }
    @FindBy(how=How.XPATH,using="//*[@id=\"formly_4_firstName_0_0\"]")
    @CacheLookup
    WebElement firstnamepatient1;
    
    public void firstnamepatient1(String ss)
    {
    	firstnamepatient1.clear();
    	firstnamepatient1.sendKeys(ss);
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"formly_4_firstName_1_1\"]")
    @CacheLookup
    WebElement lastnamepatient1;
    
    public void lastnamepatient1(String ss)
    {
    	lastnamepatient1.clear();
    	lastnamepatient1.sendKeys(ss);
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
    @CacheLookup
    WebElement formsavedemographic1;
    
    public void formsavedemographic1()
    {
    	formsavedemographic1.click();
    	
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/button[1]")
    @CacheLookup
    WebElement clklockdocumentmodel;
    
    public void clklockdocumentmodel()
    {
    	clklockdocumentmodel.click();
    	
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[1]/a/span")
    @CacheLookup
    WebElement partiendemograpicform1;
    
    public void partiendemograpicform1()
    {
    	partiendemograpicform1.click();
    	
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"formly_2_firstName_0_0\"]")
    @CacheLookup
    WebElement firstnamepatient2;
    
    public void firstnamepatient2(String ss)
    {
    	firstnamepatient2.clear();
    	firstnamepatient2.sendKeys(ss);
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"formly_2_firstName_1_1\"]")
    @CacheLookup
    WebElement lastnamepatient2;
    
    public void lastnamepatient2(String ss)
    {
    	lastnamepatient2.clear();
    	lastnamepatient2.sendKeys(ss);
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"formly_2_input_2_2\"]")
    @CacheLookup
    WebElement middlenamepatient2;
    
    public void middlenamepatient2(String ss)
    {
    	middlenamepatient2.clear();
    	middlenamepatient2.sendKeys(ss);
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"formly_2_date_3_3\"]")
    @CacheLookup
    WebElement dateselectpatient2;
    
    public void dateselectpatient2(String rr)
    {
    	dateselectpatient2.click();
    	dateselectpatient2.sendKeys(rr);
    	
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"lockedDocumentsViewer\"]/main/div[1]/locked-documents-viewer/documents-header/div/i")
    @CacheLookup
    WebElement clicklockicon;
    
    public void clicklockicon()
    {
    	clicklockicon.click();    
    	
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/re-auth-modal/form/div[1]/div/div/input")
    @CacheLookup
    WebElement enterpassword;
    
    public void enterpassword(String ss)
    {
    	enterpassword.sendKeys(ss);   
    	
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/re-auth-modal/form/div[2]/button[2]")
    @CacheLookup
    WebElement submitbutton1;
    
    public void submitbutton1()
    {
    	submitbutton1.click(); 
    	
    }
   
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[6]/div/div/input")
    @CacheLookup
    WebElement clipcomment;
    
    public void clipcomment(String ss)
    {
    
    	clipcomment.sendKeys(ss);
    	
    }
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[2]/a/span")
    @CacheLookup
    WebElement cliprbcreport1;
    
    public void cliprbcreport1()
    {
    
    	cliprbcreport1.click();
    	
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[3]/a/span")
    @CacheLookup
    WebElement clipmrisaftyform;
    
    public void clipmrisaftyform()
    {
    
    	clipmrisaftyform.click();
    	
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/div/div[2]/label/input")
    @CacheLookup
    WebElement covidsymptomsno;
    
    public void covidsymptomsno()
    {
    
    	covidsymptomsno.click();
    	
    }
  //-------------------------------------------------24-12-2022-----------------------------------------------------------------------------------------------  
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[2]/div/div[2]/date-picker/div/input")
    @CacheLookup
    WebElement Clip_Appointment_Date;
    
    public void Clip_Appointment_Date(String d)
    {
    	
    	Clip_Appointment_Date.sendKeys(d);
    }
    
  
}
	
	
	
	
	
	
	
	
	
	
	 
	 
