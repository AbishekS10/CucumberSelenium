package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.LandingPagePOM;
import PageObjects.OfferPagePOM;
import io.cucumber.java.en.Then;
import utils.TestContentsetup;

public class offerPage {
	TestContentsetup testContentsetup;	
	String Offerpageproductname;
	
	public offerPage(TestContentsetup testContentsetup)
	{
		this.testContentsetup=testContentsetup;
	}
	
	@Then("user searched for same shortname in offers page to check if product exist")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist() throws InterruptedException {
		
		switchtoofferdealsWindow();
		OfferPagePOM offerpage = new OfferPagePOM(testContentsetup.driver);
	   
		offerpage.searchitem("Tom");
		
//		testContentsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tom");
		 Offerpageproductname = offerpage.productnamegettext();
	
		Assert.assertEquals(testContentsetup.LandlingproductName, Offerpageproductname);
		
		
		}
	
	public void switchtoofferdealsWindow() throws InterruptedException
	
	{

		LandingPagePOM landingpage = new LandingPagePOM(testContentsetup.driver);
		landingpage.topdealspage();
		Thread.sleep(2000);
		Set<String> S1 =testContentsetup.driver.getWindowHandles();
		Iterator<String> S= S1.iterator();
		String PW = S.next();
		String CW = S.next();
		testContentsetup.driver.switchTo().window(CW);     
	}
	

}
