package com.access.testcases;

import java.util.concurrent.TimeUnit;

import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Reg_TC_04 extends BaseClass

{
	
	public void RegistrationPage() throws Exception
	{
		   loginpage lp=new loginpage(driver);
		   lp.setUserName(email);
		   lp.setPassword(password);
		   lp.clickSubmit();
		   Thread.sleep(5000);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   RegtPage r=new RegtPage(driver);
		   r.clickRegistrationPage();
		   Thread.sleep(3000);
		   
			  
	   r.clickredit("rajput", "praveen", "kumar");
		   
		   Thread.sleep(3000);
		  
		   r.Editdate();
		   
		   r.txtdate("03122022");
		   Thread.sleep(3000);
		  
		   r.txtEditAPPTTIME("09:45");
		   r.AMPM();
		   r.APPLIAM();
		  
		   r.gender("male");
		   Thread.sleep(5000);
		   r.Editseeing();
		  
           r.Number("7896509874");
          
           
           r.Email("ravi@gmail.com");
          
           r.contactname("praveen");
           r.contactnumber("7777777777");
           r.Editcopay();
           r.Copay("7000");
           Thread.sleep(3000);
           
           r.comment("complete");
           r.FLAGS();
           
          
           
            
           
           
	}
	



}
