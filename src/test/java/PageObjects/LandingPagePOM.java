package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPagePOM {
	
	public WebDriver driver;
	
	public LandingPagePOM(WebDriver driver){
		
		
		this.driver = driver;
		
	}
	

	By search = By.xpath("//input [@type='search']");
	By productname = By.cssSelector("h4.product-name");
	By topdeals = By.xpath("//a[@href='#/offers']");
	
	public void searchitem(String string)
	{
		
		driver.findElement(search).sendKeys(string);
	}
	
	public String productnamegettext()
	{
		return driver.findElement(productname).getText();
	}

	public void topdealspage()
	{
		driver.findElement(topdeals).click();
	}
	
	

}
