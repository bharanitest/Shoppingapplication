package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement productdropdown;
	
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement product;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	public WebElement getProductdropdown() {
		return productdropdown;
	}
	
	public AddtocartPage selectproduct()
	{
		product.click();
		return new AddtocartPage(driver);
	}

}
