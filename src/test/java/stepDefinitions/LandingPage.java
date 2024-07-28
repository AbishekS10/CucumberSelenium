package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import PageObjects.LandingPagePOM;

import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestContentsetup;
import io.cucumber.java.en.*;

public class LandingPage {
	
	WebDriver driver;
	String LandlingproductName;	
	String Offerpageproductname;
	TestContentsetup testContentsetup;
	
	public LandingPage(TestContentsetup testContentsetup)
	{
		this.testContentsetup=testContentsetup;
	}
	
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		
//		ChromeOptions co = new ChromeOptions();
//		co.set
//		
//		 WebDriver driver = WebDriverManager.chromedriver().create();
		System.setProperty("webdriver.egde.driver","C:\\Users\\Hp\\Music\\msedgedriver.exe");
		testContentsetup.driver = new EdgeDriver();
		 
		testContentsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		 System.out.println(driver.getTitle());
		 testContentsetup.driver.manage().window().maximize();
	    
	}
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) throws InterruptedException {
		
//		testContentsetup.driver.findElement(By.xpath("//input [@type='search']")).sendKeys(string);
		LandingPagePOM landingpage = new LandingPagePOM(testContentsetup.driver);
		landingpage.searchitem(string);
		Thread.sleep(2000);
		testContentsetup.LandlingproductName = landingpage.productnamegettext().split("-")[0].trim();
		System.out.println(testContentsetup.LandlingproductName +" is extracted from Home page");
	    
		
	}
	


}
