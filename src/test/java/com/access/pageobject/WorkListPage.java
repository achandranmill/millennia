package com.access.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkListPage 
{

	WebDriver   ldriver;
	public WorkListPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 20), this);
	}

	@FindBy(how=How.XPATH,using="//a[@ui-sref=\"worklist\"]")
	@CacheLookup
	WebElement Worklisttab;

	@FindBy(how=How.XPATH,using="//a[contains(@ui-sref,'worklist')]")
	@CacheLookup
	WebElement Worklisttab2;

	public void Worklisttab2()
	{
		Worklisttab2.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/button[1]")
	@CacheLookup
	WebElement Searchworklist;


	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/search-modal/div[2]/div[1]/div[2]/input")
	@CacheLookup
	WebElement worklistLN;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/search-modal/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement worklistFstN;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody/tr")
	@CacheLookup
	WebElement worklistselectName;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[11]/div/button")
	@CacheLookup
	WebElement WorklistSendto;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[14]/div/button")
	@CacheLookup
	WebElement WorklistSendto2;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[11]/div/ul/li[2]/a")
	@CacheLookup
	WebElement worklistDischarge;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Discharge')]")
	@CacheLookup
	WebElement worklistDischarge2;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[1]/div/button[2]")
	@CacheLookup
	WebElement worklistviewDischarge;

	@FindBy(how=How.XPATH,using="//button[@id=\"configure-options-dropdown\" and @type=\"button\"]")
	@CacheLookup
	WebElement ConfigureList;

	@FindBy(how=How.CSS,using="#configure-options-dropdown")
	@CacheLookup
	WebElement ConfigureList2;

	public void ConfigureList2()
	{
		ConfigureList2.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[1]/div/div[1]/div/ul/li[1]/a")
	@CacheLookup
	WebElement EditDepartment;

	@FindBy(how=How.XPATH,using="//input[@ng-click='$ctrl.updateDepartmentSelection(department)']")
	@CacheLookup
	WebElement Testing1;

	public void Testing1()
	{
		if(!Testing1.isSelected())
				{
			Testing1.click();
				}
		else
		{
			
		}
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Close')]")
	@CacheLookup
	WebElement BtnClose;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[1]/div/ul/li[2]/a")
	@CacheLookup
	WebElement EditSeeing;

	public void EditSeeing()
	{
		EditSeeing.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/seeing-filter/div[2]/div[3]/label/input")
	@CacheLookup
	WebElement Provider;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/seeing-filter/div[2]/div[2]/label/input")
	@CacheLookup
	WebElement Provider_checkBox_1;

	public void Provider_checkBox_1()
	{
		if(!Provider_checkBox_1.isSelected())
		{
			Provider_checkBox_1.click();
		}
		else
		{

		}
	}



	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/seeing-filter/div[3]/button")
	@CacheLookup
	WebElement BtnClose2;

	public void BtnClose2()
	{
		BtnClose2.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[2]/div/button")
	@CacheLookup
	WebElement SortBy;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[2]/div/ul")
	@CacheLookup
	WebElement SortBy_Code;

	public void SortBy_Code()
	{
		String code = SortBy_Code.getText();
		System.out.println("SORT BY LIST IS :" +code);
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Name')]")
	@CacheLookup
	WebElement OneName;

	public void OneName()
	{
		Actions ab = new Actions(ldriver);
		ab.moveToElement(OneName).click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input")
	@CacheLookup
	WebElement Waiting;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input")
	@CacheLookup
	WebElement Waiting2;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[3]/button")
	@CacheLookup
	WebElement btnclose3;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/location-filter/div[2]/div/div[1]/div[1]/label/input")
	@CacheLookup
	WebElement SelectAll;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[2]/label/input")
	@CacheLookup
	WebElement Checkin;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[3]/label/input")
	@CacheLookup
	WebElement ConnectCheckin;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[4]/label/input")
	@CacheLookup
	WebElement New;

	@FindBy(how=How.ID,using="send-back-to-button")
	@CacheLookup
	WebElement SendtoBack;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[3]/table/tbody/tr/td[23]/div/ul/li[3]/a")
	@CacheLookup
	WebElement SendBackNew;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[5]/table/tbody/tr/td[12]/div/ul/li[2]/a")
	@CacheLookup
	WebElement SendBackWaiting;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[3]/table/tbody/tr/td[7]/div/ul/li[1]/a")
	@CacheLookup
	WebElement SendBackRegt;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/button[1]")
	@CacheLookup
	WebElement ReturnActivePatient;

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[1]/div/ul/li[3]/a")
	@CacheLookup
	WebElement EditListColumns;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[3]/button[1]")
	@CacheLookup
	WebElement Columns_SettoDefaults;

	public void Columns_SettoDefaults()
	{
		Columns_SettoDefaults.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/ul/li[2]/a")
	@CacheLookup
	WebElement Appointment;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[24]/td[2]/input")
	@CacheLookup
	WebElement FormsComleted;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[3]/button[3]")
	@CacheLookup
	WebElement SaveChanges;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[1]/div/div/label[2]/input")
	@CacheLookup
	WebElement Threshold;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[2]/table/tbody/tr[20]/td[2]/input")
	@CacheLookup
	WebElement ThresholdStarttime;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[2]/table/tbody/tr[23]/td[2]/input")
	@CacheLookup
	WebElement ThresholdWaittime;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[2]/table/tbody/tr[22]/td[2]/input")
	@CacheLookup
	WebElement ThresholdStatus;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/patient-list/div[3]/button[3]")
	@CacheLookup
	WebElement ThredsholdSave;

	@FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/patient-list/div[3]/button[1]")
	@CacheLookup
	WebElement Discharge_Setdefault;

	public void Discharge_Setdefault()
	{
		Discharge_Setdefault.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"patient-lists-component\"]/div/ul/li[3]/a")
	@CacheLookup
	WebElement EditColumns_Discharge;

	public void EditColumns_Discharge()
	{
		EditColumns_Discharge.click();
	}



	public void ThredsholdSave()
	{
		ThredsholdSave.click();
	}


	public void ThresholdStatus()
	{
		ThresholdStatus.click();
	}

	public void ThresholdWaittime()
	{
		ThresholdWaittime.click();
	}


	public void ThresholdStarttime()
	{

		ThresholdStarttime.click();
	}
	public void  Threshold()
	{

		Threshold.click();
	}

	public void SaveChanges()
	{
		SaveChanges.click();
	}

	public void FormsComleted()
	{
		FormsComleted.click();
	}

	public void Appointment()
	{
		Appointment.click();
	}

	public void EditListColumns()
	{
		EditListColumns.click();
	}

	public void ReturnActivePatient()
	{
		ReturnActivePatient.click();
	}


	public void SendtoBack()
	{
		SendtoBack.click();

	}

	public void SendBackWaiting()
	{
		SendBackWaiting.click();
	}
	public void  SendBackNew()
	{
		SendBackNew.click();
	}

	public void WorklistSendto()
	{
		WorklistSendto.click();
	}
	public void WorklistSendto2()
	{
		WorklistSendto2.click();
	}


	public void Checkin()
	{
		Checkin.click();
	}
	public void ConnectCheckin()
	{
		ConnectCheckin.click();
	}
	public void New()
	{
		New.click();
	}
	public void SelectAll()
	{
		SelectAll.click();
	}

	public void Waiting2()
	{
		Waiting2.click();
		btnclose3.click();
	}


	public void Waiting()
	{
		Waiting.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[3]/button")
	@CacheLookup
	WebElement Waiting2_Close_Btn;

	public void Waiting2_Close_Btn()
	{
		Waiting2_Close_Btn.click();
	}

	public void BtnClose()
	{
		BtnClose.click();
	}



	public void SortBy() throws Exception
	{
		SortBy.click();
		Thread.sleep(10000);
		OneName.click();
	}


	public void worklist()
	{

		Worklisttab.click();

	}

	public void Discharge() throws Exception
	{

		WorklistSendto.click();
		Thread.sleep(3000);
		worklistDischarge.click();

	}
	public void Discharge2() throws Exception
	{
	
		worklistDischarge2.click();
	}

	public void DischargeViwe()
	{
		worklistviewDischarge.click();
	}
	public void Configure()
	{
		ConfigureList.click();

	}

	@FindBy(how=How.CSS,using="#worklist > main > div:nth-child(1) > worklist > div > div:nth-child(1) > div > div:nth-child(1) > div > ul > li:nth-child(1) > a")
	@CacheLookup
	WebElement Edit_Department2;

	public void Edit_Department2()
	{
		Edit_Department2.click();
	}

	@FindBy(how=How.CSS,using="#worklist > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > location-filter > div.modal-footer > button")
	@CacheLookup
	WebElement Edit_Department_btn;

	public void Edit_Department_btn()
	{
		Edit_Department_btn.click();
	}

	public void Department()
	{
		EditDepartment.click();

	}

	@FindBy(how=How.CSS,using="#worklist > main > div:nth-child(1) > worklist > div > div:nth-child(1) > div > div:nth-child(1) > div > ul > li:nth-child(2) > a")
	@CacheLookup
	WebElement Edit_Seeing2;

	public void Edit_Seeing2()
	{
		Edit_Seeing2.click();
	}

	public void Provider()
	{
		EditSeeing.click();
		Provider.click();
		BtnClose2.click();

	}
	public void Searchworklist()
	{
		Searchworklist.click();
	}
	public void worklistN(String l,String f)
	{
		worklistLN.sendKeys(l);
		worklistFstN.sendKeys(f);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/search-modal/div[1]/button/span")
	@CacheLookup
	WebElement search_cross;

	public void search_cross()
	{
		search_cross.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[30]/td[10]/div/button")
	@CacheLookup
	WebElement work_Send_to;

	public void work_Send_to()
	{
		work_Send_to.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[30]/td[10]/div/ul/li[3]/a")
	@CacheLookup
	WebElement work_Discharg;

	public void work_Discharg()
	{
		work_Discharg.click();
	}


	@FindBy(how=How.XPATH,using="//button[contains(text(),'View Discharged Patients')]")
	@CacheLookup
	WebElement work_ViewDischargedPatients;

	public void work_ViewDischargedPatients()
	{
		work_ViewDischargedPatients.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[3]/table/tbody/tr[1]/td[10]/div/button")
	@CacheLookup
	WebElement work_sendbacktobutton;

	public void work_sendbacktobutton()
	{
		work_sendbacktobutton.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[3]/table/tbody/tr[1]/td[10]/div/ul/li[2]/a")
	@CacheLookup
	WebElement work_PatientoComeInside;

	public void work_PatientoComeInside()
	{
		work_PatientoComeInside.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Return to Active Patients')]")
	@CacheLookup
	WebElement work_ReturntoActivePatients;

	public void work_ReturntoActivePatients()
	{
		work_ReturntoActivePatients.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/search-modal/div[2]/div[1]/div[2]/input")
	@CacheLookup
	WebElement Search_lastname;

	public void Searchl(String l)
	{
		Search_lastname.sendKeys(l);

	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/search-modal/div[2]/div[1]/div[3]/input")
	@CacheLookup
	WebElement Search_firstname;

	public void Searchf(String f)
	{
		Search_firstname.sendKeys(f);

	}

//-----------------------------------------11-01-2023--------------------------------------------------------------------

     @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[1]/div/div[2]/div/ul")
     @CacheLookup
     WebElement SortBy_Option_Display;
     
     public void SortBy_Option_Display()
     {
    	 String act = SortBy_Option_Display.getText();
    	 System.out.println(act);
     }
//----------------------------------------12-01-2023---------------------------------------------------------------------

     @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[19]/div/ul")
     @CacheLookup
     WebElement Sendto_print;
     
     public void Sendto_print()
     {
    	 String act = Sendto_print.getText();
    	 System.out.println(act);
     }
     
     @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/patient-details-modal/ul/li[2]/a")
     @CacheLookup
     WebElement Forms;
     
     public void Forms()
     {
    	 Forms.click();
     }

     
     
     
}	



