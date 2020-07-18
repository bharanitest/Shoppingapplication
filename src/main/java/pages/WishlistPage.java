package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	public WebDriver driver;
@FindBy(xpath="(//a[@title='Dresses'])[2]")
private WebElement dresses;

public WebElement getDresses() {
	return dresses;
}
@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
private WebElement eveningdress;

@FindBy(id="layered_id_attribute_group_3")
private WebElement sizecheckbox;

@FindBy(id="layered_id_attribute_group_24")
private WebElement colorcheckbox;

@FindBy(xpath="//a[@title='Delivery']")
private WebElement deliverytab;

public WishlistPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void delivery()
{
	eveningdress.click();
	sizecheckbox.click();
	colorcheckbox.click();
	deliverytab.click();
}


}
