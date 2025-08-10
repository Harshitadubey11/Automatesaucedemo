package Ecommercepages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productpage {
	WebDriver driver;
	
//**********Locators**************
	By Firstname = By.id("first-name");
	By Lastname = By.id("last-name");
	By PostalCode = By.id("postal-code");
	By Continue = By.id("continue");
	
	public productpage(WebDriver driver) {
		this.driver = driver;
	}
	
//**************Methods Create to call*****************
	public void firstname() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
	    firstNameField.sendKeys("John");
	}

	
	public void lastname() {
		driver.findElement(Lastname).sendKeys("Cake");
	}
	
	public void postalCode() {
		driver.findElement(PostalCode).sendKeys("23456");
	}
	
	public void Continue() {
		driver.findElement(Continue).click();
	}
	
	public void productpage1() {
		firstname();
		lastname();
		postalCode();
		Continue();
	}
	

}
