package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPagePOM {
	
		public WebDriver driver;
		
		public OfferPagePOM(WebDriver driver){
			
			
			this.driver = driver;
			
		}
		

		By search = By.xpath("//input [@type='search']");
		By productname = By.cssSelector("tr td:nth-child(1)");
		
		
		public void searchitem(String string)
		{
			
			driver.findElement(search).sendKeys(string);
		}
		
		public String productnamegettext()
		{
			return driver.findElement(productname).getText();
		}

		
		
		

	


}
