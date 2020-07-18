package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement serachbtn;
	
	@FindBy(xpath="//span[.='My wishlists']")
	private WebElement wishlist;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public ProductPage serachforproduct(String product)
	{
		serachtb.sendKeys(product);
		serachbtn.click();
		return new ProductPage(driver);
	}
	
	public WishlistPage wishlistbtn()
	{
		wishlist.click();
		return new WishlistPage(driver);
	}

}
