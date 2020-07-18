package scripts;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import pages.Contactuspage;
import pages.LoginPage;

public class Contacting extends Basetest{
	@Test
	public void customercare()
	{
		LoginPage l=new LoginPage(driver);
		Contactuspage c = l.contactus();
		c.contacting(Propertyfile.getdata("username"),
				Propertyfile.getdata("or"),Propertyfile.getdata("file"));
	}

}
