package com.access.testcases;


import org.testng.annotations.Test;

import com.access.pageobject.*;

public class ForgotP_tc_2  extends BaseClass
{

	@Test
	
	public void forgotpassword() throws Exception
	{
		ForgotPassword obj1=new ForgotPassword(driver);
		obj1.linkfogotpassword();
		
		obj1.fpemail("12345");
		
		obj1.clearfp();
		
		
		
		
		
	}
	
}
