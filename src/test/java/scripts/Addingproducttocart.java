package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.AddtocartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class Addingproducttocart extends Basetest{
	
	@Test
	public void addingtocart()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.logincreditals(Propertyfile.getdata("username"),Propertyfile.getdata("password"));
		ProductPage p = h.serachforproduct(Propertyfile.getdata("productname"));
		Utilies.dropdown(p.getProductdropdown(),Propertyfile.getdata("sort"));
		AddtocartPage c = p.selectproduct();
		for(int i=1;i<=3;i++)
		{
		c.plus();
		}
		Utilies.dropdown(c.getSizedropdown(),Propertyfile.getdata("size"));
		c.addingtocart();
		String t = driver.getTitle();
		Assert.assertEquals(t,Propertyfile.getdata("endpagetitle"));
		
	}

}
