package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Departments 

{


	WebDriver ldriver;
	public Departments(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}

	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[6]/a")
	@CacheLookup
	WebElement departmentlink;

	public void departmentlink()
	{

		departmentlink.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departmentSelector\"]")
	@CacheLookup
	WebElement selectdepartment;

	public void selectdepartment()
	{
		selectdepartment.click();
		//selectdepartment.sendKeys(dept);
		//selectdepartment.sendKeys(Keys.ENTER);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/header/div[1]/ul/li[2]/a/span")
	@CacheLookup
	WebElement selectdepartmentnew;

	public void selectdepartmentnew()
	{

		selectdepartmentnew.click();
		//selectdepartmentnew.sendKeys(Keys.ENTER);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"name\"]")
	@CacheLookup
	WebElement deptname;

	public void deptname(String dname)
	{

		deptname.clear();
		deptname.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"shortName\"]")
	@CacheLookup
	WebElement deptshortname;

	public void deptshortname(String dname)
	{

		deptshortname.clear();
		deptshortname.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"phoneNumber\"]")
	@CacheLookup
	WebElement phonenumber;

	public void phonenumber(String dname)
	{

		phonenumber.clear();
		phonenumber.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"streetLine1\"]")
	@CacheLookup
	WebElement streetaddress;

	public void streetaddress(String dname)
	{

		streetaddress.clear();
		streetaddress.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"streetLine2\"]")
	@CacheLookup
	WebElement streetaddresssec;

	public void streetaddresssec(String dname)
	{
		streetaddresssec.clear();

		streetaddresssec.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"city\"]")
	@CacheLookup
	WebElement city;

	public void city(String dname)
	{

		city.clear();
		city.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"state\"]")
	@CacheLookup
	WebElement state;

	public void state(String dname)
	{

		state.clear();
		state.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"zipcode\"]")
	@CacheLookup
	WebElement zipcode;

	public void zipcode(String dname)
	{

		zipcode.clear();
		zipcode.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[1]/article/a")
	@CacheLookup
	WebElement addhoursmonday;

	public void addhoursmonday()
	{


		addhoursmonday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[1]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement fromhourmonday;

	public void fromhourmonday(String monfromhours)
	{
		fromhourmonday.click();
		fromhourmonday.clear();
		fromhourmonday.sendKeys(monfromhours);


	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[1]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement tohourmonday;

	public void tohourmonday(String montohours)
	{
		tohourmonday.click();
		tohourmonday.clear();
		tohourmonday.sendKeys(montohours);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[2]/article/a")
	@CacheLookup
	WebElement addhourstuesday;

	public void addhourstuesday()
	{


		addhourstuesday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[2]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement fromhourtuesday;

	public void fromhourtuesday(String tuesfromhours)
	{
		fromhourtuesday.click();
		fromhourtuesday.clear();
		fromhourtuesday.sendKeys(tuesfromhours);


	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[2]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement tohourtuesday;

	public void tohourtuesday(String tuestohours)
	{
		tohourtuesday.click();
		tohourtuesday.clear();
		tohourtuesday.sendKeys(tuestohours);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[3]/article/a")
	@CacheLookup
	WebElement addhourswednesday;

	public void addhourswednesday()
	{


		addhourswednesday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[3]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement fromhourwednesday;

	public void fromhourwednesday(String wedfromhours)
	{
		fromhourwednesday.click();
		fromhourwednesday.clear();
		fromhourwednesday.sendKeys(wedfromhours);


	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[3]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement tohourwednesday;

	public void tohourwednesday(String wedtohours)
	{
		tohourwednesday.click();
		tohourwednesday.clear();
		tohourwednesday.sendKeys(wedtohours);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[4]/article/a")
	@CacheLookup
	WebElement addhoursthursday;

	public void addhoursthursday()
	{


		addhoursthursday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[4]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement fromhourthursday;

	public void fromhourthursday(String thrusfromhours)
	{
		fromhourthursday.click();
		fromhourthursday.clear();
		fromhourthursday.sendKeys(thrusfromhours);


	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[4]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement tohourthursday;

	public void tohourthursday(String thurstohours)
	{
		tohourthursday.click();
		tohourthursday.clear();
		tohourthursday.sendKeys(thurstohours);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[5]/article/a")
	@CacheLookup
	WebElement addhoursfriday;

	public void addhoursfriday()
	{


		addhoursfriday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[5]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement fromhourfriday;

	public void fromhourfriday(String fridayfromhours)
	{
		fromhourfriday.click();
		fromhourfriday.clear();
		fromhourfriday.sendKeys(fridayfromhours);


	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[5]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement tohourfriday;

	public void tohourfriday(String fridaytohours)
	{
		tohourfriday.click();
		tohourfriday.clear();
		tohourfriday.sendKeys(fridaytohours);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[6]/article/a")
	@CacheLookup
	WebElement addhourssaturday;

	public void addhourssaturday()
	{


		addhourssaturday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[6]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement fromhoursaturday;

	public void fromhoursaturday(String saturdayfromhours)
	{
		fromhoursaturday.click();
		fromhoursaturday.clear();
		fromhoursaturday.sendKeys(saturdayfromhours);


	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[6]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement tohoursaturday;

	public void tohoursaturday(String saturdaytohours)
	{
		tohoursaturday.click();
		tohoursaturday.clear();
		tohoursaturday.sendKeys(saturdaytohours);

	}


	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[7]/article/a")
	@CacheLookup
	WebElement addhourssunday;

	public void addhourssunday()
	{


		addhourssunday.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[7]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement fromhoursunday;

	public void fromhoursunday(String sundayfromhours)
	{
		fromhoursunday.click();
		fromhoursunday.clear();
		fromhoursunday.sendKeys(sundayfromhours);


	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[7]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement tohoursunday;

	public void tohoursunday(String sundaytohours)
	{
		tohoursunday.click();
		tohoursunday.clear();
		tohoursunday.sendKeys(sundaytohours);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[1]/div/div[1]/div[1]/label/input")
	@CacheLookup
	WebElement userlocation;

	public void userlocation()
	{

		userlocation.click();	
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[1]/div/div[1]/div[2]/label/input")
	@CacheLookup
	WebElement locationinput;

	public void locationinput()
	{

		locationinput.click();	
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[1]/div/div[2]/div[2]/label/input")
	@CacheLookup
	WebElement radiorestrictedtext;

	public void radiorestrictedtext()
	{

		radiorestrictedtext.click();	
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/div[2]/div[1]/div/div[3]/div/table/tbody/tr[1]/td[2]/button/span")
	@CacheLookup
	WebElement deletelocation;

	public void deletelocation()
	{

		deletelocation.click();	
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[1]/div/div[3]/div/table/tfoot/tr/td[2]/button/span")
	@CacheLookup
	WebElement addlocation;

	public void addlocation()
	{

		addlocation.click();	
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[1]/div/div[3]/div/table/tfoot/tr/td[1]/input")
	@CacheLookup  
	WebElement addnewlocation;

	public void addnewlocation(String location)
	{

		addnewlocation.sendKeys(location);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[2]/div[1]/div/button")
	@CacheLookup  
	WebElement siteadmin;

	public void siteadmin()
	{

		siteadmin.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[2]/div[1]/div/ul/li[1]/a")
	@CacheLookup  
	WebElement checkall;

	public void checkall()
	{

		checkall.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[2]/div[2]/div/button")  
	//*[@id="dept-details"]/form/div[2]/div[2]/div[2]/div/button
	@CacheLookup  
	WebElement appointmenttype;

	//button[contains(text(),'No Default Appointment Type')]
	public void appointmenttype()
	{

		appointmenttype.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[2]/div[2]/div/ul/li[2]/a")
	@CacheLookup  
	WebElement appointmenttypevisit;
	//*[@id="dept-details"]/form/div[2]/div[2]/div[2]/div/ul/li[2]/a
	//a[text()=\"Primary Care Provider\"]
	public void appointmenttypevisit()
	{


		appointmenttypevisit.click();

	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'No Self Pay Form Selected')]")
	@CacheLookup  
	WebElement selfpayform;

	public void selfpayform()
	{


		selfpayform.click();

	}

	@FindBy(how=How.XPATH,using="//a[text()=\"COVID Screening Form\"]")
	@CacheLookup  
	WebElement selfpayformtype;

	public void selfpayformtype()
	{


		selfpayformtype.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[2]/div[2]/div[4]/button")
	@CacheLookup  
	WebElement changefilter;

	public void changefilter()
	{


		changefilter.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/forms-on-demand-filter/div[2]/div[2]/label/input")
	@CacheLookup  
	WebElement changefilterselect;

	public void changefilterselect()
	{


		changefilterselect.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/forms-on-demand-filter/div[3]/button")
	@CacheLookup  
	WebElement changefilterclose;

	public void changefilterclose()
	{


		changefilterclose.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"deptDirections\"]")
	@CacheLookup  
	WebElement departmentdirection;

	public void departmentdirection(String dept)
	{


		departmentdirection.sendKeys(dept);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/div[4]/div[1]/image-uploader/div[2]/input")
	@CacheLookup  
	WebElement selectimage;

	public void selectimage()
	{


		WebElement upload_file = ldriver.findElement(By.xpath("//*[@id=\"dept-details\"]/form/div[4]/div[1]/image-uploader/div[2]/input"));

		upload_file.sendKeys("C:\\Users\\ATM\\Desktop\\deep.jpg");

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/div/button[2]")
	@CacheLookup  
	WebElement savedepartment;

	public void savedepartment()
	{


		savedepartment.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/div/button[1]")
	@CacheLookup  
	WebElement canceldepartment;

	public void canceldepartment()
	{


		canceldepartment.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[2]/div")
	@CacheLookup  
	WebElement savedetailmsg;

	public void savedetailmsg()
	{


		savedetailmsg.getText();
		System.out.println(savedetailmsg.getText());

	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Appointment Types')]")
	@CacheLookup  
	WebElement appointmentlink;

	public void appointmentlink()
	{


		appointmentlink.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/appointment-types/section/div[1]/div[2]/button/span")
	@CacheLookup  
	WebElement Addappointment;

	public void Addappointment()
	{


		Addappointment.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/from-organization/div[1]/h3")
	@CacheLookup  
	WebElement checkAddappointment;

	public void checkAddappointment()
	{


		checkAddappointment.getText();
		System.out.println(checkAddappointment.getText());
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/from-organization/div[2]/div/form/div/select")
	@CacheLookup  
	WebElement Selectappointment;

	public void Selectappointment()
	{


		Selectappointment.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/from-organization/div[2]/div/form/div/select")
	@CacheLookup  
	WebElement Selectappointmenttype;

	public void Selectappointmenttype(String appt)
	{


		Selectappointmenttype.sendKeys(appt);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/from-organization/div[3]/button[2]")
	@CacheLookup  
	WebElement createappointment;

	public void createappointment()
	{


		createappointment.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[2]/div")
	@CacheLookup  
	WebElement addappointmentalertmsg;

	public void addappointmentalertmsg()
	{


		addappointmentalertmsg.getText();
		System.out.println(addappointmentalertmsg.getText());

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/appointment-types/section/div[2]/div/table/tbody/tr[1]/td[4]/button/span")
	@CacheLookup  
	WebElement editappointment;

	public void editappointment()
	{


		editappointment.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/appointment-types/appointment-type-viewer/section/form/div[4]/div/button")
	@CacheLookup  
	WebElement removeappointment;

	public void removeappointment()
	{


		removeappointment.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/confirm/div[3]/button[2]")
	@CacheLookup  
	WebElement removeappointmentconf;

	public void removeappointmentconf()
	{


		removeappointmentconf.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[2]/div/span")
	@CacheLookup  
	WebElement removeappointmentalrtmsg;

	public void removeappointmentalrtmsg()
	{


		removeappointmentalrtmsg.getText();
		System.out.println(removeappointmentalrtmsg.getText());

	}


	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/appointment-types/appointment-type-viewer/section/div/div/a")
	@CacheLookup  
	WebElement backtoappointment;

	public void backtoappointment()
	{


		backtoappointment.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/appointment-types/section/div[1]/div[1]/h2")
	@CacheLookup  
	WebElement checkbacktoappointment;

	public void checkbacktoappointment()
	{


		checkbacktoappointment.getText();
		System.out.println(checkbacktoappointment.getText());


	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/from-organization/div[3]/button[1]")
	@CacheLookup  
	WebElement appointmentcancel;

	public void appointmentcancel()
	{


		appointmentcancel.click();

	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Clipboard')]")
	@CacheLookup  
	WebElement clipboardlink;

	public void clipboardlink()
	{


		clipboardlink.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"SMS\"]")
	@CacheLookup  
	WebElement unchecksmschkbox;

	public void unchecksmschkbox()
	{


		unchecksmschkbox.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[7]/a[3]")
	@CacheLookup  
	WebElement savebtnclk;

	public void savebtnclk()
	{


		savebtnclk.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/navbar/header/div/div/div[2]/ul[2]/li/a")
	@CacheLookup  
	WebElement adminprofileclk;

	public void adminprofileclk()
	{


		adminprofileclk.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/navbar/header/div/div/div[2]/ul[2]/li/ul/section[3]/li/a")
	@CacheLookup  
	WebElement returntoaccess;

	public void returntoaccess()
	{


		returntoaccess.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"EMAIL\"]")
	@CacheLookup  
	WebElement unchkemailchkbox;

	public void unchkemailchkbox()
	{


		unchkemailchkbox.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[3]/label/input")
	@CacheLookup  
	WebElement checksmschkbox;

	public void checksmschkbox()
	{


		checksmschkbox.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[5]/label/input")
	@CacheLookup  
	WebElement chkemailchkbox;

	public void chkemailchkbox()
	{


		chkemailchkbox.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"VOICE\"]")
	@CacheLookup  
	WebElement unchkvoicechkbox;

	public void unchkvoicechkbox()
	{


		unchkvoicechkbox.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[4]/label/input")
	@CacheLookup  
	WebElement chkvoicechkbox;

	public void chkvoicechkbox()
	{


		chkvoicechkbox.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"PRINT\"]")
	@CacheLookup  
	WebElement unchkaccesspasschkbox;

	public void unchkaccesspasschkbox()
	{


		unchkaccesspasschkbox.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[6]/label/input")
	@CacheLookup  
	WebElement chkaccesspasschkbox;

	public void chkaccesspasschkbox()
	{


		chkaccesspasschkbox.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"COMBINE\"]")
	@CacheLookup  
	WebElement unchkcheckinbtn;

	public void unchkcheckinbtn()
	{


		unchkcheckinbtn.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"COMBINE\"]")
	@CacheLookup  
	WebElement chkcheckinbtn;

	public void chkcheckinbtn()
	{


		chkcheckinbtn.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[2]/header/a[2]")
	@CacheLookup  
	WebElement downarrowfirstname;

	public void downarrowfirstname()
	{


		downarrowfirstname.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[3]/header/a[2]")
	@CacheLookup  
	WebElement uparrowfirstname;

	public void uparrowfirstname()
	{


		uparrowfirstname.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/a")
	@CacheLookup  
	WebElement clkaddmorebtn;

	public void clkaddmorebtn()
	{


		clkaddmorebtn.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/header/a[1]")
	@CacheLookup  
	WebElement clipboardclosebtn;

	public void clipboardclosebtn()
	{


		clipboardclosebtn.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement setdateofbirth;
	public void setdateofbirth()
	{

		Select drpdown = new Select(setdateofbirth);
		drpdown.selectByIndex(3);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement dobfieldsize;
	public void dobfieldsize()
	{

		Select drpdown = new Select(dobfieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement dobfieldtitle;
	public void dobfieldtitle(String title)
	{

		dobfieldtitle.clear();

		dobfieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement dobplaceholder;
	public void dobplaceholder(String dob)
	{

		dobplaceholder.clear();

		dobplaceholder.sendKeys(dob);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement dobrequired;
	public void dobrequired()
	{

		dobrequired.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement setcellnumber;
	public void setcellnumber()
	{

		Select drpdown = new Select(setcellnumber);
		drpdown.selectByIndex(4);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement cellnumfieldsize;
	public void cellnumfieldsize()
	{

		Select drpdown = new Select(cellnumfieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement cellnumfieldtitle;
	public void cellnumfieldtitle(String title)
	{

		cellnumfieldtitle.clear();
		cellnumfieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement cellplaceholder;
	public void cellplaceholder(String title)
	{

		cellplaceholder.clear();
		cellplaceholder.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement cellrequired;
	public void cellrequired()
	{

		cellrequired.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement additionalphonenumber;
	public void additionalphonenumber()
	{

		Select drpdown = new Select(additionalphonenumber);
		drpdown.selectByIndex(5);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement additionalfieldsize;
	public void additionalfieldsize()
	{

		Select drpdown = new Select(additionalfieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement additionalfieldtitle;
	public void additionalfieldtitle(String title)
	{

		additionalfieldtitle.clear();
		additionalfieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement additionalplacholder;
	public void additionalplacholder(String title)
	{

		additionalplacholder.clear();
		additionalplacholder.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement additionalrequired;
	public void additionalrequired()
	{

		additionalrequired.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement email;
	public void email()
	{

		Select drpdown = new Select(email);
		drpdown.selectByIndex(6);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement emailfieldsize;
	public void emailfieldsize()
	{

		Select drpdown = new Select(emailfieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement emailfieldtitle;
	public void emailfieldtitle(String title)
	{

		emailfieldtitle.clear();
		emailfieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement emailplacholder;
	public void emailplacholder(String title)
	{

		emailplacholder.clear();
		emailplacholder.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement emailrequired;
	public void emailrequired()
	{

		emailrequired.click();

	}


	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement gender;
	public void gender()
	{

		Select drpdown = new Select(gender);
		drpdown.selectByIndex(7);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement genderfieldsize;
	public void genderfieldsize()
	{

		Select drpdown = new Select(genderfieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement genderfieldtitle;
	public void genderfieldtitle(String title)
	{

		genderfieldtitle.clear();
		genderfieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement genderplacholder;
	public void genderplacholder(String title)
	{

		genderplacholder.clear();
		genderplacholder.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement genderrequired;
	public void genderrequired()
	{

		genderrequired.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement ssn;
	public void ssn()
	{

		Select drpdown = new Select(ssn);
		drpdown.selectByIndex(8);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement ssnfieldsize;
	public void ssnfieldsize()
	{

		Select drpdown = new Select(ssnfieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement ssnfieldtitle;
	public void ssnfieldtitle(String title)
	{

		ssnfieldtitle.clear();
		ssnfieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement ssnplacholder;
	public void ssnplacholder(String title)
	{

		ssnplacholder.clear();
		ssnplacholder.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement ssnrequired;
	public void ssnrequired()
	{

		ssnrequired.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement mrn;
	public void mrn()
	{

		Select drpdown = new Select(mrn);
		drpdown.selectByIndex(9);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement mrnfieldsize;
	public void mrnfieldsize()
	{

		Select drpdown = new Select(mrnfieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement mrnfieldtitle;
	public void mrnfieldtitle(String title)
	{

		mrnfieldtitle.clear();
		mrnfieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement mrnplacholder;
	public void mrnplacholder(String title)
	{

		mrnplacholder.clear();
		mrnplacholder.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement mrnrequired;
	public void mrnrequired()
	{

		mrnrequired.click();

	}


	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement additionalcontactname;
	public void additionalcontactname()
	{

		Select drpdown = new Select(additionalcontactname);
		drpdown.selectByIndex(10);
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
	@CacheLookup  
	WebElement contactnamefieldsize;
	public void contactnamefieldsize()
	{

		Select drpdown = new Select(contactnamefieldsize);
		drpdown.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement contactnamefieldtitle;
	public void contactnamefieldtitle(String title)
	{

		contactnamefieldtitle.clear();
		contactnamefieldtitle.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"placeholderpatient2\"]")
	@CacheLookup  
	WebElement contactnameplacholder;
	public void contactnameplacholder(String title)
	{

		contactnameplacholder.clear();
		contactnameplacholder.sendKeys(title);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredpatient2\"]")
	@CacheLookup  
	WebElement contactnamerequired;
	public void contactnamerequired()
	{

		contactnamerequired.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[7]/a[1]")
	@CacheLookup  
	WebElement setdefaultvalue;
	public void setdefaultvalue()
	{

		setdefaultvalue.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[2]/div/span")
	@CacheLookup  
	WebElement setdefaultvaluemsg;
	public void setdefaultvaluemsg()
	{

		setdefaultvaluemsg.getText();
		System.out.println(setdefaultvaluemsg.getText());


	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[7]/a[2]")
	@CacheLookup  
	WebElement cancelsettings;
	public void cancelsettings()
	{

		cancelsettings.click();


	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[2]/div/span")
	@CacheLookup  
	WebElement cancelsettingsmsg;
	public void cancelsettingsmsg()
	{

		cancelsettingsmsg.getText();
		System.out.println(cancelsettingsmsg.getText());


	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/ul/li[2]/a")
	@CacheLookup  
	WebElement appointmentfieldsclk;
	public void appointmentfieldsclk()
	{

		appointmentfieldsclk.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/a")
	@CacheLookup  
	WebElement addmorebtnsecond;
	public void addmorebtnsecond()
	{

		addmorebtnsecond.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/header/a[2]")
	@CacheLookup  
	WebElement appointmentuparrowbtn;
	public void appointmentuparrowbtn()
	{

		appointmentuparrowbtn.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[7]/a[3]")
	@CacheLookup  
	WebElement clipbappointsave;
	public void clipbappointsave()
	{

		clipbappointsave.click();

	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/header/a[1]")
	@CacheLookup  
	WebElement closebtnchk;
	public void closebtnchk()
	{

		closebtnchk.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement seeing;
	public void seeing()
	{

		Select drpdown = new Select(seeing);
		drpdown.selectByValue("2");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement seeingfieldsize;
	public void seeingfieldsize()
	{

		Select drpdown = new Select(seeingfieldsize);
		drpdown.selectByIndex(1);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement seeingtitle;
	public void seeingtitle(String see)
	{

		seeingtitle.clear();
		seeingtitle.sendKeys(see);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement seeingplaceholder;
	public void seeingplaceholder(String seeplace)
	{

		seeingplaceholder.clear();
		seeingplaceholder.sendKeys(seeplace);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"requiredappointment1\"]")
	@CacheLookup  
	WebElement seeingrequired;
	public void seeingrequired()
	{


		seeingrequired.click();

	}



	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement patientflag;
	public void patientflag()
	{


		Select drpdown = new Select(patientflag);
		drpdown.selectByValue("3");


	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement patientflagfieldsize;
	public void patientflagfieldsize()
	{

		Select drpdown = new Select(patientflagfieldsize);
		drpdown.selectByIndex(3);	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement patientflagttitle;
	public void patientflagttitle(String app)
	{

		patientflagttitle.clear();
		patientflagttitle.sendKeys(app);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement patientflagplaceholder;
	public void patientflagplaceholder(String appplace)
	{

		patientflagplaceholder.clear();
		patientflagplaceholder.sendKeys(appplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[2]/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement patientflagrequired;
	public void patientflagrequired()
	{


		patientflagrequired.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[7]/a[1]")
	@CacheLookup  
	WebElement appsetdefaultval;
	public void appsetdefaultval()
	{


		appsetdefaultval.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/div[7]/a[2]")
	@CacheLookup  
	WebElement appcancelbtn;
	public void appcancelbtn()
	{


		appcancelbtn.click();

	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Dash')]")
	@CacheLookup  
	WebElement clkdashlink;
	public void clkdashlink()
	{


		clkdashlink.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/h2")
	@CacheLookup  
	WebElement validatedashtitle;
	public void validatedashtitle()
	{


		validatedashtitle.getText();
		System.out.println(validatedashtitle.getText());

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[1]/td[1]/div/label/input")
	@CacheLookup  
	WebElement dashcheckinclk;
	public void dashcheckinclk()
	{


		dashcheckinclk.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[1]/td[3]/input")
	@CacheLookup  
	WebElement checkinordvalue;
	public void checkinordvalue(String val1)
	{


		checkinordvalue.clear();
		checkinordvalue.sendKeys(val1);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/dash/div/button[2]")
	@CacheLookup  
	WebElement dashsavebtn;
	public void dashsavebtn()
	{


		dashsavebtn.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"dash\"]/navbar/header/div/div/div[2]/ul[1]/li[1]/a")
	@CacheLookup  
	WebElement userclipboardlink;
	public void userclipboardlink()
	{


		userclipboardlink.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[4]/a")
	@CacheLookup  
	WebElement userdashlink;
	public void userdashlink()
	{


		userdashlink.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dash\"]/main/div[1]/dash1/dash-item[1]/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement checkinviewdetail;
	public void checkinviewdetail()
	{


		checkinviewdetail.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[2]/td[1]/div/label/input")
	@CacheLookup  
	WebElement checkregistration;
	public void checkregistration()
	{


		checkregistration.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[2]/td[3]/input")
	@CacheLookup  
	WebElement registrationorder;
	public void registrationorder( String regorder)
	{


		registrationorder.clear();
		registrationorder.sendKeys(regorder);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dash\"]/main/div[1]/dash1/dash-item[1]/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement registrationviewdtl;
	public void registrationviewdtl()
	{


		registrationviewdtl.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[3]/td[1]/div/label/input")
	@CacheLookup  
	WebElement discharge;
	public void discharge()
	{


		discharge.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[3]/td[3]/input")
	@CacheLookup  
	WebElement dischargeorder;
	public void dischargeorder(String discorder)
	{


		dischargeorder.clear();
		dischargeorder.sendKeys(discorder);
	}
	//*[@id="dash"]/main/div[1]/dash1/dash-item[1]/section/div/section/article[2]/button
	@FindBy(how=How.XPATH,using="//*[@id=\"dash\"]/main/div[1]/dash1/dash-item[1]/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement dischargeviewdtl;
	public void dischargeviewdtl()
	{


		dischargeviewdtl.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[4]/td[1]/div/label/input")
	@CacheLookup  
	WebElement connectcheckin;
	public void connectcheckin()
	{


		connectcheckin.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[4]/td[3]/input")
	@CacheLookup  
	WebElement ordervalue;
	public void ordervalue(String ordval)
	{


		ordervalue.clear();
		ordervalue.sendKeys(ordval);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dash\"]/main/div[1]/dash1/dash-item[2]/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement checkinviewdtl;
	public void checkinviewdtl()
	{


		checkinviewdtl.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[5]/td[1]/div/label/input")
	@CacheLookup  
	WebElement holding;
	public void holding()
	{


		holding.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[5]/td[3]/input")
	@CacheLookup  
	WebElement holdingordervalue;
	public void holdingordervalue(String ordval)
	{


		holdingordervalue.clear();
		holdingordervalue.sendKeys(ordval);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/dash1/dash-item[3]/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement holdingviewdtl;
	public void holdingviewdtl()
	{


		holdingviewdtl.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[7]/td[1]/div/label/input")
	@CacheLookup  
	WebElement parkinglot;
	public void parkinglot()
	{


		parkinglot.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[7]/td[3]/input")
	@CacheLookup  
	WebElement parkinglotordervalue;
	public void parkinglotordervalue(String ordval)
	{


		parkinglotordervalue.clear();
		parkinglotordervalue.sendKeys(ordval);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"dash\"]/main/div[1]/dash1/dash-item[6]/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement parkinglotviewdtl;
	public void parkinglotviewdtl()
	{


		parkinglotviewdtl.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[8]/td[1]/div/label/input")
	@CacheLookup  
	WebElement filloutdocuments;
	public void filloutdocuments()
	{


		filloutdocuments.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[8]/td[3]/input")
	@CacheLookup  
	WebElement documentsordervalue;
	public void documentsordervalue(String ordval)
	{


		documentsordervalue.clear();
		documentsordervalue.sendKeys(ordval);
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/dash1/dash-item[7]/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement documentsviewdtl;
	public void documentsviewdtl()
	{


		documentsviewdtl.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Flags')]")
	@CacheLookup  
	WebElement flagsclk;
	public void flagsclk()
	{


		flagsclk.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/flags/jfh-add-flag/form/div/div/div[1]/jfh-simple-image-upload-cropper/div/div[2]/div[2]/label")
	@CacheLookup  
	WebElement choosefile;
	public void choosefile() throws AWTException
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

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/ui-cropper-modal/div[3]/button[2]")
	@CacheLookup  
	WebElement cropimage;
	public void cropimage()
	{


		cropimage.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[9]/td[1]/div/label/input")
	@CacheLookup  
	WebElement patientcomeinside;
	public void patientcomeinside()
	{


		patientcomeinside.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[9]/td[3]/input")
	@CacheLookup  
	WebElement patientcomeinsideord;
	public void patientcomeinsideord(String ordval)
	{


		patientcomeinsideord.clear();
		patientcomeinsideord.sendKeys(ordval);
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/dash1/dash-item/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement patientcomedetail;
	public void patientcomedetail()
	{


		patientcomedetail.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[10]/td[1]/div/label/input")
	@CacheLookup  
	WebElement patientaddscreening;
	public void patientaddscreening()
	{


		patientaddscreening.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/section[1]/article/table/tbody/tr[10]/td[3]/input")
	@CacheLookup  
	WebElement patientaddscreeningord;
	public void patientaddscreeningord(String ordval)
	{


		patientaddscreeningord.clear();
		patientaddscreeningord.sendKeys(ordval);
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/dash1/dash-item/section/div/section/article[2]/button")
	@CacheLookup  
	WebElement patientscreeningdetail;
	public void patientscreeningdetail()
	{


		patientscreeningdetail.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/dash/div/button[1]")
	@CacheLookup  
	WebElement chkundobutton;
	public void chkundobutton()
	{


		chkundobutton.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/flags/jfh-add-flag/form/div/div/div[2]/input")
	@CacheLookup  
	WebElement flaglabel;
	public void flaglabel(String ss)
	{


		flaglabel.sendKeys(ss);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/flags/jfh-add-flag/form/div/div/div[3]/div/label/input")
	@CacheLookup  
	WebElement persistant;
	public void persistant()
	{


		persistant.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/flags/jfh-add-flag/form/div/div/div[4]/button")
	@CacheLookup  
	WebElement addorgflag;
	public void addorgflag()
	{


		addorgflag.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[2]/div")
	@CacheLookup  
	WebElement addorgflagalert;
	public void addorgflagalert()
	{


		addorgflagalert.getText();
		System.out.println(addorgflagalert.getText());

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/flags/div[2]/div[1]/div/div[1]/jfh-flag-card/form/div")
	@CacheLookup  
	WebElement unassignedflag;
	public void unassignedflag()
	{


		unassignedflag.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/flags/div[2]/div[2]/div/div[1]/jfh-flag-card/form/div/div/div[1]")
	@CacheLookup  
	WebElement assignedflag;
	public void assignedflag()
	{


		assignedflag.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Populations')]")
	@CacheLookup  
	WebElement population;
	public void population()
	{


		population.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/populations/div/div/h2")
	@CacheLookup  
	WebElement populationchk;
	public void populationchk()
	{


		populationchk.getText();
		System.out.println(populationchk.getText());
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/populations/div/div/button/span")
	@CacheLookup  
	WebElement addpopulation;
	public void addpopulation()
	{

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollTo(0, 0)");
		addpopulation.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/population-modal/div[2]/form/div[1]/input")
	@CacheLookup  
	WebElement populationname;
	public void populationname(String name)
	{


		populationname.sendKeys(name);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/population-modal/div[2]/form/div[2]/input")
	@CacheLookup  
	WebElement shortname;
	public void shortname(String sname)
	{


		shortname.sendKeys(sname);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"seeing-dropdown\"]")
	@CacheLookup  
	WebElement addevent;
	public void addevent()
	{


		addevent.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/population-modal/div[2]/form/div[3]/div/div/ul/li[3]/a/span")
	@CacheLookup  
	WebElement selectevent;
	public void selectevent()
	{


		selectevent.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/population-modal/div[3]/div/button[2]")
	@CacheLookup  
	WebElement savepopulation;
	public void savepopulation()
	{


		savepopulation.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/populations/table/tbody/tr[6]/td[2]/button[2]/span")
	@CacheLookup  
	WebElement editpopulation;
	public void editpopulation()
	{


		editpopulation.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/population-modal/div[2]/form/div[1]/input")
	@CacheLookup  
	WebElement editpopulationname;
	public void editpopulationname(String popname)
	{

		editpopulationname.clear();
		editpopulationname.sendKeys(popname);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/population-modal/div[2]/form/div[2]/input")
	@CacheLookup  
	WebElement editpopulationshname;
	public void editpopulationshname(String popsname)
	{

		editpopulationshname.clear();
		editpopulationshname.sendKeys(popsname);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/population-modal/div[3]/div/button[2]")
	@CacheLookup  
	WebElement editpopulationsave;
	public void editpopulationsave()
	{

		editpopulationsave.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/population-modal/div[3]/div/button[1]")
	@CacheLookup  
	WebElement addpopulcancel;
	public void addpopulcancel()
	{

		addpopulcancel.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/population-modal/div[3]/div/button[1]")
	@CacheLookup  
	WebElement editpopulcancel;
	public void editpopulcancel()
	{

		editpopulcancel.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/populations/table/tbody/tr[1]/td[2]/button[3]")
	@CacheLookup  
	WebElement deletepopulation;
	public void deletepopulation()
	{

		deletepopulation.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[1]/div/div/confirm-modal/div[3]/div/button[1]")
	@CacheLookup  
	WebElement deletepopulationconf;
	public void deletepopulationconf()
	{

		deletepopulationconf.click();

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/div[2]/div")
	@CacheLookup  
	WebElement deletepopulationconfmsg;
	public void deletepopulationconfmsg()
	{

		deletepopulationconfmsg.getText();
		System.out.println(deletepopulationconfmsg.getText());

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/populations/table/tbody/tr[1]/td[2]/button[1]/span")
	@CacheLookup  
	WebElement clickcopyUrl;
	public void clickcopyUrl()
	{

		clickcopyUrl.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"copy-link\"]")
	@CacheLookup  
	WebElement clickcopybtn;
	public void clickcopybtn()
	{

		clickcopybtn.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/populations-url-modal/div[2]/span")
	@CacheLookup  
	WebElement copyurlconf;
	public void copyurlconf()
	{

		copyurlconf.getText();
		System.out.println(copyurlconf.getText());
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/populations-url-modal/div[3]/button")
	@CacheLookup  
	WebElement clickclosewindow;
	public void clickclosewindow()
	{

		clickclosewindow.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Locations')]")
	@CacheLookup  
	WebElement locations;
	public void locations()
	{

		locations.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/locations/div/div/h2")
	@CacheLookup  
	WebElement locationschk;
	public void locationschk()
	{

		locationschk.getText();
		System.out.println(locationschk.getText());
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/locations/div/div/button")
	@CacheLookup  
	WebElement addlocationsclk;
	public void addlocationsclk()
	{

		addlocationsclk.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"name\"]")
	@CacheLookup  
	WebElement locationname;
	public void locationname(String loc)
	{

		locationname.sendKeys(loc);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"external-service-id\"]")
	@CacheLookup  
	WebElement serviceidentifier;
	public void serviceidentifier(String ser)
	{

		serviceidentifier.sendKeys(ser);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"phoneNumber\"]")
	@CacheLookup  
	WebElement locphonenum;
	public void locphonenum(String ph)
	{

		locphonenum.sendKeys(ph);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"streetLine1\"]")
	@CacheLookup  
	WebElement street1;
	public void street1(String street)
	{

		street1.sendKeys(street);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"streetLine2\"]")
	@CacheLookup  
	WebElement street2;
	public void street2(String streetn)
	{

		street2.sendKeys(streetn);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"city\"]")
	@CacheLookup  
	WebElement cityaddress;
	public void cityaddress(String city)
	{

		cityaddress.sendKeys(city);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"state\"]")
	@CacheLookup  
	WebElement stateaddress;
	public void stateaddress(String stateadd)
	{

		stateaddress.sendKeys(stateadd);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"zipcode\"]")
	@CacheLookup  
	WebElement zipcodenew;
	public void zipcodenew(String zip)
	{

		zipcodenew.sendKeys(zip);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-modal/div[2]/form/div[6]/text-angular/div[2]/div[3]")
	@CacheLookup  
	WebElement addlocinfo;
	public void addlocinfo(String locinfo)
	{
		addlocinfo.click();
		addlocinfo.sendKeys(locinfo);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-modal/div[3]/button[2]")
	@CacheLookup  
	WebElement locsavebtn;
	public void locsavebtn()
	{

		locsavebtn.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-modal/div[3]/button[1]")
	@CacheLookup  
	WebElement loccancelbtn;
	public void loccancelbtn()
	{

		loccancelbtn.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/locations/table/tbody/tr[2]/td[2]/button[1]/span")
	@CacheLookup  
	WebElement loceditutton;
	public void loceditutton()
	{

		loceditutton.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-modal/div[2]/form/div[2]/div[2]/input")
	@CacheLookup  
	WebElement editlocphonenum;
	public void editlocphonenum(String ph)
	{
		editlocphonenum.clear();
		editlocphonenum.sendKeys(ph);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-modal/div[2]/form/div[5]/div[3]/input")
	@CacheLookup  
	WebElement editzipcodenew;
	public void editzipcodenew(String zip)
	{
		editzipcodenew.clear();
		editzipcodenew.sendKeys(zip);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-modal/div[2]/form/div[2]/div[1]/input")
	@CacheLookup  
	WebElement editlocationname;
	public void editlocationname(String loc)
	{
		editlocationname.clear();
		editlocationname.sendKeys(loc);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-modal/div[3]/button[2]")
	@CacheLookup  
	WebElement editlocsave;
	public void editlocsave()
	{

		editlocsave.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/locations/table/tbody/tr[2]/td[2]/button[2]/span")
	@CacheLookup  
	WebElement locdelete;
	public void locdelete()
	{

		locdelete.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/confirm-modal/div[3]/div/button[1]")
	@CacheLookup  
	WebElement locdeleteconf;
	public void locdeleteconf()
	{

		locdeleteconf.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Registration')]")
	@CacheLookup  
	WebElement registration;
	public void registration()
	{

		registration.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/h2")
	@CacheLookup  
	WebElement registrationconf;
	public boolean registrationconf()
	{

		String s=registrationconf.getText();

		if(s.equals("Registration"))
		{
			System.out.println("Test case passed");
			return true;

		}
		else
		{
			System.out.println("Test case fail");
			return false;
		}

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[2]/a[2]")
	@CacheLookup  
	WebElement saveguestreg;
	public void saveguestreg()
	{

		saveguestreg.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div")
	@CacheLookup  
	WebElement saveguestregconf;
	public void saveguestregconf()
	{

		String conf=saveguestregconf.getText();
		System.out.println(conf);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/a")
	@CacheLookup  
	WebElement regaddmore;
	public void regaddmore()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollTo(0, 1000)");
		regaddmore.click();;

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/header/a[1]")
	@CacheLookup  
	WebElement guestclosebtn;
	public void guestclosebtn()
	{

		guestclosebtn.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/header/a[2]")
	@CacheLookup  
	WebElement regupperbtnclk;
	public void regupperbtnclk()
	{

		regupperbtnclk.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement reggender;
	public void reggender()
	{

		Select drpdown = new Select(reggender);
		drpdown.selectByValue("3");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement reggenderfieldsize;
	public void reggenderfieldsize()
	{

		Select drpdown = new Select(reggenderfieldsize);
		drpdown.selectByIndex(1);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement reggendertitle;
	public void reggendertitle(String reg)
	{

		reggendertitle.clear();
		reggendertitle.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement genderplaceholder;
	public void genderplaceholder(String regplace)
	{

		genderplaceholder.clear();
		genderplaceholder.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement reggenderrequired;
	public void reggenderrequired()
	{


		reggenderrequired.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[2]/a[2]")
	@CacheLookup  
	WebElement guestregsavebtn;
	public void guestregsavebtn()
	{


		guestregsavebtn.click();

	}
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div")
	@CacheLookup  
	WebElement guestregsavebtnconf;
	public boolean guestregsavebtnconf()
	{



		String s=guestregsavebtnconf.getText();
		System.out.println(s);
		if(s.equals("Configuration Saved"))
		{
			System.out.println("Test case passed");

		}
		else
		{
			System.out.println("Test case fail");
		}
		return false;

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement regphnumber;
	public void regphnumber()
	{

		Select drpdown = new Select(regphnumber);
		drpdown.selectByValue("4");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement reggphfieldsize;
	public void reggphfieldsize()
	{

		Select drpdown = new Select(reggphfieldsize);
		drpdown.selectByIndex(1);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regphtitle;
	public void regphtitle(String reg)
	{

		regphtitle.clear();
		regphtitle.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regphplaceholder;
	public void regphplaceholder(String regplace)
	{

		regphplaceholder.clear();
		regphplaceholder.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regphrequired;
	public void regphrequired()
	{


		regphrequired.click();

	}
	//----
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement reglocation;
	public void reglocation()
	{

		Select drpdown = new Select(reglocation);
		drpdown.selectByValue("5");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement reglocfieldsize;
	public void reglocfieldsize()
	{

		Select drpdown = new Select(reglocfieldsize);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regloctitle;
	public void regloctitle(String reg)
	{

		regloctitle.clear();
		regloctitle.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement reglocplaceholder;
	public void reglocplaceholder(String regplace)
	{

		reglocplaceholder.clear();
		reglocplaceholder.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement reglocrequired;
	public void reglocrequired()
	{


		reglocrequired.click();

	}

	//---------
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement regemail;
	public void regemail()
	{

		Select drpdown = new Select(regemail);
		drpdown.selectByValue("6");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regemailfieldsize;
	public void regemailfieldsize()
	{

		Select drpdown = new Select(regemailfieldsize);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regemailtitle;
	public void regemailtitle(String reg)
	{

		regemailtitle.clear();
		regemailtitle.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regemailplaceholder;
	public void regemailplaceholder(String regplace)
	{

		regemailplaceholder.clear();
		regemailplaceholder.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regemailrequired;
	public void regemailrequired()
	{


		regemailrequired.click();

	}

	//---------

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement regssn;
	public void regssn()
	{

		Select drpdown = new Select(regssn);
		drpdown.selectByValue("7");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regssnfieldsize;
	public void regssnfieldsize()
	{

		Select drpdown = new Select(regssnfieldsize);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regssntitle;
	public void regssntitle(String reg)
	{

		regssntitle.clear();
		regssntitle.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regssnplaceholder;
	public void regssnplaceholder(String regplace)
	{

		regssnplaceholder.clear();
		regssnplaceholder.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regssnrequired;
	public void regssnrequired()
	{


		regssnrequired.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[2]/a[1]")
	@CacheLookup  
	WebElement guestcanclbtn;
	public void guestcanclbtn()
	{


		guestcanclbtn.click();

	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'New Account / Registered')]")
	@CacheLookup  
	WebElement newaccountregistered;
	public void newaccountregistered()
	{

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollTo(0, 0)");
		newaccountregistered.click();

	}

	//--------

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement newaccountdob;
	public void newaccountdob()
	{

		Select drpdown = new Select(newaccountdob);
		drpdown.selectByValue("2");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regdobfieldsize;
	public void regdobfieldsize()
	{

		Select drpdown = new Select(regdobfieldsize);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regdobtitle;
	public void regdobtitle(String reg)
	{

		regdobtitle.clear();
		regdobtitle.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regdobplaceholder;
	public void regdobplaceholder(String regplace)
	{

		regdobplaceholder.clear();
		regdobplaceholder.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regdobrequired;
	public void regdobrequired()
	{


		regdobrequired.click();

	}
	//-----------

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement newaccountgender;
	public void newaccountgender()
	{

		Select drpdown = new Select(newaccountgender);
		drpdown.selectByValue("3");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regfieldsizegender;
	public void regfieldsizegender()
	{

		Select drpdown = new Select(regfieldsizegender);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regtitlegender;
	public void regtitlegender(String reg)
	{

		regtitlegender.clear();
		regtitlegender.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regplaceholdergender;
	public void regplaceholdergender(String regplace)
	{

		regplaceholdergender.clear();
		regplaceholdergender.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regrequiredgender;
	public void regrequiredgender()
	{


		regrequiredgender.click();

	}
	//-------------

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement newaccountphnumber;
	public void newaccountphnumber()
	{

		Select drpdown = new Select(newaccountphnumber);
		drpdown.selectByValue("4");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regfieldsizephnumber;
	public void regfieldsizephnumber()
	{

		Select drpdown = new Select(regfieldsizephnumber);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regtitlephnumber;
	public void regtitlephnumber(String reg)
	{

		regtitlephnumber.clear();
		regtitlephnumber.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regplaceholderphnumber;
	public void regplaceholderphnumber(String regplace)
	{

		regplaceholderphnumber.clear();
		regplaceholderphnumber.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regrequiredphnumber;
	public void regrequiredphnumber()
	{


		regrequiredphnumber.click();

	}

	//---------

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement newaccountlocation;
	public void newaccountlocation()
	{

		Select drpdown = new Select(newaccountlocation);
		drpdown.selectByValue("5");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regfieldsizelocation;
	public void regfieldsizelocation()
	{

		Select drpdown = new Select(regfieldsizelocation);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regtitlelocation;
	public void regtitlelocation(String reg)
	{

		regtitlelocation.clear();
		regtitlelocation.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regplaceholderlocation;
	public void regplaceholderlocation(String regplace)
	{

		regplaceholderlocation.clear();
		regplaceholderlocation.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regrequiredlocation;
	public void regrequiredlocation()
	{


		regrequiredlocation.click();

	}
	//---------------

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement newaccountemail;
	public void newaccountemail()
	{

		Select drpdown = new Select(newaccountemail);
		drpdown.selectByValue("6");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regfieldsizeemail;
	public void regfieldsizeemail()
	{

		Select drpdown = new Select(regfieldsizeemail);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regtitleemail;
	public void regtitleemail(String reg)
	{

		regtitleemail.clear();
		regtitleemail.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regplaceholderemail;
	public void regplaceholderemail(String regplace)
	{

		regplaceholderemail.clear();
		regplaceholderemail.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regrequiredemail;
	public void regrequiredemail()
	{


		regrequiredemail.click();

	}
	//-------------

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement newaccountssn;
	public void newaccountssn()
	{

		Select drpdown = new Select(newaccountssn);
		drpdown.selectByValue("7");	

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement regfieldsizessn;
	public void regfieldsizessn()
	{

		Select drpdown = new Select(regfieldsizessn);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement regtitlessn;
	public void regtitlessn(String reg)
	{

		regtitlessn.clear();
		regtitlessn.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement regplaceholderssn;
	public void regplaceholderssn(String regplace)
	{

		regplaceholderssn.clear();
		regplaceholderssn.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[3]/div/div/label/input")
	@CacheLookup  
	WebElement regrequiredssn;
	public void regrequiredssn()
	{


		regrequiredssn.click();

	}

	//--------

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Claim Record')]")
	@CacheLookup  
	WebElement claimrecord;
	public void claimrecord()
	{

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollTo(0, 0)");
		claimrecord.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement claimrecordssn;
	public void claimrecordssn()
	{

		Select drpdown = new Select(claimrecordssn);
		drpdown.selectByValue("0");

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement claimfieldsizessn;
	public void claimfieldsizessn()
	{

		Select drpdown = new Select(claimfieldsizessn);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement claimtitlessn;
	public void claimtitlessn(String reg)
	{

		claimtitlessn.clear();
		claimtitlessn.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement claimplaceholderssn;
	public void claimplaceholderssn(String regplace)
	{

		claimplaceholderssn.clear();
		claimplaceholderssn.sendKeys(regplace);

	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/a")
	@CacheLookup  
	WebElement regaddmoreclaim;
	public void regaddmoreclaim()
	{

		regaddmoreclaim.click();

	}
	//----

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement claimrecordphnumber;
	public void claimrecordphnumber()
	{

		Select drpdown = new Select(claimrecordphnumber);
		drpdown.selectByValue("4");

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement claimfieldsizephnumber;
	public void claimfieldsizephnumber()
	{

		Select drpdown = new Select(claimfieldsizephnumber);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement claimtitlephnumber;
	public void claimtitlephnumber(String reg)
	{

		claimtitlephnumber.clear();
		claimtitlephnumber.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[3]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement claimplaceholderphnumber;
	public void claimplaceholderphnumber(String regplace)
	{

		claimplaceholderphnumber.clear();
		claimplaceholderphnumber.sendKeys(regplace);

	}
	//-------


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[5]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement claimrecorddob;
	public void claimrecorddob()
	{

		Select drpdown = new Select(claimrecorddob);
		drpdown.selectByValue("1");

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[4]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement claimfieldsizedob;
	public void claimfieldsizedob()
	{

		Select drpdown = new Select(claimfieldsizedob);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[5]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement claimtitledob;
	public void claimtitledob(String reg)
	{

		claimtitledob.clear();
		claimtitledob.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[5]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement claimplaceholderdob;
	public void claimplaceholderdob(String regplace)
	{

		claimplaceholderdob.clear();
		claimplaceholderdob.sendKeys(regplace);

	}
	//----------
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[5]/div/div/div[1]/div[1]/select")
	@CacheLookup  
	WebElement claimrecordemail;
	public void claimrecordemail()
	{

		Select drpdown = new Select(claimrecordemail);
		drpdown.selectByValue("5");

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[5]/div/div/div[1]/div[2]/select")
	@CacheLookup  
	WebElement claimfieldsizeemail;
	public void claimfieldsizeemail()
	{

		Select drpdown = new Select(claimfieldsizeemail);
		drpdown.selectByIndex(2);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[5]/div/div/div[1]/div[3]/input")
	@CacheLookup  
	WebElement claimtitleemail;
	public void claimtitleemail(String reg)
	{

		claimtitleemail.clear();
		claimtitleemail.sendKeys(reg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[1]/field-builder/div/div[5]/div/div/div[2]/div/input")
	@CacheLookup  
	WebElement claimplaceholderemail;
	public void claimplaceholderemail(String regplace)
	{

		claimplaceholderemail.clear();
		claimplaceholderemail.sendKeys(regplace);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/registration-admin/section/div[2]/a[1]")
	@CacheLookup  
	WebElement claimcancel;
	public void claimcancel()
	{


		claimcancel.click();

	}

	//Algorithum

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Algorithm')]")
	@CacheLookup  
	WebElement algorithum;
	public void algorithum()
	{


		algorithum.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[1]/div[1]/h2")
	@CacheLookup  
	WebElement algorithumconf;
	public void algorithumconf()
	{

		String ss=algorithumconf.getText();
		System.out.println(ss);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[2]/div[1]/div[1]/div/div/div/input")
	@CacheLookup  
	WebElement capacity;
	public void capacity(int i)
	{
		capacity.clear();

		capacity.sendKeys(String.valueOf(i));

	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[2]/div[1]/div[2]/div/div/div/input")
	@CacheLookup  
	WebElement appointmentlen;
	public void appointmentlen(int j)
	{
		appointmentlen.clear();
		appointmentlen.sendKeys(String.valueOf(j));

	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[2]/div[1]/div[3]/div[1]/div/div/input")
	@CacheLookup  
	WebElement beginquethersold;
	public void beginquethersold(int k)
	{
		beginquethersold.clear();
		beginquethersold.sendKeys(String.valueOf(k));

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[2]/div[1]/div[3]/div[2]/input")
	@CacheLookup  
	WebElement beginquethersoldmsg;
	public void beginquethersoldmsg(String sd)
	{
		beginquethersoldmsg.clear();
		beginquethersoldmsg.sendKeys(sd);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[2]/div[1]/div[4]/div[1]/div/div/input")
	@CacheLookup  
	WebElement endquethersold;
	public void endquethersold(int sd)
	{
		endquethersold.clear();
		endquethersold.sendKeys(String.valueOf(sd));

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[2]/div[1]/div[4]/div[2]/input")
	@CacheLookup  
	WebElement endquethersoldmsg;
	public void endquethersoldmsg(String sd)
	{
		endquethersoldmsg.clear();
		endquethersoldmsg.sendKeys(sd);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[3]/div/table/tbody/tr[1]/td[1]/input")
	@CacheLookup  
	WebElement includeinalgochkbox;
	public void includeinalgochkbox()
	{
		includeinalgochkbox.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[3]/div/table/tbody/tr[1]/td[2]/input")
	@CacheLookup  
	WebElement includeincapchkbox;
	public void includeincapchkbox()
	{
		includeincapchkbox.click();

	}

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Save')]")
	@CacheLookup  
	WebElement algosave;
	public void algosave()
	{

		algosave.click();

	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/config-change-modal/div[1]/h2")
	@CacheLookup  
	WebElement configchangemsg;
	public void configchangemsg()
	{
		String msg= configchangemsg.getText();
		System.out.println(msg);

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/algorithm/section/div[1]/div[2]/button")
	@CacheLookup  
	WebElement launchanalysis;
	public void launchanalysis()
	{
		launchanalysis.click();

	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Close')]")
	@CacheLookup  
	WebElement launchanalysisclose;
	public void launchanalysisclose()
	{
		launchanalysisclose.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/analytics-modal/div[1]/div/div[2]/button")
	@CacheLookup  
	WebElement launchanalysiscrossbtn;
	public void launchanalysiscrossbtn()
	{
		launchanalysiscrossbtn.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/analytics-modal/div[2]/div[3]/div[2]/button")
	@CacheLookup  
	WebElement launchanalysisupdate;
	public void launchanalysisupdate()
	{
		launchanalysisupdate.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[1]/input")
	@CacheLookup  
	WebElement launchanalysisfromdate;
	public void launchanalysisfromdate(String ss)
	{
		launchanalysisfromdate.clear();
		launchanalysisfromdate.sendKeys(ss);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[2]/div[1]/input")
	@CacheLookup  
	WebElement launchanalysistodate;
	public void launchanalysistodate(String ss)
	{
		launchanalysistodate.clear();
		launchanalysistodate.sendKeys(ss);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[3]/div/button[1]")
	@CacheLookup  
	WebElement applybuttonclk;
	public void applybuttonclk()
	{
		applybuttonclk.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/analytics-modal/div[2]/div[3]/div[3]/button")
	@CacheLookup  
	WebElement updateclick;
	public void updateclick()
	{
		updateclick.click();

	}
}

