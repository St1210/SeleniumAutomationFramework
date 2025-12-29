package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.LoggerUtil;

public class LoginPage {
	
	private WebDriver driver;
	
	//locators using page factory method
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailField;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(id="RememberMe")
	WebElement rememberMeCheckbox;
	
	
    //private By emailField = By.xpath("//input[@type='email']");
    //private By passwordField = By.xpath("//input[@type='password']");
    //private By loginButton = By.xpath("//button[@type='submit']");
	
    public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    public void enterEmail(String email) {
    	
    	LoggerUtil.info("Entering email: " + email);
		emailField.clear();
		emailField.sendKeys(email);
		 
	}

	public void enterPassword(String password) {
		
		LoggerUtil.info("Entering password.");
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	public void checkRememberMe() {
		
		LoggerUtil.info("Checking the 'Remember Me' checkbox.");
		if (!rememberMeCheckbox.isSelected()) {
			rememberMeCheckbox.click();
		}
		
	}
	
	public void clickLogin() {
		
		LoggerUtil.info("Clicking the login button.");
		loginButton.click();
	}

	public String getloginErrorMessage() {
		
		// TODO Auto-generated method stub
		return null;
	}

}
