package OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabs_OR {
	// WebDriver driver;
	//  LOGIN Locators   //
	@FindBy(xpath="//*[@id=\"user-name\"]")
	protected WebElement textusername;
	@FindBy(xpath="//*[@id=\"password\"]")
	protected WebElement passwordd;
	@FindBy(xpath="//*[@id=\"login-button\"]")
	protected WebElement login;
	@FindBy(xpath="//*[@class='login_logo']")
	protected static WebElement pagelogo;
	
	// HomePage Locators //
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	protected WebElement slbackpack;
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	protected WebElement backpackatoc;
	@FindBy(id="remove-sauce-labs-backpack")
	protected WebElement backpackremove;
	
	//About Locator //
	@FindBy(id="about_sidebar_link")
	protected WebElement about;
	
	//Products Locator//
	@FindBy(xpath="//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")
	protected WebElement products;
	@FindBy(xpath="(//*[text()='Platform for Test'])[1]")
	protected WebElement platformtest;
	@FindBy(xpath="//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Cross-Browser']")
	protected WebElement crossbrowser;
	@FindBy(xpath="//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Orchestrate']")
	protected WebElement orchastrate;
	
	
	//Developers //
	@FindBy(xpath="//span[text()='Developers']")
	protected WebElement developers;
	@FindBy(xpath="//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-fzuta4']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[1]")
	protected WebElement devloprs;
	
	//Pricing //
	@FindBy(xpath="//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Pricing']")
	protected WebElement pricing;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(id="react-burger-menu-btn")
	protected WebElement menu;
	@FindBy(id="logout_sidebar_link")
	protected WebElement logout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
