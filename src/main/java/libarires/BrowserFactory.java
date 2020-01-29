package libarires;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory 
{
	
	  static WebDriver driver;
	public static WebDriver OpenBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SDH\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 return driver;
		
	}
	

}
