package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Get_In_Line 

{
     WebDriver  ldriver;
     
     public Get_In_Line(WebDriver rdriver)
     {
    	 
    	 ldriver = rdriver;
    	 PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
    	 
     }

     
     
     
     @FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[1]/div/a")
     @CacheLookup
     WebElement Link_StageA;
     
     public  void Link_StageA()
     {
    	 Link_StageA.click();
     }
     
     @FindBy(how=How.XPATH,using="// span [contains(text(),'1-rakhi new york')]")
     @CacheLookup
     WebElement Visit_Code;
     
     public void Visit_Code()
     {
    	 Visit_Code.click();
     }
     
     
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Departments')]")
	@CacheLookup
	WebElement Department_Link;
	
	public void Department_Link()
	{
		Department_Link.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Details')]")
	@CacheLookup
	WebElement Details;
	
	public void Details()
	{
		Details.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/header/div[1]/button")
	@CacheLookup
	WebElement Select_Department;
	
	public void Select_Department()
	{
		Select_Department.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"departments\"]/main/div[1]/admin-departments/header/div[1]/ul/li[1]/a")
	@CacheLookup
	WebElement Select_Department_Imenso;
	
	public void Select_Department_Imenso()
	{
		Select_Department_Imenso.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/div[1]/div[1]/div[1]/input")
	@CacheLookup
	WebElement Department_Name;
	
	public void Department_Name(String a)
	{
		Department_Name.click();
		Department_Name.click();
		Department_Name.sendKeys(a);
	}
	
	@FindBy(how=How.NAME,using="shortName")
	@CacheLookup
	WebElement Short_Name;
	
	public void Short_Name(String b)
	{
		Short_Name.click();
		Short_Name.clear();
		Short_Name.sendKeys(b);
	}
	
	@FindBy(how=How.NAME,using="phoneNumber")
	@CacheLookup
	WebElement Department_Phone;
	
	public void Department_Phone(String c)
	{
		Department_Phone.click();
		Department_Phone.clear();
		Department_Phone.sendKeys(c);
	}
	
	@FindBy(how=How.NAME,using="streetLine1")
	@CacheLookup
	WebElement streetLine1;
	
	public void streetLine1(String d)
	{
		streetLine1.click();
		streetLine1.clear();
		streetLine1.sendKeys(d);
	}
	
	@FindBy(how=How.ID,using="streetLine2")
	@CacheLookup
	WebElement streetLine2;
	
	public void streetLine2(String e)
	{
		streetLine2.click();
		streetLine2.clear();
		streetLine2.sendKeys(e);
	}
	
	@FindBy(how=How.NAME,using="city")
	@CacheLookup
	WebElement Department_city;
	
	public void Department_city(String f)
	{
		Department_city.click();
		Department_city.clear();
		Department_city.sendKeys(f);
	}
	
	@FindBy(how=How.NAME,using="state")
	@CacheLookup
	WebElement Department_state;
	
	public void Department_state(String g)
	{
		Department_state.click();
		Department_state.clear();
		Department_state.sendKeys(g);
	}
	
	@FindBy(how=How.NAME,using="zipcode")
	@CacheLookup
	WebElement Department_zipcode;
	
	public void Department_zipcode(String h)
	{
		Department_zipcode.click();
		Department_zipcode.clear();
		Department_zipcode.sendKeys(h);
	}
	
	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Business Hours')]")
	@CacheLookup
	WebElement Business_Hours;
	
	public void Business_Hours()
	{
		Business_Hours.isDisplayed();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[1]/article/a")
	@CacheLookup
	WebElement Business_Hours_Monday_ADDhours;
	
	public void Business_Hours_Monday_ADDhours()
	{
		Business_Hours_Monday_ADDhours.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[1]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Monday;
	
	public void Business_Hours_Monday(String m)
	{
		Business_Hours_Monday.click();
		Business_Hours_Monday.clear();
		Business_Hours_Monday.sendKeys(m);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[1]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_MondayAMPM;
	
	public void Business_Hours_MondayAMPM()
	{
		Business_Hours_MondayAMPM.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[1]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_Monday2;
	
	public void Business_Hours_Monday2(String m)
	{
		Business_Hours_Monday2.click();

		Business_Hours_Monday2.sendKeys(m);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[1]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_Monday2AMPM;
	
	public void Business_Hours_Monday2AMPM()
	{
		Business_Hours_Monday2AMPM.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[2]/article/a")
	@CacheLookup
	WebElement Business_Hours_Tuesday_Addhours;
	
	public void Business_Hours_Tuesday_Addhours()
	{
		Business_Hours_Tuesday_Addhours.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[2]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Tuesday;
	
	public  void Business_Hours_Tuesday(String t)
	{
		Business_Hours_Tuesday.click();
		Business_Hours_Tuesday.clear();
		Business_Hours_Tuesday.sendKeys(t);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[2]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_TuesdayAMPM;
	
	public void Business_Hours_TuesdayAMPM()
	{
		Business_Hours_TuesdayAMPM.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[2]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Tuesday2;
	
	public void Business_Hours_Tuesday2(String t2)
	{
		Business_Hours_Tuesday2.click();

		Business_Hours_Tuesday2.sendKeys(t2);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[2]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_TuesdayPMAM;
	
	public void Business_Hours_TuesdayPMAM()
	{
		Business_Hours_TuesdayPMAM.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[3]/article/a")
	@CacheLookup
	WebElement Business_Hours_Wednesday_Addhours;
	
	public void Business_Hours_Wednesday_Addhours()
	{
		Business_Hours_Wednesday_Addhours.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[3]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Wednesday;
	
	public void Business_Hours_Wednesday(String w)
	{
		Business_Hours_Wednesday.click();
		Business_Hours_Wednesday.clear();
		Business_Hours_Wednesday.sendKeys(w);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[3]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_WednesdayAMPM;
	
	public void Business_Hours_WednesdayAMPM()
	{
		Business_Hours_WednesdayAMPM.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[3]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Wednesday2;
	
	public void Business_Hours_Wednesday2(String w2)
	{
		Business_Hours_Wednesday2.click();
		Business_Hours_Wednesday2.clear();
		Business_Hours_Wednesday2.sendKeys(w2);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[3]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_Wednesday2PMAM;
	
	public void Business_Hours_Wednesday2PMAM()
	{
		Business_Hours_Wednesday2PMAM.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[4]/article/a")
	@CacheLookup
	WebElement Business_Hours_Thursday_Addhours;
	
	public void Business_Hours_Thursday_Addhours()
	{
		Business_Hours_Thursday_Addhours.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[4]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Thursday;
	
	public void Business_Hours_Thursday(String th)
	{
		Business_Hours_Thursday.click();
		Business_Hours_Thursday.clear();
		Business_Hours_Thursday.sendKeys(th);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[4]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_ThursdayAMPM;
	
	public void Business_Hours_ThursdayAMPM()
	{
		Business_Hours_ThursdayAMPM.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[4]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Thursday2;
	
	public void Business_Hours_Thursday2(String t2)
	{
		Business_Hours_Thursday2.click();
		Business_Hours_Thursday2.clear();
		Business_Hours_Thursday2.sendKeys(t2);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[4]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_ThursdayPMAM;
	
	public void Business_Hours_ThursdayPMAM()
	{
		Business_Hours_ThursdayPMAM.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[5]/article/a")
	@CacheLookup
	WebElement Business_Hours_Friday_Addhours;
	
	public void Business_Hours_Friday_Addhours()
	{
		Business_Hours_Friday_Addhours.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[5]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Friday;
	
	public void Business_Hours_Friday(String f)
	{
		Business_Hours_Friday.click();
		Business_Hours_Friday.clear();
		Business_Hours_Friday.sendKeys(f);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[5]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_FridayAMPM;
	
	public void Business_Hours_FridayAMPM()
	{
		Business_Hours_FridayAMPM.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[5]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Friday2;
	
	public void Business_Hours_Friday2(String f2)
	{
		Business_Hours_Friday2.click();
		Business_Hours_Friday2.clear();
		Business_Hours_Friday2.sendKeys(f2);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[5]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_Friday2PMAM;
	
	public void Business_Hours_Friday2PMAM()
	{
		Business_Hours_Friday2PMAM.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[6]/article/a")
	@CacheLookup
	WebElement Business_Hours_Saturday_Addhours;
	
	public void Business_Hours_Saturday_Addhours()
	{
		Business_Hours_Saturday_Addhours.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[6]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Saturday;
	
	public void Business_Hours_Saturday(String s)
	{
		Business_Hours_Saturday.click();
		Business_Hours_Saturday.clear();
		Business_Hours_Saturday.sendKeys(s);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[6]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_SaturdayAMPM;
	
	public void Business_Hours_SaturdayAMPM()
	{
		Business_Hours_SaturdayAMPM.click();
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[6]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Saturday2;
	
	public void Business_Hours_Saturday2(String s)
	{
		Business_Hours_Saturday2.click();
		Business_Hours_Saturday2.clear();
		Business_Hours_Saturday2.sendKeys(s);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[6]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_Saturday2PMAM;
	public void Business_Hours_Saturday2PMAM()
	{
		Business_Hours_Saturday2PMAM.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dept-details\"]/form/schedule-builder/section[7]/article/a")
	@CacheLookup
	WebElement Business_Hours_Sunday_Addhours;
	
	public void Business_Hours_Sunday_Addhours()
	{
		Business_Hours_Sunday_Addhours.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[7]/article/div/day-slot/div/div[1]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Sunday;
	
	public void Business_Hours_Sunday(String su)
	{
		Business_Hours_Sunday.click();
		Business_Hours_Sunday.clear();
		Business_Hours_Sunday.sendKeys(su);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[7]/article/div/day-slot/div/div[1]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_SundayAMPM;
	
	public void Business_Hours_SundayAMPM()
	{
		Business_Hours_SundayAMPM.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[7]/article/div/day-slot/div/div[3]/time-picker/div/input")
	@CacheLookup
	WebElement Business_Hours_Sunday2;
	
	public void Business_Hours_Sunday2(String s)
	{
		Business_Hours_Sunday2.click();
		Business_Hours_Sunday2.clear();
		Business_Hours_Sunday2.sendKeys(s);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/department-details/section/form/schedule-builder/section[7]/article/div/day-slot/div/div[3]/time-picker/div/span/button")
	@CacheLookup
	WebElement Business_Hours_Sunday2PAMAM;
	
	public void Business_Hours_Sunday2PAMAM()
	{
		Business_Hours_Sunday2PAMAM.click();
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement Department_Save;
	
	public void Department_Save()
	{
		Department_Save.click();
	}

	//----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Get In Line')]")
	@CacheLookup
	WebElement Get_in_line_link;
	
	public void Get_in_line_link()
	{
		Get_in_line_link.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-departments/section/div/div[2]/get-in-line/form/section/article/div[3]/a")
	@CacheLookup
	WebElement Getin_line_link2;
	
	public void Getin_line_link2()
	{
		Getin_line_link2.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Next')]")
	@CacheLookup
	WebElement Getin_Next;
	
	public void Getin_Next()
	{
		Getin_Next.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement Sign_IN;
	
	public void Sign_IN()
	{
		Sign_IN.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@name=\"email\"]")
	@CacheLookup
	WebElement Sign_Email;
	
	public void Sign_Email(String E)
	{
		Sign_Email.click();
		Sign_Email.click();
		Sign_Email.sendKeys(E);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name=\"password\"]")
	@CacheLookup
	WebElement Sign_Password;
	
	public void Sign_Password(String P)
	{
		Sign_Password.click();
		Sign_Password.clear();
		Sign_Password.sendKeys(P);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement Sign_Submit;
	
	public void Sign_Submit()
	{
		Sign_Submit.click();
	}
//---------------------------------------MY DOCUMENT ---------------------------------------------------------------------------
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'My Documents')]")
	@CacheLookup
	WebElement My_Documents;
	
	public void My_Documents()
	{
		My_Documents.click();
	}
  
	@FindBy(how=How.XPATH,using="//button[@class=\"btn btn-primary btn-block edit-button\"]")
	@CacheLookup
	WebElement RCB_Edit;
	
	public void RCB_Edit()
	{
		RCB_Edit.click();
	}
	
	@FindBy(how=How.ID,using="register-acc")
	@CacheLookup
	WebElement Register;
	
	public void Register()
	{
		Register.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[2]/documents-list/div/a[1]/div[2]/div/div/button")
	@CacheLookup
	WebElement RCB_Report;
	
	public void RCB_Report()
	{
		RCB_Report.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/document-modal/div[2]/form/form-render/div/ng-form/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement RCB_firstname;
	
	public void RCB_firstname(String a)
	{
		RCB_firstname.click();
		RCB_firstname.clear();
		RCB_firstname.sendKeys(a);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/document-modal/div[2]/form/form-render/div/ng-form/div[2]/div/div[1]/div/input")
	@CacheLookup
	WebElement RCB_lastname;
	
	public void RCB_lastname(String c)
	{
		RCB_lastname.click();
		RCB_lastname.clear();
		RCB_lastname.sendKeys(c);
	}
	
	@FindBy(how=How.NAME,using="Dob_formly_2_date_2_2")
	@CacheLookup
	WebElement RCB_dob;
	
    public void RCB_dob(String b)
    {
    
    	RCB_dob.sendKeys(b);
    }
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/document-modal/div[2]/form/form-render/div/ng-form/div[4]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement RCB_ssn;
	
	public void RCB_ssn(String d)
	{
		RCB_ssn.click();
		RCB_ssn.clear();
		RCB_ssn.sendKeys(d);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/document-modal/div[2]/form/form-render/div/ng-form/div[6]/div/div[1]/div/input")
	@CacheLookup
	WebElement RCB_ZipCode;
	
	public void RCB_ZipCode(String z)
	{
		RCB_ZipCode.click();
		RCB_ZipCode.clear();
		RCB_ZipCode.sendKeys(z);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/document-modal/div[2]/form/form-render/div/ng-form/div[5]/div/div[1]/div/input")
	@CacheLookup
	WebElement RCB_Patient;
	
	public void RCB_Patient(String d)
	{
		RCB_Patient.click();
		RCB_Patient.clear();
		RCB_Patient.sendKeys(d);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/document-modal/div[2]/form/form-render/div/ng-form/div[7]/div/div[1]/div/div/div/div[1]/label/input")
	@CacheLookup
	WebElement RCB_Tick;
	
	public void RCB_Tick()
	{
		RCB_Tick.click();
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
	WebElement RCB_Done;
	
	public void RCB_Done()
	{
		RCB_Done.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[2]/documents-list/div/a[2]/div[2]/div/div/button")
	@CacheLookup
	WebElement New_Que;
	
	public void New_Que()
	{
		New_Que.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/document-modal/div[3]/span/button")
	@CacheLookup
	WebElement New_Que_Done;
	
	public void New_Que_Done()
	{
		New_Que_Done.click();
	}
	
	@FindBy(how=How.ID,using="email")
	@CacheLookup
	WebElement Email;
	
	public void Email(String d)
	{
		
		Email.sendKeys(d);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[1]/div[2]/password-checker/section/div/input")
	@CacheLookup
	WebElement Password;
	
	public void Password(String b)
	{
		Password.click();
		Password.clear();
		Password.sendKeys(b);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[1]/div[3]/input")
	@CacheLookup
	WebElement Confirm_Password;
	
	public void Confirm_Password(String d)
	{
		Confirm_Password.click();
		Confirm_Password.clear();
		Confirm_Password.sendKeys(d);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[1]/input")
	@CacheLookup
	WebElement First_name;
	
	public void First_name(String g)
	{
		First_name.click();
		First_name.clear();
		First_name.sendKeys(g);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[2]/input")
	@CacheLookup
	WebElement Location1;
	
	public void Location1(String h)
	{
		Location1.click();
		Location1.clear();
		Location1.sendKeys(h);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[3]/input")
	@CacheLookup
	WebElement SSN;
	
	public void SSN(String n)
	{
		SSN.click();
		SSN.clear();
		SSN.sendKeys(n);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[4]/div/div[1]/label/input")
	@CacheLookup
	WebElement Male;
	
	public void Male()
	{
		Male.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[5]/input")
	@CacheLookup
	WebElement Phone;
	
	public void Phone(String f)
	{
		Phone.click();
		Phone.clear();
		Phone.sendKeys(f);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[6]/input")
	@CacheLookup
	WebElement Location2;
	
	public void Location2(String d)
	{
		Location2.click();
		Location2.clear();
		Location2.sendKeys(d);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[8]/input")
	@CacheLookup
	WebElement Last4ofSSNTITLE;
	
	public void Last4ofSSNTITLE(String h)
	{
		Last4ofSSNTITLE.click();
		Last4ofSSNTITLE.clear();
		Last4ofSSNTITLE.sendKeys(h);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[3]/div[1]/label/input")
	@CacheLookup
	WebElement Send_Text_Message;
	
	public void Text_Message()
	{
		Send_Text_Message.click();
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[3]/div[2]/label/input")
	@CacheLookup
	WebElement Send_Email;
	
	public void Send_Email()
	{
		Send_Email.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[3]/div[3]/label/input")
	@CacheLookup
	WebElement Send_Voice;
	
	public  void Send_Voice()
	{
		Send_Voice.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[4]/div/label/input")
	@CacheLookup
	WebElement Terms;
	
	public void Terms()
	{
		Terms.click();
	}
	
	@FindBy(how=How.XPATH,using="//div[@class=\"recaptcha-checkbox-border\"]")
	@CacheLookup
	WebElement Robot;
	
	public void Robot()
	{
		Actions a = new Actions(ldriver);
		a.moveToElement(Robot).click();
		
		
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'REGISTER AND GET IN LINE')]")
	@CacheLookup
	WebElement REGISTERANDGET_LINE;
	
	public void REGISTERANDGET_LINE()
	{
		REGISTERANDGET_LINE.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Create Account')]")
	@CacheLookup
	WebElement Create_Acount;
	
	public void Create_Acount()
	{
		Create_Acount.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement Sing_in;
	
	public void Sing_in()
	{
		Sing_in.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/login/section/div/div/div/div[2]/form/div/input[1]")
	@CacheLookup
	WebElement User_name;
	
	public void User_name(String u)
	{
		User_name.click();
		User_name.sendKeys(u);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/login/section/div/div/div/div[2]/form/div/input[2]")
	@CacheLookup
	WebElement User_Password;
	
	public void User_Password(String b)
	{
		User_Password.click();
		User_Password.sendKeys(b);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement User_Sing;
	
	public void User_Sing()
	{
		User_Sing.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'My Events')]")
	@CacheLookup
	WebElement My_Events;
	
	public void My_Events()
	{
		My_Events.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/my-events/section/div/div[1]/div/ul/li[4]/div/label/input")
	@CacheLookup
	WebElement Include_past_events;
	
	public void Include_past_events()
	{
		Include_past_events.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Appointments')]")
	@CacheLookup
	WebElement Appointments;
	
	public void Appointments()
	{
		Appointments.click();
	}
	
	@FindBy(how=How.ID,using="register-guest")
	@CacheLookup
	WebElement Guest;
	
	public   void Guest()
	{
		Guest.click();
	}
	
	@FindBy(how=How.ID,using="FirstName")
	@CacheLookup
	WebElement Guest_Firstname;
	
	public void Guest_Firstname(String f)
	{
		Guest_Firstname.click();
		Guest_Firstname.sendKeys(f);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[2]/input")
	@CacheLookup
	WebElement Guest_Lastname;
	
	public void Guest_Lastname(String f)
	{
		Guest_Lastname.click();
		Guest_Lastname.sendKeys(f);
	}
	
	@FindBy(how=How.NAME,using="DOB")
	@CacheLookup
	WebElement Guest_Dob;
	
	public void Guest_Dob(String d)
	{
		Guest_Dob.click();
		Guest_Dob.sendKeys(d);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[4]/div/div[1]/label/input")
	@CacheLookup
	WebElement Guest_Male;
	
	public void Guest_Male()
	{
		Guest_Male.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[2]/get-in-line-form-body/div[1]/register-form/form/div[1]/div[2]/div[4]/div/div[2]/label/input")
	@CacheLookup
	WebElement Guest_FeMale;
	
	public  void Guest_FeMale()
	{
		Guest_FeMale.click();
	}
	
	@FindBy(how=How.NAME,using="PhoneNumber")
	@CacheLookup
	WebElement Guest_PhoneNumber;
	
	public void Guest_PhoneNumber(String p)
	{
		Guest_PhoneNumber.click();
		Guest_PhoneNumber.sendKeys(p);
	}
	
	@FindBy(how=How.NAME,using="Location")
	@CacheLookup
	WebElement Guest_Location;
	
	public void Guest_Location(String l)
	{
		Guest_Location.click();
		Guest_Location.sendKeys(l);
	}
	
	@FindBy(how=How.NAME,using="sendSMS")
	@CacheLookup
	WebElement Guest_Sendsms;
	
	public void Guest_Sendsms()
	{
		Guest_Sendsms.click();
	}
	
	@FindBy(how=How.NAME,using="sendEmail")
	@CacheLookup
	WebElement Guest_sendEmail;
	
	public void Guest_sendEmail()
	{
		Guest_sendEmail.click();
	}
	
	@FindBy(how=How.NAME,using="sendVoice")
	@CacheLookup
	WebElement Guest_sendVoice;
	
	public void Guest_sendVoice()
	{
		Guest_sendVoice.click();
	}
	
	@FindBy(how=How.NAME,using="tos")
	@CacheLookup
	WebElement Guest_Terms;
	
	public void Guest_Terms()
	{
		Guest_Terms.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")
	@CacheLookup
	WebElement Guest_Robot;
	
	public void Guest_Robot()
	{
		Actions a = new Actions(ldriver);
		a.moveToElement(Robot).click();
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'GET IN LINE')]")
	@CacheLookup
	WebElement Guest_Get_in_Line;
	
	public void Guest_Get_in_Line()
	{
		Guest_Get_in_Line.click();
	}
	
	 //----------------------------------------------- My Conversations ----- --------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
