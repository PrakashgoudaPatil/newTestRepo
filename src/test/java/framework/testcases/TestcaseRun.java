package framework.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.base.HelpMethods;
import framework.pages.LoginePage;

public class TestcaseRun {
	
    @Test
	public void VerifyLogin() {
    	WebDriver driver=HelpMethods.StartBrowser("chrome", "https://opensource-demo.orangehrmlive.com");
    	LoginePage login=PageFactory.initElements(driver, LoginePage.class);
    	login.LoginePageMothed("admin", "admin123");
 	
    	HelpMethods.closeBrowser();
		
	}
		

	

}
