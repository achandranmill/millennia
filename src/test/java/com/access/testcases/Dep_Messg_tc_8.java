package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Messg_tc_8 extends BaseClass

{
	public void departments() throws InterruptedException 
	{
		

		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
	//	pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.Dept_Messages();
		Thread.sleep(2000);
		dept.Message_Addnew();
		Thread.sleep(2000);
		dept.Message_CreateCustomMessage();
		Thread.sleep(2000);
		dept.Message_continue();
		Thread.sleep(2000);
		dept.Message_voiceMessage();
		Thread.sleep(2000);
		dept.Message_voiceSend();
		Thread.sleep(2000);
		dept.Message_voiceRecipients();
		Thread.sleep(2000);
		dept.Message_voiceRecipientsPATIENT();
		Thread.sleep(2000);
		dept.Message_VoiceAddResponse();
		Thread.sleep(2000);
		dept.Message_VoiceAddResponseFollow("why");
		Thread.sleep(2000);
		dept.Message_VoiceAddResponseSelect();
		Thread.sleep(2000);
		dept.Message_VoiceAddResponseFollow("yes");
		Thread.sleep(2000);
		dept.Message_VoiceAddResponseCross();
		Thread.sleep(2000);
		dept.Message_VoiceMessageContent("yes");
		Thread.sleep(10000);
		
		
}
}