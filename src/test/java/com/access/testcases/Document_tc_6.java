package com.access.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Document;
import com.access.pageobject.Get_In_Line;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_6 extends BaseClass

{



	public void Document() throws Exception
	{
		driver.get("https://connect-stage-a.jellyfishhealth.com:443/inline?d=Imenso.sandbox-staging");
		//----------------GET-IN-LINE (CONNECT PORTAL)--------------------------------
		Get_In_Line of = new Get_In_Line(driver);
		of.Sing_in();
		Thread.sleep(1000);
		of.Sign_Email("albert@gmail.com");
		Thread.sleep(1000);
		of.Sign_Password("A@lbert123");
		Thread.sleep(1000);
		of.Sign_Submit();
		Thread.sleep(15000);
		of.My_Documents();
		Thread.sleep(10000);
		Document d  =  new Document(driver);
		d.Print();
		/*Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String PWD = it.next();
		String CWID = it.next();
		driver.switchTo().window(PWD);
		String url =driver.getCurrentUrl();
		System.out.println("pdf tab url:"+url);*/
		String url = driver.getCurrentUrl();
		URL pdfurl = new URL(url);
		URLConnection urlconnection = pdfurl.openConnection();
		urlconnection.addRequestProperty("User-Agent", "Chrome");
		InputStream ip     = urlconnection.getInputStream();
		BufferedInputStream bf = new BufferedInputStream(ip);
		


	}	
}
