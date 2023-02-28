package com.access.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class AdmUser 
{
	
	WebDriver ldriver;
	public AdmUser(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userLocation\"]")
	@CacheLookup
	WebElement userlocation;
	
	public void userlocation()
	{
		
		userlocation.click();
		userlocation.sendKeys("Florida");
		//*[@id="userLocation"]
		
		//WebElement userlocation = ldriver.findElement(By.xpath("//*[@id=\"userLocation\"]"));  
		//Select dropdown = new Select(userlocation); 
		//dropdown.selectByIndex(1);
	}
	

	@FindBy(how=How.XPATH,using="//select[@id='userLocation']")
	@CacheLookup
	WebElement userlocation1;
	
	public void userlocation1()
	{
		Select ab =new Select(userlocation1);
		ab.selectByIndex(1);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/user-location-modal/div[3]/button")
	@CacheLookup
	WebElement okbutton;
	
	public void okbutton()
	{
		
		okbutton.click();
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a")
	@CacheLookup
	WebElement admprofile;
	public void admprofile()
	{
		
		admprofile.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Admin')]")
	@CacheLookup
	WebElement admlink;
	public void admlink()
	{
		
		admlink.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[1]/div[2]/button")
	@CacheLookup
	WebElement adduser;
	public void adduser()
	{
		
		adduser.click();
		
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	@CacheLookup
	WebElement adduseremail;
	public void adduseremail(String email)
	{
		
		adduseremail.sendKeys(email);
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[1]/div[1]/div/div/span/input")
	@CacheLookup
	WebElement adduseremailchk;
	public void adduseremailchk()
	{
		
		adduseremailchk.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[1]/div[2]/div/div/input")
	@CacheLookup
	WebElement userphnumber;
	public void userphnumber(String ph)
	{
		
		userphnumber.sendKeys(ph);
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[1]/div[2]/div/div/span/input")
	@CacheLookup
	WebElement usertextmsgchk;
	public void usertextmsgchk()
	{
		
		usertextmsgchk.click();
		
	}
	
	@FindBy(how=How.NAME,using="firstName")
	@CacheLookup
	WebElement userfname;
	public void userfname(String fname)
	{
		
		userfname.sendKeys(fname);
		
	}
	
	@FindBy(how=How.NAME,using="lastName")
	@CacheLookup
	WebElement userlname;
	public void userlname(String lname)
	{
		
		userlname.sendKeys(lname);
		
	}
	
	@FindBy(how=How.NAME,using="passwordInput")
	@CacheLookup
	WebElement userpswd;
	public void userpswd(String pswd)
	{
		
		userpswd.sendKeys(pswd);
		
	}
	
	@FindBy(how=How.NAME,using="passwordConfirm")
	@CacheLookup
	WebElement userconfpswd;
	public void userconfpswd(String cnpswd)
	{
		
		userconfpswd.sendKeys(cnpswd);
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[3]/div[2]/div[2]/div/label/input")
	@CacheLookup
	WebElement chngnextlognchk;
	public void chngnextlognchk()
	{
		
		chngnextlognchk.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[4]/div/div/div/label/input")
	@CacheLookup
	WebElement thresholdalertchk;
	public void thresholdalertchk()
	{
		
		thresholdalertchk.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[5]/div[1]/div/div/button")
	@CacheLookup
	WebElement userroledrpdwn;
	public void userroledrpdwn()
	{
		
		userroledrpdwn.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[5]/div[1]/div/div/ul/li[2]/a")
	@CacheLookup
	WebElement userroledrpdwnselect;
	public void userroledrpdwnselect()
	{
		
		userroledrpdwnselect.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"allowedDeptDropdown\"]")
	@CacheLookup
	WebElement deptdrpdown;
	public void deptdrpdown()
	{
		
		deptdrpdown.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[6]/div[1]/div/div/ul/li[1]/a")
	@CacheLookup
	WebElement deptdrpdownselect;
	public void deptdrpdownselect()
	{
		
		deptdrpdownselect.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[6]/div[2]/div/div/button")
	@CacheLookup
	WebElement defdeptdrpdown;
	public void defdeptdrpdown()
	{
		
		defdeptdrpdown.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[6]/div[2]/div/div/ul/li[1]/a")
	@CacheLookup
	WebElement defdeptdrpdownsel;
	public void defdeptdrpdownsel()
	{
		
		defdeptdrpdownsel.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/div[1]/div/div/user-editor/form/div[2]/button[2]")
	@CacheLookup
	WebElement savebtn;
	public void savebtn()
	{
		
		savebtn.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/div[1]/div/div/user-editor/form/div[2]/button[1]")
	@CacheLookup
	WebElement cancelbtn;
	public void cancelbtn()
	{
		
		cancelbtn.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[3]/div[2]/div[1]/span[1]")
	@CacheLookup
	WebElement confpswdalert;
	public void confpswdalert()
	{
		
		confpswdalert.getText();
		System.out.println(confpswdalert.getText());
		
	}
	
	@FindBy(how=How.XPATH,using=" //  button[contains(text(),'Filter Users')]")
	@CacheLookup
	WebElement clkfilterbtn;
	public void clkfilterbtn()
	{
		
		clkfilterbtn.click();
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"lastname\"]")
	@CacheLookup
	WebElement filterlname;
	public void filterlname(String lname)
	{
		
		filterlname.sendKeys(lname);
		
		
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(@class,'btn btn-primary pull-right') and text()='Filter']")
	@CacheLookup
	WebElement filterbtnclk;
	//@SuppressWarnings("deprecation")
	public void filterbtnclk()
	{
		
		filterbtnclk.click();
		
		//WebDriverWait wait = new WebDriverWait(ldriver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'btn btn-primary pull-right') and text()='Filter']"))); 
		//((JavascriptExecutor)ldriver).executeScript("arguments[0].click();", element);
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/filter/div[2]/form/div/div[1]/div[2]/input")
	@CacheLookup
	WebElement filterbyfname;
	
	public void filterbyfname(String fname)
	{
		
		filterbyfname.sendKeys(fname);
		
		
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(@class,'btn btn-primary pull-right') and text()='Filter']")
	@CacheLookup
	WebElement filterbyfnameclk;
	
	public void filterbyfnameclk()
	{
		
		filterbyfnameclk.click();
		
		
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary ng-scope']")
	@CacheLookup
	WebElement closefltrbtn;
	
	public void closefltrbtn()
	{
		
		closefltrbtn.click();
		
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/filter/div[2]/form/div/div[2]/div[1]/input")
	@CacheLookup
	WebElement filterbyemail;
	
	public void filterbyemail(String email)
	{
		
		filterbyemail.sendKeys(email);
		
		
	}
	
	@FindBy(how=How.ID,using="roles")
	@CacheLookup
	WebElement selectrole;
	
	public void selectrole()
	{
		
		//Select role= new Select(ldriver.findElement(By.id("roles")));
		//role.selectByIndex(0);
		
		selectrole.sendKeys("ADMIN");
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/div[1]/div/div/filter/div[3]/button[1]")
	@CacheLookup
	WebElement clkcancelbtn;
	
	public void clkcancelbtn()
	{
		
		clkcancelbtn.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[1]/div[1]/sort/div/div/button")
	@CacheLookup
	WebElement sorting;
	
	public void sorting()
	{
		
		sorting.click();
		//sorting.sendKeys("Username");
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[1]/div[1]/sort/div/div/ul/li[1]/a")
	@CacheLookup
	WebElement sortbydefault;
	
	public void sortbydefault()
	{
		
		
		sortbydefault.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[1]/div[1]/sort/div/div/ul/li[2]/a")
	@CacheLookup
	WebElement sortbyuname;
	
	public void sortbyuname()
	{
		
		sortbyuname.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[1]/div[1]/sort/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement sortbyname;
	
	public void sortbyname()
	{
		
		sortbyname.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[1]/div[1]/sort/div/div/ul/li[4]/a")
	@CacheLookup
	WebElement sortbylstlogin;
	
	public void sortbylstlogin()
	{
		
		sortbylstlogin.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[1]/div[1]/sort/div/div/ul/li[5]/a")
	@CacheLookup
	WebElement sortbystatus;
	
	public void sortbystatus()
	{
		
		sortbystatus.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[2]/div/table/tbody/tr[2]/td[5]/button")
	@CacheLookup
	WebElement edituser;
	
	public void edituser()
	{
		
		edituser.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[2]/a")
	@CacheLookup
	WebElement registration;
	
	public void registration()
	{
		
		registration.click();
	}

	
	@FindBy(how=How.XPATH,using="//*[@id=\"userEditorModal\"]/div[2]/div[1]/div/input")
	@CacheLookup
	WebElement editusername;
	
	public void editusername(String edtname)
	{
		
		editusername.clear();
		editusername.sendKeys(edtname);
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/div[1]/div/div/user-editor/form/div[2]/button[2]")
	@CacheLookup
	WebElement editusersave;
	
	public void editusersave()
	{
		
		editusersave.click();
		
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/div[1]/div/div/user-editor/form/div[2]/button[1]")
	@CacheLookup
	WebElement editusercancel;
	
	public void editusercancel()
	{
		
		editusercancel.click();
		
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[2]/div/table/tbody/tr[3]/td[5]/div/button")
	@CacheLookup
	WebElement threedot;
	
	public void threedot()
	{
		
		threedot.click();
		
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[2]/div/table/tbody/tr[3]/td[5]/div/ul/li[2]/a")
	@CacheLookup
	WebElement disaleaccntlink;
	
	public void disaleaccntlink()
	{
		
		disaleaccntlink.click();
		
		
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/div[1]/div/div/confirm-modal/div[3]/div/button[1]")
	@CacheLookup
	WebElement disaleaccntconf;
	
	public void disaleaccntconf()
	{
		
		disaleaccntconf.click();
		
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[2]/div/table/tbody/tr[3]/td[5]/div/ul/li/a")
	@CacheLookup
	WebElement enableaccount;
	
	public void enableaccount()
	{
		
		enableaccount.click();
		
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[2]/div/table/tbody/tr[3]/td[5]/div/ul/li[1]/a")
	@CacheLookup
	WebElement verifyemail;
	
	public void verifyemail()
	{
		
		verifyemail.click();
		
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[2]/div/nav/ul/li[4]/a")
	@CacheLookup
	WebElement pagination;
	
	public void pagination()
	{
		
		pagination.click();
		
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/main/div[1]/users/section/div[2]/div/nav/ul/li[14]/a")
	@CacheLookup
	WebElement paginationnew;
	
	public void paginationnew()
	{
		
		paginationnew.click();
		
		
		
	}
	
}
