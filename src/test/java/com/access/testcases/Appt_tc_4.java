package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;



@Test
public class Appt_tc_4 extends BaseClass



{

	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Appointments ap=new Appointments(driver);

		ap.linkAppointment();

		ap.Configurelist();
		ap.EditDepartFillter();
		Thread.sleep(10000);
		ap.DepartFillterSelect();
		Thread.sleep(3000);
		ap.Departmentsavechange();
		Thread.sleep(10000);
		ap.Configurelist();
		ap.EditSeeingFillter();
		ap.RemoveProvider();
		Thread.sleep(3000);
		ap.CloseBtnSeeing();
		Thread.sleep(10000);
		ap.Configurelist();
		ap.EditListColumns();
		Thread.sleep(3000);
		ap.DobColumsAppoint();
		Thread.sleep(3000);
		ap.ApptDragDrop();
		Thread.sleep(3000);
		ap.ApptDragDrop1();
		Thread.sleep(3000);
		ap.ApptDragDrop2();
		Thread.sleep(3000);
		ap.ColumnsSaveChange();
		Thread.sleep(5000);
		ap.AppointDATE();
		ap.AppointDATE1("2022-09-01");
		ap.AppointDATE2("2022-09-06");
		ap.AppointDATEAPPLY();
		Thread.sleep(3000);
	}
}