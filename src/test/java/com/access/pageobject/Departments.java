package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
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



}
