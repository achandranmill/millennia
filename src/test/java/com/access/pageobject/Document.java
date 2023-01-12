package com.access.pageobject;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Document 

{

	WebDriver ldriver;
	public Document(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"myDocuments\"]/main/my-documents-list/div/div[2]/div/documents-list")
	@CacheLookup
	WebElement Button_print_edit;
	
	public void Button_print_edit()
	{
		String act = Button_print_edit.getText();
		System.out.println(act);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class=\"modal-content\"]")
	@CacheLookup
	WebElement Modal_pops;
	
	public void Modal_pops()
	{
		String act = Modal_pops.getText();
		System.out.println(act);
	}
	
	@FindBy(how=How.XPATH,using="//button[@class=\"btn btn-primary btn-block edit-button\"]")
	@CacheLookup
	WebElement RCB_edit;

	public void RCB_edit()
	{
		RCB_edit.click();
	}

	@FindBy(how=How.ID,using="formly_4_input_0_0")
	@CacheLookup
	WebElement RCB_First_Name;

	public void RCB_First_Name(String a)
	{
		RCB_First_Name.sendKeys(a);
	}

	@FindBy(how=How.ID,using="formly_4_input_1_1")
	@CacheLookup
	WebElement RCB_Last_Name;

	public void RCB_Last_Name(String b)
	{
		RCB_Last_Name.click();
		RCB_Last_Name.clear();
		RCB_Last_Name.sendKeys(b);
	}

	@FindBy(how=How.ID,using="formly_4_date_2_2")
	@CacheLookup
	WebElement RCB_DOB;

	public void RCB_DOB(String d)
	{
		RCB_DOB.click();
		RCB_DOB.clear();
		RCB_DOB.sendKeys(d);
	}

	@FindBy(how=How.ID,using="formly_4_full_ssn_3_3")
	@CacheLookup
	WebElement RCB_SSN;

	public void RCB_SSN(String s)
	{
		RCB_SSN.sendKeys(s);
	}

	@FindBy(how=How.ID,using="formly_4_streetAddress_4_4")
	@CacheLookup
	WebElement RCB_PATIENT;

	public void RCB_PATIENT(String p)
	{
		RCB_PATIENT.sendKeys(p);
	}

	@FindBy(how=How.ID,using="formly_4_postalCode_5_5")
	@CacheLookup
	WebElement RCB_ZIP_CODE;

	public void RCB_ZIP_CODE(String z)
	{
		RCB_ZIP_CODE.sendKeys(z);
	}

	@FindBy(how=How.ID,using="checkbox_6")
	@CacheLookup
	WebElement RCB_SIGNATURE1;

	public void RCB_SIGNATURE1()
	{
		RCB_SIGNATURE1.click();
	}

	@FindBy(how=How.XPATH,using="//canvas[@id='canvas_6']")
	@CacheLookup
	WebElement RCB_Signature2;

	public void RCB_Signature2()
	{
		Actions builder = new Actions(ldriver);
		Action signature= builder.contextClick(RCB_Signature2)                       
				.clickAndHold()
				.moveToElement(RCB_Signature2,20,-50)
				.moveByOffset(50, 50)
				.moveByOffset(80,-50)
				.moveByOffset(100,50)
				.release(RCB_Signature2)
				.build();                       
		signature.perform();
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Done')]")
	@CacheLookup
	WebElement RCB_DONE;
	
	public void RCB_DONE()
	{
		RCB_DONE.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"myDocuments\"]/main/my-documents-list/div/div[2]/div/documents-list/div/a[1]/div[2]/div/div/button[1]")
	@CacheLookup
	WebElement Print;
	
	public void Print() 
	{
		Print.click();
	}

	@FindBy(how=How.CSS,using="#icon")
	@CacheLookup
	WebElement PDF_threedot;
	
	
	public void PDF_threedot()
	{
		
		PDF_threedot.click();
	    
	}
	
	@FindBy(how=How.XPATH,using="/html/body/pdf-viewer//viewer-toolbar//cr-action-menu/button[4]")
	@CacheLookup
	WebElement PDF_document;
	
	public void PDF_document()
	{
		PDF_document.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/embed")
	@CacheLookup
	WebElement pdf_print;
	
	public void pdf_print()
	{
		
		String act = pdf_print.getText();
		System.out.println(act);
	}
	
	
	
	
	
	
	
	
}
