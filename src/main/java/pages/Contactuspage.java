package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactuspage {
	public WebDriver driver;
	@FindBy(id="id_contact")
	private WebElement contatctdropdown;

	public WebElement getContatctdropdown() {
		return contatctdropdown;
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="id_order")
	private WebElement orderrefrence;
	
	@FindBy(id="fileUpload")
	private WebElement upload;
	
	@FindBy(id="submitMessage")
	private WebElement sumbitbtn;
	
	public Contactuspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void contacting(String us,String or,String file)
	{
		 email.sendKeys(us);
		 orderrefrence.sendKeys(or);
		 upload.sendKeys(file);
		 sumbitbtn.click();
	}

}
