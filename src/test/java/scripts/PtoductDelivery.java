package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.HomePage;
import pages.LoginPage;
import pages.WishlistPage;

public class PtoductDelivery extends Basetest{
	@Test
	public void delivery()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.logincreditals(Propertyfile.getdata("username"),Propertyfile.getdata("password"));
		WishlistPage w = h.wishlistbtn();
		Utilies.mousehover(driver,w.getDresses());
		w.delivery();
		Assert.assertEquals(driver.getTitle(),Propertyfile.getdata("deliverytitle"));
	}

}
