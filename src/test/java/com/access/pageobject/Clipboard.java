package com.access.pageobject;

import java.awt.Desktop.Action;

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
	
	@FindBy(how = How.XPATH, using ="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[2]/div[1]/div/div/input")
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
	
	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/date-picker[1]/div[1]/input[1]")
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
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Yes')]")
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
		ConfirmUndoCheckIn.click();
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
	 
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/button")
	 @CacheLookup
	 WebElement Clip_Appointment_Type;
	 
	 public void Clip_Appointment_Type()
	 {
		 Clip_Appointment_Type.click();
	 }
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/ul/li[2]/a")
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
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/clipboard1/div[1]/div/form/div[3]/div[4]/div/div/ul/li[2]/a")
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	 
}