package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Signup;
import libarires.BrowserFactory;
import libarires.Utility_class;

public class testclass extends BrowserFactory
{

	private static final Utility_class reader = null;
	WebDriver driver;
	Signup Up;

	
	@BeforeClass
	public void openBrowser()
	{
		
		driver=OpenBrowser();
		
		
	}
	
	@BeforeMethod
	public void openappp() 
	{
		
		System.out.println("  open");
		

	}
	
	@DataProvider
	public Object[][] signupdata() throws EncryptedDocumentException, IOException
	{
		
		Object[][] data=Utility_class.gettestdata("Sheet1");
		return data;
		
	}
	
	
	
	@Test(dataProvider="signupdata")
	public void verification(String first, String sur,String mail,String pass)
	{
		Up=new Signup(driver);
		Up.setSignupFirstname(first);
		Up.setSignupsurtname(sur);
		Up.setSignupEmail(mail);
		Up.setSignupMobno(pass);
		
		

		System.out.println("facebook");
		
	}
	
	
	@AfterMethod
	public void closeappp()
	{
		
		System.out.println("close signup");
		
	}

	
	@AfterClass
	public void closebrowser()
	{
		//driver.close();
		Up=null;
		
		
	}
	
	
	
}
