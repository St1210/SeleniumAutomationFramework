package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class DashBoardPage extends BaseTest {

	private WebDriver driver;
	private WebDriverWait wait;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	}

	// Locators 
	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement dashboardHeader;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutLink;

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchBox;

	//Submenu items
	//1.Catalog 
	
	@FindBy(xpath = "//p[contains(text(),'Catalog')]")
	WebElement catalogMenu;
	
	//sub menus under catalog
	@FindBy(xpath="//p[contains(text(),'Products')]")
	WebElement productsMenu;
	
	@FindBy(xpath="//p[contains(text(),'Categories')]")
	WebElement categoriesMenu;
	
	@FindBy(xpath="//p[contains(text(),'Manufacturers')]")
	WebElement manufacturersMenu;
	
	@FindBy(xpath="//p[contains(text(),'Product reviews')]")
	WebElement productReviewsMenu;
	
	@FindBy(xpath="//p[contains(text(),'Product tags')]")
	WebElement productTagsMenu;
	
	@FindBy(xpath="//p[contains(text(),'Attributes')]")
	WebElement attributesMenu;
	//end of sub menus under catalog
	
	//2.Sales
	
	@FindBy(xpath = "//p[contains(text(),'Sales')]")
	WebElement salesMenu;
	
	//sub menus under sales
	
	

	@FindBy(xpath = "//p[contains(text(),'Customers')]")
	WebElement customersMenu;

	@FindBy(xpath = "//p[contains(text(),'Promotions')]")
	WebElement promotionsMenu;

	@FindBy(xpath = "//p[contains(text(),'Content management')]")
	WebElement contentManagementMenu;

	@FindBy(xpath = "//p[contains(text(),'Configuration')]")
	WebElement configurationMenu;

	@FindBy(xpath = "//p[contains(text(),'System')]")
	WebElement systemMenu;

	@FindBy(xpath = "//p[contains(text(),'Reports')]")
	WebElement reportsMenu;

	@FindBy(xpath = "//p[contains(text(),'Help')]")
	WebElement helpMenu;
	
	public boolean isDashboardDisplayed() {
		return dashboardHeader.isDisplayed();
	}
}
