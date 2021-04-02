package framework.pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginePage {
	
	WebDriver driver;
	
	@FindBy(id = "txtUsername") WebElement UserName;  //https://opensource-demo.orangehrmlive.com/
	@FindBy(name = "txtPassword") WebElement Password;
	@FindBy(id = "btnLogin") WebElement loginButton;
	@FindBy(xpath = "//img[@alt='OrangeHRM']") WebElement VerifyLogine;
	
	public LoginePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void LoginePageMothed(String username,String password) {
		UserName.sendKeys(username);
		Password.sendKeys(password);
		
		loginButton.click();
		
		boolean element=VerifyLogine.isDisplayed();
		if(element) {
			System.out.println("logine is succussful");
		}else {
			System.out.println("logine is not succusful");
		}
		
	
	}

}
