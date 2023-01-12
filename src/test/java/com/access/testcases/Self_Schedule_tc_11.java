package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Self_Schedule_tc_11 extends BaseClass

{

	public void Clipboard() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		AdmUser ad=new AdmUser(driver);
		try
		{
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.Registration();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("mondloi");
		//User Enter FirstName
		addp.fname("ravi");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("mondloi@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(10000);
		addp.Clip_Seeing();
		Thread.sleep(1000);
		addp.Clip_Thoms();
		Thread.sleep(3000);
		addp.Clip_Flag();
		addp.Clip_Flag_Option();
		addp.Clip_Comment("Routine checkup");
		addp.Clip_Reason("only checkup");
		addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.printAccessPass();
		Thread.sleep(3000);
		addp.Clip_LinkConnectAccount();
		Thread.sleep(3000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(3000);
		addp.Clip_LinkPatientismyParent();
		Thread.sleep(3000);
		addp.Clip_Addpatient();
		Thread.sleep(3000);
		addp.Clip_Checkin();
		Thread.sleep(5000);
		addp.Accesssprint_close();
		addp.lname("s");
		Thread.sleep(10000);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		r.search("mondloi", "ravi");
		Thread.sleep(20000);
		List<WebElement> list = driver.findElements(By.xpath("//tbody//tr[@class='ng-scope']//td/descendant::a[@class='ng-binding']"));
		System.out.println(list.size());

		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			if(listitem.contains("mondloi ravi"))
			{
				list.get(i).click();
				break;
			}
		}

		Thread.sleep(3000);
		r.FormsOnDemand();
		Thread.sleep(10000);
		r.FormsOnDemand_Select();
		r.FormsOnDemand_Select_checkAll();
		r.Appointment_Type();
		r.Appointment_Type_CheckAll();
		r.Forms_on_Demand_send();
		Thread.sleep(30000);
		r.GotopatientDetails();
		Thread.sleep(10000);
		r.Gotopatient_Forms();
		r.COVIDScreeningForm();
		r.Gotopatient_Forms_Symptoms();
		//r.Gotopatient_Forms_When();
		r.Gotopatient_Forms_breathing();
		r.Gotopatient_Forms_cherries();
		r.Gotopatient_Forms_COVID19();
		r.Gotopatient_Forms_image1();
		r.Gotopatient_Forms_image2();
		r.Gotopatient_Forms_save();
		Thread.sleep(20000);
		r.Gotopatient_Forms_Cancel();
		Thread.sleep(10000);
		r.GotopatientDetails();
		Thread.sleep(10000);
		r.Gotopatient_Forms();
		Thread.sleep(3000);
		r.COVIDScreeningForm();
		Thread.sleep(10000);
		boolean symptoms_no = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/div/div[2]/label/input")).isEnabled();
		if(symptoms_no)
		{
			System.out.println("Yes ! This is enabled");
		}
		else
		{
			System.out.println("Yes ! This is disabled");
		}

	}

}
