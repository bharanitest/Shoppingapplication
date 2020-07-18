package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Autoconstant{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.get(Propertyfile.getdata(key));
		driver.get("http://automationpractice.com/index.php?");
		
	}
	
	@AfterMethod
	public void closeapp(ITestResult r)
	{
		int status = r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			Photo.getphoto(driver, name);
		}
		driver.close();
	}

}
