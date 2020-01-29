package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup 
{

	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement Firstname;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement Surname;
	@FindBy(xpath="(//input[@type='text'])[3]") private WebElement Email;
	@FindBy(xpath="(//input[@type='password'])[2]") private WebElement Mobno;
	@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement Radio;
	public Signup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void setSignupFirstname(String first)
	{
		
		Firstname.sendKeys(first);
		
	}
	public void setSignupsurtname(String sur)
	{
		
		Surname.sendKeys(sur);
		
	}
	public void setSignupEmail(String mail)
	{
		
		Email.sendKeys(mail);
		
	}
	public void setSignupMobno(String pass)
	{
		
		Mobno.sendKeys(pass);
		
	}
	public void clickSignupradio()
	{
		
		Radio.click();
		
	}
	
	
	
	
	
	
	
}
