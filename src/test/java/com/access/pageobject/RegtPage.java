package com.access.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegtPage
{
	WebDriver ldriver;
	public RegtPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 20), this);
	}

	@FindBy(how=How.XPATH,using="//a[@ui-sref='registration'  or @ ui-sref= 'selected']")
	@CacheLookup
	WebElement linkRegistration;


	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/header/div/h1/a/span")
	@CacheLookup 
	WebElement Nameedit;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model=\"$ctrl.current.patient.lastName\"]")
	@CacheLookup
	WebElement lastname;

	@FindBy(how=How.XPATH,using="//input[@ng-model=\"$ctrl.current.patient.firstName\"]")
	@CacheLookup 
	WebElement firstname;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model=\"$ctrl.current.patient.middleInitial\"]")
	@CacheLookup
	WebElement middlename;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/header/div/div/div[4]/button[1]")
	@CacheLookup 
	WebElement btncancel;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Apply')]")
	@CacheLookup
	WebElement btnapply;
	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[1]/p/a/span")
	@CacheLookup
	WebElement EdditDate;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[1]/div/input")
	@CacheLookup
	WebElement txtdate;


	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[1]/div/span/button[1]/span")
	@CacheLookup
	WebElement calender;

	@FindBy(how=How.XPATH,using="//*[@id=\"datepicker-2694-829-title\"]/strong")
	@CacheLookup 
	WebElement btnyear;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[1]/div/div/ul/li/div/div/div/table/thead/tr[1]/th[3]/button/i")
	@CacheLookup
	WebElement btnsection;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[1]/div/div/ul/li/div/div/div/table/thead/tr[1]/th[1]/button/i")
	@CacheLookup 
	WebElement btnsection2;


	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[1]/div/span/button[2]")
	@CacheLookup 
	WebElement btncalenderaplly;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[3]/p/a/span")
	@CacheLookup
	WebElement EditAPPTTIME;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[3]/div/time-picker/div/input")
	@CacheLookup
	WebElement txtTime;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[3]/div/time-picker/div/span/button/span")
	@CacheLookup
	WebElement btnPMAM;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[3]/div/span/button")
	@CacheLookup
	WebElement btnAPPLY;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[4]/p[1]/a/span")
	@CacheLookup
	WebElement EditAAPTLOCATION;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[4]/div/ul/div/input")
	@CacheLookup
	WebElement Filterdepartment;

	@FindBy(how=How.XPATH,using="//*[@id=\"location-chooser\"]")
	@CacheLookup
	WebElement btnimenso;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[4]/div/ul/div/input")
	@CacheLookup
	WebElement Searchfilterdepart;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[5]/p/a/span")
	@CacheLookup
	WebElement Editgender;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[5]/div/input")
	@CacheLookup
	WebElement txtgender;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[1]/div[5]/div/span/button")
	@CacheLookup
	WebElement btngenderapply;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[1]/p/a/span")
	@CacheLookup
	WebElement Editseeing;

	@FindBy(how=How.XPATH,using="//*[@id=\"provider-chooser\"]")
	@CacheLookup
	WebElement providerchooser;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[1]/div/ul/li[1]")
	@CacheLookup
	WebElement SelectDropdown;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Test_4, Provider')]")
	@CacheLookup
	WebElement selectseeing;

	@FindBy(how=How.ID,using="filterProvidersRegistration")
	@CacheLookup
	WebElement filterprovider;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[4]/p/a/span")
	@CacheLookup
	WebElement Editnumber;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[4]/div/input")
	@CacheLookup
	WebElement txtnumber;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[4]/div/span/button")
	@CacheLookup
	WebElement btnnumberapply;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[5]/p/a/span")
	@CacheLookup
	WebElement Editemail;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[5]/div/input")
	@CacheLookup
	WebElement txtemail;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[5]/div/span/button")
	@CacheLookup
	WebElement btnemailapply;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/p[1]/a/span")
	@CacheLookup
	WebElement Editcontactname;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/input")
	@CacheLookup
	WebElement txtcontactname;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/span/button")
	@CacheLookup
	WebElement btncontactname;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/p[2]/a/span")
	@CacheLookup
	WebElement Editcontactnumber;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/input")
	@CacheLookup
	WebElement txtphonecontactname;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/span/button")
	@CacheLookup
	WebElement btnphoneapply;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/p[3]/a")
	@CacheLookup
	WebElement Editcopay;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/article/section[1]/article[2]/div[6]/div/div/div[1]/copay-widget/div[1]/div/input")
	@CacheLookup
	WebElement txtcopay;

	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default dropdown-toggle']")
	@CacheLookup
	WebElement  searchmarkas;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/div/div[1]/copay-widget/div[1]/div/div/div/ul/li[3]/a" )
	@CacheLookup
	WebElement Unknown;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/div/div[2]/button")
	@CacheLookup
	WebElement btncopayapply;


	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/p[4]/a/span")
	@CacheLookup
	WebElement Editcomment ;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/textarea")
	@CacheLookup
	WebElement txtcomment;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/button")
	@CacheLookup
	WebElement btncommentapply;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/aside/button[5]")
	@CacheLookup
	WebElement Search;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/search-modal/div[2]/div[1]/div[2]/input")
	@CacheLookup
	WebElement searchlastname;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/search-modal/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement searchfirst;

	@FindBy(how=How.CLASS_NAME,using="ng-scope")
	@CacheLookup
	WebElement ClickSearchPatient;


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/aside/button[3]")
	@CacheLookup
	WebElement StartPatient;

	@FindBy(how=How.XPATH,using="//button[@ng-click=\"$ctrl.moveNext()\"]")
	@CacheLookup
	WebElement NextPatient;

	@FindBy(how=How.XPATH,using="//button[@ng-click=\"$ctrl.movePrev()\"]")
	@CacheLookup
	WebElement PreviousPatient;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/aside/button[6]")
	@CacheLookup
	WebElement PatientHoldList;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/span")
	@CacheLookup
	WebElement Hold_Patient_Message;

	public void Hold_Patient_Message()
	{
		String act = Hold_Patient_Message.getText();
		System.out.println("Hold Patient Message is: "+act);
	}

	@FindBy(how=How.CSS,using="#registration > div.modal.center-modal-backdrop.fade.ng-scope.ng-isolate-scope.in > div > div > patient-hold-list > div.modal-body > table > tbody > tr:nth-child(1) > td:nth-child(1)")
	@CacheLookup
	WebElement Remove_HoldList;

	public void Remove_HoldList()
	{
		Remove_HoldList.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/span")
	@CacheLookup
	WebElement Remove_Hodlist_Message;

	public void Remove_Hodlist_Message()
	{
		String act = Remove_Hodlist_Message.getText();
		System.out.println("Remove Patient Message is: "+act);
	}
	@FindBy(how=How.CLASS_NAME,using="ng-scope")
	@CacheLookup
	WebElement ClickPatientlist;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[2]/article/div[1]/label/input")
	@CacheLookup
	WebElement SMS;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[2]/article/div[2]/label/input")
	@CacheLookup
	WebElement EmailCheck;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[2]/article/div[3]/label/input")
	@CacheLookup
	WebElement Receivevoice;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[4]/button[2]")
	@CacheLookup
	WebElement POST;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[4]/button[4]")
	@CacheLookup
	WebElement smsmessage;

	@FindBy(how=How.XPATH,using="//*[@id=\"location-chooser\"]")
	@CacheLookup
	WebElement SelectMesssage;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/send-s-m-s-modal/div[2]/form/div[2]/div[2]/div/li[2]/label")
	@CacheLookup
	WebElement SelectPatient1;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/send-s-m-s-modal/div[2]/form/div[2]/div[2]/button")
	@CacheLookup
	WebElement Selectpatient;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/send-s-m-s-modal/div[3]/button[2]")
	@CacheLookup
	WebElement SENDbtn;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/send-s-m-s-modal/div[3]/button[1]")
	@CacheLookup
	WebElement btnsmsCancel;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/article/section[4]/button[1]")
	@CacheLookup
	WebElement Documents;

	@FindBy(how=How.XPATH,using="//*[@id=\"formly_5_in")
	@CacheLookup
	WebElement Documentname;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/div/button")
	@CacheLookup
	WebElement Makechanges;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
	@CacheLookup
	WebElement SAVEFORM;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/patient-details-modal/div[3]/button[2]")
	@CacheLookup
	WebElement DOCUMENTcancel;

	@FindBy(how=How.CSS,using="#reg-card > aside > button:nth-child(5)")
	@CacheLookup
	WebElement HOLD;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/aside/div/span")
	@CacheLookup
	WebElement SENDTO;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/article/section[2]/div/span/jfh-patient-flags/div/div/div[2]/span")
	@CacheLookup
	WebElement FLAGS;

	@FindBy(how=How.XPATH,using="//*[@id=\"patientFlags\"]/div/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement Userselect;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/article/section[2]/div/span/jfh-patient-flags/div/div/div[2]/span")
	@CacheLookup
	WebElement FLAGS1;

	@FindBy(how=How.XPATH,using="//a //span[contains(text(),'dlj')]")
	@CacheLookup
	WebElement Userselect1;

	public void FLAGS1()
	{
		FLAGS1.click();
		Userselect1.click();
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[4]/button[3]")
	@CacheLookup
	WebElement ACCESSPASS;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/access-pass-modal/div[3]/button")
	@CacheLookup
	WebElement AccessCancel;

	@FindBy(how=How.XPATH,using="//div[@class='modal-footer']//button[@type='button'and @class='btn btn-default pull-left']")
	@CacheLookup
	WebElement LockDoucumentModal;

	@FindBy(how=How.XPATH,using="//*[@id=\"lockedDocumentsViewer\"]/main/div[1]/locked-documents-viewer/div/form/div/span/button")
	@CacheLookup
	WebElement locknext;

	@FindBy(how=How.XPATH,using="//*[@id=\"lockedDocumentsViewer\"]/main/div[1]/locked-documents-viewer/div/form/div/span/button")
	@CacheLookup
	WebElement lockfinish;


	@FindBy(how=How.XPATH,using="//*[@id=\"lockedDocumentsViewer\"]/main/div[1]/locked-documents-viewer/documents-header/div/i")
	@CacheLookup
	WebElement Lock;

	@FindBy(how=How.ID,using="password")
	@CacheLookup
	WebElement txtLockPassword;

	@FindBy(how=How.XPATH,using="//*[@id=\"lockedDocumentsViewer\"]/div[1]/div/div/re-auth-modal/form/div[2]/button[2]")
	@CacheLookup
	WebElement LockSubmit;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Forms On Demand')]")
	@CacheLookup
	WebElement Formsondemand;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[2]/div/button")
	@CacheLookup
	WebElement Appointment;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[2]/div/ul/li[4]/a")
	@CacheLookup
	WebElement NewAppointment;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[3]/div[2]/label/input")
	@CacheLookup
	WebElement checkemail;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/forms-on-demand/div/div[2]/div[3]/button[2]")
	@CacheLookup
	WebElement sendForms;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/aside/div/span")
	@CacheLookup
	WebElement SendToDischarge;

	@FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/aside/div/ul/li[3]/a")
	@CacheLookup
	WebElement Discharge;

	@FindBy(how=How.XPATH,using="/html/body/pdf-viewer//viewer-toolbar//div/div[3]/viewer-download-controls//cr-icon-button//div/iron-icon")
	@CacheLookup
	WebElement AccessDownload;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[2]/button")
	@CacheLookup 
	WebElement AccessPrint;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/aside/div/ul/li[1]")
	@CacheLookup
	WebElement SendToNew;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Go to Patient Details')]")
	@CacheLookup
	WebElement GotopatientDetails;

	public void GotopatientDetails()
	{
		GotopatientDetails.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[1]/patient-details/form/div[1]/div[2]/input")
	@CacheLookup
	WebElement Gotopatient_first;

	public void Gotopatient_first(String g)
	{

		Gotopatient_first.sendKeys(g);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/button[3]")
	@CacheLookup
	WebElement Gotopatient_save;

	public void Gotopatient_save()
	{
		Gotopatient_save.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Coverage')]")
	@CacheLookup
	WebElement coverage;

	public void coverage()
	{
		coverage.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Make Changes')]")
	@CacheLookup
	WebElement makechanges;

	public void coverage_makechanges()
	{
		makechanges.click();
	}

	@FindBy(how=How.ID,using="payer-name")
	@CacheLookup
	WebElement coverage_payername;

	public void coverage_payername(String pn)
	{

		coverage_payername.sendKeys(pn);
	}

	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[2]/a")
	@CacheLookup
	WebElement Regit_payers;

	public void Regit_payers()
	{
		Regit_payers.click();
	}

	public void clickRegistrationPage()
	{

		linkRegistration.click();

	}

	@FindBy(how=How.XPATH,using="//li//a[contains(text(),'Registration')]")
	@CacheLookup
	WebElement Registration;

	public void Registration()
	{
		Registration.click();
	}

	public void clickredit( String nm,String ln,String mn) throws InterruptedException
	{
		Nameedit.click();
		lastname.clear();
		firstname.clear();
		middlename.clear();

		lastname.sendKeys(nm);
		firstname.sendKeys(ln);
		middlename.sendKeys(mn);
		Thread.sleep(5000);
		btnapply.click();
	}
	public void clickcancel()
	{
		btncancel.click();
	}
	public void Editdate()
	{
		EdditDate.click();
		txtdate.clear();
	}
	public void txtdate(String a)
	{
		txtdate.sendKeys(a);
		btncalenderaplly.click();
	}

	public void txtEditAPPTTIME(String t)
	{
		EditAPPTTIME.click();
		txtTime.clear();
		txtTime.sendKeys(t);

	}
	public void APPLIAM()
	{
		btnAPPLY.click();
	}
	public void AMPM()
	{
		btnPMAM.click();
	}
	public void APPTLOCATION(String arg)
	{
		EditAAPTLOCATION.click();

		Filterdepartment.sendKeys(arg);
		Filterdepartment.click();

	}
	public void gender(String g)
	{
		Editgender.click();
		txtgender.clear();
		txtgender.sendKeys(g);

		btngenderapply.click();
	}
	public void cleargender()
	{
		txtgender.clear();
	}
	public void Editseeing() throws Exception
	{
		Editseeing.click();
		Thread.sleep(3000);
		providerchooser.click();
		SelectDropdown.click();
	}
	public void Number(String arg)
	{
		Editnumber.click();

		txtnumber.sendKeys("arg");
		btnnumberapply.click();
	}
	public void Email(String arg)
	{
		Editemail.click();
		txtemail.clear();
		txtemail.sendKeys(arg);
		btnemailapply.click();
	}
	public void contactname(String arg)
	{
		Editcontactname.click();
		txtcontactname.clear();
		txtcontactname.sendKeys(arg);
		btncontactname.click();
	}
	public void contactnumber(String arg)
	{
		Editcontactnumber.click();
		txtphonecontactname.clear();
		txtphonecontactname.sendKeys(arg);
		btnphoneapply.click();

	}
	public void Editcopay()
	{
		Editcopay.click();
	}
	public void Copay(String a)
	{
		searchmarkas.click();
		Unknown.click();
		txtcopay.clear();
		txtcopay.sendKeys(a);
	}

	public void comment(String c)
	{
		Editcomment.click();
		txtcomment.clear();

		txtcomment.sendKeys(c);
		btncommentapply.click();

	}
	public void search(String n,String l) throws InterruptedException
	{
		Search.click();

		Thread.sleep(5000);

		searchlastname.sendKeys(n);

		searchfirst.sendKeys(l);
		ClickSearchPatient.click();
	}


	@FindBy(how=How.XPATH,using="//table[@class='table table-striped']//tbody//tr")
	@CacheLookup
	List<WebElement>  search_click;

	public void search_click()
	{
		System.out.println(search_click.size());

		for(int i=0;i<search_click.size();i++)
		{
			String listitem=search_click.get(i).getText();
			if(listitem.contains("Ravi Mishra"))
			{
				search_click.get(i).click();
				break;
			}
		}

	}



	public void StartPatient()
	{
		StartPatient.click();
	}

	public void NEXT()
	{
		NextPatient.click();
	}

	public void Previous()
	{
		PreviousPatient.click();
	}
	public void Holdlist() throws Exception
	{
		PatientHoldList.click();
		Thread.sleep(3000);
		ClickPatientlist.click();
	}
	public void sms()
	{
		SMS.click();
		EmailCheck.click();
		Receivevoice.click();

	}
	public void sendpost()
	{
		POST.click();
	}
	public void smsMessage()
	{
		smsmessage.click();
	}

	public void smsdorpdown()
	{
		Selectpatient.click();
		SelectPatient1.click();

		SENDbtn.click();
	}
	public void Document()
	{
		Documents.click();

	}
	public void txtDocument(String n)
	{
		Documentname.sendKeys(n);
	}
	public void saveform()
	{
		SAVEFORM.click();
	}
	public void Documentcancel()
	{
		DOCUMENTcancel.click();
	}

	@FindBy(how=How.XPATH,using="//input[@name='First Name 1_formly_1_firstName_0_0, fname']")
	@CacheLookup
	WebElement Document_firstname;

	public void Document_firstname(String f)
	{

		Document_firstname.sendKeys(f);
	}


	@FindBy(how=How.XPATH,using="//input[@name='Last Name_formly_1_firstName_1_1, fname']")
	@CacheLookup
	WebElement Document_lastname;

	public void Document_lastname(String l)
	{

		Document_lastname.sendKeys(l);
	}


	@FindBy(how=How.XPATH,using="//input[@name='Middle Name_formly_1_input_2_2, search']")
	@CacheLookup
	WebElement Document_middlename;

	public void Document_middlename(String m)
	{
		Document_middlename.click();
		Document_middlename.clear();
		Document_middlename.sendKeys(m);
	}

	@FindBy(how=How.XPATH,using="//input[@name='New Field_formly_1_date_3_3']")
	@CacheLookup
	WebElement Document_Dob;

	public void Document_Dob(String d)
	{

		Document_Dob.sendKeys(d);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button")
	@CacheLookup
	WebElement Document_Saveform;

	public void Document_Saveform()
	{
		Document_Saveform.click();
	}

	@FindBy(how=How.XPATH,using="//span[contains(text(),'COVID Screening Form')]")
	@CacheLookup
	WebElement COVIDScreeningForm;

	public void COVIDScreeningForm()
	{
		COVIDScreeningForm.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[1]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement COVID_19SymptomsPresent;

	public void COVID_19SymptomsPresent()
	{
		COVID_19SymptomsPresent.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div[1]/div/select")
	@CacheLookup
	WebElement COVID_Whenwasthelasttimeyouleftthecountry;

	public void COVID_Whenwasthelasttimeyouleftthecountry()
	{
		Select ab = new Select(COVID_Whenwasthelasttimeyouleftthecountry);
		ab.selectByVisibleText("Within the last 2 years");
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement COVID_Haveyouhadanycranberries;

	public void COVID_Haveyouhadanycranberries()
	{
		COVID_Haveyouhadanycranberries.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div[1]/div/select")
	@CacheLookup
	WebElement COVID_DoyouhaveCOVID19;

	public void COVID_DoyouhaveCOVID19()
	{
		Select ad = new Select(COVID_DoyouhaveCOVID19);
		ad.selectByVisibleText("Not Sure");
	}







	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement COVID_Doyouhavedifficultybreathing;

	public void COVID_Doyouhavedifficultybreathing()
	{
		COVID_Doyouhavedifficultybreathing.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button")
	@CacheLookup
	WebElement COVID_save;

	public void COVID_save()
	{
		COVID_save.click();
	}


	@FindBy(how=How.XPATH,using="//label[@for='file-3']")
	@CacheLookup
	WebElement COVID_images1;

	public void COVID_images1() throws AWTException
	{
		COVID_images1.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Downloads\\sherry.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//paste operation in clipboard

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//press enter key

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);



	}


	@FindBy(how=How.XPATH,using="//label[@for='file-4' ]")
	@CacheLookup
	WebElement COVID_images2;

	public void COVID_images2() throws AWTException
	{
		COVID_images2.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Downloads\\sherry.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//paste operation in clipboard

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//press enter key

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);


	}


	@FindBy(how=How.XPATH,using="//div[@class='alert alert-danger doc-alert ng-binding ng-scope']")
	@CacheLookup
	WebElement COVID_SAVE_Message;

	public void COVID_SAVE_Message()
	{
		String act = COVID_SAVE_Message.getText();
		System.out.println("Error message is: "+ act);
	}

	@FindBy(how=How.XPATH,using="//i[contains(text(),'print')]")
	@CacheLookup
	WebElement COVID_print;

	public void COVID_print()
	{
		COVID_print.click();
	}

	@FindBy(how=How.XPATH,using="//span[contains(text(),'MRI Safety Questionnaire')]")
	@CacheLookup
	WebElement MRISafetyQuestionnaire;

	public void MRISafetyQuestionnaire()
	{
		MRISafetyQuestionnaire.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/div/div[2]/label/input")
	@CacheLookup
	WebElement MRI_Doyouvape_no;

	public void MRI_Doyouvape_no()
	{
		MRI_Doyouvape_no.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement MRI_AreyouMRIready_no ;

	public void MRI_AreyouMRIready_no()
	{
		MRI_AreyouMRIready_no.click();

	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/div/div[2]/label/input")
	@CacheLookup
	WebElement MRI_Selectthefollowingconditions_pain;

	public void MRI_Selectthefollowingconditions_pain()
	{
		MRI_Selectthefollowingconditions_pain.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/input")
	@CacheLookup
	WebElement MRI_Ifotherpleasedescribe_formly_2_input_4_4search;

	public void MRI_Ifotherpleasedescribe_formly_2_input_4_4search(String g)
	{
		MRI_Ifotherpleasedescribe_formly_2_input_4_4search.click();
		MRI_Ifotherpleasedescribe_formly_2_input_4_4search.sendKeys("hi");
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div[1]/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement MRI_signatureConsent_5;

	public void MRI_signatureConsent_5()
	{
		MRI_signatureConsent_5.click();
	}

	@FindBy(how=How.XPATH,using="//canvas[@id='canvas_5']")
	@CacheLookup
	WebElement MRI_signatureConsent_sign;



	public void MRI_signatureConsent_sign()
	{
		Actions builder = new Actions(ldriver);
		Action signature= builder.contextClick(MRI_signatureConsent_sign)                       
				.clickAndHold()
				.moveToElement(MRI_signatureConsent_sign,20,-50)
				.moveByOffset(50, 50)
				.moveByOffset(80,-50)
				.moveByOffset(100,50)
				.release(MRI_signatureConsent_sign)
				.build();                       
		signature.perform();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[7]/div/div/div/div/input")
	@CacheLookup
	WebElement MRI_Dob;

	public void MRI_Dob(String t)
	{

		MRI_Dob.sendKeys("t");
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button")
	@CacheLookup
	WebElement MRI_save;

	public void MRI_save()
	{
		MRI_save.click();
	}


	@FindBy(how=How.XPATH,using="//li//a//span[contains(text(),'RCB Report')]")
	@CacheLookup
	WebElement RCB_Report;

	public void RCB_Report()
	{
		RCB_Report.click();
	}

	@FindBy(how=How.XPATH,using="//input[@name=\"First Name_formly_3_input_0_0, search\"  or @id=\"formly_3_input_0_0\"] ")
	@CacheLookup
	WebElement RCB_FirstName;

	public void RCB_FirstName(String s)
	{
		RCB_FirstName.click();
		RCB_FirstName.sendKeys(s);
	}

	@FindBy(how=How.XPATH,using="//input[@name=\"Last Name_formly_3_input_1_1, search\"  or @id=\"formly_3_input_1_1\"] ")
	@CacheLookup
	WebElement RCB_LastName;

	public void RCB_LastName(String l)
	{
		RCB_LastName.click();
		RCB_LastName.sendKeys(l);
	}

	@FindBy(how=How.CSS,using="#formly_3_date_2_2")
	@CacheLookup
	WebElement RCB_Dob;

	public void RCB_Dob(String d)
	{
		RCB_Dob.click();
		RCB_Dob.sendKeys(d);
	}


	@FindBy(how=How.XPATH,using="//input[@id='formly_3_full_ssn_3_3']")
	@CacheLookup
	WebElement RCB_Ssn;

	public void RCB_Ssn(String ssn)
	{
		RCB_Ssn.click();
		RCB_Ssn.sendKeys(ssn);
	}


	@FindBy(how=How.XPATH,using="//input[@id='formly_3_streetAddress_4_4']")
	@CacheLookup
	WebElement RCB_PatientStreetAddress;

	public void RCB_PatientStreetAddress(String d)
	{
		RCB_PatientStreetAddress.click();
		RCB_PatientStreetAddress.sendKeys(d);
	}


	@FindBy(how=How.XPATH,using="//input[@id='formly_3_postalCode_5_5']")
	@CacheLookup
	WebElement RCB_ZipCode;

	public void RCB_ZipCode(String z)
	{
		RCB_ZipCode.click();
		RCB_ZipCode.sendKeys(z);
	}


	@FindBy(how=How.XPATH,using="//input[@name='signatureConsent_6']")
	@CacheLookup
	WebElement RCB_Signature ;

	public void RCB_Signature()
	{
		RCB_Signature.click();
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


	@FindBy(how=How.XPATH,using="//span[contains(text(),'Save Form')]")
	@CacheLookup
	WebElement RCB_save;

	public void RCB_save()
	{
		RCB_save.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/pdf-viewer//viewer-toolbar//div/div[3]/cr-icon-button[2]//div/iron-icon")
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


	public void makechanges()
	{
		Makechanges.click();
	}



	public void HOLD()
	{
		HOLD.click();
	}
	public void SENDTO()

	{


		SENDTO.click();

	}
	public void FLAGS()
	{
		FLAGS.click();
		Userselect.click();
	}
	public void ACCESSPASS()
	{
		ACCESSPASS.click();
		AccessCancel.click();
	}

	public void ClickLock(String arg) throws Exception
	{
		try
		{LockDoucumentModal.click();
		Thread.sleep(2000);
		Lock.click();
		Thread.sleep(2000);
		txtLockPassword.sendKeys(arg);
		Thread.sleep(5000);
		LockSubmit.click();}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	public void Appoint()
	{
		Appointment.click();
		NewAppointment.click();
		checkemail.click();
		sendForms.click();

	}

	public void Forms() throws Exception
	{
		Formsondemand.click();
	}

	public void SendTo()
	{
		try {
			SendToDischarge.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	public void Dish()
	{
		Discharge.click();
	}

	public void Download()
	{
		AccessDownload.click();
	}

	public void Print()
	{
		AccessPrint.click();
	}

	public void SendNew()
	{
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SendToNew.click();
	}

	@FindBy(how=How.XPATH,using="//button//i[contains(text(),'print')]")
	@CacheLookup
	WebElement Print;

	public void Doc_Print()
	{
		Print.click();

	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/ul/li[2]/a")
	@CacheLookup
	WebElement Gotopatient_Forms;

	public void Gotopatient_Forms()
	{
		Gotopatient_Forms.click();
	}

	@FindBy(how=How.XPATH,using="//a//span[contains(text(),'COVID Screening Form')]")
	@CacheLookup
	WebElement Gotopatient_Forms_Symptoms ;

	public void Gotopatient_Forms_Symptoms()
	{
		Gotopatient_Forms_Symptoms.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[3]/div/div[1]/div/select")
	@CacheLookup
	WebElement Gotopatient_Forms_When ;

	public void Gotopatient_Forms_When()
	{
		Select ab =  new Select(Gotopatient_Forms_When);
		ab.selectByIndex(1);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[4]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement Gotopatient_Forms_breathing;

	public void Gotopatient_Forms_breathing()
	{
		Gotopatient_Forms_breathing.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[5]/div/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement Gotopatient_Forms_cherries;

	public void Gotopatient_Forms_cherries()
	{
		Gotopatient_Forms_cherries.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[6]/div/div[1]/div/select")
	@CacheLookup
	WebElement Gotopatient_Forms_COVID19;

	public void Gotopatient_Forms_COVID19()
	{
		Select v = new Select(Gotopatient_Forms_COVID19);
		v.selectByIndex(1);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[7]/div/div/div/div/div/div/label")
	@CacheLookup
	WebElement Gotopatient_Forms_image1;

	public void Gotopatient_Forms_image1() throws AWTException

	{


		Gotopatient_Forms_image1.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Downloads\\sherry.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//paste operation in clipboard

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//press enter key

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[8]/div/div/div/div/div/div/label")
	@CacheLookup
	WebElement Gotopatient_Forms_image2;

	public void Gotopatient_Forms_image2() throws AWTException
	{

		Gotopatient_Forms_image2.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\ATM\\Downloads\\sherry.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//paste operation in clipboard

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//press enter key

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[3]/span/button")
	@CacheLookup
	WebElement Gotopatient_Forms_save;

	public void Gotopatient_Forms_save()
	{
		Gotopatient_Forms_save.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[1]/button")
	@CacheLookup
	WebElement Gotopatient_Forms_Cancel;

	public void Gotopatient_Forms_Cancel()
	{
		Gotopatient_Forms_Cancel.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[3]/div[2]/form/form-render/div/ng-form/div[2]/div/div/div/div/div[2]/label/input")
	@CacheLookup
	WebElement Gotopatient_Forms_disable;

	public void Gotopatient_Forms_disable()
	{
		Gotopatient_Forms_disable.isDisplayed();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[2]/a/div")
	@CacheLookup
	WebElement Gotopatient_Forms_incomplete;

	public  void Gotopatient_Forms_incomplete()
	{
		Gotopatient_Forms_incomplete.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/article/section[1]/article[2]/div[3]")
	@CacheLookup
	WebElement WaitTime;
	public void WaitTime()
	{
		String act = WaitTime.getText();
		System.out.println("Time message is: "+ act);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-details-modal/div[1]/button")
	@CacheLookup
	WebElement Back_to_registration;

	public void Back_to_registration()
	{
		Back_to_registration.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Forms On Demand')]")
	@CacheLookup
	WebElement FormsOnDemand;

	public void FormsOnDemand()
	{
		FormsOnDemand.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement FormsOnDemand_Select;

	public void FormsOnDemand_Select()
	{
		FormsOnDemand_Select.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[1]/div/ul/li[1]/a")
	@CacheLookup
	WebElement FormsOnDemand_Select_checkAll;

	public void FormsOnDemand_Select_checkAll()
	{
		FormsOnDemand_Select_checkAll.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[2]/div/button")
	@CacheLookup
	WebElement Appointment_Type;

	public void Appointment_Type()
	{
		Appointment_Type.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand/div/div[2]/div[2]/div[2]/div/ul/li[1]/a")
	@CacheLookup
	WebElement Appointment_Type_CheckAll;

	public void Appointment_Type_CheckAll()
	{
		Appointment_Type_CheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Send')]")
	@CacheLookup
	WebElement Forms_on_Demand_send;

	public void Forms_on_Demand_send() throws InterruptedException
	{
		if(Forms_SMS.isSelected())
		{
			System.out.println("SMS IS Already Selecte");
		}
		else
		{
			Forms_SMS.click();
			System.out.println("Email IS Not Selecte");
		}
		Thread.sleep(5000);

		if(Forms_Email.isSelected())
		{
			System.out.println("Email IS Already Selecte");
		}

		else
		{
			Forms_Email.click();
			System.out.println("Email IS Not Selecte");
		}

		Thread.sleep(10000);
		Forms_on_Demand_send.click();
	}

	@FindBy(how=How.XPATH,using="//input[@ng-model=\"$ctrl.deliveryPreference.wantsSMS\"]")
	@CacheLookup
	WebElement Forms_SMS;

	@FindBy(how=How.XPATH,using="//input[@ng-model=\"$ctrl.deliveryPreference.wantsEmails\"]")
	@CacheLookup
	WebElement Forms_Email;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/article/section[4]/button[1]/span")
	@CacheLookup
	WebElement Document_forms_No;

	public void Document_forms_No()
	{
		String act = Document_forms_No.getText();
		System.out.println("Time message is: "+ act);
	}

	@FindBy(how=How.XPATH,using="//a[@ng-click='$ctrl.MoveToNextNode($ctrl.current.patient, node)']")
	@CacheLookup
	WebElement Send_To_Registration;

	public void Send_To_Registration()
	{
		Send_To_Registration.click();
	}
	//------------------------------30-12-2022---------------------------------------------------------------------------------------------------------------

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Attributes')]")
	@CacheLookup
	WebElement Attributes;

	public void Attributes()
	{
		Attributes.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/attributes-modal/div[2]/form/div[2]/textarea")
	@CacheLookup
	WebElement Attributes_Value;

	public void Attributes_Value(String v)
	{
		Attributes_Value.click();
		Attributes_Value.clear();
		Attributes_Value.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Save Attribute')]")
	@CacheLookup
	WebElement Attribute_Save;

	public void Attribute_Save()
	{
		Attribute_Save.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/organization-attributes/h4/button")
	@CacheLookup
	WebElement Add_Attribute;

	public void Add_Attribute()
	{
		Add_Attribute.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/attributes-modal/div[2]/form/div[1]/textarea")
	@CacheLookup
	WebElement Attribute_Name;

	public void Attribute_Name(String c)
	{
		Attribute_Name.click();
		Attribute_Name.sendKeys(c);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/attributes-modal/div[2]/form/div[2]/textarea")
	@CacheLookup
	WebElement Attribute_og_Value;

	public void Attribute_og_Value(String c)
	{
		Attribute_og_Value.click();
		Attribute_og_Value.sendKeys(c);
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Save Attribute')]")
	@CacheLookup
	WebElement Save_Attribute;

	public void Save_Attribute()
	{
		Save_Attribute.click();

	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Return to Access')]")
	@CacheLookup
	WebElement Returnto_Access;

	public void Returnto_Access()
	{
		Returnto_Access.click();
	}

	@FindBy(how=How.ID,using="location-chooser")
	@CacheLookup
	WebElement Select_Message;

	public void Select_Message()
	{
		Select_Message.click();
	}

	@FindBy(how=How.XPATH,using="//ul[@aria-labelledby=\"location-chooser\"]")
	@CacheLookup
	WebElement Select_Message_option_print;

	public void Select_Message_option_print()
	{
		String act = Select_Message_option_print.getText();
		System.out.println(act);
	}

	@FindBy(how=How.ID,using="smsMessageInput")
	@CacheLookup
	WebElement SMSMessageInput;

	public void SMSMessageInput(String s)
	{
		SMSMessageInput.click();
		SMSMessageInput.sendKeys("s");
	}
    
	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/send-s-m-s-modal/div[2]/form/div[3]")
	@CacheLookup
	WebElement SMSMessageInput_print;

	public void SMSMessageInput_print()
	{
		String act = SMSMessageInput_print.getText();
		System.out.println(act);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]")
	@CacheLookup
	WebElement SMS_Cancel;

	public void SMS_Cancel()
	{
		SMS_Cancel.click();
	}
//-----------------------------------04-01-2023----------------------------------------------------------------------

	@FindBy(how=How.XPATH,using="//button[@ng-show=\"closeable\"]")
	@CacheLookup
	WebElement Headline_Message;
	
	public void Headline_Message()
	{
		Headline_Message.click();
	}


}






















