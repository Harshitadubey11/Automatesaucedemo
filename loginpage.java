package Ecommercepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
//********Create a WebDriver object for this page***********
	WebDriver driver;
//*********Create locators for the elements*************	 
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton   = By.id("login-button");
    
//*******Create constructor to link this class with the driver********
    public loginpage(WebDriver driver) {
    	this.driver = driver;
    }
    
//********** Create reusable methods for actions*********
    public void enterUsername(String uname) {
    	driver.findElement(usernameField).sendKeys(uname);
    }
    public void enterPassword(String pwd) {
        driver.findElement(passwordField).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
//***********combine steps**************
    public void login(String uname, String pwd) {
        enterUsername(uname);
        enterPassword(pwd);
        clickLogin();
    } 
}
