package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Messg_tc_12 extends BaseClass

{
	public void departments() throws Exception 
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
		dept.Message_ChoosefromCoreMessages();
		Thread.sleep(2000);
		dept.Message_fromTemplate();
		Thread.sleep(2000);
		dept.Message_continue();
		Thread.sleep(2000);
		 dept.Message_Templatetitle("Pre-Op Sx Message3");
        Thread.sleep(2000);
        dept.Message_TemplateEmail();
        Thread.sleep(2000);
        dept.Message_TemplateEmailSend();
        Thread.sleep(2000);
        dept.Message_TemplateEmailRecipients();
        Thread.sleep(2000);
  dept.Message_TemplateEmailRecipientsAppoint();
   Thread.sleep(2000);
   dept.Message_TemplateEmailContent("REPLY");
    dept.Message_TemplateEmailCC();
    Thread.sleep(5000);
    dept.Message_TemplateEmailCCUser();
    Thread.sleep(2000);
    dept.Message_TemplateEmailContent("REPLY");
    dept.Message_TemplateEmailBcc();
    Thread.sleep(2000);
    dept.Message_TemplateEmailBccAdmin();
    Thread.sleep(2000);
    dept.Message_TemplateEmailContent("REPLY");
    Thread.sleep(5000);
    dept.Message_TemplateEmailSubject("yes");
    Thread.sleep(2000);
    dept.Message_TemplateHL7();
    Thread.sleep(2000);
    dept.Message_TemplateHL7Address("city");
    Thread.sleep(2000);
    dept.Message_TemplateHL7Message("hi");
    Thread.sleep(2000);
    dept.Message_TemplateSave();
	
	
}
}
