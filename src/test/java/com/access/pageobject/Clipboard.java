package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	@FindBy(how=How.LINK_TEXT,using="Clipboard")
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
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Admin')]")
	@CacheLookup
	WebElement flagselect;

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
	
	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/main/div[1]/clipboard1/div[1]/div/form/div[2]/div[3]/div/date-picker/div/input")
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
	
}