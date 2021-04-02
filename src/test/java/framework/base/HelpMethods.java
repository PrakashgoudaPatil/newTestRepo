package framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.core.ReturnInstruction.Return;

public class HelpMethods {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String BrowseName,String url) {
		if(BrowseName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else 	{
			System.out.println("invalid browser name"+BrowseName);
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
