package com.access.pageobject;



	 import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;







	public class RegtPage
	{
	    WebDriver ldriver;
	public RegtPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/navbar/header/div/div/div[2]/ul[1]/li[2]/a")
	@CacheLookup
	WebElement linkRegistration;

	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/header/div/h1/a/span")
	 @CacheLookup 
	  WebElement Nameedit;
	 @FindBy(how=How.XPATH,using="//*[@id=\"last-name\"]")
	  @CacheLookup
	  WebElement lastname;

	 @FindBy(how=How.XPATH,using="//*[@id=\"first-name\"]")
	 @CacheLookup 
	  WebElement firstname;
	 @FindBy(how=How.XPATH,using="//*[@id=\"middle-name\"]")
	  @CacheLookup
	  WebElement middlename;

	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/header/div/div/div[4]/button[1]")
	 @CacheLookup 
	  WebElement btncancel;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/header/div/div/div[4]/button[2]")
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
	 
	 @FindBy(how=How.ID,using="provider-chooser")
	 @CacheLookup
	 WebElement providerchooser;
	 
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
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/div/div[1]/copay-widget/div[1]/div/input")
	 @CacheLookup
	 WebElement txtcopay;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[1]/article[2]/div[6]/div/div/div[1]/copay-widget/div[1]/div/div/div")
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
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/search-modal/div[2]/div[1]/div[2]/input")
	 @CacheLookup
	 WebElement searchlastname;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/search-modal/div[2]/div[1]/div[3]/input")
	 @CacheLookup
	 WebElement searchfirst;
	 
	 @FindBy(how=How.CLASS_NAME,using="ng-scope")
	 @CacheLookup
	 WebElement ClickSearchPatient;
	 		
	 
	 @FindBy(how=How.CLASS_NAME,using="list-group-item")
	 @CacheLookup
	 WebElement StartPatient;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/aside/button[1]")
	 @CacheLookup
	 WebElement NextPatient;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/aside/button[2]")
	 @CacheLookup
	 WebElement PreviousPatient;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/aside/button[6]")
	 @CacheLookup
	 WebElement PatientHoldList;
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
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[4]/button[1]")
	 @CacheLookup
	 WebElement Documents;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"formly_5_in")
	 @CacheLookup
	 WebElement Documentname;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/patient-details-modal/div[3]/span/button")
	 @CacheLookup
	 WebElement Makechanges;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/patient-details-modal/div[3]/span/button/span")
	 @CacheLookup
	 WebElement SAVEFORM;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/patient-details-modal/div[3]/button[2]")
	 @CacheLookup
	 WebElement DOCUMENTcancel;
	 
	 @FindBy(how=How.CLASS_NAME,using="list-group-item")
	 @CacheLookup
	 WebElement HOLD;
	 
	 @FindBy(how=How.ID,using="send-to")
	 @CacheLookup
	 WebElement SENDTO;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"patientFlags\"]/div/div[2]/span")
	 @CacheLookup
	 WebElement FLAGS;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"patientFlags\"]/div/div[2]/ul/li")
	 @CacheLookup
	 WebElement Userselect;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[4]/button[3]")
	 @CacheLookup
	 WebElement ACCESSPASS;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/access-pass-modal/div[3]/button")
	 @CacheLookup
	 WebElement AccessCancel;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/div[1]/div/div/patient-details-modal/div[3]/button[1]")
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
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"reg-card\"]/article/section[3]/div/button")
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
	 
	 @FindBy(how=How.XPATH,using="/html/body/pdf-viewer//viewer-toolbar//div/div[3]/cr-icon-button[1]//div/iron-icon")
	 @CacheLookup 
	 WebElement AccessPrint;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/registration/section/aside/div/ul/li[1]")
	 @CacheLookup
	 WebElement SendToNew;
	 
	public void clickRegistrationPage()
	{
		linkRegistration.click();
		
	}
	public void clickredit( String nm,String ln,String mn)
	{
		Nameedit.click();
		 lastname.clear();
		    firstname.clear();
			middlename.clear();
		
	    lastname.sendKeys("nm");
	    firstname.sendKeys("ln");
		middlename.sendKeys("mn");
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
		public void Editseeing()
		{
			Editseeing.click();
			providerchooser.click();
			selectseeing.click();
			
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
			txtcopay.clear();
			txtcopay.sendKeys(a);
			searchmarkas.click();
			Unknown.click();
		}
		
			public void comment(String c)
		{
			Editcomment.click();
			txtcomment.clear();
			
			txtcomment.sendKeys(c);
			btncommentapply.click();
			
	}
		public void search(String n,String l)
		{
			Search.click();
			
			searchlastname.sendKeys(n);
			
			searchfirst.sendKeys(l);
			ClickSearchPatient.click();
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
			LockDoucumentModal.click();
			Thread.sleep(3000);
			Lock.click();
			Thread.sleep(3000);
			txtLockPassword.sendKeys(arg);
			Thread.sleep(3000);
			LockSubmit.click();
			
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
			SendToDischarge.click();
			
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
		SendToNew.click();
	}
	}
			
		
		
			
			
		
		

		

			

		






