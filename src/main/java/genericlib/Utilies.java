package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilies {
	
	public static void dropdown(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}

	public static void mousehover(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	
	public static void rightclick(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.contextClick(target).perform();
	}
	
	public static void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
}
