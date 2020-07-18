package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbtn;
	
	@FindBy(id="group_1")
	private WebElement sizedropdown;
	
	public WebElement getSizedropdown() {
		return sizedropdown;
	}

	@FindBy(name="Blue")
	private WebElement color;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedbtn;
	
	public AddtocartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void plus()
	{
		plusbtn.click();
	}

	public void addingtocart()
	
	{
		color.click();
		addtocart.click();
		proceedbtn.click();
	}
}
