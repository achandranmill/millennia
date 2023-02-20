package com.access.pageobject;

import org.openqa.selenium.WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Departments')]")
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

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Alpha-1')]")
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


		phonenumber.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"streetLine1\"]")
	@CacheLookup
	WebElement streetaddress;

	public void streetaddress(String dname)
	{


		streetaddress.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"streetLine2\"]")
	@CacheLookup
	WebElement streetaddresssec;

	public void streetaddresssec(String dname)
	{


		streetaddresssec.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"city\"]")
	@CacheLookup
	WebElement city;

	public void city(String dname)
	{


		city.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"state\"]")
	@CacheLookup
	WebElement state;

	public void state(String dname)
	{


		state.sendKeys(dname);

	}

	@FindBy(how=How.XPATH,using="//*[@id=\"zipcode\"]")
	@CacheLookup
	WebElement zipcode;

	public void zipcode(String dname)
	{


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

	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[10]/header/a[1]")
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

//same daa 

//PATIENT INTAKE

@FindBy(how=How.XPATH,using="//a[contains(text(),'Patient Intake')]")
@CacheLookup
WebElement Dep_PATIENINTAKE;

public void Dep_PATIENINTAKE()
{
	Dep_PATIENINTAKE.click();
}

@FindBy(how=How.NAME,using="taskRequired")
@CacheLookup
WebElement InsuranceEnabled;

public void InsuranceEnabled()
{
	InsuranceEnabled.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[1]/div/div[4]/table/tbody/tr/td[1]/input")
@CacheLookup
WebElement InsuranceName;

public void InsuranceName(String in)
{
	InsuranceName.click();
	InsuranceName.sendKeys(in);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[1]/div/div[4]/table/tbody/tr/td[2]/input")
@CacheLookup
WebElement InsuranceValue;

public void InsuranceValue(String iv)
{
	InsuranceValue.click();
	InsuranceValue.sendKeys(iv);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[1]/div/div[4]/table/tbody/tr/td[3]/button")
@CacheLookup
WebElement InsuranceAdd;

public void InsuranceAdd()
{
	InsuranceAdd.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[1]/div/div[4]/table/tbody/tr[2]/td[1]/input")
@CacheLookup
WebElement InsuranceName1;

public void InsuranceName1(String in1)
{
	InsuranceName1.click();
	InsuranceName1.sendKeys(in1);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[1]/div/div[4]/table/tbody/tr[2]/td[2]/input")
@CacheLookup
WebElement InsuranceValue1;

public void InsuranceValue1(String iv1)
{
	
	InsuranceValue1.sendKeys(iv1);
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Remove')]")
@CacheLookup
WebElement InsuranceRemove;

public void InsuranceRemove()
{
	InsuranceRemove.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[2]/div/div[3]/div/label/input")
@CacheLookup
WebElement IdentityEnabled;

public void IdentityEnabled()
{
	IdentityEnabled.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr/td[1]/input")
@CacheLookup
WebElement IdentityName;

public void IdentityName(String in)
{
	IdentityName.click();
	IdentityName.sendKeys(in);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr/td[2]/input")
@CacheLookup
WebElement IdentityValue;

public void IdentityValue(String iv)
{
	IdentityValue.click();
	IdentityValue.sendKeys(iv);
}

@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr/td[3]/button")
@CacheLookup
WebElement IdentityAdd;

public void IdentityAdd()
{
	IdentityAdd.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr[2]/td[1]/input")
@CacheLookup
WebElement IdentityName1;

public void IdentityName1(String in1)
{
	IdentityName1.click();
	IdentityName1.sendKeys(in1);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr[2]/td[2]/input")
@CacheLookup
WebElement IdentityValue1;

public void IdentityValue1(String iv1)
{
	IdentityValue1.click();
	IdentityValue1.sendKeys(iv1);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr[1]/td[3]/button")
@CacheLookup
WebElement IdentityRemove;

public void IdentityRemove()
{
	IdentityRemove.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[3]/div/button[1]")
@CacheLookup
WebElement PatientIntakeCancel;

public void PatientIntakeCancel()
{
	PatientIntakeCancel.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-intake-config/section/div[3]/div/button[2]")
@CacheLookup
WebElement PatientIntakeSave;

public void PatientIntakeSave()
{
	PatientIntakeSave.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Patient Lists')]")
@CacheLookup
WebElement PatientLists;

public void PatientLists()
{
	PatientLists.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Work List')]")
@CacheLookup
WebElement WorkList;

public void WorkList()
{
	WorkList.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/input")
@CacheLookup
WebElement Work_Name;

public void Work_Name()
{
	if(!Work_Name.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click()",Work_Name);
		if(!Work_Name.isSelected()) {
			Work_Name.click();
		}
	}
}
	
public void work_Named()
{
	Work_Name.click();
}
 
		
 @FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input")	
 @CacheLookup
 WebElement Work_MRN;
 
 public void Work_MRN()
 {
	 if(!Work_MRN.isSelected()) {
		 JavascriptExecutor e = (JavascriptExecutor)ldriver;
		 e.executeScript("arguments[0].click()",Work_MRN);
		 if(!Work_MRN.isSelected()) {
			 Work_MRN.click();
		 }
	 }
 }
 
 @FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[2]/input")
 @CacheLookup
 WebElement Work_VisitCode;
 
 public void Work_VisitCode()
 {
	 if(Work_VisitCode.isSelected()) {
		 JavascriptExecutor e = (JavascriptExecutor)ldriver;
		 e.executeScript("arguments[0].click()",Work_VisitCode);
		 if(!Work_VisitCode.isSelected()) {
			 Work_VisitCode.click();
		 
		 }
	 }
 }
 
 @FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[2]/input")
 @CacheLookup
 WebElement Work_DOB;
 
 public void Work_DOB()
 {
	 if(!Work_DOB.isSelected()) {
		 JavascriptExecutor e = (JavascriptExecutor)ldriver;
		 e.executeScript("arguments[0].click()", Work_DOB);
		 if(!Work_DOB.isSelected()) {
			 Work_DOB.isSelected();
			 Work_DOB.click();
		 }
	 }
 }
 
 @FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/input")
 @CacheLookup
 WebElement Work_Checkintime;
 
 public void Work_Checkintime()
 {
	 if(!Work_Checkintime.isSelected())
	 {
		 JavascriptExecutor e = (JavascriptExecutor)ldriver;
		 e.executeScript("arguments[0].click()", Work_Checkintime);
		 if(!Work_Checkintime.isSelected()) {
			 Work_Checkintime.isSelected();
			 Work_Checkintime.click();
		 }
	 }
 }
		 
	@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement Work_Location;
	
	public void Work_Location()
	{
		if(!Work_Location.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click()", Work_Location);
			if(!Work_Location.isSelected()) {
				Work_Location.isSelected();
				Work_Location.click();
			}
		}
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/div/button[2]")
	@CacheLookup
	WebElement work_Save;

	public void work_Save()
	{
		work_Save.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/span")
	@CacheLookup
	WebElement work_Save_message;

	public void work_Save_message()
	{

		String act = work_Save_message.getText();
		System.out.println("Error message is: "+ act);
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/div/button[1]")
	@CacheLookup
	WebElement work_Cancel;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'At least one field must be selected to save')]")
	@CacheLookup
	WebElement work_Atleastonefieldmustbeselectetosave;
	
	public void work_Atleastonefieldmustbeselectetosave()
	{
		String act = work_Atleastonefieldmustbeselectetosave.getText();
		System.out.println("Error message is:"+ act);
		
	}
	
	public void work_Cancel()
	{
		work_Cancel.click();
	}
		
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Appointments')]")	
	@CacheLookup
	WebElement Appointments;
	
	public void Appointments()
	{
		Appointments.click();
		
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/input")
	@CacheLookup
	WebElement Appoint_DOB;
	
	public void Appoint_DOB()
	{
		if(!Appoint_DOB.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click", Appoint_DOB);
			if(!Appoint_DOB.isSelected()) {
				Appoint_DOB.isSelected();
				Appoint_DOB.click();
			}
		}
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/patient-lists/section/div/div/div[2]/div/table/tbody/tr[1]/td[2]/input")
	@CacheLookup
	WebElement Appoint_NAME;
	
	public void Appoint_NAME()
	{
		if(!Appoint_NAME.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click", Appoint_NAME);
			if(!Appoint_NAME.isSelected()) {
				Appoint_NAME.isSelected();
				Appoint_NAME.click();
				
			}
		}
	}
	
	public void Appoint_NAMEd()
	{
		Appoint_NAME.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[3]/td[2]/input")
	@CacheLookup
	WebElement Appoint_MRN;
	
	public void Appoint_MRN()
	{
		if(!Appoint_MRN.isSelected()) {
			JavascriptExecutor e = (JavascriptExecutor)ldriver;
			e.executeScript("arguments[0].click", Appoint_MRN);
			if(!Appoint_MRN.isSelected()) {
				Appoint_MRN.isSelected();
				Appoint_MRN.click();
			}
		}
	}
	
	public void Appoint_MRNd()
	{
		Appoint_MRN.click();
	}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[4]/td[2]/input")
@CacheLookup
WebElement Appoint_VisitCode;

public void Appoint_VisitCode()
{
	if(!Appoint_VisitCode.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Appoint_VisitCode);
		if(!Appoint_VisitCode.isSelected()) {
			Appoint_VisitCode.click();
		}
	}
}


@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[5]/td[2]/input")
@CacheLookup
WebElement Appoint_ApptTime;

public void Appoint_ApptTime()
{
	if(!Appoint_ApptTime.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Appoint_ApptTime);
		if(!Appoint_ApptTime.isSelected()) {
			Appoint_ApptTime.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[7]/td[2]/input")
@CacheLookup
WebElement Appoint_Flags;

public void Appoint_Flags()
{
	if(!Appoint_Flags.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Appoint_Flags);
		if(!Appoint_Flags.isSelected()) {
			Appoint_Flags.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[8]/td[2]/input")
@CacheLookup
WebElement Appoint_Gender;

public void Appoint_Gender()
{
	if(!Appoint_Gender.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Appoint_Gender);
		if(!Appoint_Gender.isSelected()) {
			Appoint_Gender.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/div/button[2]")
@CacheLookup
WebElement Appoint_SAVE;

public void Appoint_SAVE()
{
	Appoint_SAVE.click();
}

@FindBy(how=How.XPATH,using="//span[contains(text(),'Appointments Configuration Saved')]")
@CacheLookup
WebElement Appoint_SaveMessage;

public void Appoint_SaveMessage()
{
	String act = Appoint_SaveMessage.getText();
	System.out.println("Error message is: "+ act);
}


@FindBy(how=How.XPATH,using="//span[contains(text(),'At least one field must be selected to save')]")
@CacheLookup
WebElement Appoint_Atleastonefieldmustbeselectedtosave;

public void Appoint_Atleastonefieldmustbeselectedtosave()
{
	String act = Appoint_Atleastonefieldmustbeselectedtosave.getText();
	System.out.println("Error message is: "+ act);
}


@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/div/button[1]")
@CacheLookup
WebElement Appoint_CANCEL;

public void Appoint_CANCEL()
{
	Appoint_CANCEL.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Discharge')]")
@CacheLookup
WebElement Discharge;

public void Discharge()
{
	Discharge.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[1]/td[2]/input")
@CacheLookup
WebElement Discharge_ApptTime;

public void Discharge_ApptTime()
{
	if(!Discharge_ApptTime.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_ApptTime);
		if(!Discharge_ApptTime.isSelected()) {
			Discharge_ApptTime.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[2]/td[2]/input")
@CacheLookup
WebElement Discharge_ApptLocation;

public void Discharge_ApptLocation()
{
	if(!Discharge_ApptLocation.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_ApptLocation);
		if(!Discharge_ApptLocation.isSelected()) {
			Discharge_ApptLocation.click();
		}
	}
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/patient-lists/section/div/div/div[3]/div/table/tbody/tr[1]/td[2]/input")
@CacheLookup
WebElement Discharge_Name;

public void Discharge_Name()
{
	if(!Discharge_Name.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_Name);
		if(!Discharge_Name.isSelected()) {
			Discharge_Name.click();
		}
				
	}
}

public void Discharge_Named()
{
	Discharge_Name.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[4]/td[2]/input")
@CacheLookup
WebElement Discharge_MRN;

public void Discharge_MRN()
{
	if(!Discharge_MRN.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_MRN);
		if(!Discharge_MRN.isSelected()) {
			Discharge_MRN.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[5]/td[2]/input")
@CacheLookup
WebElement Discharge_VisitCode;

public void Discharge_VisitCode()
{
	if(!Discharge_VisitCode.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_VisitCode);
		if(!Discharge_VisitCode.isSelected()) {
			Discharge_VisitCode.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[6]/td[2]/input")
@CacheLookup
WebElement Discharge_DOB;

public void Discharge_DOB()
{
	if(!Discharge_DOB.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_DOB);
		if(!Discharge_DOB.isSelected()) {
			Discharge_DOB.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[7]/td[2]/input")
@CacheLookup
WebElement Discharge_Gender;

public void Discharge_Gender()
{
	if(!Discharge_Gender.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_Gender);
		if(!Discharge_Gender.isSelected()) {
			Discharge_Gender.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[8]/td[2]/input")
@CacheLookup
WebElement Discharge_Seeing;

public void Discharge_Seeing()
{
	if(!Discharge_Seeing.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_Seeing);
		if(!Discharge_Seeing.isSelected());
		Discharge_Seeing.click();
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/div/div[3]/div/table/tbody/tr[9]/td[2]/input")
@CacheLookup
WebElement Discharge_Status;

public void Discharge_Status()
{
	if(!Discharge_Status.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click", Discharge_Status);
		if(!Discharge_Status.isSelected()) {
			Discharge_Status.click();
		}
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/div/button[2]")
@CacheLookup
WebElement Discharge_Save;

public void Discharge_Save()
{
	Discharge_Save.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/patient-lists-parent/section/div/button[1]")
@CacheLookup
WebElement Discharge_Cancel;

public void Discharge_Cancel()
{
	Discharge_Cancel.click();
}

@FindBy(how=How.XPATH,using="//span[contains(text(),'Discharge Configuration Saved')]")
@CacheLookup
WebElement Discharge_SaveMessage;

public void Discharge_SaveMessage()
{
	String act = Discharge_SaveMessage.getText();
	System.out.println("Error message is: "+ act);
}


@FindBy(how=How.XPATH,using="//span[contains(text(),'At least one field must be selected to save')]")
@CacheLookup
WebElement Discharge_Atleastonefieldmustbeselectedtosave;

public void Discharge_Atleastonefieldmustbeselectedtosave()
{
	String act = Discharge_Atleastonefieldmustbeselectedtosave.getText();
	System.out.println("Error message is: "+ act);
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Messages')]")
@CacheLookup
WebElement Dept_Messages;

public void Dept_Messages()
{
	Dept_Messages.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[1]/div/div/a")
@CacheLookup
WebElement  Message_BacktodepartmentMessages;

public void Message_BacktodepartmentMessages()
{
	Message_BacktodepartmentMessages.click();
}

@FindBy(how=How.XPATH,using="//*[@type='text']//following::input[2]")
@CacheLookup
WebElement Message_searchname;

public void Message_searchname(String sn)
{
	
	//Message_searchname.click();
	Message_searchname.sendKeys(sn);
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder\"]/div/div[2]/table/tbody/tr/td[5]/button[2]")
@CacheLookup
WebElement Message_Delete;

public void Message_Delete()
{
	Message_Delete.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[1]/div/div[1]/div/div[2]/button")
@CacheLookup
WebElement Message_Addnew;

public void Message_Addnew()
{
	Message_Addnew.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[1]/div[1]/label/input")
@CacheLookup
WebElement Message_CreateCustomMessage;

public void Message_CreateCustomMessage()
{
	Message_CreateCustomMessage.click();
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Continue')]")
@CacheLookup
WebElement Message_continue;

public void Message_continue()
{
	Message_continue.click();
}

@FindBy(how=How.NAME,using="title")
@CacheLookup
WebElement Message_title;

public void Message_title(String n)
{
	Message_title.click();
	Message_title.sendKeys(n);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[1]/div/select")
@CacheLookup
WebElement Message_category;

public void Message_category()
{
	Select mc = new Select(Message_category);
	mc.selectByVisibleText("APPOINTMENT");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[2]/div/select")
@CacheLookup
WebElement Message_Trigger;

public void Message_Trigger_CONFIRMED()
{
	Select mt = new Select(Message_Trigger);
	mt.selectByVisibleText("CONFIRMED");
	
}

public void Message_Trigger_DISCHARGE()
{
	Select mt = new Select(Message_Trigger);
	mt.selectByIndex(4);
	
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/button")
@CacheLookup
WebElement Message_Limits;

public void Message_Limits()
{
	Message_Limits.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/ul/li[1]/a")
@CacheLookup
WebElement Message_checkAll;

public void Message_checkAll()
{
	Message_checkAll.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/ul/li[2]/a")
@CacheLookup
WebElement Message_uncheckAll;

public void Message_uncheckAll()
{
	Message_uncheckAll.click();
}

@FindBy(how=How.NAME,using="textMessage")
@CacheLookup
WebElement Message_textMessage;

public void Message_textMessage()
{
	if(!Message_textMessage.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click()", Message_textMessage);
		if(!Message_textMessage.isSelected()) {
			Message_textMessage.isSelected();
			Message_textMessage.click();
		}
	}
	
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[1]/select")
@CacheLookup
WebElement Message_textMessage_SendFrom;

public void Message_textMessage_SendFrom()
{
	Select tm  = new Select(Message_textMessage_SendFrom);
	tm.selectByIndex(1);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[2]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_textMessage_Recipients;

public void Message_textMessage_Recipients()
{
	Message_textMessage_Recipients.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div[1]/div/div/div[2]/recipients/div/ul/li/div[5]/span/div/h4")
@CacheLookup
WebElement Message_textMessage_user;

public void Message_textMessage_user()
{
	Message_textMessage_user.click();
}

@FindBy(how=How.NAME,using="smsMessageMessage")
@CacheLookup
WebElement Message_TextMessageContent;

public void Message_TextMessageContent(String tmc)
{
	Message_TextMessageContent.click();
	Message_TextMessageContent.sendKeys(tmc);
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'+ Add Response')]")
@CacheLookup
WebElement Message_AddResponse;

public void Message_AddResponse()
{
	Message_AddResponse.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
@CacheLookup
WebElement Message_ResponseText;

public void Message_ResponseText(String rt)
{
	Message_ResponseText.click();
	Message_ResponseText.sendKeys(rt);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
@CacheLookup
WebElement Message_Responseselect;

public void Message_Responseselect()
{
	Select rs = new Select(Message_Responseselect);
	rs.selectByIndex(2);
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[2]/div/div/input")
@CacheLookup
WebElement Message_Followup;

public void Message_Followup(String rf)
{
	Message_Followup.click();
	Message_Followup.sendKeys(rf);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div[1]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[3]/div/a/i")
@CacheLookup
WebElement Message_Responsecrose;

public void Message_Responsecrose()
{
	Message_Responsecrose.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Add Text Message')]")
@CacheLookup
WebElement Message_ADDtextMessage;

public void Message_ADDtextMessage()
{
	Message_ADDtextMessage.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div[1]/header/a")
@CacheLookup
WebElement Message_RemoveMessage;

public void Message_RemoveMessage()
{
	Message_RemoveMessage.click();
}

@FindBy(how=How.NAME,using="voiceMessage")
@CacheLookup
WebElement Message_voiceMessage;

public void Message_voiceMessage()
{
	Message_voiceMessage.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[1]/select")
@CacheLookup
WebElement Message_voiceSend;

public void Message_voiceSend()
{
	Select ac = new Select(Message_voiceSend);
	ac.selectByIndex(1);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[2]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_voiceRecipients;

public void Message_voiceRecipients()
{
	Message_voiceRecipients.click();
}

@FindBy(how=How.XPATH,using="//h4[contains(text(),'PATIENT')]")
@CacheLookup
WebElement Message_voiceRecipientsPATIENT;

public void Message_voiceRecipientsPATIENT()
{
	Message_voiceRecipientsPATIENT.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[1]/div/div/div[1]/div/textarea")
@CacheLookup
WebElement Message_VoiceMessageContent;

public void Message_VoiceMessageContent(String mvc)
{
	Message_VoiceMessageContent.click();
	Message_VoiceMessageContent.sendKeys(mvc);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div/div/div/a")
@CacheLookup
WebElement Message_VoiceAddResponse;

public void Message_VoiceAddResponse()
{
	Message_VoiceAddResponse.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
@CacheLookup
WebElement Message_VoiceAddResponsetext;

public void  Message_VoiceAddResponsetext(String v)
{
	Message_VoiceAddResponsetext.click();
	Message_VoiceAddResponsetext.sendKeys(v);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
@CacheLookup
WebElement Message_VoiceAddResponseSelect;

public void Message_VoiceAddResponseSelect()
{
	Select ab = new Select(Message_VoiceAddResponseSelect);
			ab.selectByVisibleText("Cancel");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[2]/div/div/input")
@CacheLookup
WebElement Message_VoiceAddResponseFollow;

public void Message_VoiceAddResponseFollow(String f)
{
	Message_VoiceAddResponseFollow.click();
	Message_VoiceAddResponseFollow.sendKeys(f);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[3]/div/a/i")
@CacheLookup
WebElement Message_VoiceAddResponseCross;

public void Message_VoiceAddResponseCross()
{
	Message_VoiceAddResponseCross.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[3]/div/div/div[3]/div[2]/div/header/div/div/div[2]/input")
@CacheLookup
WebElement Message_Sameasabove;

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[3]/div/div/div[3]/div[2]/div/div/div[2]/div/textarea")
@CacheLookup
WebElement Message_VoiceMailContent;

public void Message_VoiceMailContent(String mvc)
{
	Message_VoiceMailContent.click();
	Message_VoiceMailContent.sendKeys(mvc);
}

@FindBy(how=How.NAME,using="emailMessage")
@CacheLookup
WebElement Message_emailMessage;

public void Message_emailMessage()
{
	Message_emailMessage.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[1]/select")
@CacheLookup
WebElement Message_emailMessageSend;

public void Message_emailMessageSend()
{
	Select em = new Select(Message_emailMessageSend);
	em.selectByIndex(1);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[1]/div/div[1]/input")
@CacheLookup
WebElement Message_emailResponse;

public void Message_emailResponse()
{
	Message_emailResponse.click();
}

@FindBy(how=How.XPATH,using="//h4[contains(text(),'APPOINTMENT')]")
@CacheLookup
WebElement Message_emailResponseAppoint;

public void Message_emailResponseAppoint()
{
	Message_emailResponseAppoint.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[2]/div/div[1]/input")
@CacheLookup
WebElement Message_email_cc;

public void Message_email_cc()
{
	Message_email_cc.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"ui-select-choices-row-1-1\"]/span/div")
@CacheLookup
WebElement Message_email_ccUser;

public void Message_email_ccUser()
{
	Message_email_ccUser.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[4]/div/div/div[2]/recipients[3]/div/div[1]/input")
@CacheLookup
WebElement Message_email_Bcc;

public void Message_email_Bcc()
{
	Message_email_Bcc.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"ui-select-choices-row-2-1\"]/span/div/h4")
@CacheLookup
WebElement Message_email_BccAppoint;

public void Message_email_BccAppoint()
{
	Message_email_BccAppoint.click();
}

@FindBy(how=How.NAME,using="subject")
@CacheLookup
WebElement Message_email_Subject;

public void Message_email_Subject(String es)
{
	Message_email_Subject.click();
	Message_email_Subject.sendKeys(es);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[4]/div/div/div/div/div/textarea")
@CacheLookup
WebElement Message_EmailContent;

public void Message_EmailContent(String mec)
{
	Message_EmailContent.click();
	Message_EmailContent.sendKeys(mec);
}

@FindBy(how=How.NAME,using="HLSevenMessage")
@CacheLookup
WebElement Message_HL7Message;

public void Message_HL7Message()
{
	Message_HL7Message.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/div/div/div[1]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_HL7Message_Address;

public void Message_HL7Message_Address(String a)
{
	Message_HL7Message_Address.click();
	Message_HL7Message_Address.sendKeys(a);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/div/div/div[2]/div/div/div/div/div/textarea")
@CacheLookup
WebElement Message_MessageContent;

public void Message_MessageContent(String mc)
{
	Message_MessageContent.click();
	Message_MessageContent.sendKeys(mc);
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Save Changes')]")
@CacheLookup
WebElement Message_Save;

public void Message_Save()
{
	Message_Save.click();
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]")
@CacheLookup
WebElement Message_Cancel;

public void Message_Cancel()
{
	Message_Cancel.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[1]/div[2]/label/input")
@CacheLookup
WebElement Message_ChoosefromCoreMessages;

public void Message_ChoosefromCoreMessages()
{
	Message_ChoosefromCoreMessages.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[2]/form/div/select")
@CacheLookup
WebElement Message_fromTemplate;

public void Message_fromTemplate()
{
	Select af = new Select(Message_fromTemplate);
	af.selectByVisibleText("Pre-Op Sx Message");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[1]/div/div/input")
@CacheLookup
WebElement Message_Templatetitle;

public void Message_Templatetitle(String tt)
{
	Message_Templatetitle.click();
	Message_Templatetitle.clear();
	Message_Templatetitle.sendKeys(tt);
}

@FindBy(how=How.XPATH,using="//*[@name='category']//following::select[1]")
@CacheLookup
WebElement Message_Templatecategory;

public void Message_Templatecategory()
{
	Select at = new Select(Message_Templatecategory);
	at.selectByIndex(2);
	
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[2]/div/select")
@CacheLookup
WebElement Message_TemplateTrigger;

public void Message_TemplateTrigger_FLOW()
{
	Select tt = new Select(Message_TemplateTrigger);
	tt.selectByVisibleText("FLOW");
}

public void Message_TemplateTrigger_DISCHARGE()
{
	Select tt = new Select(Message_TemplateTrigger);
	tt.selectByVisibleText("DISCHARGE");
}


public void Message_TemplateTrigger_REMINDER()
{
	Select tt = new Select(Message_TemplateTrigger);
	tt.selectByVisibleText("REMINDER");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/button")
@CacheLookup
WebElement Message_TemplateLimits;

public void Message_TemplateLimits()
{
	Message_TemplateLimits.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/ul/li[1]/a")
@CacheLookup
WebElement Message_TemplateLimitsCHECKall;

public void Message_TemplateLimitsCHECKall()
{
	Message_TemplateLimitsCHECKall.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/trigger-settings/div/div/div/div[1]/div/select")
@CacheLookup
WebElement Message_TemplateTriggerSettings;

public void Message_TemplateTriggerSettings()
{
	Message_TemplateTriggerSettings.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/trigger-settings/div/div/div/div[1]/div/select/option[2]")
@CacheLookup
WebElement Message_TemplateTriggerSettingsRegistration;

public void Message_TemplateTriggerSettingsRegistration()
{
	Message_TemplateTriggerSettingsRegistration.click();
}


public void Message_TemplateTriggerSettings_Discharge()
{
	Select tts = new Select(Message_TemplateTriggerSettings);
	tts.selectByVisibleText("Discharge");
}

@FindBy(how=How.NAME,using="Grouping")
@CacheLookup
WebElement CadenceCheckbox;

public void CadenceCheckbox()
{
	CadenceCheckbox.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div[2]/cadence/div[1]/select")
@CacheLookup
WebElement Delay_Immediately;

public void Delay()
{
	Select ai = new Select(Delay_Immediately);
	ai.selectByVisibleText("Delay");
}

public void Immediately1()
{
	Select ai = new Select(Delay_Immediately);
	ai.selectByVisibleText("Immediately");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div[2]/cadence/span/span/input")
@CacheLookup
WebElement Delay_Immediately_Numbers;

public void Delay_Immediately_Numbers(String d)
{
	Delay_Immediately_Numbers.click();
	Delay_Immediately_Numbers.clear();
	Delay_Immediately_Numbers.sendKeys(d);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div[2]/cadence/span/span/span/select")
@CacheLookup
WebElement Days_Hour_Minute;

public void Hour()
{
	Select a = new Select(Days_Hour_Minute);
	a.selectByVisibleText("Hour(s)");
}

public void Minute1()
{
	Select a = new Select(Days_Hour_Minute);
	a.selectByVisibleText("Minute(s)");
}


public void Days()
{
	Select a = new Select(Days_Hour_Minute);
	a.selectByVisibleText("Day(s)");
}

@FindBy(how=How.NAME,using="setSpecificTime")
@CacheLookup
WebElement MEssage_Template_setSpecificTime;

public void MEssage_Template_setSpecificTime()
{
	MEssage_Template_setSpecificTime.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div[2]/cadence/div[2]/span/div/time-picker/div/input")
@CacheLookup
WebElement setSpecificTime_text;

public void setSpecificTime_text(String f)
{
	setSpecificTime_text.click();
	setSpecificTime_text.clear();
	setSpecificTime_text.sendKeys(f);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div[2]/cadence/div[2]/span/div/time-picker/div/span/button")
@CacheLookup
WebElement setSpecificTime_AMPM;

public void setSpecificTime_AMPM()
{
	setSpecificTime_AMPM.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div[2]/a/i")
@CacheLookup
WebElement MEssage_Template_CadenceCross;

public void MEssage_Template_CadenceCross()
{
	MEssage_Template_CadenceCross.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'+ Add Cadence')]")
@CacheLookup
WebElement MEssage_Template_AddCadence;

public void MEssage_Template_AddCadence()
{
	MEssage_Template_AddCadence.click();
}



public void Message_TemplateTriggerSettingsReminder()
{
	Select tts = new Select(Message_TemplateTriggerSettings);
	tts.selectByVisibleText("REMINDER");
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div[2]/cadence/span/span/div/select")
@CacheLookup
WebElement MEssage_Template_Before_After;

public void MEssage_Template_Before()
{
	Select d = new Select(MEssage_Template_Before_After);
	d.selectByVisibleText("Before");
}

public void MEssage_Template_After()
{
	Select d = new Select(MEssage_Template_Before_After);
	d.selectByVisibleText("After");
}




public void Message_TemplateTriggerSettings3()
{
	Select tts = new Select(Message_TemplateTriggerSettings);
	tts.selectByVisibleText("Holding");
}


public void Message_TemplateTriggerSettings4()
{
	Select tts = new Select(Message_TemplateTriggerSettings);
	tts.selectByVisibleText("Connect Check In");
}


public void Message_TemplateTriggerSettings5()
{
	Select tts = new Select(Message_TemplateTriggerSettings);
	tts.selectByVisibleText("Call Back");
}

public void Message_TemplateTriggerSettings6()
{
	Select tts = new Select(Message_TemplateTriggerSettings);
	tts.selectByVisibleText("Waiting in the Parking Lot");
}


public void Message_TemplateTriggerSettings7()
{
	Select tts = new Select(Message_TemplateTriggerSettings);
	tts.selectByVisibleText("Fill Out Documents");
}

@FindBy(how=How.NAME,using="nodeTrigger")
@CacheLookup
WebElement Message_TemplateNodeTrigger;

public void Message_TemplateNodeTrigger()
{
	Select tt = new Select(Message_TemplateNodeTrigger);
	tt.selectByVisibleText("NODE_STARTED");
}

public void Message_TemplateNodeTrigger_NODE_STOPPED()
{
	Select tt = new Select(Message_TemplateNodeTrigger);
	tt.selectByVisibleText("NODE_STOPPED");
}


public void Message_TemplateNodeTrigger_THRESHOLD()
{
	Select tt = new Select(Message_TemplateNodeTrigger);
	tt.selectByVisibleText("THRESHOLD");
}


@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/trigger-settings/div/div/div/div[3]/div[2]/div/div/label/input")
@CacheLookup
WebElement   Message_TemplateNodeTrigger_Noconditionsapply;

public void Message_TemplateNodeTrigger_Noconditionsapply()
{
	Message_TemplateNodeTrigger_Noconditionsapply.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/trigger-settings/div/div/div/div[3]/div[3]/div/div/label/input")
@CacheLookup
WebElement Message_TemplateNodeTrigger_Whenthepatientposition;

public void Message_TemplateNodeTrigger_Whenthepatientposition()
{
	Message_TemplateNodeTrigger_Whenthepatientposition.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/trigger-settings/div/div/div/div[3]/div[4]/div/div/div[1]/input")
@CacheLookup
WebElement Message_TemplateNodeTrigger_andtotalqueuesizeis;

public void Message_TemplateNodeTrigger_andtotalqueuesizeis(String d)
{
	Message_TemplateNodeTrigger_andtotalqueuesizeis.click();
	Message_TemplateNodeTrigger_andtotalqueuesizeis.clear();
	Message_TemplateNodeTrigger_andtotalqueuesizeis.sendKeys(d);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/trigger-settings/div/div/div/div[3]/div[4]/div/div/div[3]/select")
@CacheLookup
WebElement Message_TemplateNodeTrigger_andtotalqueuesizeis2;

public void Message_TemplateNodeTrigger_andtotalqueuesizeis2()
{
	Select ad = new Select(Message_TemplateNodeTrigger_andtotalqueuesizeis2);
	ad.selectByVisibleText("GREATER_THAN");
}

public void Message_TemplateNodeTrigger_andtotalqueuesizeis3()
{
	Select ad = new Select(Message_TemplateNodeTrigger_andtotalqueuesizeis);
	ad.selectByVisibleText("LESS_THAN");
}

public void Message_TemplateNodeTrigger_andtotalqueuesizeis4()
{
	Select ad = new Select(Message_TemplateNodeTrigger_andtotalqueuesizeis);
	ad.selectByVisibleText("EQUAL_TO");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/trigger-settings/div/div/div/div[3]/div[4]/div/div/div[4]/input")
@CacheLookup
WebElement Message_TemplateNodeTrigger_andtotalqueuesizeistext;

public void Message_TemplateNodeTrigger_andtotalqueuesizeistext(String g)
{
	Message_TemplateNodeTrigger_andtotalqueuesizeistext.click();
	Message_TemplateNodeTrigger_andtotalqueuesizeistext.clear();
	Message_TemplateNodeTrigger_andtotalqueuesizeistext.sendKeys(g);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/header/input")
@CacheLookup
WebElement Message_TemplateTextMessage;

public void Message_TemplateTextMessage()
{
	if(!Message_TemplateTextMessage.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click()", Message_TemplateTextMessage);
		if(!Message_TemplateTextMessage.isSelected()) {
			Message_TemplateTextMessage.isSelected();
			Message_TemplateTextMessage.click();
		}
}

}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[1]/select")
@CacheLookup
WebElement Message_TemplateTextSend;

public void Message_TemplateTextSend()
{
	Select at = new Select(Message_TemplateTextSend);
	at.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[2]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_TemplateTextRecipients;

public void Message_TemplateTextRecipients()
{
	Message_TemplateTextRecipients.click();
}

@FindBy(how=How.XPATH,using="//h4[contains(text(),'USER')]")
@CacheLookup
WebElement Message_TemplateTextRecipientsUser;

public void Message_TemplateTextRecipientsUser()
{
	Message_TemplateTextRecipientsUser.click();
}


@FindBy(how=How.NAME,using="smsMessageMessage")
@CacheLookup
WebElement Message_TemplateTextContent;

public void Message_TemplateTextContent(String mtc) throws Exception
{
	 Message_TemplateTextContent.clear();
	 Message_TemplateTextContent.sendKeys(mtc);
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div/div/div/a")
@CacheLookup
WebElement Message_TemplateResponse;

public void Message_TemplateResponse()
{
	Message_TemplateResponse.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
@CacheLookup
WebElement Message_TemplateResponseText;

public void Message_TemplateResponseText(String s)
{
	
	Message_TemplateResponseText.click();
	Message_TemplateResponseText.clear();
	Message_TemplateResponseText.sendKeys(s);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
@CacheLookup
WebElement Message_TemplateResponseStatus;

public void Message_TemplateResponseStatus()
{
	Select as = new Select(Message_TemplateResponseStatus);
	as.selectByVisibleText("Confirm");
}

public void Message_TemplateResponseStatus2()
{
	Select as = new Select(Message_TemplateResponseStatus);
	as.selectByVisibleText("Cancel");
}

public void Message_TemplateResponseStatus3()
{
	Select as = new Select(Message_TemplateResponseStatus);
	as.selectByVisibleText("Check In");
}

public void Message_TemplateResponseStatus4()
{
	Select as = new Select(Message_TemplateResponseStatus);
	as.selectByVisibleText("Remote Check In");
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[2]/div/div/input")
@CacheLookup
WebElement Message_TemplateResponseFollow;

public void Message_TemplateResponseFollow(String fr)
{
	Message_TemplateResponseFollow.click();
	Message_TemplateResponseFollow.clear();
	Message_TemplateResponseFollow.sendKeys(fr);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[3]/div/a/i")
@CacheLookup
WebElement Message_TemplateResponseCross;

public void Message_TemplateResponseCross()
{
	Message_TemplateResponseCross.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Add Text Message')]")
@CacheLookup
WebElement Message_TemplateAddtextMessage;

public void Message_TemplateAddtextMessage()
{
	Message_TemplateAddtextMessage.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div[2]/header/a")
@CacheLookup
WebElement Message_TemplateAddtextMessageRemove;

public void Message_TemplateAddtextMessageRemove()
{
	Message_TemplateAddtextMessageRemove.click();
}



@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[2]/div/header/a")
@CacheLookup
WebElement Message_TemplateRemoveMessage;

public void Message_TemplateRemoveMessage()
{
	Message_TemplateRemoveMessage.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[3]/header/input")
@CacheLookup
WebElement Message_TemplateVoiceMessage;

public void Message_TemplateVoiceMessage()
{
	Message_TemplateVoiceMessage.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[1]/select")
@CacheLookup
WebElement Message_TemplateVoiceSend;

public void Message_TemplateVoiceSend()
{
	Select tv = new Select(Message_TemplateVoiceSend);
	tv.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[2]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_TemplateVoiceRecipients;

public void Message_TemplateVoiceRecipients()
{
	Message_TemplateVoiceRecipients.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[2]/recipients/div/ul/li/div[4]/span/div/h4")
@CacheLookup
WebElement Message_TemplateVoiceRecipientsAppoint;

public void Message_TemplateVoiceRecipientsAppoint()
{
	Message_TemplateVoiceRecipientsAppoint.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[1]/div/div/div[1]/div/textarea")
@CacheLookup
WebElement Message_TemplateVoiceContent;

public void Message_TemplateVoiceContent(String s)
{
	
	
	Message_TemplateVoiceContent.sendKeys(s);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div/div/div/a")
@CacheLookup
WebElement Message_TemplateVoiceResponse;

public void Message_TemplateVoiceResponse()
{
	Message_TemplateVoiceResponse.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
@CacheLookup
WebElement Message_TemplateVoiceResponseText;

public void Message_TemplateVoiceResponseText(String vr)
{
	Message_TemplateVoiceResponseText.click();
	Message_TemplateVoiceResponseText.clear();
	Message_TemplateVoiceResponseText.sendKeys(vr);
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
@CacheLookup
WebElement Message_TemplateVoiceResponseStatus;

public void Message_TemplateVoiceResponseStatus()
{
	Select tvr = new Select(Message_TemplateVoiceResponseStatus);
	tvr.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[2]/div/div/input")
@CacheLookup
WebElement Message_TemplateVoiceResponseFollow;

public void Message_TemplateVoiceResponseFollow(String vrf)
{
	Message_TemplateVoiceResponseFollow.click();
	Message_TemplateVoiceResponseFollow.clear();
	Message_TemplateVoiceResponseFollow.sendKeys(vrf);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[3]/div/a/i")
@CacheLookup
WebElement Message_TemplateVoiceResponseCross;

public void Message_TemplateVoiceResponseCross()
{
	Message_TemplateVoiceResponseCross.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[2]/div/header/div/div/div[2]/input")
@CacheLookup
WebElement Message_TemplateVoiceSAMEASABOVE;

public void Message_TemplateVoiceSAMEASABOVE()
{
	Message_TemplateVoiceSAMEASABOVE.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[2]/div/div/div[2]/div/textarea")
@CacheLookup
WebElement Message_TemplateVoiceMailContent;

public void Message_TemplateVoiceMailContent(String v)
{
	Message_TemplateVoiceMailContent.click();
	Message_TemplateVoiceMailContent.clear();
	Message_TemplateVoiceMailContent.sendKeys("v");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/header/input")
@CacheLookup
WebElement Message_TemplateEmail;

public void Message_TemplateEmail()
{
	Message_TemplateEmail.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[4]/div/div/div[1]/select")
@CacheLookup
WebElement Message_TemplateEmailSend;

public void Message_TemplateEmailSend()
{
	Select ae = new Select(Message_TemplateEmailSend);
	ae.selectByIndex(0);}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[4]/div/div/div[2]/recipients[1]/div/div[1]/input")
@CacheLookup
WebElement Message_TemplateEmailRecipients;

public void Message_TemplateEmailRecipients()
{
	Message_TemplateEmailRecipients.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[1]/div/ul/li/div[4]/span/div/h4")
@CacheLookup
WebElement Message_TemplateEmailRecipientsAppoint;

public void Message_TemplateEmailRecipientsAppoint()
{
	Message_TemplateEmailRecipientsAppoint.click();
}

@FindBy(how=How.CSS,using="#message-builder-editor > form > div:nth-child(5) > div > div > div:nth-child(2) > recipients:nth-child(4) > div > div:nth-child(1) > input")
@CacheLookup
WebElement Message_TemplateEmailCC;

public void Message_TemplateEmailCC()
{
	Message_TemplateEmailCC.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[2]/div/ul/li/div[5]/span/div/h4")
@CacheLookup
WebElement Message_TemplateEmailCCUser;

public void Message_TemplateEmailCCUser()
{
	Message_TemplateEmailCCUser.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[3]/div")
@CacheLookup
WebElement Message_TemplateEmailBcc;

public void Message_TemplateEmailBcc()
{
	Message_TemplateEmailBcc.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[3]/div/ul/li/div[6]/span/div/h4")
@CacheLookup
WebElement Message_TemplateEmailBccAdmin;

public void Message_TemplateEmailBccAdmin()
{
	Message_TemplateEmailBccAdmin.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[3]/div/input")
@CacheLookup
WebElement Message_TemplateEmailSubject;

public void Message_TemplateEmailSubject(String tms)
{
	Message_TemplateEmailSubject.click();
	Message_TemplateEmailSubject.sendKeys(tms);
}

@FindBy(how=How.XPATH,using="//*[@id=\"emailMessageMessage\"]")
@CacheLookup
WebElement Message_TemplateEmailContent;

public void Message_TemplateEmailContent(String te)
{
	Message_TemplateEmailContent.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/header/input")
@CacheLookup
WebElement Message_TemplateHL7;

public void Message_TemplateHL7()
{
	Message_TemplateHL7.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/div/div/div[1]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_TemplateHL7Address;

public void Message_TemplateHL7Address(String a)
{
	Message_TemplateHL7Address.click();
	Message_TemplateHL7Address.clear();
	Message_TemplateHL7Address.sendKeys(a);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/div/div/div[2]/div/div/div/div/div/textarea")
@CacheLookup
WebElement Message_TemplateHL7Message;

public void Message_TemplateHL7Message(String m)
{
	Message_TemplateHL7Message.click();
	Message_TemplateHL7Message.clear();
	Message_TemplateHL7Message.sendKeys(m);
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Save Changes')]")
@CacheLookup
WebElement 	Message_TemplateSave;

public void Message_TemplateSave()
{
	Message_TemplateSave.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[6]/div/div/div/div/button[1]")
@CacheLookup
WebElement Message_TemplateCANCEL;

public void Message_TemplateCANCEL()
{
	Message_TemplateCANCEL.click();
}
//Choose from Org Messages

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[1]/div[3]/label/input")
@CacheLookup
WebElement ChoosefromOrgMessages;

public void ChoosefromOrgMessages()
{
	ChoosefromOrgMessages.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[2]/form/div/select")
@CacheLookup
WebElement ChoosefromOrgMessagesSelect;

public void ChoosefromOrgMessagesSelect()
{
	Select org = new Select(ChoosefromOrgMessagesSelect);
	org.selectByIndex(0);
}

public void ChoosefromOrgMessagesSelect1()
{
	Select org = new Select(ChoosefromOrgMessagesSelect);
	org.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[3]/div[2]/label/input")
@CacheLookup
WebElement Copythismessageandmakechanges;

public void Copythismessageandmakechanges()
{
	Copythismessageandmakechanges.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[2]/div/span")
@CacheLookup
WebElement confirmmessage;

public void confirmmessage(String v)
{
	String act = confirmmessage.getText();
	System.out.println("Error message is: "+ act);
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[3]/div[1]/label/input")
@CacheLookup
WebElement Assignthismessagtothisdepartment;

public void Assignthismessagtothisdepartment()
{
	Assignthismessagtothisdepartment.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[1]/div/div[2]/table/tbody/tr[1]/td[5]/button[1]")
@CacheLookup
WebElement Message_Edit;

public void Message_Edit()
{
	Message_Edit.click();
}

@FindBy(how=How.NAME,using="title")
@CacheLookup
WebElement Message_EditTitle;

public void Message_EditTitle(String s)
{
	Message_EditTitle.click();
	Message_EditTitle.clear();
	Message_EditTitle.sendKeys(s);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[1]/div/select")
@CacheLookup
WebElement Message_EditCategory;

public void Message_EditCategory()
{
	Select ec = new Select(Message_EditCategory);
	ec.selectByVisibleText("SCHEDULE");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[2]/div/select")
@CacheLookup
WebElement Message_EditTrigger;

public void Message_EditTrigger()
{
	Select et = new Select(Message_EditTrigger);
	et.selectByVisibleText("CONFIRMED");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/button")
@CacheLookup
WebElement Message_EditLimits;

public void Message_EditLimits()
{
	Message_EditLimits.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/ul/li[1]/a")
@CacheLookup
WebElement Message_EditLimitsCHECKALL;

public void Message_EditLimitsCHECKALL()
{
	Message_EditLimitsCHECKALL.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[2]/div/header/input")
@CacheLookup
WebElement Message_EditTextMessage;

public void Message_EditTextMessage()
{
	if(!Message_EditTextMessage.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		e.executeScript("arguments[0].click()", Message_EditTextMessage);
		if(!Message_EditTextMessage.isSelected()) {
			Message_EditTextMessage.isSelected();
			Message_EditTextMessage.click();
		}
	}
	
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/header/a")
@CacheLookup
WebElement Message_EditRemoveMessage;

public void Message_EditRemoveMessage()
{
	Message_EditRemoveMessage.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[1]/select")
@CacheLookup
WebElement Message_EditSendFrom;

public void Message_EditSendFrom()
{
	Select at = new Select(Message_EditSendFrom);
	at.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[2]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_EditRecipients;

public void Message_EditRecipients()
{
	Message_EditRecipients.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"ui-select-choices-row-39-1\"]/span/div/h4")
@CacheLookup
WebElement Message_EditRecipientsAppoints;

public void Message_EditRecipientsAppoints()
{
	Message_EditRecipientsAppoints.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/textarea")
@CacheLookup
WebElement Message_EditTextMessageContent;

public void Message_EditTextMessageContent(String g)
{
	Message_EditTextMessageContent.click();
	Message_EditTextMessageContent.sendKeys(g);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div/div/div/a")
@CacheLookup
WebElement Message_EditEditResponse;

public void Message_EditResponse()
{
	Message_EditEditResponse.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
@CacheLookup
WebElement Message_EditEditResponseTitle;

public void Message_EditEditResponseTitle(String Rt)
{
	Message_EditEditResponseTitle.click();
	Message_EditEditResponseTitle.sendKeys(Rt);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
@CacheLookup
WebElement Message_EditEditResponseSelect;

public void Message_EditEditResponseSelect()
{
	Select er = new Select(Message_EditEditResponseSelect);
	er.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[2]/div/div/input")
@CacheLookup
WebElement Message_EditEditResponseFollow;

public void Message_EditEditResponseFollow(String vb)
{
	Message_EditEditResponseFollow.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[3]/div/a/i")
@CacheLookup
WebElement Message_EditEditResponseCross;

public void Message_EditEditResponseCross()
{
	Message_EditEditResponseCross.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/header/input")
@CacheLookup
WebElement Message_EditVoiceMessage;

public void Message_EditVoiceMessage()
{
	Message_EditVoiceMessage.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[1]/select")
@CacheLookup
WebElement Message_EditVoiceSendFrom;

public void Message_EditVoiceSendFrom()
{
	Select ab = new Select(Message_EditVoiceSendFrom);
	ab.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[2]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_EditVoiceRecipients;

public void Message_EditVoiceRecipients()
{
	Message_EditVoiceRecipients.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[2]/recipients/div/ul/li/div[5]/span/div/h4")
@CacheLookup
WebElement Message_EditVoiceRecipientsUser;


public void Message_EditVoiceRecipientsUser()
{
	Message_EditVoiceRecipientsUser.click();
}



@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[1]/div/div/div[1]/div/textarea")
@CacheLookup
WebElement Message_EditVoiceContent;

public void Message_EditVoiceContent(String as)
{
	
	Message_EditVoiceContent.sendKeys(as);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div/div/div/a")
@CacheLookup
WebElement Message_EditVoiceADDResponse;

public void Message_EditVoiceADDResponse()
{
	Message_EditVoiceADDResponse.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
@CacheLookup
WebElement Message_EditVoiceResponseTest;

public void Message_EditVoiceResponseTest(String vrt)
{
	Message_EditVoiceResponseTest.click();
	Message_EditVoiceResponseTest.clear();
	Message_EditVoiceResponseTest.sendKeys(vrt);
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
@CacheLookup
WebElement Message_EditVoiceResponseSelect;

public void Message_EditVoiceResponseSelect()
{
	Select bc = new Select(Message_EditVoiceResponseSelect);
	bc.selectByIndex(0);
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[2]/div/div/input")
@CacheLookup
WebElement Message_EditVoiceResponseFOLLOW;

public void Message_EditVoiceResponseFOLLOW(String vc)
{
	Message_EditVoiceResponseFOLLOW.click();
	Message_EditVoiceResponseFOLLOW.clear();
	Message_EditVoiceResponseFOLLOW.sendKeys("vc");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[3]/div/a/i")
@CacheLookup
WebElement Message_EditVoiceResponseCross;

public void Message_EditVoiceResponseCross()
{
	Message_EditVoiceResponseCross.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[2]/div/header/div/div/div[2]/input")
@CacheLookup
WebElement Message_EditVoiceMailContent;

public void Message_EditVoiceMailContent_SAMEASABOVE()
{
	Message_EditVoiceMailContent.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[2]/div/div/div[2]/div/textarea")
@CacheLookup
WebElement Message_EditVoiceMailContentText;

public void Message_EditVoiceMailContentText(String df)
{
	
	Message_EditVoiceMailContentText.sendKeys(df);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/header/input")
@CacheLookup
WebElement Message_EditMail;

public void Message_EditMail()
{
	if(!Message_EditMail.isSelected()){
		JavascriptExecutor em = (JavascriptExecutor)ldriver;
		em.executeScript("arguments[0].click", Message_EditMail);
		if(!Message_EditMail.isSelected()) {
			Message_EditMail.click();
		}
		
	}
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[1]/select")
@CacheLookup
WebElement Message_EditMailSendFrom;

public void Message_EditMailSendFrom()
{
	Select msf = new Select(Message_EditMailSendFrom);
	msf.selectByIndex(0);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[1]/div/div[1]/input")
@CacheLookup
WebElement Message_EditMailRecipients;

public void Message_EditMailRecipients()
{
	Message_EditMailRecipients.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[1]/div/ul/li/div[5]/span")
@CacheLookup
WebElement Message_EditMailRecipientsAppoint;

public void Message_EditMailRecipientsAppoint()
{
	Message_EditMailRecipientsAppoint.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[2]/div/div[1]/input")
@CacheLookup
WebElement Message_EditMailCC;

public void Message_EditMailCC()
{
	Message_EditMailCC.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[2]/div/div[1]/input")
@CacheLookup
WebElement Message_EditMailCCUSER;

public void Message_EditMailCCUSER()
{
	Message_EditMailCCUSER.click();
}


@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[4]/div/div/div[2]/recipients[3]/div/div[1]/input")
@CacheLookup
WebElement Message_EditMailBCCUSER;

public void Message_EditMailBCCUSER()
{
	Message_EditMailBCCUSER.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"ui-select-choices-row-35-1\"]/span/div/h4")
@CacheLookup
WebElement Message_EditMailBCCAppoint;

public void Message_EditMailBCCAppoint()
{
	Message_EditMailBCCAppoint.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[3]/div/input")
@CacheLookup
WebElement Message_EditMailSUBJECT;

public void Message_EditMailSUBJECT(String b)
{
	Message_EditMailSUBJECT.click();
	Message_EditMailSUBJECT.clear();
	Message_EditMailSUBJECT.sendKeys(b);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[4]/div/div/div/div/div/textarea")
@CacheLookup
WebElement Message_EditMailContent;

public void Message_EditMailContent(String emc)
{
	Message_EditMailContent.click();
	Message_EditMailContent.clear();
	Message_EditMailContent.sendKeys(emc);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/header/input")
@CacheLookup
WebElement Message_EditHl7;

public void Message_EditHl7()
{
	if(!Message_EditHl7.isSelected()) {
		JavascriptExecutor as = (JavascriptExecutor)ldriver;
		as.executeScript("arguments[0].click", Message_EditHl7);
		if(!Message_EditHl7.isSelected())
		{
			Message_EditHl7.click();
			
		}
		
	}
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/div/div/div[1]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_EditHl7Address;

public void Message_EditHl7Address(String n)
{
	
	Message_EditHl7Address.sendKeys(n);
}

@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[5]/div/div/div[2]/div/div/div/div/div/textarea")
@CacheLookup
WebElement Message_EditHl7MessageContent;

public void Message_EditHl7MessageContent(String n)
{
	Message_EditHl7MessageContent.click();
	Message_EditHl7MessageContent.clear();
	Message_EditHl7MessageContent.sendKeys(n);
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Save Changes')]")
@CacheLookup
WebElement Message_Edit_save;

public void Message_Edit_save()
{
	Message_Edit_save.click();
}


@FindBy(how=How.XPATH,using="//span[contains(text(),'Message saved')]")
@CacheLookup
WebElement Message_EditSAVECHANGEMESSAGE;

public void Message_EditSAVECHANGEMESSAGE()
{
	String act = Message_EditSAVECHANGEMESSAGE.getText();
	System.out.println("Error message is: "+ act);
	
}

//Mobile waiting Room

@FindBy(how=How.XPATH,using="//a[contains(text(),'Mobile Waiting Room')]")
@CacheLookup
WebElement MobilewaitingRoom;

public void MobilewaitingRoom()
{
	MobilewaitingRoom.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[1]/div[2]/div[2]/div[1]/label/input")
@CacheLookup
WebElement OrgnizationAddress;

public void OrgnizationAddress()
{
	OrgnizationAddress.click();
}

@FindBy(how=How.ID,using="remoteCheckIn")
@CacheLookup
WebElement AllowRemoteCheckin;

public void AllowRemoteCheckin()
{
	AllowRemoteCheckin.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[2]/div[2]/form/div[1]/div/select")
@CacheLookup
WebElement INadvance;

public void INadvance1()
{
	Select as = new Select(INadvance);
	as.selectByVisibleText("30 Min");
}

public void INadvance2()
{
	Select as = new Select(INadvance);
	as.selectByVisibleText("1 Hour");
}

public void INadvance3()
{
	Select as = new Select(INadvance);
	as.selectByVisibleText("2 Hours");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[2]/div[2]/form/div[2]/div/input")
@CacheLookup
WebElement ftoflocation;

public void ftoflocation(String t)
{
	ftoflocation.click();
	ftoflocation.clear();
	ftoflocation.sendKeys(t);
}

@FindBy(how=How.ID,using="limitAppt")
@CacheLookup
WebElement Limitappointmentconfirmationwindow;

public void Limitappointmentconfirmationwindow()
{
	Limitappointmentconfirmationwindow.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[3]/div[2]/form/div[2]/div/input")
@CacheLookup
WebElement hourfromappointment;

public void hourfromappointment(String h)
{
	hourfromappointment.click();
	hourfromappointment.clear();
	hourfromappointment.sendKeys(h);
}


@FindBy(how=How.ID,using="showInline")
@CacheLookup
WebElement Showplaceinline;

public void Showplaceinline()
{
	Showplaceinline.click();
}

@FindBy(how=How.ID,using="showWaitTime")
@CacheLookup
WebElement showWaitTime;

public void showWaitTime()
{
	showWaitTime.click();
}

@FindBy(how=How.ID,using="progressText")
@CacheLookup
WebElement progressText;

public void progressText(String b)
{
	progressText.click();
	progressText.clear();
	progressText.sendKeys(b);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[5]/a")
@CacheLookup
WebElement AddNewProgressSteps;

public void AddNewProgressSteps()
{
	AddNewProgressSteps.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[7]/div[2]/form/div[1]/input")
@CacheLookup
WebElement AddnewProgress_name;

public void AddnewProgress_name(String a)
{
	AddnewProgress_name.click();
	AddnewProgress_name.sendKeys(a);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[7]/div[2]/form/div[2]/div/button")
@CacheLookup
WebElement AddnewProgress_choosedepartment;

public void AddnewProgress_choosedepartment()
{
	AddnewProgress_choosedepartment.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[7]/div[2]/form/div[2]/div/div/div[1]/label/input")
@CacheLookup
WebElement AddnewProgress_choosedepartment_next;

public void AddnewProgress_choosedepartment_next()
{
	AddnewProgress_choosedepartment_next.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[7]/div[2]/form/div[3]/div/button")
@CacheLookup
WebElement AddnewProgress_chooseFilter;

public void AddnewProgress_chooseFilter()
{
	AddnewProgress_chooseFilter.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[7]/div[2]/form/div[3]/div/div/div[1]/div[2]/label/input")
@CacheLookup
WebElement AddnewProgress_chooseFilter_Registration;


public void AddnewProgress_chooseFilter_Registration()
{
	AddnewProgress_chooseFilter_Registration.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[6]/div[1]/a")
@CacheLookup
WebElement AddnewRemove;

public void AddnewRemove()
{
	AddnewRemove.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[6]/div[2]/form/div[1]/input")
@CacheLookup
WebElement Name;

public void Progresssteps_Name(String n)
{
	Name.click();
	Name.clear();
	Name.sendKeys(n);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[6]/div[2]/form/div[2]/div/button")
@CacheLookup
WebElement ChooseDepartment;

public void ChooseDepartment()
{
	ChooseDepartment.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[6]/div[2]/form/div[2]/div/div/div[1]/label/input")
@CacheLookup
WebElement nextNode2;

public void nextNode2()
{
	nextNode2.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[6]/div[2]/form/div[3]/div/button")
@CacheLookup
WebElement ChooseAFilter;

public void ChooseAFilter()
{
	ChooseAFilter.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/div/div[6]/div[2]/form/div[4]/input")
@CacheLookup
WebElement CallBack;

public void CallBack(String c)
{
	CallBack.click();
	CallBack.clear();
	CallBack.sendKeys(c);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/mobile-waiting-room-editor/section/a")
@CacheLookup
WebElement MobileWaitingSAVE;

public void MobileWaitingSAVE()
{
	MobileWaitingSAVE.click();
}

@FindBy(how=How.XPATH,using="//span[contains(text(),'Mobile waiting room configuration saved.')]")
@CacheLookup
WebElement MobileSave_Message;

public void MobileSave_Message()
{
	String act = MobileSave_Message.getText();
	System.out.println("Error message is: "+ act);
}


       //Kiosk

@FindBy(how=How.XPATH,using="//a[contains(text(),'Kiosk')]")
@CacheLookup
WebElement Dep_Kiosk;

public void Dep_Kiosk()
{
	Dep_Kiosk.click();
}

@FindBy(how=How.ID,using="error-page-message")
@CacheLookup
WebElement Kiosk_errorMessage;

public void Kiosk_errorMessage(String ep)
{
	Kiosk_errorMessage.click();
	Kiosk_errorMessage.clear();
	Kiosk_errorMessage.sendKeys(ep);
}

@FindBy(how=How.ID,using="error-page-timeout")
@CacheLookup
WebElement Kiosk_ErrorMessageTimeout;

public void Kiosk_ErrorMessageTimeout(String t)
{
	Kiosk_ErrorMessageTimeout.click();
	Kiosk_ErrorMessageTimeout.clear();
	Kiosk_ErrorMessageTimeout.sendKeys(t);
}

@FindBy(how=How.ID,using="search-appointment-add")
@CacheLookup
WebElement Kiosk_WalkInAppointmentFlag;

public void Kiosk_WalkInAppointmentFlag()
{
	if(!Kiosk_WalkInAppointmentFlag.isSelected()) {
		
		JavascriptExecutor ab = (JavascriptExecutor)ldriver;
		ab.executeScript("arguments[0].click", Kiosk_WalkInAppointmentFlag);
		if(!Kiosk_WalkInAppointmentFlag.isSelected()) {
			Kiosk_WalkInAppointmentFlag.click();
		}
		
	}
}

@FindBy(how=How.XPATH,using="//*[@id=\"kiosk-config\"]/form/div[1]/div/div[2]/div[1]/div[2]/button")
@CacheLookup
WebElement Kiosk_Flag_dropdown;

public void Kiosk_Flag_dropdown()
{
	Kiosk_Flag_dropdown.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[1]/div/div[2]/div[1]/div[2]/ul/li[1]/a")
@CacheLookup
WebElement Kiosk_Flag_dropdown1;

public void Kiosk_Flag_dropdown1()
{
	Kiosk_Flag_dropdown1.click();
}

@FindBy(how=How.ID,using="add-new-add")
@CacheLookup
WebElement Kiosk_NewPatientCreatedFlag;

public void Kiosk_NewPatientCreatedFlag()
{
	if(!Kiosk_NewPatientCreatedFlag.isSelected()) {
		JavascriptExecutor r = (JavascriptExecutor)ldriver;
		r.executeScript("arguments[0].click", Kiosk_NewPatientCreatedFlag);
		if(!Kiosk_NewPatientCreatedFlag.isSelected()) {
			Kiosk_NewPatientCreatedFlag.click();
		}
	}
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[1]/div/div[2]/div[2]/div[2]/button")
@CacheLookup
WebElement Kiosk_newpatientflag_dropdown;

public void Kiosk_newpatientflag_dropdown()
{
	Kiosk_newpatientflag_dropdown.click();
}


@FindBy(how=How.XPATH,using="//*[@id=\"kiosk-config\"]/form/div[1]/div/div[2]/div[2]/div[2]/ul/li[1]/a")
@CacheLookup
WebElement Kiosk_newpatientflag_dropdown1;

public void Kiosk_newpatientflag_dropdown1()
{
	Kiosk_newpatientflag_dropdown1.click();
}


@FindBy(how=How.ID,using="welcome-page-configure")
@CacheLookup
WebElement Kiosk_configuration;

public void Kiosk_configuration()
{
	Kiosk_configuration.click();
}

@FindBy(how=How.ID,using="welcome-message-input")
@CacheLookup
WebElement Kiosk_WelcomeScreenMessage;

public void Kiosk_WelcomeScreenMessage(String s)
{
	Kiosk_WelcomeScreenMessage.click();
	Kiosk_WelcomeScreenMessage.clear();
	Kiosk_WelcomeScreenMessage.sendKeys(s);
}


@FindBy(how=How.ID,using="message-font-size-button")
@CacheLookup
WebElement Kiosk_FontSize;

public void Kiosk_FontSize()
{
	Kiosk_FontSize.click();
}


@FindBy(how=How.XPATH,using="//a[contains(text(),'H3')]")
@CacheLookup
WebElement Kiosk_FontSizeH3;


public void Kiosk_FontSizeH3()
{
	Kiosk_FontSizeH3.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'H1')]")
@CacheLookup
WebElement Kiosk_FontSizeH1;

public void Kiosk_FontSizeH1()
{
	Kiosk_FontSizeH1.click();
}


@FindBy(how=How.ID,using="message-field-size-button")
@CacheLookup
WebElement Kiosk_Fieldsize;

public void Kiosk_Fieldsize()
{
	Kiosk_Fieldsize.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"fieldSize\"]/ul/li[3]/a")
@CacheLookup
WebElement Kiosk_Fieldsize3;

public void Kiosk_Fieldsize3()
{
	Kiosk_Fieldsize3.click();
}


@FindBy(how=How.XPATH,using="//*[@id=\"fieldSize\"]/ul/li[10]/a")
@CacheLookup
WebElement Kiosk_Fieldsize10;

public void Kiosk_Fieldsize10()
{
	Kiosk_Fieldsize10.click();
}

@FindBy(how=How.ID,using="message-placement-left")
@CacheLookup
WebElement Kiosk_messageplacementleft;

public void Kiosk_messageplacementleft()
{
	Kiosk_messageplacementleft.click();
}


@FindBy(how=How.ID,using="message-placement-center")
@CacheLookup
WebElement Kiosk_messageplacementcenter;

public void Kiosk_messageplacementcenter()
{
	Kiosk_messageplacementcenter.click();
}

@FindBy(how=How.ID,using="message-placement-right")
@CacheLookup
WebElement Kiosk_messageplacementright;

public void Kiosk_messageplacementright()
{
	Kiosk_messageplacementright.click();
}


@FindBy(how=How.ID,using="welcome-button-text")
@CacheLookup
WebElement Kiosk_SearchButtonText;

public void Kiosk_SearchButtonText(String s)
{
	Kiosk_SearchButtonText.click();
	Kiosk_SearchButtonText.clear();
	Kiosk_SearchButtonText.sendKeys(s);
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[4]/div[1]/label/input")
@CacheLookup
WebElement   Kiosk_ButtonPlacementLeft;

public void Kiosk_ButtonPlacementLeft()
{
	Kiosk_ButtonPlacementLeft.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[4]/div[2]/label/input")
@CacheLookup
WebElement Kiosk_ButtonPlacementCenter;

public void Kiosk_ButtonPlacementCenter()
{
	Kiosk_ButtonPlacementCenter.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[4]/div[3]/label/input")
@CacheLookup
WebElement Kiosk_ButtonPlacementRight;

public void Kiosk_ButtonPlacementRight()
{
	Kiosk_ButtonPlacementRight.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[5]/label/input")
@CacheLookup
WebElement Kiosk_AllowNewAppointmentFromWelcomeScreen;

public void Kiosk_AllowNewAppointmentFromWelcomeScreen()
{
	Kiosk_AllowNewAppointmentFromWelcomeScreen.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[6]/div/div/textarea")
@CacheLookup
WebElement Kiosk_NewAppointmentButtonText;

public void Kiosk_NewAppointmentButtonText(String f)
{
	
	Kiosk_NewAppointmentButtonText.click();
	
	Kiosk_NewAppointmentButtonText.sendKeys(f);
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[7]/div[1]/label/input")
@CacheLookup
WebElement Kiosk_newButtonPlacementLeft;

public void Kiosk_newButtonPlacementLeft()
{
	Kiosk_newButtonPlacementLeft.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[7]/div[2]/label/input")
@CacheLookup
WebElement Kiosk_newButtonPlacementRight;

public void Kiosk_newButtonPlacementRight()
{
	Kiosk_newButtonPlacementRight.click();
}


@FindBy(how=How.ID,using="welcome-done")
@CacheLookup
WebElement Kiosk_Donebutton;


public void Kiosk_Donebutton()
{
	Kiosk_Donebutton.click();
}


@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]")
@CacheLookup
WebElement Kiosk_Cancelbutton;

public void Kiosk_Cancelbutton()
{
	Kiosk_Cancelbutton.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[2]/div/div/div/div[1]/div/label/input")
@CacheLookup
WebElement   Kiosk_SearchAppointmentFlow;

public void Kiosk_SearchAppointmentFlow()
{
	if(!Kiosk_SearchAppointmentFlow.isSelected()) {
		JavascriptExecutor ab = (JavascriptExecutor)ldriver;
		ab.executeScript("arguments[0].click", Kiosk_SearchAppointmentFlow);
		if(!Kiosk_SearchAppointmentFlow.isSelected()) {
			Kiosk_SearchAppointmentFlow.click();
		}
	}
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[3]/div/div/div/div[1]/button")
@CacheLookup
WebElement Kiosk_searchpageconfigurebutton;

public void Kiosk_searchpageconfigurebutton()
{
	Kiosk_searchpageconfigurebutton.click();
}


@FindBy(how=How.ID,using="welcome-message-input")
@CacheLookup
WebElement Kiosk_welcomemessageinput;

public void Kiosk_welcomemessageinput(String s)
{
	Kiosk_welcomemessageinput.click();
	Kiosk_welcomemessageinput.clear();
	Kiosk_welcomemessageinput.sendKeys(s);
	
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/div/div/div[1]/div[1]/select")
@CacheLookup
WebElement Kiosk_FieldType;

public void Kiosk_FieldType()
{
	Select AB = new Select(Kiosk_FieldType);
	AB.selectByVisibleText("Medical Record Number");
}

@FindBy(how=How.NAME,using="fieldSize")
@CacheLookup
WebElement Kiosk_fieldSize;

public void Kiosk_fieldSize()
{
	Select dc = new Select(Kiosk_fieldSize);
	dc.selectByVisibleText("3");
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/div/div/div[1]/div[3]/input")
@CacheLookup
WebElement Kiosk_FieldTitle;

public void Kiosk_FieldTitle(String t)
{
	Kiosk_FieldTitle.click();
	Kiosk_FieldTitle.clear();
	Kiosk_FieldTitle.sendKeys(t);
}

@FindBy(how=How.NAME,using="placeholderText")
@CacheLookup
WebElement Kiosk_placeholderText;


public void Kiosk_placeholderText(String t)
{
	Kiosk_placeholderText.click();
	Kiosk_placeholderText.clear();
	Kiosk_placeholderText.sendKeys(t);
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/div/div/div[3]/div/div/label/input")
@CacheLookup
WebElement Kiosk_Required;

public void Kiosk_Required()
{
	Kiosk_Required.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Add more')]")
@CacheLookup
WebElement Kiosk_AddMore;

public void Kiosk_AddMore()
{
	Kiosk_AddMore.click();
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Done')]")
@CacheLookup
WebElement Kiosk_Done;

public void Kiosk_Done()
{
	Kiosk_Done.click();
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]")
@CacheLookup
WebElement Kiosk_Cancel;

public void Kiosk_Cancel()
{
	Kiosk_Cancel.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/header/a[2]")
@CacheLookup
WebElement Kiosk_SerialChange;

public void Kiosk_SerialChange()
{
	Kiosk_SerialChange.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/header/a[1]")
@CacheLookup
WebElement Kiosk_Searchpage_Cross;


public void Kiosk_Searchpage_Cross()
{
	Kiosk_Searchpage_Cross.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[2]/div/div/div/div[2]/div/label/input")
@CacheLookup
WebElement   Kiosk_AddNewAppointmentFlow;

public void Kiosk_AddNewAppointmentFlow()
{
	if(!Kiosk_AddNewAppointmentFlow.isSelected()) {
		JavascriptExecutor ab = (JavascriptExecutor)ldriver;
		ab.executeScript("arguments[0].click", Kiosk_AddNewAppointmentFlow);
		if(!Kiosk_AddNewAppointmentFlow.isSelected()) {
			Kiosk_AddNewAppointmentFlow.click();
		}
		
	}
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[3]/div[1]/a")
@CacheLookup
WebElement Kiosk_AddPage;

public void Kiosk_AddPage()
{
	Kiosk_AddPage.click();
}

@FindBy(how=How.ID,using="page-builder-name-input")
@CacheLookup
WebElement Kiosk_PageName;

public void Kiosk_PageName(String pn)
{
	Kiosk_PageName.click();
	Kiosk_PageName.clear();
	Kiosk_PageName.sendKeys(pn);
}

@FindBy(how=How.NAME,using="pageType")
@CacheLookup
WebElement Kiosk_Pagetype;

public void Kiosk_Pagetype()
{
	Select a = new Select(Kiosk_Pagetype);
	a.selectByVisibleText("Fields");
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/a")
@CacheLookup
WebElement Kiosk_pagename_Addmore;

public void Kiosk_pagename_Addmore()
{
	Kiosk_pagename_Addmore.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[1]/select")
@CacheLookup
WebElement Kiosk_Pagename_Fieldtype;

public void Kiosk_Pagename_FieldSeeing()
{
	Select av = new Select(Kiosk_Pagename_Fieldtype);
	av.selectByVisibleText("Seeing");
}

@FindBy(how=How.NAME,using="fieldSize")
@CacheLookup
WebElement Kiosk_Pagename_fieldSize;

public void Kiosk_Pagename_fieldSize()
{
	Select fs = new Select(Kiosk_Pagename_fieldSize);
	fs.selectByVisibleText("1");
}

public void Kiosk_Pagename_FieldAppointmentTime()
{
	Select av = new Select(Kiosk_Pagename_Fieldtype);
	av.selectByVisibleText("Appointment Time");
}

public void Kiosk_Pagename_fieldSizeA()
{
	Select fs = new Select(Kiosk_Pagename_fieldSize);
	fs.selectByVisibleText("5");
}

public void Kiosk_Pagename_FieldLastName()
{
	Select av = new Select(Kiosk_Pagename_Fieldtype);
	av.selectByVisibleText("Last Name");
}

public void Kiosk_Pagename_fieldSizeLN()
{
	Select fs = new Select(Kiosk_Pagename_fieldSize);
	fs.selectByVisibleText("6");
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[3]/input")
@CacheLookup
WebElement Kiosk_Pagename_Title;

public void Kiosk_Pagename_Title(String pt)
{
	Kiosk_Pagename_Title.click();
	Kiosk_Pagename_Title.clear();
	Kiosk_Pagename_Title.sendKeys(pt);
}





@FindBy(how=How.NAME,using="placeholderText")
@CacheLookup
WebElement Kiosk_Pagename_Placeholder;

public void Kiosk_Pagename_Placeholder(String ph)
{
	Kiosk_Pagename_Placeholder.click();
	Kiosk_Pagename_Placeholder.clear();
	Kiosk_Pagename_Placeholder.sendKeys(ph);
}


@FindBy(how=How.NAME,using="requiredCheck")
@CacheLookup
WebElement Kiosk_Pagename_RequiredCheck;


public void Kiosk_Pagename_RequiredCheck()
{
	if(!Kiosk_Pagename_RequiredCheck.isSelected()) {
		JavascriptExecutor pr = (JavascriptExecutor)ldriver;
		pr.executeScript("arguments[0].click", Kiosk_Pagename_RequiredCheck);
		if(!Kiosk_Pagename_RequiredCheck.isSelected()) {
			Kiosk_Pagename_RequiredCheck.click();
		}
	}
}


public void Kiosk_PagetVerification()
{
	Select a = new Select(Kiosk_Pagetype);
	a.selectByVisibleText("Verification");
}


@FindBy(how=How.ID,using="seeing")
@CacheLookup
WebElement Kiosk_pagename_VerificationSeeing;

public void Kiosk_pagename_VerificationSeeing()
{
	if(!Kiosk_pagename_VerificationSeeing.isSelected()) {
		JavascriptExecutor vs = (JavascriptExecutor)ldriver;
		vs.executeScript("arguments[0].click", Kiosk_pagename_VerificationSeeing);
		if(!Kiosk_pagename_VerificationSeeing.isSelected()) {
			Kiosk_pagename_VerificationSeeing.click();
		}
	}
}



@FindBy(how=How.ID,using="appointmentTime")
@CacheLookup
WebElement Kiosk_pagename_VerificationappointmentTime;

public void Kiosk_pagename_VerificationappointmentTime()
{
	if(!Kiosk_pagename_VerificationSeeing.isSelected()) {
		JavascriptExecutor vs = (JavascriptExecutor)ldriver;
		vs.executeScript("arguments[0].click", Kiosk_pagename_VerificationappointmentTime);
		if(!Kiosk_pagename_VerificationappointmentTime.isSelected()) {
			Kiosk_pagename_VerificationappointmentTime.click();
		}
	}
}



@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/verification-builder/div[3]/div/label/input")
@CacheLookup
WebElement Kiosk_pagename_VerificationlastName;

public void Kiosk_pagename_VerificationlastName()
{
	if(!Kiosk_pagename_VerificationSeeing.isSelected()) {
		JavascriptExecutor vs = (JavascriptExecutor)ldriver;
		vs.executeScript("arguments[0].click", Kiosk_pagename_VerificationlastName);
		if(!Kiosk_pagename_VerificationlastName.isSelected()) {
			Kiosk_pagename_VerificationlastName.click();
		}
	}
}


@FindBy(how=How.XPATH,using="//button[contains(text(),'Add')]")
@CacheLookup
WebElement Kiosk_Pagename_Add;

public void Kiosk_Pagename_Add()
{
	Kiosk_Pagename_Add.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[3]/button[1]")
@CacheLookup
WebElement Kiosk_Pagename_Cancel;

public void Kiosk_Pagename_Cancel()
{
	Kiosk_Pagename_Cancel.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[3]/div/div/div/div[3]/span[3]")
@CacheLookup
WebElement  Kiosk_Pagename_Edit;


public void Kiosk_Pagename_Edit()

{
	Kiosk_Pagename_Edit.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[3]/div/div/div/div[1]/span")
@CacheLookup
WebElement Kiosk_Pagename_Delete;

public void Kiosk_Pagename_Delete()
{
	Kiosk_Pagename_Delete.click();
}



@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[3]/div[1]/a")
@CacheLookup
WebElement Kiosk_ExistingAppointment_Addpage;

public void Kiosk_ExistingAppointment_Addpage()
{
	Kiosk_ExistingAppointment_Addpage.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[1]/div/div[1]/input")
@CacheLookup
WebElement Kiosk_ExistingAppointmen_Pagename;

public void Kiosk_ExistingAppointmen_Pagename(String EA)
{
	Kiosk_ExistingAppointmen_Pagename.click();
	Kiosk_ExistingAppointmen_Pagename.clear();
	Kiosk_ExistingAppointmen_Pagename.sendKeys(EA);
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[1]/div/div[2]/div/select")
@CacheLookup
WebElement Kiosk_ExistingAppointmen_PageType;

public void Kiosk_ExistingAppointmen_PageType()
{
	Select Ep = new Select(Kiosk_ExistingAppointmen_PageType);
	Ep.selectByVisibleText("Fields");
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/a")
@CacheLookup
WebElement Kiosk_ExistingAppointme_Addmore;


public void Kiosk_ExistingAppointme_Addmore()
{
	Kiosk_ExistingAppointme_Addmore.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[1]/select")
@CacheLookup
WebElement Kiosk_ExistingAppointme_FieldType;

public void Kiosk_ExistingAppointme_Seeing()
{
	Select ab = new Select(Kiosk_ExistingAppointme_FieldType);
	ab.selectByVisibleText("Seeing");
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[2]/select")
@CacheLookup
WebElement Kiosk_ExistingAppointme_FieldSize;

public void Kiosk_ExistingAppointme_FieldSize()
{
	Select ea = new Select(Kiosk_ExistingAppointme_FieldSize);
	ea.selectByVisibleText("6");
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[3]/input")
@CacheLookup
WebElement Kiosk_ExistingAppointme_FieldTitle;

public void Kiosk_ExistingAppointme_FieldTitle(String t)
{
	Kiosk_ExistingAppointme_FieldTitle.click();
	Kiosk_ExistingAppointme_FieldTitle.clear();
	Kiosk_ExistingAppointme_FieldTitle.sendKeys(t);
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[2]/div/input")
@CacheLookup
WebElement Kiosk_ExistingAppointme_Placeholder;

public void Kiosk_ExistingAppointme_Placeholder(String pk)
{
	Kiosk_ExistingAppointme_Placeholder.click();
	Kiosk_ExistingAppointme_Placeholder.clear();
	Kiosk_ExistingAppointme_Placeholder.sendKeys(pk);
}



@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[3]/div/div/label/input")
@CacheLookup
WebElement Kiosk_ExistingAppointme_Required;

public void Kiosk_ExistingAppointme_Required()
{
	if(!Kiosk_ExistingAppointme_Required.isSelected()) {
		JavascriptExecutor as = (JavascriptExecutor)ldriver;
		as.executeScript("arguments[0].click", Kiosk_ExistingAppointme_Required);
		if(!Kiosk_ExistingAppointme_Required.isSelected()) {
			Kiosk_ExistingAppointme_Required.click();
		}
	}
}






public void Kiosk_ExistingAppointmen_PageVerification()
{
	Select Ep = new Select(Kiosk_ExistingAppointmen_PageType);
	Ep.selectByVisibleText("Verification");
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/verification-builder/div[1]/div/label/input")
@CacheLookup
WebElement Kiosk_ExistingAppointmen_PageVerification_Seeing;

public void Kiosk_ExistingAppointmen_PageVerification_Seeing()
{
	Kiosk_ExistingAppointmen_PageVerification_Seeing.click();
}


@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[3]/button[2]")
@CacheLookup
WebElement Kiosk_ExistingAppointmen_PageVerification_Add;

public void Kiosk_ExistingAppointmen_PageVerification_Add()
{
	Kiosk_ExistingAppointmen_PageVerification_Add.click();
}

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[3]/button[1]")
@CacheLookup
WebElement Kiosk_ExistingAppointmen_PageVerification_Cancel;

public void Kiosk_ExistingAppointmen_PageVerification_Cancel()
{
	Kiosk_ExistingAppointmen_PageVerification_Cancel.click();
}


@FindBy(how=How.ID,using="confirmation-message")
@CacheLookup
WebElement Kiosk_confirmationmessage;

public void Kiosk_confirmationmessage(String cm)
{
	Kiosk_confirmationmessage.click();
	Kiosk_confirmationmessage.clear();
	Kiosk_confirmationmessage.sendKeys(cm);
}

@FindBy(how=How.ID,using="show-confirmation-separate")
@CacheLookup
WebElement Kiosk_separatepage;

public void Kiosk_separatepage()
{
	Kiosk_separatepage.click();
}

@FindBy(how=How.ID,using="show-confirmation-modal")
@CacheLookup
WebElement Kiosk_modal;

public void Kiosk_modal()
{
	Kiosk_modal.click();
}


@FindBy(how=How.ID,using="show-confirmation-same")
@CacheLookup
WebElement Kiosk_samepageaverification;

public void Kiosk_samepageaverification()
{
	Kiosk_samepageaverification.click();
}


@FindBy(how=How.ID,using="confirmation-timeout")
@CacheLookup
WebElement Kiosk_confirmationtimeout;

public void Kiosk_confirmationtimeout(String c)
{
	Kiosk_confirmationtimeout.click();
	Kiosk_confirmationtimeout.clear();
	Kiosk_confirmationtimeout.sendKeys(c);
}


@FindBy(how=How.ID,using="kiosk-config-save-button")
@CacheLookup
WebElement Kiosk_Savebutton;

public void Kiosk_Savebutton()
{
	Kiosk_Savebutton.click();
}


@FindBy(how=How.XPATH,using="//button[contains(text(),'Undo')]")
@CacheLookup
WebElement Kiosk_Undo;


public void Kiosk_Undo()
{
	Kiosk_Undo.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[3]/div/div/div/div[2]/div/label/input")
@CacheLookup
WebElement Kiosk_Skip;

public void Kiosk_Skip()
{
	if(!Kiosk_Skip.isSelected()) {
		
		JavascriptExecutor r = (JavascriptExecutor)ldriver;
		r.executeScript("arguments[0].click", Kiosk_Skip);
		if(!Kiosk_Skip.isSelected()) {
			Kiosk_Skip.click();
		}
		
	}
		
}








 //GET-IN-LINE


@FindBy(how=How.XPATH,using="//a[contains(text(),'Get In Line')]")
@CacheLookup
WebElement GetIN_Line;

public void GetIN_Line()
{
	GetIN_Line.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/section/div/label/input")
@CacheLookup
WebElement GetIN_AllowFeature;

public void GetIN_AllowFeature()
{
	if(!GetIN_AllowFeature.isSelected()) {
		JavascriptExecutor G = (JavascriptExecutor)ldriver;
		G.executeScript("arguments[0].click", GetIN_AllowFeature);
		if(!GetIN_AllowFeature.isSelected()) {
			GetIN_AllowFeature.click();
		}
	}
}



@FindBy(how=How.NAME,using="enableQuestionnaireCheckbox")
@CacheLookup
WebElement GetIN_enableQuestionnaireCheckbox;

public void GetIN_enableQuestionnaireCheckbox()
{
	if(!GetIN_enableQuestionnaireCheckbox.isSelected()) {
		JavascriptExecutor e = (JavascriptExecutor)ldriver;
		if(!GetIN_enableQuestionnaireCheckbox.isSelected()) {
			GetIN_enableQuestionnaireCheckbox.click();
		}
	}
}


@FindBy(how=How.ID,using="questionnaireSelector")
@CacheLookup
WebElement GetIN_questionnaireSelector;

public void GetIN_questionnaireSelector()
{
	GetIN_questionnaireSelector.click();
}


@FindBy(how=How.XPATH,using="//a[contains(text(),'MRI Safety Questionnaire')]")
@CacheLookup
WebElement GetIN_MRISafetyQuestionnaire;


public void GetIN_MRISafetyQuestionnaire()
{
	GetIN_MRISafetyQuestionnaire.click();
}



@FindBy(how=How.XPATH,using="//a[contains(text(),'COVID Screening Form')]")
@CacheLookup
WebElement GetIN_COVIDScreeningForm;


public void GetIN_COVIDScreeningForm() 

{
	GetIN_COVIDScreeningForm.click();
	
}


@FindBy(how=How.XPATH,using="//a[contains(text(),'RBC Report')]")
@CacheLookup
WebElement GetIN_RBCReport;

public void GetIN_RBCReport()
{
	GetIN_RBCReport.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/div[3]/label/input")
@CacheLookup
WebElement GetIN_ShowPlaceInLine;

public void GetIN_ShowPlaceInLine()
{
	if(!GetIN_ShowPlaceInLine.isSelected()) {
		JavascriptExecutor s = (JavascriptExecutor)ldriver;
		s.executeScript("arguments[0].click", GetIN_ShowPlaceInLine);
		if(!GetIN_ShowPlaceInLine.isSelected()) {
			GetIN_ShowPlaceInLine.click();
		}
	}
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/div[4]/label/input")
@CacheLookup
WebElement GetIN_ShowWaitTime;


public void GetIN_ShowWaitTime()
{
	if(!GetIN_ShowWaitTime.isSelected()) {
		JavascriptExecutor st = (JavascriptExecutor)ldriver;
		st.executeScript("arguments[0].click", GetIN_ShowWaitTime);
		if(!GetIN_ShowWaitTime.isSelected()) {
			GetIN_ShowWaitTime.click();
		}
	}
}


@FindBy(how=How.NAME,using="confirmationMessage")
@CacheLookup
WebElement GetIN_confirmationMessage;

public void GetIN_confirmationMessage(String m)
{
	GetIN_confirmationMessage.click();
	GetIN_confirmationMessage.clear();
	GetIN_confirmationMessage.sendKeys(m);
}


@FindBy(how=How.NAME,using="registrationLogin")
@CacheLookup
WebElement GetIN_registrationLogin;

public void GetIN_registrationLogin()
{
	if(!GetIN_registrationLogin.isSelected()) {
		JavascriptExecutor h = (JavascriptExecutor)ldriver;
		h.executeScript("arguments[0].click", GetIN_registrationLogin);
		if(!GetIN_registrationLogin.isSelected()) {
			GetIN_registrationLogin.click();
		}
	}
}


@FindBy(how=How.NAME,using="guest")
@CacheLookup
WebElement GetIN_guest;

public void GetIN_guest()
{
	if(!GetIN_guest.isSelected()) {
		JavascriptExecutor n = (JavascriptExecutor)ldriver;
		n.executeScript("arguments[0].click", GetIN_guest);
		if(!GetIN_guest.isSelected()) {
			GetIN_guest.click();
		}
	}
}



@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/div[6]/div/div/button")
@CacheLookup
WebElement GetIN_DefaultAppointmentType;

public void GetIN_DefaultAppointmentType()
{
	GetIN_DefaultAppointmentType.click();
}


@FindBy(how=How.XPATH,using="//a[contains(text(),'No Default Appointment Type')]")
@CacheLookup
WebElement GetIN_nodefult;

public void GetIN_nodefult()
{
	GetIN_nodefult.click();
}



@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[1]/article/a")
@CacheLookup
WebElement GetIN_Monday_AddHours;

public void GetIN_Monday_AddHours()
{
	GetIN_Monday_AddHours.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[1]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Monday_startT;

public void GetIN_Monday_startT(String t)
{
	GetIN_Monday_startT.click();
	GetIN_Monday_startT.clear();
	GetIN_Monday_startT.sendKeys(t);
}



@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[1]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_AMPM;

public void GetIN_AMPM()
{
	GetIN_AMPM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[1]/article/div/day-slot/div/div[3]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Monday_Endt;

public void GetIN_Monday_Endt(String f)
{
	GetIN_Monday_Endt.click();
	GetIN_Monday_Endt.clear();
	GetIN_Monday_Endt.sendKeys(f);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[1]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Monday_EndPMAM;

public void GetIN_Monday_EndPMAM()
{
	GetIN_Monday_EndPMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[1]/article/div/a")
@CacheLookup
WebElement GetIN_Monday_cross;

public void GetIN_Monday_cross()
{
	GetIN_Monday_cross.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[2]/article/a")
@CacheLookup
WebElement GetIN_Tuesday_AddHours;

public void GetIN_Tuesday_AddHours()
{
	GetIN_Tuesday_AddHours.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[2]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Tuesday_Startt;

public void GetIN_Tuesday_Startt(String h)
{
	GetIN_Tuesday_Startt.click();
	GetIN_Tuesday_Startt.clear();
	GetIN_Tuesday_Startt.sendKeys(h);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[2]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Tuesday_startAMPM;

public void GetIN_Tuesday_startAMPM()
{
	GetIN_Tuesday_startAMPM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[2]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Tuesday_Endt;


public void GetIN_Tuesday_Endt(String h)
{
	GetIN_Tuesday_Endt.click();
	GetIN_Tuesday_Endt.clear();
	GetIN_Tuesday_Endt.sendKeys(h);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[2]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Tuesday_EndAMPM;

public void GetIN_Tuesday_EndAMPM()
{
	GetIN_Tuesday_EndAMPM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[2]/article/div/a")
@CacheLookup
WebElement GetIN_Tuesday_Cross;

public void GetIN_Tuesday_Cross()
{
	GetIN_Tuesday_Cross.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[3]/article/a")
@CacheLookup
WebElement GetIN_Wednesday_AddHours;

public void GetIN_Wednesday_AddHours()
{
	GetIN_Wednesday_AddHours.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[3]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Wednesday_Start;

public void GetIN_Wednesday_Start(String f)

{
	GetIN_Wednesday_Start.click();
	GetIN_Wednesday_Start.clear();
	GetIN_Wednesday_Start.sendKeys(f);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[3]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Wednesday_StartPMAM;

public void GetIN_Wednesday_StartPMAM()
{
	GetIN_Wednesday_StartPMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[3]/article/div/day-slot/div/div[3]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Wednesday_End;

public void GetIN_Wednesday_End(String g)
{
	GetIN_Wednesday_End.click();
	
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[3]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Wednesday_PMAM;

public void GetIN_Wednesday_PMAM()
{
	GetIN_Wednesday_PMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[3]/article/div/a")
@CacheLookup
WebElement GetIN_Wednesday_cross;

public void GetIN_Wednesday_cross()
{
	GetIN_Wednesday_cross.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[4]/article/a")
@CacheLookup
WebElement GetIN_Thursday_AddHours;

public void GetIN_Thursday_AddHours()
{
	GetIN_Thursday_AddHours.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[4]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Thursday_Startt;

public void GetIN_Thursday_Startt(String f)
{
	GetIN_Thursday_Startt.click();
	GetIN_Thursday_Startt.clear();
	GetIN_Thursday_Startt.sendKeys(f);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[4]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Thursday_StartPMAM;

public void GetIN_Thursday_StartPMAM()
{
	GetIN_Thursday_StartPMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[4]/article/div/day-slot/div/div[3]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Thursday_Endt;


public void GetIN_Thursday_Endt(String h)
{
	GetIN_Thursday_Endt.click();
	GetIN_Thursday_Endt.clear();
	GetIN_Thursday_Endt.sendKeys(h);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[4]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Thursday_EndPMAM;

public void GetIN_Thursday_EndPMAM()
{
	GetIN_Thursday_EndPMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[4]/article/div/a")
@CacheLookup
WebElement GetIN_Thursday_Cross;

public void GetIN_Thursday_Cross()
{
	GetIN_Thursday_Cross.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[5]/article/a")
@CacheLookup
WebElement GetIN_Friday_AddHours;

public void GetIN_Friday_AddHours()
{
	GetIN_Friday_AddHours.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[5]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Friday_Startt;

public void GetIN_Friday_Startt(String f)
{
	GetIN_Friday_Startt.click();
	GetIN_Friday_Startt.clear();
	GetIN_Friday_Startt.sendKeys(f);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[5]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Friday_StartPMAM;

public void GetIN_Friday_StartPMAM()
{
	GetIN_Friday_StartPMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[5]/article/div/day-slot/div/div[3]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Friday_Endt;

public void GetIN_Friday_Endt(String h)
{
	GetIN_Friday_Endt.click();
	GetIN_Friday_Endt.clear();
	GetIN_Friday_Endt.sendKeys(h);
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[5]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_FridayPMAM;


public void GetIN_FridayPMAM()
{
	GetIN_FridayPMAM.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[5]/article/div/a")
@CacheLookup
WebElement GetIN_Friday_Cross;

public void GetIN_Friday_Cross()
{
	GetIN_Friday_Cross.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[6]/article/a")
@CacheLookup
WebElement GetIN_Saturday_AddHours;

public void GetIN_Saturday_AddHours()
{
	GetIN_Saturday_AddHours.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[6]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Saturday_Startt;

public void GetIN_Saturday_Startt(String t)
{
	GetIN_Saturday_Startt.click();
	GetIN_Saturday_Startt.clear();
	GetIN_Saturday_Startt.sendKeys(t);
}
	
@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[6]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Saturday_StartPMAM;

public void GetIN_Saturday_StartPMAM()
{
	GetIN_Saturday_StartPMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[6]/article/div/day-slot/div/div[3]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Saturday_Endt;

public void GetIN_Saturday_Endt(String n)
{
	GetIN_Saturday_Endt.click();
	GetIN_Saturday_Endt.clear();
	GetIN_Saturday_Endt.sendKeys(n);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[6]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Saturday_EndPMAM;

public void GetIN_Saturday_EndPMAM()
{
	GetIN_Saturday_EndPMAM.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[6]/article/div/a")
@CacheLookup
WebElement GetIN_Saturday_Cross;

public void GetIN_Saturday_Cross()
{
	GetIN_Saturday_Cross.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[7]/article/a")
@CacheLookup
WebElement GetIN_Sunday_AddHours;

public void GetIN_Sunday_AddHours()
{
	GetIN_Sunday_AddHours.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[7]/article/div/day-slot/div/div[1]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Sunday_Startt;

public void GetIN_Sunday_Startt(String t)
{
	GetIN_Sunday_Startt.click();
	GetIN_Sunday_Startt.clear();
	GetIN_Sunday_Startt.sendKeys(t);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[7]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Sunday_StartPMAM;

public void GetIN_Sunday_StartPMAM()
{
	GetIN_Sunday_StartPMAM.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[7]/article/div/day-slot/div/div[3]/time-picker/div/input")
@CacheLookup
WebElement GetIN_Sunday_Endt;

public void GetIN_Sunday_Endt(String t)
{
	GetIN_Sunday_Endt.click();
	GetIN_Sunday_Endt.clear();
	GetIN_Sunday_Endt.sendKeys(t);
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[7]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
@CacheLookup
WebElement GetIN_Sunday_EndPMAM;

public void GetIN_Sunday_EndPMAM()
{
	GetIN_Sunday_EndPMAM.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/schedule-builder/section[7]/article/div/a")
@CacheLookup
WebElement GetIN_Sunday_Cross;

public void GetIN_Sunday_Cross()
{
	GetIN_Sunday_Cross.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/div[7]/button")
@CacheLookup
WebElement GetIN_Save;

public void GetIN_Save()
{
	GetIN_Save.click();
}



        // Patient Priority



@FindBy(how=How.XPATH,using="//a[contains(text(),'Patient Priority')]")
@CacheLookup
WebElement PatientPriority_;

public void PatientPriority_()
{
	PatientPriority_.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/h2/button")
@CacheLookup
WebElement PatientPriority_AddOption;

public void PatientPriority_AddOption()
{
	PatientPriority_AddOption.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/div/div/div[1]/div/div[1]/button")
@CacheLookup
WebElement PatientPriority_DropDown;

public void PatientPriority_DropDown()
{
	PatientPriority_DropDown.click();
}


@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/div/div/div[1]/div/div[1]/ul/li[2]/a")
@CacheLookup
WebElement PatientPriority_ApptTime;

public void PatientPriority_ApptTime()
{
	PatientPriority_ApptTime.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/div/div/div/div/div[2]/button")
@CacheLookup
WebElement PatienPriority_DropDown2;

public void PatienPriority_DropDown2()
{
	PatienPriority_DropDown2.click();
}



@FindBy(how=How.XPATH,using="//*[contains(text(),'Descending')]")
@CacheLookup
WebElement PatienPriority_Descending;



public void PatienPriority_Descending()
{
	PatienPriority_Descending.click();
}


@FindBy(how=How.XPATH,using="//*[contains(text(),'Ascending')]")
@CacheLookup
WebElement PatienPriority_Ascending;

public void PatienPriority_Ascending()
{
	PatienPriority_Ascending.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/div/div/div[1]/div/div[3]/button")
@CacheLookup
WebElement PatienPriority_Downbtn;

public void PatienPriority_Downbtn()
{
	PatienPriority_Downbtn.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/div/div/div[2]/div/div[4]/button")
@CacheLookup
WebElement PatienPriority_UPbtn;

public void PatienPriority_UPbtn()
{
	PatienPriority_UPbtn.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/div/div/div[1]/div/div[5]/button")
@CacheLookup
WebElement PatienPriority_Cross;

public void PatienPriority_Cross()
{
	PatienPriority_Cross.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/custom-default-sort/button[2]")
@CacheLookup
WebElement PatientPriority_Save;

public void PatientPriority_Save()
{
	PatientPriority_Save.click();
}

@FindBy(how=How.XPATH,using="//button[contains(text(),'Reset To Default Sorting')]")
@CacheLookup
WebElement PatientPriority_ResetDefault;

public void PatientPriority_ResetDefault()
{
	PatientPriority_ResetDefault.click();
}

//---------------------------------Flag -----------------------------------------------------------------------------------------------------------

@FindBy(how=How.XPATH,using="//a[contains(text(),'Flags')]")
@CacheLookup
WebElement Dep_Flag;

public void Dep_Flag()
{
	Dep_Flag.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/flags/jfh-add-flag/form/div/div/div[1]/jfh-simple-image-upload-cropper/div/div[2]/div[2]/label")
@CacheLookup
WebElement Dep_Flag_File;

public void Dep_Flag_File() throws AWTException
{
	Dep_Flag_File.click();
	Robot rb=new Robot();
	rb.delay(2000);
	//copy to clipboard
	StringSelection ss= new StringSelection("C:\\Users\\ATM\\Downloads\\sherry.jpg");
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

@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/ui-cropper-modal/div[3]/button[2]")
@CacheLookup
WebElement Dep_File_Crop;

public void Dep_File_Crop()
{
	Dep_File_Crop.click();
}

@FindBy(how=How.NAME,using="flag-label")
@CacheLookup
WebElement Dep_File_lable;

public void Dep_File_lable(String n)
{
	
	Dep_File_lable.sendKeys(n);
}

@FindBy(how=How.XPATH,using="//input[@type=\"Flag will always show for every visit\" or @title=\"Flag will always show for every visit\"]")
@CacheLookup
WebElement Dep_File_persistent;

public  void Dep_File_persistent()
{
	Dep_File_persistent.click();
}

@FindBy(how=How.XPATH,using="//button[@class=\"btn btn-primary ng-binding\"]")
@CacheLookup
WebElement Dep_File_Add;

public void Dep_File_Add()
{
	Dep_File_Add.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/flags/div[2]/div[1]/div/div[1]/jfh-flag-card/form/div")
@CacheLookup
WebElement Dep_File_disabled;

public void Dep_File_disabled()
{
	Dep_File_disabled.click();
	
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/flags/div[2]/div[1]/div/div[1]/jfh-flag-card/form/div")
@CacheLookup
WebElement Dep_Flag_Assigned;

public void Dep_Flag_Assigned()
{
	Dep_Flag_Assigned.click();
}

@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a/span[1]")
@CacheLookup
WebElement Dep_Flag_Adminuser;

public void Dep_Flag_Adminuser()
{
	Dep_Flag_Adminuser.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'Return to Access')]")
@CacheLookup
WebElement Dep_Flag_ReturnAccess;

public void Dep_Flag_ReturnAccess()
{
	Dep_Flag_ReturnAccess.click();
}



   //same data

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
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/div[2]/div[2]/div[2]/div/ul/li[3]/a")
	@CacheLookup  
	WebElement appointment2;
	public void appointment2()
	{
		appointment2.click();

	}

//----------------------------------------ClipBoard-----Remove Field------------------14-Feb-2023---------------------------------------------------------------------------

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/header/a[1]")
    @CacheLookup
    WebElement Middle_Name_Remove;
    
    public void Middle_Name_Remove()
    {
    	Middle_Name_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[5]/header/a[1]")
    @CacheLookup
    WebElement Dob_Remove;
    
    public void Dob_Remove()
    {
    	Dob_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[6]/header/a[1]")
    @CacheLookup
    WebElement Phone_Remove;
    
    public void Phone_Remove()
    {
    	Phone_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[7]/header/a[1]")
    @CacheLookup
    WebElement Email_Remove;
    
    public void Email_Remove()
    {
    	Email_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[8]/header/a[1]")
    @CacheLookup
    WebElement Additional_Phone_Number_Remove;
    
    public void Additional_Phone_Number_Remove()
    {
    	Additional_Phone_Number_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[9]/header/a[1]")
    @CacheLookup
    WebElement Gender_Remove;
    
    public void Gender_Remove()
    {
    	Gender_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[10]/header/a[1]")
    @CacheLookup
    WebElement SSN_Remove;
    
    public void SSN_Remove()
    {
    	SSN_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[11]/header/a[1]")
    @CacheLookup
    WebElement MRN_Remove;
    
    public void MRN_Remove()
    {
    	MRN_Remove.click();
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[12]/header/a[1]")
    @CacheLookup
    WebElement Additional_Contact_Name_Remove;
    
    public void Additional_Contact_Name_Remove()
    {
    	Additional_Contact_Name_Remove.click();
    }

    //--------------------Clipboard Add and Reconfigure-------------------------------------------------------
    
    @FindBy(how=How.XPATH,using="//a[contains(text(),'Add more')]")
    @CacheLookup
    WebElement AddMore;
    
    public void AddMore()
    {
    	AddMore.click();
    }
    

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement Middle_Name_Select;
    
    public void Middle_Name_Select()
    {
    	Select a = new Select(Middle_Name_Select);
    	a.selectByVisibleText("Middle Initial");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient2\"]")
    @CacheLookup
    WebElement Middle_Name_Size_Select;
    
    public void Middle_Name_Size_Select()
    {
    	Select d = new Select(Middle_Name_Size_Select);
    	d.selectByVisibleText("2");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[4]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement Middle_Name_Field;
    
    public void Middle_Name_Field(String s)
    {
    	Middle_Name_Field.click();
    	Middle_Name_Field.clear();
    	Middle_Name_Field.sendKeys(s);
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[5]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement Dob_Select;
    
    public void Dob_Select()
    {
    	Select d = new Select(Dob_Select);
    	d.selectByVisibleText("Date Of Birth");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient3\"]")
    @CacheLookup
    WebElement Dob_Field_Size;
    
    public void Dob_Field_Size()
    {
    	Select d = new Select(Dob_Field_Size);
    	d.selectByVisibleText("2");
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[5]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement Dob_Field_Name;
    
    public void Dob_Field_Name(String d)
    {
    	Dob_Field_Name.click();
    	Dob_Field_Name.clear();
    	Dob_Field_Name.sendKeys(d);
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[6]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement Phone_Name_Select;
    
    public void Phone_Name_Select()
    {
    	Select p = new Select(Phone_Name_Select);
    	p.selectByVisibleText("Cell Number");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient4\"]")
    @CacheLookup
    WebElement Phone_Name_Size_Select;
    
    public void Phone_Name_Size_Select()
    {
    	Select p = new Select(Phone_Name_Size_Select);
    	p.selectByVisibleText("2");
    	
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[6]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement Phone_Name_Field;
    
    public void Phone_Name_Field(String p)
    {
    	Phone_Name_Field.click();
    	Phone_Name_Field.clear();
    	Phone_Name_Field.sendKeys(p);
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[7]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement Email_Name_Select;
    
    public void Email_Name_Select()
    {
    	Select e = new Select(Email_Name_Select);
    	e.selectByVisibleText("Email");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient5\"]")
    @CacheLookup
    WebElement Email_Name_Size_Select;
    
    public void Email_Name_Size_Select()
    {
    	Select es = new Select(Email_Name_Size_Select);
    	es.selectByVisibleText("3");
    }
    
    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[7]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement Email_Name_Field;
    
    public void Email_Name_Field(String e)
    {
    	Email_Name_Field.click();
    	Email_Name_Field.clear();
    	Email_Name_Field.sendKeys(e);
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[8]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement Additional_Phone_Name_Select;
    
    public void Additional_Phone_Name_Select()
    {
    	Select Ap=new Select(Additional_Phone_Name_Select);
    	Ap.selectByVisibleText("Additional Phone Number");
    			
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient6\"]")
    @CacheLookup
    WebElement Additional_Phone_Size_Select;
    
    public void Additional_Phone_Size_Select()
    {
    	Select As = new Select(Additional_Phone_Size_Select);
    	As.selectByVisibleText("2");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[8]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement Adiditional_Phone_Field;
    
    public void Adiditional_Phone_Field(String A)
    {
    	Adiditional_Phone_Field.click();
    	Adiditional_Phone_Field.clear();
    	Adiditional_Phone_Field.sendKeys(A);
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[9]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement Gender_Name_Select;
    
    public void Gender_Name_Select()
    {
    	Select G = new Select(Gender_Name_Select);
    	G.selectByVisibleText("Gender");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient7\"]")
    @CacheLookup
    WebElement Gender_Name_Size_Select;
    
    public void Gender_Name_Size_Select()
    {
    	Select G = new Select(Gender_Name_Size_Select);
    	G.selectByVisibleText("2");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[9]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement Gender_Name_Field;
    
    public void Gender_Name_Field(String g)
    {
    	Gender_Name_Field.click();
    	Gender_Name_Field.clear();
    	Gender_Name_Field.sendKeys(g);
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[10]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement SSN_Name_Select;
    
    public void SSN_Name_Select()
    {
    	Select S = new Select(SSN_Name_Select);
    	S.selectByVisibleText("SSN");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient8\"]")
    @CacheLookup
    WebElement SSN_Name_Size_Select;
    
    public void SSN_Name_Size_Select()
    {
    	Select S = new Select(SSN_Name_Size_Select);
    	S.selectByVisibleText("2");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[10]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement SSN_Name_Field;
    
    public void SSN_Name_Field(String S)
    {
    	SSN_Name_Field.click();
    	SSN_Name_Field.clear();
    	SSN_Name_Field.sendKeys(S);
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[11]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement MRN_Name_Select;
    
    public void MRN_Name_Select()
    {
    	Select M = new Select(MRN_Name_Select);
    	M.selectByVisibleText("MRN");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient9\"]")
    @CacheLookup
    WebElement MRN_Name_Size_Select;
    
    public void MRN_Name_Size_Select()
    {
    	Select M = new Select(MRN_Name_Size_Select);
    	M.selectByVisibleText("2");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[11]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement MRN_Name_Field;
    
    public void MRN_Name_Field(String m)
    {
    	MRN_Name_Field.click();
    	MRN_Name_Field.clear();
    	MRN_Name_Field.sendKeys(m);
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[12]/div/div/div[1]/div[1]/select")
    @CacheLookup
    WebElement Additional_Contact_Name_Select;
    
    public void Additional_Contact_Name_Select()
    {
    	Select A = new Select(Additional_Contact_Name_Select);
    	A.selectByVisibleText("Additional Contact Name");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"fieldSizepatient10\"]")
    @CacheLookup
    WebElement Additional_Contact_Size_Select;
    
    public void Additional_Contact_Size_Select()
    {
    	Select A = new Select(Additional_Contact_Size_Select);
    	A.selectByVisibleText("2");
    }

    @FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/section/div/div[2]/clipboard/section/field-builder[1]/div/div[12]/div/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement Additional_Contact_Field;
    
    public void Additional_Contact_Field(String A)
    {
    	Additional_Contact_Field.click();
    	Additional_Contact_Field.clear();
    	Additional_Contact_Field.sendKeys(A);
    }


















































































































































































































































































































































































































































































































































































}
