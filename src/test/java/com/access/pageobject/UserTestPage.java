package com.access.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserTestPage
{
	WebDriver ldriver;
	public UserTestPage(WebDriver rdriver)
	{

		ldriver=rdriver;

		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 20), this);
	}

	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a/span[1]")
	@CacheLookup
	WebElement linkUserTest;

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/navbar/header/div/div/div[2]/ul[2]/li/ul/section/ol/li/input")
	@CacheLookup
	WebElement filterdepartment;
	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/navbar/header/div/div/div[2]/ul[2]/li/ul/section/ol/span/li/a")
	@CacheLookup
	WebElement linkImenso;
<<<<<<< HEAD

	@FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/navbar/header/div/div/div[2]/ul[2]/li/ul/section/li[1]/a")
	@CacheLookup
	WebElement changedepartment;


	@FindBy(how=How.LINK_TEXT,using="Change Department")
	@CacheLookup
	WebElement changedepartment1;

	public void changedepartment1()
	{
		changedepartment1.click();
=======
	@FindBy(how=How.LINK_TEXT,using="Change Department")
	@CacheLookup
	WebElement changedepartment;

	public void changedepartment()
	{
		changedepartment.click();
>>>>>>> 62a12d711fedfe06f15fb562f27a24bcdd72039c
	}

	@FindBy(how=How.TAG_NAME,using="span")
	@CacheLookup
	WebElement Clinic1;

	public void Clinic1()
	{
		Clinic1.click();

	}
	@FindBy(how=How.TAG_NAME,using="span")
	@CacheLookup
	WebElement Emergency;

	public void Emergency()
	{
		Actions action = new Actions(ldriver);

		action.moveToElement(Emergency).click().perform();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"clipboard\"]/div[1]/div/div/tree-modal/div[2]/ul/li[3]/div/a[2]/i")
	@CacheLookup
	WebElement Alpha;

	public void Alpha()
	{
		Alpha.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/tree-modal/div[3]/button[2]")
	@CacheLookup
	WebElement ChangeDepartmentbtn;

	public void ChangeDepartmentbtn()
	{
		ChangeDepartmentbtn.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/tree-modal/div[3]/button[1]")
	@CacheLookup
	WebElement DepartmentCancelbtn;

	public void DepartmentCancelbtn()
	{
		DepartmentCancelbtn.click();
	}

<<<<<<< HEAD

=======
>>>>>>> 62a12d711fedfe06f15fb562f27a24bcdd72039c
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/ul/li[3]/a")
	@CacheLookup
	WebElement Logout;

	@FindBy(how=How.LINK_TEXT,using="Patient Lookup")
	@CacheLookup
	WebElement patientLookup;

	public void patientLookup()
	{
		for(int i=0;i<=2;i++)
		{
			try
			{
				patientLookup.click();
			}
			catch(Exception e)
			{
				System.out.println("e.gettextmassage");
			}
		}

	}

	@FindBy(how=How.NAME,using="lastName")
	@CacheLookup
<<<<<<< HEAD

	WebElement patientLookuplastName;

	


	public void patientLookuplastName(String l)
	{
		patientLookuplastName.sendKeys(l);
	}

	@FindBy(how=How.NAME,using="firstName")
	@CacheLookup

	WebElement patientLookupfirstName;

	


	public void patientLookupfirstName(String f)
	{
		patientLookupfirstName.sendKeys(f);
	}

	@FindBy(how=How.NAME,using="visitCode")
	@CacheLookup

	WebElement patientLookupvisitCode;



	public void patientLookupvisitCode(String v)
	{
		patientLookupvisitCode.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"location-dropdown\"]")
	@CacheLookup
	WebElement  Location;

	public void Location()
	{
		Location.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/ul/li[2]/a")
	@CacheLookup
	WebElement UncheckAll;

	public void UncheckAll()
	{
		UncheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/ul/li[4]/a/span[2]")
	@CacheLookup
	private WebElement Clinic;

	public void Clinic()
	{
		this.Clinic.isDisplayed();
		this.Clinic.click();         // when clicked, button should swap into btnTurnOn
		this.Clinic.isDisplayed();
		this.Clinic.click();         // when clicked, button should swap into btnTurnOff
		this.Clinic.isDisplayed();   // throws an exception
		return ;
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/ul/li[1]/a")
	@CacheLookup
	WebElement CheckAll;

	public void CheckAll()
	{
		CheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement Date;

	public void Date()
	{
		Date.click();
	}

	@FindBy(how=How.NAME,using="daterangepicker_start")
	@CacheLookup
	WebElement daterangepicker_start;

	public void daterangepicker_start(String d1)
	{
		daterangepicker_start.clear();
		daterangepicker_start.sendKeys(d1);
	}

	@FindBy(how=How.NAME,using="daterangepicker_end")
	@CacheLookup
	WebElement daterangepicker_end;

	public void daterangepicker_end(String d2)
	{
		daterangepicker_end.clear();
		daterangepicker_end.sendKeys(d2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/div[2]/div[3]/div/button[1]")
	@CacheLookup
	WebElement DateApply;

	public void DateApply()
	{
		DateApply.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[3]/button")
	@CacheLookup
	WebElement Search;

	public void Search()
	{
		Search.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[2]/table/tbody[1]/tr[1]/td[1]/button")
	@CacheLookup
	WebElement PatientRecord;

	public void PatientRecord()
	{
		for(int i=0;i<=2;i++)
		{
			try
			{
				PatientRecord.click(); 
			}
			catch(Exception e)
			{
				System.out.println("e.gettextMassage");
			}

		}
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[2]/table/tbody[1]/tr[2]/td/ul/li[2]/a")
	@CacheLookup
	WebElement MessageHistory;



	public void MessageHistory()
	{
		MessageHistory.click();
	}

	@FindBy(how=How.ID,using="smsCheckbox")
	@CacheLookup
	private WebElement SMSCheckBox;

	public void SMSCheckBox()
	{

		this.SMSCheckBox.isDisplayed();
		this.SMSCheckBox.click();          // when clicked, button should swap into btnTurnOn
		this.SMSCheckBox.isDisplayed();
		this.SMSCheckBox.click();          // when clicked, button should swap into btnTurnOff
		this.SMSCheckBox.isDisplayed();    // throws an exception
		return ;
	}

	@FindBy(how=How.ID,using="emailCheckbox")
	@CacheLookup
	WebElement EmailCheckBox;

	public void EmailCheckBox()
	{
		EmailCheckBox.click();
	}



	public void Logout()
	{
		Logout.click();
	}

	public void linkUserTest()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		WebElement linkUserTest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/navbar/header/div/div/div[2]/ul[2]/li/a/span[1]")));
		linkUserTest.click();


	}

	public void clicklinkImenso()
	{

		linkImenso.click();

	}
	public void clickfilterdepartment()

	{
		filterdepartment.click();

	}


	public void clickchangeDepartment()
	{
		changedepartment.click();


	}
















=======
	WebElement     patientLookuplastName;

	public void patientLookuplastName(String l)
	{
		patientLookuplastName.sendKeys(l);
	}

	@FindBy(how=How.NAME,using="firstName")
	@CacheLookup
	WebElement          patientLookupfirstName;

	public void patientLookupfirstName(String f)
	{
		patientLookupfirstName.sendKeys(f);
	}

	@FindBy(how=How.NAME,using="visitCode")
	@CacheLookup
	WebElement   patientLookupvisitCode;

	public void patientLookupvisitCode(String v)
	{
		patientLookupvisitCode.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"location-dropdown\"]")
	@CacheLookup
	WebElement  Location;

	public void Location()
	{
		Location.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/ul/li[2]/a")
	@CacheLookup
	WebElement UncheckAll;

	public void UncheckAll()
	{
		UncheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/ul/li[4]/a/span[2]")
	@CacheLookup
	private WebElement Clinic;

	public void Clinic()
	{
		this.Clinic.isDisplayed();
		this.Clinic.click();         // when clicked, button should swap into btnTurnOn
		this.Clinic.isDisplayed();
		this.Clinic.click();         // when clicked, button should swap into btnTurnOff
		this.Clinic.isDisplayed();   // throws an exception
		return ;
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/ul/li[1]/a")
	@CacheLookup
	WebElement CheckAll;

	public void CheckAll()
	{
		CheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement Date;

	public void Date()
	{
		Date.click();
	}

	@FindBy(how=How.NAME,using="daterangepicker_start")
	@CacheLookup
	WebElement daterangepicker_start;

	public void daterangepicker_start(String d1)
	{
		daterangepicker_start.clear();
		daterangepicker_start.sendKeys(d1);
	}

	@FindBy(how=How.NAME,using="daterangepicker_end")
	@CacheLookup
	WebElement daterangepicker_end;

	public void daterangepicker_end(String d2)
	{
		daterangepicker_end.clear();
		daterangepicker_end.sendKeys(d2);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/div[2]/div[3]/div/button[1]")
	@CacheLookup
	WebElement DateApply;

	public void DateApply()
	{
		DateApply.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[1]/div/div/div/div[2]/div/div[3]/button")
	@CacheLookup
	WebElement Search;

	public void Search()
	{
		Search.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[2]/table/tbody[1]/tr[1]/td[1]/button")
	@CacheLookup
	WebElement PatientRecord;

	public void PatientRecord()
	{
		for(int i=0;i<=2;i++)
		{
			try
			{
				PatientRecord.click(); 
			}
			catch(Exception e)
			{
				System.out.println("e.gettextMassage");
			}

		}
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"patientLookup\"]/main/div[1]/patient-lookup/div[2]/div[2]/table/tbody[1]/tr[2]/td/ul/li[2]/a")
	@CacheLookup
	WebElement MessageHistory;



	public void MessageHistory()
	{
		MessageHistory.click();
	}

	@FindBy(how=How.ID,using="smsCheckbox")
	@CacheLookup
	private WebElement SMSCheckBox;

	public void SMSCheckBox()
	{

		this.SMSCheckBox.isDisplayed();
		this.SMSCheckBox.click();          // when clicked, button should swap into btnTurnOn
		this.SMSCheckBox.isDisplayed();
		this.SMSCheckBox.click();          // when clicked, button should swap into btnTurnOff
		this.SMSCheckBox.isDisplayed();    // throws an exception
		return ;
	}

	@FindBy(how=How.ID,using="emailCheckbox")
	@CacheLookup
	WebElement EmailCheckBox;

	public void EmailCheckBox()
	{
		EmailCheckBox.click();
	}



	public void Logout()
	{
		Logout.click();
	}

	public void linkUserTest()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		WebElement linkUserTest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/navbar/header/div/div/div[2]/ul[2]/li/a/span[1]")));
		linkUserTest.click();


	}

	public void clicklinkImenso()
	{

		linkImenso.click();

	}
	public void clickfilterdepartment()

	{
		filterdepartment.click();

	}















>>>>>>> 62a12d711fedfe06f15fb562f27a24bcdd72039c
}
