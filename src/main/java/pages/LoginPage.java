package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.LoggerUtil;

public class LoginPage {
	
	private WebDriver driver;
	
    private By emailField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
	
    public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
    
    public void enterEmail(String email) {
    	
    	LoggerUtil.info("Entering email: " + email);
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys(email);
		 
	}

	public void enterPassword(String password) {
		
		LoggerUtil.info("Entering password.");
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}

	public void checkRememberMe() {
		
		LoggerUtil.info("Checking the 'Remember Me' checkbox.");
		By rememberMeCheckbox = By.id("RememberMe");
		if (!driver.findElement(rememberMeCheckbox).isSelected()) {
			driver.findElement(rememberMeCheckbox).click();
		}
		
	}
	
	public void clickLogin() {
		
		LoggerUtil.info("Clicking the login button.");
		driver.findElement(loginButton).click();
	}

}
