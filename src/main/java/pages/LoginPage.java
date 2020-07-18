package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//a[contains(.,'Sign in')]")
	private WebElement signinbtn;
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="passwd")
	private WebElement passwordtb;
	
	@FindBy(id="SubmitLogin")
	private WebElement sumbit;
	
	@FindBy(xpath="//a[@title='Contact Us']")
	private WebElement contactbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public HomePage logincreditals(String us,String password)
	{
		signinbtn.click();
		emailtb.sendKeys(us);
		passwordtb.sendKeys(password);
		sumbit.click();
		return new HomePage(driver);
		
	}
	
	public Contactuspage contactus()
	{
		contactbtn.click();
		return new Contactuspage(driver);
	}

}
