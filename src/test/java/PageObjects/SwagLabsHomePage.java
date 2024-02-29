package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
  
   WebDriver ldriver;
	
	public SwagLabsHomePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement slbackpack;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement backpackatoc;
	
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement backpackremove;
	
	public void slbackpack() {
		slbackpack.click();
	}
	
	public void addtocart() {
		backpackatoc.click();
	}
	
	public void remove() {
		backpackremove.click();
	}
	
	
	
	
	
}
