package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Get_In_Line;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Get_In_Line_tc_2 extends BaseClass

{

	public void Get_In_Line() throws Exception
	{
		
	loginpage lp=new loginpage(driver);
	lp.setUserName(email);
	lp.setPassword(password);
	lp.clickSubmit();
	Thread.sleep(3000);
	//AdmUser ad=new AdmUser(driver);
	//ad.userlocation();
	//Thread.sleep(5000);
	//ad.okbutton();
	RegtPage r=new RegtPage(driver);
	r.clickRegistrationPage();
	Thread.sleep(3000);
	Provider pd = new Provider(driver);
//	pd.LocationPopup("Florida");
	Thread.sleep(10000);
	pd.UserAdmin();
	Thread.sleep(3000);
	pd.Admin();
	Thread.sleep(3000);
	Get_In_Line of = new Get_In_Line(driver);
	of.Department_Link();
	Thread.sleep(3000);
	of.Get_in_line_link();
	Thread.sleep(3000);
	of.Getin_line_link2();
	Thread.sleep(10000);
	of.Getin_Next();
	Thread.sleep(20000);
	of.RCB_Report();
	Thread.sleep(10000);
	of.RCB_firstname("Udit");
	Thread.sleep(3000);
	of.RCB_lastname("Dudhe");
	Thread.sleep(10000);
	of.RCB_dob("12-09-1992");
	Thread.sleep(3000);
	of.RCB_Patient("Udit");
	Thread.sleep(3000);
	of.RCB_ssn("666666666");
	Thread.sleep(3000);
	of.RCB_ZipCode("555555555");
	of.RCB_Tick();
	Thread.sleep(3000);
	of.RCB_Signature2();
	Thread.sleep(3000);
	of.RCB_Done();
	Thread.sleep(10000);
	of.New_Que();
	Thread.sleep(3000);
	of.New_Que_Done();
	Thread.sleep(10000);
	of.Email("udit@gmail.com");
	Thread.sleep(3000);
	of.Password("U@d1i2t3");
	Thread.sleep(3000);
	of.Confirm_Password("U@d1i2t3");
	Thread.sleep(3000);
	of.First_name("Udit");
	Thread.sleep(3000);
	of.Location1("Bhopal");
	Thread.sleep(3000);
	of.SSN("09-09-1992");
	Thread.sleep(3000);
	of.Male();
	Thread.sleep(3000);
	of.Phone("8888888888");
	Thread.sleep(3000);
	of.Location2("Bhopal");
	Thread.sleep(3000);
	of.Last4ofSSNTITLE("6666");
	Thread.sleep(3000);
	of.Text_Message();
	Thread.sleep(3000);
	of.Send_Email();
	Thread.sleep(3000);
	of.Send_Voice();
	Thread.sleep(3000);
	of.Terms();
	Thread.sleep(10000);
	of.Robot();
	Thread.sleep(3000);
    of.REGISTERANDGET_LINE();
	

}
	
	
}
