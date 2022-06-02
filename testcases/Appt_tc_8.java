package com.access.testcases;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Appt_tc_8 extends BaseClass
{

	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Robin");
		//User Enter FirstName
		addp.fname("john");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		addp.Gender("male");
		addp.SSN("ww");
		addp.appointmentContactNumber("9876540998");
		addp.mrn("tt");
		addp.appointmentContactName("6778889990");

		//User Enter Appointment Time

		Thread.sleep(2000);
		addp.copay("60");
		Thread.sleep(2000);
		addp.searchdep("imenso");
		Thread.sleep(2000);
		addp.Fillterprovider();
		Thread.sleep(2000);
		addp.provider();
		Thread.sleep(2000);
		addp.Flag1();
		Thread.sleep(2000);
		addp.FlagSelect();
		Thread.sleep(2000);
		addp.reason("Routine Checkup");
		Thread.sleep(2000);
		addp.Time("0830");
		addp.Date("04072022");
		Thread.sleep(2000);
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.printAccessPass();
		addp.connect();
		addp.relation();
		addp.addcheckin();
		Thread.sleep(3000);
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(5000);
		ap.ThreeDot();
		Thread.sleep(3000);
		ap.ThreeDotCancel();

	}
}