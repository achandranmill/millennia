package com.access.utilities;






import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;





public class Utility 

{
	
	

	public static  void CaptureScreenshot(WebDriver driver,String ScreenshotName)
	{
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils
		
		
		System.out.println("screenshot taken");
		
	}

}
