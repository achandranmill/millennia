package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

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
		
		  RegtPage r=new RegtPage(driver);
		   r.clickRegistrationPage();
		   Thread.sleep(3000);
		
		Appointments ap=new Appointments(driver);
		
		ap.linkAppointment();
		
		ap.Configurelist();
		ap.EditDepartFillter();
		ap.DepartFillterSelect();
		Thread.sleep(3000);
		ap.Departmentsavechange();
		Thread.sleep(3000);
		ap.Configurelist();
		ap.EditSeeingFillter();
		ap.RemoveProvider();
		Thread.sleep(3000);
		ap.CloseBtnSeeing();
		Thread.sleep(3000);
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
		ap.AppointDATE1("20220301");
		ap.AppointDATE2("20220406");
		ap.AppointDATEAPPLY();
		Thread.sleep(3000);


		
		
	
		
		
}
}