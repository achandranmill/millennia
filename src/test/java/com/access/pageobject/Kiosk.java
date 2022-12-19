package com.access.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Kiosk 
{

	  WebDriver  ldriver;
	     
	     public Kiosk(WebDriver rdriver)
	     {
	    	 
	    	 ldriver = rdriver;
	    	 PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	    	 
	     }
	     
	  @FindBy(how=How.XPATH,using="//a[contains(text(),'Departments')]") 
	  @CacheLookup
	  WebElement Department_Link;
	  
	  public void Department_Link()
	  {
		  Department_Link.click();
	  }
	  
	  
	 @FindBy(how=How.XPATH,using="//a[contains(text(),'Kiosk')]")  
	 @CacheLookup
	 WebElement Kiosk;
	     
	    public void  Kiosk()
	    {
	    	Kiosk.click();
	    }
	     
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[1]/div/div[1]/div[1]/div/input") 
	@CacheLookup
	WebElement Kiosk_ErrorMessage;
	
	public void Kiosk_ErrorMessage(String e)
	{
		Kiosk_ErrorMessage.click();
		Kiosk_ErrorMessage.clear();
		Kiosk_ErrorMessage.sendKeys(e);
	}
	    
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[1]/div/div[1]/div[2]/div/div/input")
	@CacheLookup
	WebElement Kiosk_ErrorMessageTimeout;
	
	public void Kiosk_ErrorMessageTimeout(String t)
	{
		Kiosk_ErrorMessageTimeout.click();
		Kiosk_ErrorMessageTimeout.clear();
		Kiosk_ErrorMessageTimeout.sendKeys(t);
	}
	
	@FindBy(how=How.ID,using="search-appointment-add")
	@CacheLookup
	WebElement Kiosk_WalkInAppointmentFlag;

	public void Kiosk_WalkInAppointmentFlag()
	{
		if(!Kiosk_WalkInAppointmentFlag.isSelected()) {
			
			JavascriptExecutor ab = (JavascriptExecutor)ldriver;
			ab.executeScript("arguments[0].click", Kiosk_WalkInAppointmentFlag);
			if(!Kiosk_WalkInAppointmentFlag.isSelected()) {
				Kiosk_WalkInAppointmentFlag.click();
			}
			
		}
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"kiosk-config\"]/form/div[1]/div/div[2]/div[1]/div[2]/button")
	@CacheLookup
	WebElement Kiosk_Flag_dropdown;

	public void Kiosk_Flag_dropdown()
	{
		Kiosk_Flag_dropdown.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[1]/div/div[2]/div[1]/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement Kiosk_Flag_dropdown1;

	public void Kiosk_Flag_dropdown1()
	{
		Kiosk_Flag_dropdown1.click();
	}

	@FindBy(how=How.ID,using="add-new-add")
	@CacheLookup
	WebElement Kiosk_NewPatientCreatedFlag;

	public void Kiosk_NewPatientCreatedFlag()
	{
		if(!Kiosk_NewPatientCreatedFlag.isSelected()) {
			JavascriptExecutor r = (JavascriptExecutor)ldriver;
			r.executeScript("arguments[0].click", Kiosk_NewPatientCreatedFlag);
			if(!Kiosk_NewPatientCreatedFlag.isSelected()) {
				Kiosk_NewPatientCreatedFlag.click();
			}
		}
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[1]/div/div[2]/div[2]/div[2]/button")
	@CacheLookup
	WebElement Kiosk_newpatientflag_dropdown;

	public void Kiosk_newpatientflag_dropdown()
	{
		Kiosk_newpatientflag_dropdown.click();
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"kiosk-config\"]/form/div[1]/div/div[2]/div[2]/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement Kiosk_newpatientflag_dropdown1;

	public void Kiosk_newpatientflag_dropdown1()
	{
		Kiosk_newpatientflag_dropdown1.click();
	}


	@FindBy(how=How.ID,using="welcome-page-configure")
	@CacheLookup
	WebElement Kiosk_configuration;

	public void Kiosk_configuration()
	{
		Kiosk_configuration.click();
	}

	@FindBy(how=How.ID,using="welcome-message-input")
	@CacheLookup
	WebElement Kiosk_WelcomeScreenMessage;

	public void Kiosk_WelcomeScreenMessage(String s)
	{
		Kiosk_WelcomeScreenMessage.click();
		Kiosk_WelcomeScreenMessage.clear();
		Kiosk_WelcomeScreenMessage.sendKeys(s);
	}


	@FindBy(how=How.ID,using="message-font-size-button")
	@CacheLookup
	WebElement Kiosk_FontSize;

	public void Kiosk_FontSize()
	{
		Kiosk_FontSize.click();
	}


	@FindBy(how=How.XPATH,using="//a[contains(text(),'H3')]")
	@CacheLookup
	WebElement Kiosk_FontSizeH3;


	public void Kiosk_FontSizeH3()
	{
		Kiosk_FontSizeH3.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'H1')]")
	@CacheLookup
	WebElement Kiosk_FontSizeH1;

	public void Kiosk_FontSizeH1()
	{
		Kiosk_FontSizeH1.click();
	}


	@FindBy(how=How.ID,using="message-field-size-button")
	@CacheLookup
	WebElement Kiosk_Fieldsize;

	public void Kiosk_Fieldsize()
	{
		Kiosk_Fieldsize.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSize\"]/ul/li[3]/a")
	@CacheLookup
	WebElement Kiosk_Fieldsize3;

	public void Kiosk_Fieldsize3()
	{
		Kiosk_Fieldsize3.click();
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"fieldSize\"]/ul/li[10]/a")
	@CacheLookup
	WebElement Kiosk_Fieldsize10;

	public void Kiosk_Fieldsize10()
	{
		Kiosk_Fieldsize10.click();
	}

	@FindBy(how=How.ID,using="message-placement-left")
	@CacheLookup
	WebElement Kiosk_messageplacementleft;

	public void Kiosk_messageplacementleft()
	{
		Kiosk_messageplacementleft.click();
	}


	@FindBy(how=How.ID,using="message-placement-center")
	@CacheLookup
	WebElement Kiosk_messageplacementcenter;

	public void Kiosk_messageplacementcenter()
	{
		Kiosk_messageplacementcenter.click();
	}

	@FindBy(how=How.ID,using="message-placement-right")
	@CacheLookup
	WebElement Kiosk_messageplacementright;

	public void Kiosk_messageplacementright()
	{
		Kiosk_messageplacementright.click();
	}


	@FindBy(how=How.ID,using="welcome-button-text")
	@CacheLookup
	WebElement Kiosk_SearchButtonText;

	public void Kiosk_SearchButtonText(String s)
	{
		Kiosk_SearchButtonText.click();
		Kiosk_SearchButtonText.clear();
		Kiosk_SearchButtonText.sendKeys(s);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[4]/div[1]/label/input")
	@CacheLookup
	WebElement   Kiosk_ButtonPlacementLeft;

	public void Kiosk_ButtonPlacementLeft()
	{
		Kiosk_ButtonPlacementLeft.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[4]/div[2]/label/input")
	@CacheLookup
	WebElement Kiosk_ButtonPlacementCenter;

	public void Kiosk_ButtonPlacementCenter()
	{
		Kiosk_ButtonPlacementCenter.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[4]/div[3]/label/input")
	@CacheLookup
	WebElement Kiosk_ButtonPlacementRight;

	public void Kiosk_ButtonPlacementRight()
	{
		Kiosk_ButtonPlacementRight.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[5]/label/input")
	@CacheLookup
	WebElement Kiosk_AllowNewAppointmentFromWelcomeScreen;

	public void Kiosk_AllowNewAppointmentFromWelcomeScreen()
	{
		Kiosk_AllowNewAppointmentFromWelcomeScreen.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[6]/div/div/textarea")
	@CacheLookup
	WebElement Kiosk_NewAppointmentButtonText;

	public void Kiosk_NewAppointmentButtonText(String f)
	{
		
		Kiosk_NewAppointmentButtonText.click();
		
		Kiosk_NewAppointmentButtonText.sendKeys(f);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[7]/div[1]/label/input")
	@CacheLookup
	WebElement Kiosk_newButtonPlacementLeft;

	public void Kiosk_newButtonPlacementLeft()
	{
		Kiosk_newButtonPlacementLeft.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-welcome-builder/div[2]/div[7]/div[2]/label/input")
	@CacheLookup
	WebElement Kiosk_newButtonPlacementRight;

	public void Kiosk_newButtonPlacementRight()
	{
		Kiosk_newButtonPlacementRight.click();
	}


	@FindBy(how=How.ID,using="welcome-done")
	@CacheLookup
	WebElement Kiosk_Donebutton;


	public void Kiosk_Donebutton()
	{
		Kiosk_Donebutton.click();
	}


	@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]")
	@CacheLookup
	WebElement Kiosk_Cancelbutton;

	public void Kiosk_Cancelbutton()
	{
		Kiosk_Cancelbutton.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[2]/div/div/div/div[1]/div/label/input")
	@CacheLookup
	WebElement   Kiosk_SearchAppointmentFlow;

	public void Kiosk_SearchAppointmentFlow()
	{
		if(!Kiosk_SearchAppointmentFlow.isSelected()) {
			JavascriptExecutor ab = (JavascriptExecutor)ldriver;
			ab.executeScript("arguments[0].click", Kiosk_SearchAppointmentFlow);
			if(!Kiosk_SearchAppointmentFlow.isSelected()) {
				Kiosk_SearchAppointmentFlow.click();
			}
		}
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[3]/div/div/div/div[1]/button")
	@CacheLookup
	WebElement Kiosk_searchpageconfigurebutton;

	public void Kiosk_searchpageconfigurebutton()
	{
		Kiosk_searchpageconfigurebutton.click();
	}


	@FindBy(how=How.ID,using="welcome-message-input")
	@CacheLookup
	WebElement Kiosk_welcomemessageinput;

	public void Kiosk_welcomemessageinput(String s)
	{
		Kiosk_welcomemessageinput.click();
		Kiosk_welcomemessageinput.clear();
		Kiosk_welcomemessageinput.sendKeys(s);
		
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/div/div/div[1]/div[1]/select")
	@CacheLookup
	WebElement Kiosk_FieldType;

	public void Kiosk_FieldTypeFirstName()
	{
		Select AB = new Select(Kiosk_FieldType);
		AB.selectByVisibleText("First Name");
	}

	public void Kiosk_FieldTypeLastName()
	{
		Select AB = new Select(Kiosk_FieldType);
		AB.selectByVisibleText("Last Name");
	}
	
	@FindBy(how=How.NAME,using="fieldSize")
	@CacheLookup
	WebElement Kiosk_fieldSize;

	public void Kiosk_fieldSize()
	{
		Select dc = new Select(Kiosk_fieldSize);
		dc.selectByVisibleText("3");
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/div/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement Kiosk_FieldTitle;

	public void Kiosk_FieldTitle(String t)
	{
		Kiosk_FieldTitle.click();
		Kiosk_FieldTitle.clear();
		Kiosk_FieldTitle.sendKeys(t);
	}

	@FindBy(how=How.NAME,using="placeholderText")
	@CacheLookup
	WebElement Kiosk_placeholderText;


	public void Kiosk_placeholderText(String t)
	{
		Kiosk_placeholderText.click();
		Kiosk_placeholderText.clear();
		Kiosk_placeholderText.sendKeys(t);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/div/div/div[3]/div/div/label/input")
	@CacheLookup
	WebElement Kiosk_Required;

	public void Kiosk_Required()
	{
		Kiosk_Required.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Add more')]")
	@CacheLookup
	WebElement Kiosk_AddMore;

	public void Kiosk_AddMore()
	{
		Kiosk_AddMore.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add')]")
	@CacheLookup
	WebElement Kiosk_Add;
	
	public void Kiosk_Add()
	{
		Kiosk_Add.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Done')]")
	@CacheLookup
	WebElement Kiosk_Done;

	public void Kiosk_Done()
	{
		Kiosk_Done.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]")
	@CacheLookup
	WebElement Kiosk_Cancel;

	public void Kiosk_Cancel()
	{
		Kiosk_Cancel.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/header/a[2]")
	@CacheLookup
	WebElement Kiosk_SerialChange;

	public void Kiosk_SerialChange()
	{
		Kiosk_SerialChange.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-search-config/div[2]/field-builder/div/div[2]/header/a[1]")
	@CacheLookup
	WebElement Kiosk_Searchpage_Cross;


	public void Kiosk_Searchpage_Cross()
	{
		Kiosk_Searchpage_Cross.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[2]/div/div/div/div[2]/div/label/input")
	@CacheLookup
	WebElement   Kiosk_AddNewAppointmentFlow;

	public void Kiosk_AddNewAppointmentFlow()
	{
		if(!Kiosk_AddNewAppointmentFlow.isSelected()) {
			JavascriptExecutor ab = (JavascriptExecutor)ldriver;
			ab.executeScript("arguments[0].click", Kiosk_AddNewAppointmentFlow);
			if(!Kiosk_AddNewAppointmentFlow.isSelected()) {
				Kiosk_AddNewAppointmentFlow.click();
			}
			
		}
	}


	@FindBy(how=How.ID,using="add-new-patient-add-page")
	@CacheLookup
	WebElement Kiosk_AddPage;

	public void Kiosk_AddPage()
	{
		Kiosk_AddPage.click();
	}

	@FindBy(how=How.ID,using="page-builder-name-input")
	@CacheLookup
	WebElement Kiosk_PageName;

	public void Kiosk_PageName(String pn)
	{
		
		Kiosk_PageName.sendKeys(pn);
	}

	@FindBy(how=How.NAME,using="pageType")
	@CacheLookup
	WebElement Kiosk_Pagetype;

	public void Kiosk_Pagetype()
	{
		Select a = new Select(Kiosk_Pagetype);
		a.selectByVisibleText("Fields");
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/a")
	@CacheLookup
	WebElement Kiosk_pagename_Addmore;

	public void Kiosk_pagename_Addmore()
	{
		Kiosk_pagename_Addmore.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[1]/select")
	@CacheLookup
	WebElement Kiosk_Pagename_Fieldtype;

	public void Kiosk_Pagename_FieldFirst()
	{
		Select av = new Select(Kiosk_Pagename_Fieldtype);
		av.selectByVisibleText("First Name");
	}

	@FindBy(how=How.NAME,using="fieldSize")
	@CacheLookup
	WebElement Kiosk_Pagename_fieldSize;

	public void Kiosk_Pagename_fieldSizeFirst()
	{
		Select fs = new Select(Kiosk_Pagename_fieldSize);
		fs.selectByVisibleText("3");
	}

	public void Kiosk_Pagename_FieldAppointmentTime()
	{
		Select av = new Select(Kiosk_Pagename_Fieldtype);
		av.selectByVisibleText("Appointment Time");
	}

	public void Kiosk_Pagename_fieldSizeA()
	{
		Select fs = new Select(Kiosk_Pagename_fieldSize);
		fs.selectByVisibleText("4");
	}

	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[3]/div/div/div[1]/div[1]/select")
	@CacheLookup
	WebElement Kiosk_Pagename_FieldLastName;
	
	public void Kiosk_Pagename_FieldLastName()
	{
		Select av = new Select(Kiosk_Pagename_FieldLastName);
		av.selectByVisibleText("Last Name");
	}

	public void Kiosk_Pagename_fieldSizeLN()
	{
		Select fs = new Select(Kiosk_Pagename_fieldSize);
		fs.selectByVisibleText("4");
	}

	

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement Kiosk_Pagename_Title;

	public void Kiosk_Pagename_Title(String pt)
	{
		Kiosk_Pagename_Title.click();
		Kiosk_Pagename_Title.clear();
		Kiosk_Pagename_Title.sendKeys(pt);
	}





	@FindBy(how=How.NAME,using="placeholderText")
	@CacheLookup
	WebElement Kiosk_Pagename_Placeholder;

	public void Kiosk_Pagename_Placeholder(String ph)
	{
		Kiosk_Pagename_Placeholder.click();
		Kiosk_Pagename_Placeholder.clear();
		Kiosk_Pagename_Placeholder.sendKeys(ph);
	}


	@FindBy(how=How.NAME,using="requiredCheck")
	@CacheLookup
	WebElement Kiosk_Pagename_RequiredCheck;


	public void Kiosk_Pagename_RequiredCheck()
	{
		if(!Kiosk_Pagename_RequiredCheck.isSelected()) {
			JavascriptExecutor pr = (JavascriptExecutor)ldriver;
			pr.executeScript("arguments[0].click", Kiosk_Pagename_RequiredCheck);
			if(!Kiosk_Pagename_RequiredCheck.isSelected()) {
				Kiosk_Pagename_RequiredCheck.click();
			}
		}
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement Kiosk_PagetVerification_title;
	
	public void Kiosk_PagetVerification_title(String t)
	{
		Kiosk_PagetVerification_title.sendKeys(t);
	}
	
	@FindBy(how=How.ID,using="pageType")
	@CacheLookup
	WebElement Kiosk_PagetVerification_page_type;

	public void Kiosk_PagetVerification()
	{
		Select a = new Select(Kiosk_PagetVerification_page_type);
		a.selectByVisibleText("Verification");
	}


	@FindBy(how=How.ID,using="firstName")
	@CacheLookup
	WebElement Kiosk_pagename_VerificationfirstName;

	public void Kiosk_pagename_VerificationfirstName()
	{
		if(!Kiosk_pagename_VerificationfirstName.isSelected()) {
			JavascriptExecutor vs = (JavascriptExecutor)ldriver;
			vs.executeScript("arguments[0].click", Kiosk_pagename_VerificationfirstName);
			if(!Kiosk_pagename_VerificationfirstName.isSelected()) {
				Kiosk_pagename_VerificationfirstName.click();
			}
		}
	}



	@FindBy(how=How.ID,using="lastName")
	@CacheLookup
	WebElement Kiosk_pagename_VerificationlastName1;

	public void Kiosk_pagename_VerificationlastName1()
	{
		if(!Kiosk_pagename_VerificationlastName1.isSelected()) {
			JavascriptExecutor vs = (JavascriptExecutor)ldriver;
			vs.executeScript("arguments[0].click", Kiosk_pagename_VerificationlastName1);
			if(!Kiosk_pagename_VerificationlastName1.isSelected()) {
				Kiosk_pagename_VerificationlastName1.click();
			}
		}
	}



	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/verification-builder/div[3]/div/label/input")
	@CacheLookup
	WebElement Kiosk_pagename_VerificationlastName;

	public void Kiosk_pagename_VerificationlastName()
	{
		if(!Kiosk_pagename_VerificationlastName.isSelected()) {
			JavascriptExecutor vs = (JavascriptExecutor)ldriver;
			vs.executeScript("arguments[0].click", Kiosk_pagename_VerificationlastName);
			if(!Kiosk_pagename_VerificationlastName.isSelected()) {
				Kiosk_pagename_VerificationlastName.click();
			}
		}
	}


	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add')]")
	@CacheLookup
	WebElement Kiosk_Pagename_Add;

	public void Kiosk_Pagename_Add()
	{
		Kiosk_Pagename_Add.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[3]/button[1]")
	@CacheLookup
	WebElement Kiosk_Pagename_Cancel;

	public void Kiosk_Pagename_Cancel()
	{
		Kiosk_Pagename_Cancel.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[3]/div/div/div/div[3]/span[3]")
	@CacheLookup
	WebElement  Kiosk_Pagename_Edit;


	public void Kiosk_Pagename_Edit()

	{
		Kiosk_Pagename_Edit.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[3]/div/div/div/div[1]/span")
	@CacheLookup
	WebElement Kiosk_Pagename_Delete;

	public void Kiosk_Pagename_Delete()
	{
		Kiosk_Pagename_Delete.click();
	}



	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[3]/div[1]/a")
	@CacheLookup
	WebElement Kiosk_ExistingAppointment_Addpage;

	public void Kiosk_ExistingAppointment_Addpage()
	{
		Kiosk_ExistingAppointment_Addpage.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement Kiosk_ExistingAppointmen_Pagename;

	public void Kiosk_ExistingAppointmen_Pagename(String EA)
	{
		
		Kiosk_ExistingAppointmen_Pagename.click();
		Kiosk_ExistingAppointmen_Pagename.sendKeys(EA);
	}
    
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement Kiosk_ExistingAppointmen_verification_page;
	
	public void Kiosk_ExistingAppointmen_verification_page(String v)
	{
		Kiosk_ExistingAppointmen_verification_page.click();
		Kiosk_ExistingAppointmen_verification_page.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[1]/div/div[2]/div/select")
	@CacheLookup
	WebElement Kiosk_ExistingAppointmen_PageType;

	public void Kiosk_ExistingAppointmen_PageType()
	{
		Select Ep = new Select(Kiosk_ExistingAppointmen_PageType);
		Ep.selectByVisibleText("Fields");
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/a")
	@CacheLookup
	WebElement Kiosk_ExistingAppointme_Addmore;


	public void Kiosk_ExistingAppointme_Addmore()
	{
		Kiosk_ExistingAppointme_Addmore.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[1]/select")
	@CacheLookup
	WebElement Kiosk_ExistingAppointme_FieldType;

	public void Kiosk_ExistingAppointme_FirstName()
	{
		Select ab = new Select(Kiosk_ExistingAppointme_FieldType);
		ab.selectByVisibleText("First Name");
	}

	public void Kiosk_ExistingAppointme_LastName()
	{
		Select ab = new Select(Kiosk_ExistingAppointme_FieldType);
		ab.selectByVisibleText("Last Name");
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[2]/select")
	@CacheLookup
	WebElement Kiosk_ExistingAppointme_FieldSize;

	public void Kiosk_ExistingAppointme_FieldSize()
	{
		Select ea = new Select(Kiosk_ExistingAppointme_FieldSize);
		ea.selectByVisibleText("6");
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement Kiosk_ExistingAppointme_FieldTitle;

	public void Kiosk_ExistingAppointme_FieldTitle(String t)
	{
		Kiosk_ExistingAppointme_FieldTitle.click();
		Kiosk_ExistingAppointme_FieldTitle.clear();
		Kiosk_ExistingAppointme_FieldTitle.sendKeys(t);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[2]/div/input")
	@CacheLookup
	WebElement Kiosk_ExistingAppointme_Placeholder;

	public void Kiosk_ExistingAppointme_Placeholder(String pk)
	{
		Kiosk_ExistingAppointme_Placeholder.click();
		Kiosk_ExistingAppointme_Placeholder.clear();
		Kiosk_ExistingAppointme_Placeholder.sendKeys(pk);
	}



	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[2]/div/field-builder/div/div[2]/div/div/div[3]/div/div/label/input")
	@CacheLookup
	WebElement Kiosk_ExistingAppointme_Required;

	public void Kiosk_ExistingAppointme_Required()
	{
		if(!Kiosk_ExistingAppointme_Required.isSelected()) {
			JavascriptExecutor as = (JavascriptExecutor)ldriver;
			as.executeScript("arguments[0].click", Kiosk_ExistingAppointme_Required);
			if(!Kiosk_ExistingAppointme_Required.isSelected()) {
				Kiosk_ExistingAppointme_Required.click();
			}
		}
	}

	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add')]")
	@CacheLookup
	WebElement Kiosk_ExistingAppointme_ADD;
	
	public void Kiosk_ExistingAppointme_ADD()
	{
		Kiosk_ExistingAppointme_ADD.click();
	}


    @FindBy(how=How.XPATH,using="//select[@id=\"pageType\"]")
    @CacheLookup
    WebElement Kiosk_ExistingAppointmen_PageVerification;


	public void Kiosk_ExistingAppointmen_PageVerification()
	{
		Select Ep = new Select(Kiosk_ExistingAppointmen_PageVerification);
		Ep.selectByVisibleText("Verification");
	}

	@FindBy(how=How.ID,using="firstName")
	@CacheLookup
	WebElement Kiosk_ExistingAppointmen_PageVerification_firstName;

	public void Kiosk_ExistingAppointmen_PageVerification_firstName()
	{
		Kiosk_ExistingAppointmen_PageVerification_firstName.click();
	}

	@FindBy(how=How.ID,using="lastName")
	@CacheLookup
	WebElement Kiosk_ExistingAppointmen_PageVerification_lastName;

	public void Kiosk_ExistingAppointmen_PageVerification_lastName()
	{
		Kiosk_ExistingAppointmen_PageVerification_lastName.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[3]/button[2]")
	@CacheLookup
	WebElement Kiosk_ExistingAppointmen_PageVerification_Add;

	public void Kiosk_ExistingAppointmen_PageVerification_Add()
	{
		Kiosk_ExistingAppointmen_PageVerification_Add.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/kiosk-page-builder/div[3]/button[1]")
	@CacheLookup
	WebElement Kiosk_ExistingAppointmen_PageVerification_Cancel;

	public void Kiosk_ExistingAppointmen_PageVerification_Cancel()
	{
		Kiosk_ExistingAppointmen_PageVerification_Cancel.click();
	}


	@FindBy(how=How.ID,using="confirmation-message")
	@CacheLookup
	WebElement Kiosk_confirmationmessage;

	public void Kiosk_confirmationmessage(String cm)
	{
		Kiosk_confirmationmessage.click();
		Kiosk_confirmationmessage.clear();
		Kiosk_confirmationmessage.sendKeys(cm);
	}

	@FindBy(how=How.ID,using="show-confirmation-separate")
	@CacheLookup
	WebElement Kiosk_separatepage;

	public void Kiosk_separatepage()
	{
		Kiosk_separatepage.click();
	}

	@FindBy(how=How.ID,using="show-confirmation-modal")
	@CacheLookup
	WebElement Kiosk_modal;

	public void Kiosk_modal()
	{
		Kiosk_modal.click();
	}


	@FindBy(how=How.ID,using="show-confirmation-same")
	@CacheLookup
	WebElement Kiosk_samepageaverification;

	public void Kiosk_samepageaverification()
	{
		Kiosk_samepageaverification.click();
	}


	@FindBy(how=How.ID,using="confirmation-timeout")
	@CacheLookup
	WebElement Kiosk_confirmationtimeout;

	public void Kiosk_confirmationtimeout(String c)
	{
		Kiosk_confirmationtimeout.click();
		Kiosk_confirmationtimeout.clear();
		Kiosk_confirmationtimeout.sendKeys(c);
	}


	@FindBy(how=How.ID,using="kiosk-config-save-button")
	@CacheLookup
	WebElement Kiosk_Savebutton;

	public void Kiosk_Savebutton()
	{
		Kiosk_Savebutton.click();
	}


	@FindBy(how=How.XPATH,using="//button[contains(text(),'Undo')]")
	@CacheLookup
	WebElement Kiosk_Undo;


	public void Kiosk_Undo()
	{
		Kiosk_Undo.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/kiosk-configuration/section/form/div[2]/div[3]/div/div/div/div[2]/div/label/input")
	@CacheLookup
	WebElement Kiosk_Skip;

	public void Kiosk_Skip()
	{
		if(!Kiosk_Skip.isSelected()) {
			
			JavascriptExecutor r = (JavascriptExecutor)ldriver;
			r.executeScript("arguments[0].click", Kiosk_Skip);
			if(!Kiosk_Skip.isSelected()) {
				Kiosk_Skip.click();
			}
			
		}	
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    @FindBy(how=How.NAME,using="email")
	    @CacheLookup
	    WebElement Login_email;
	    
	    public void Login_email(String e)
	    {
	    	Login_email.click();
	    	Login_email.sendKeys(e);
	    }
	
	    @FindBy(how=How.NAME,using="password")
	    @CacheLookup
	    WebElement Login_password;
	    
	    public void Login_password(String f)
	    {
	    	Login_password.click();
	    	Login_password.sendKeys(f);
	    }
	    
	    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/login/section/div/div[1]/form/button")
	    @CacheLookup
	    WebElement Login_submit;
	    
	    public void Login_submit()
	    {
	    	Login_submit.click();
	    	
	    }
	    
	    @FindBy(how=How.XPATH,using="/html/body/div[2]")
	    @CacheLookup
	    WebElement Save_Configure_message;
	    
	    public void Save_Configure_message()
	    {
	    	
	    String act = Save_Configure_message.getText();
	    System.out.println("");
	    	
	    	
	    }
	
	     @FindBy(how=How.LINK_TEXT,using="https://access-stage-a.jellyfishhealth.com/#/kiosk")
	     @CacheLookup
	     WebElement Kiosk_Homepage;
	     
	     public void Kiosk_Homepage(String k)
	     {
	    	 Kiosk_Homepage.sendKeys(k);
	     }
	
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Press Here To Start')]")
		@CacheLookup
		WebElement Press_HereTo_Start;
		
		public void Press_HereTo_Start()
		{
			Press_HereTo_Start.click();
		}
		
	    @FindBy(how=How.ID,using="firstName")
	    @CacheLookup
	    WebElement FirstName;
	    
	    public void FirstName(String f)
	    {
	    	FirstName.click();
	    	FirstName.sendKeys(f);
	    }
	    
	  @FindBy(how=How.ID,using="nameLast")
	  @CacheLookup
	  WebElement LastName;
	  
	  public void LastName(String l)
	  {
		  
		  LastName.click();
		  LastName.sendKeys(l);
	  }
	    
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'SEARCH')]") 
	  @CacheLookup
	  WebElement Search;
	  
	  public void Search()
	  {
		  Search.click();
	  }
	  
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'Search Again')]")
	  @CacheLookup
	  WebElement Search_Again;
	  
	  public void Search_Again()
	  {
		  Search_Again.click();
		  
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/main/div[1]/kiosk/div/div[2]/kiosk-search/section/form/div/div/div[1]/div/div/input")
	  @CacheLookup
	  WebElement Search_Again_First;
	  
	  public void Search_Again_First(String sf)
	  {
		  Search_Again_First.click();
		  Search_Again_First.sendKeys(sf);
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/main/div[1]/kiosk/div/div[2]/kiosk-search/section/form/div/div/div[2]/div/div/input")
	  @CacheLookup
	  WebElement Search_Again_Last;
	  
	  public void Search_Again_Last(String sl)
	  {
		  Search_Again_Last.click();
		  Search_Again_Last.sendKeys(sl);
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/main/div[1]/kiosk/div/div[2]/kiosk-search/section/div/div/button")
	  @CacheLookup
	  WebElement Search_Again_Search2;
	  
	  public void Search_Again_Search2()
	  {
		  Search_Again_Search2.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/main/div[1]/kiosk/div/div[2]/kiosk-search/section/form/div/div/div[3]/div/div/button")
	  @CacheLookup
	  WebElement Search_Again_DOB;
	  
	  public void Search_Again_DOB()
	  {
		  Search_Again_DOB.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/jfh-dob-picker/div/div[2]/div/div/button[9]")
	  @CacheLookup
	  WebElement Search_Again_1990;
	  
	  public void Search_Again_1990()
	  {
		  Search_Again_1990.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/jfh-dob-picker/div/div[2]/div/div/button[3]")
	  @CacheLookup
	  WebElement Search_Again_1992;
	  
	  public void Search_Again_1992()
	  {
		  Search_Again_1992.click();
	  }
	  
	  
	  @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/jfh-dob-picker/div/div[2]/div/div/button[1]")
	  @CacheLookup
	  WebElement Search_Again_JAN;
	  
	  public void Search_Again_JAN()
	  {
		  Search_Again_JAN.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/jfh-dob-picker/div/div[2]/div/div/button[10]")
	  @CacheLookup
	  WebElement Search_Again_JAN10;
	  
	  public void Search_Again_JAN10()
	  {
		  Search_Again_JAN10.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'New Appointment')]")
	  @CacheLookup
	  WebElement New_Appointment;
	  
	  public void New_Appointment()
	  {
		  New_Appointment.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="/html/body/main/div[1]/kiosk/div/div[2]/kiosk-flow/section/div[1]/div[3]/button")
	  @CacheLookup
	  WebElement New_Appointment_CheckIN;
	  
	  public void New_Appointment_CheckIN()
	  {
		  New_Appointment_CheckIN.click();
	  }
	  
	  
	    
	  //----------IF   Skip Search Results Page and go straight to Add New Appointment flow   THIS CHECK_BOX IS SELECTED --SEARCH AGAIN -  FUNCTION IS NOT DISPLAYED-------------
	 
	  
	  
	  @FindBy(how=How.XPATH,using="/html/body/main/div[1]/kiosk/div/div[2]/kiosk-flow/section/div[1]/div[3]/button")
	  @CacheLookup
	  WebElement CHECK_IN;
	  
	  public void CHECK_IN()
	  {
		  CHECK_IN.click();
	  }
	    
	  @FindBy(how=How.XPATH,using="/html/body/main/div[1]/kiosk/div/div[2]/kiosk-search/section/form/div/div/div[3]/div/div/button") 
	  @CacheLookup
	  WebElement Kiosk_DOB;
	  
	  public void Kiosk_DOB()
	  {
		  Kiosk_DOB.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'1990')]")
	  @CacheLookup
	  WebElement Kiosk_1990;
	  
	  public void Kiosk_1990()
	  {
		  Kiosk_1990.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'1995')]")
	  @CacheLookup
	  WebElement Kiosk_1995;
	  
	  public void Kiosk_1995()
	  {
		  Kiosk_1995.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'Feb')]")
	  @CacheLookup
	  WebElement Kiosk_Feb;
	  
	  public void Kiosk_Feb()
	  {
		  Kiosk_Feb.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'1')]")
	  @CacheLookup
	  WebElement Kiosk_1;
	  
	  public void Kiosk_1()
	  {
		  Kiosk_1.click();
	  }
	  
	//----------------------------------------------NEW DOB -------------------------------------------------------------------------  
	  
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'2000')]")
	  @CacheLookup
	  WebElement Kiosk_2000;
	  
	  public void Kiosk_2000()
	  {
		  Kiosk_2000.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'2005')]")
	  @CacheLookup
	  WebElement Kiosk_2005;
	  
	  public void Kiosk_2005()
	  {
		  Kiosk_2005.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'Feb')]")
	  @CacheLookup
	  WebElement Kiosk_Feb2;
	  
	  public void Kiosk_Feb2()
	  {
		  Kiosk_Feb2.click();
	  }
	  
	  @FindBy(how=How.XPATH,using="//button[contains(text(),'10')]")
	  @CacheLookup
	  WebElement Kiosk_10;
	  
	  public void Kiosk_10()
	  {
		  Kiosk_10.click();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	    
	}    
	

