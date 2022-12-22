package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Self_Schedule_tc_15 extends BaseClass

{

	public void Clipboard() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.Registration();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("jadhav");
		//User Enter FirstName
		addp.fname("raja");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("jadhav@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		//Thread.sleep(10000);
		//addp.Clip_Seeing();
		//Thread.sleep(1000);
		//addp.Clip_Thoms();
		addp.Clip_Flag();
		addp.Clip_Flag_Option();
		Thread.sleep(3000);
		addp.Clip_Comment("Nill");
		//addp.Clip_Reason("only checkup");
		//addp.Clip_Copay("10000");
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
		r.search("jadhav", "raja");
		Thread.sleep(20000);
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody/tr[1]"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			if(listitem.contains("jadhav raja"))
			{
				list.get(i).click();
				break;
			}
		}

		Thread.sleep(10000);
		r.FormsOnDemand();
		Thread.sleep(10000);
		r.FormsOnDemand_Select();
		r.FormsOnDemand_Select_checkAll();
		r.Appointment_Type();
		r.Appointment_Type_CheckAll();
		r.Forms_on_Demand_send();
		Thread.sleep(10000);
		r.GotopatientDetails();
        Thread.sleep(10000);
		r.Gotopatient_Forms();
		Thread.sleep(5000);
		r.COVIDScreeningForm();
		WebElement COVID = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/label"));
		String ExpectedTitle1 = "COVID_19 Symptoms Present *";
		Assert.assertEquals(COVID.getText(), ExpectedTitle1);
		WebElement COVIDYes = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/div/div[1]/label/span"));
		String ExpectedTitle2 = "yes";
		Assert.assertEquals(COVIDYes.getText(), ExpectedTitle2);
		WebElement COVIDNo  = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/div/div[2]/label/span"));
		String ExpectedTitle3 = "no";
		Assert.assertEquals(COVIDNo.getText(), ExpectedTitle3);		
		r.Gotopatient_Forms_When();
		r.Gotopatient_Forms_breathing();
		WebElement breathing  = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/label"));
		String ExpectedTitle4 = "Do you have difficulty breathing *";
		Assert.assertEquals(breathing.getText(), ExpectedTitle4);
		WebElement breathingYes = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/div/div[1]/label/span"));
		String ExpectedTitle5 = "yes";
		Assert.assertEquals(breathingYes.getText(), ExpectedTitle5);
		WebElement breathingNo = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/div/div[2]/label/span"));
		String ExpectedTitle6 = "no";
		Assert.assertEquals(breathingNo.getText(), ExpectedTitle6);
		r.Gotopatient_Forms_cherries();
		WebElement cherries = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/label"));
		String ExpectedTitle7 = "Have you had any cranberries *";
		Assert.assertEquals(cherries.getText(), ExpectedTitle7);
		WebElement cherriesYes = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[1]/label/span"));
		String ExpectedTitle8 = "yes";
		Assert.assertEquals(cherriesYes.getText(), ExpectedTitle8);
		WebElement cherriesNo = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[2]/label/span"));
		String ExpectedTitle9 = "no";
		Assert.assertEquals(cherriesNo.getText(), ExpectedTitle9);
		r.Gotopatient_Forms_COVID19();
		r.Gotopatient_Forms_image1();
		WebElement image1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div/div/label"));
		String ExpectedTitle10 = "image *";
		Assert.assertEquals(image1.getText(), ExpectedTitle10);
		r.Gotopatient_Forms_image2();
		WebElement image2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[7]/div/div/div/label"));
		String ExpectedTitle11 = "image *";
		Assert.assertEquals(image2.getText(), ExpectedTitle11);
		r.Gotopatient_Forms_save();
		Thread.sleep(20000);
		WebElement COMPLETE = driver.findElement(By.xpath("//*[@id=\"registration\"]/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[1]/a/div"));
		String ExpectedTitle = "COMPLETE";
		Assert.assertEquals(COMPLETE.getText(), ExpectedTitle);
		Thread.sleep(10000);
		
	}
	
	
	
}
