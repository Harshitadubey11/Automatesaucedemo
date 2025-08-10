package Ecommercepages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class finishpage {
	WebDriver driver;
	
	By finish = By.id("finish");
	
	public finishpage(WebDriver driver) {
		this.driver = driver;

	}
	public void ClickonFinish() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement finishBtn = wait.until(ExpectedConditions.presenceOfElementLocated(finish));

	        // ✅ Debug: Check the current page title
	        System.out.println("🔍 Page Title: " + driver.getTitle());
	        System.out.println("🔍 Current URL: " + driver.getCurrentUrl());

	        // Scroll to the button
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", finishBtn);
	        Thread.sleep(500); // Optional wait to ensure stability

	        // Force click via JavaScript
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", finishBtn);

	        System.out.println("✅ Finish button clicked successfully.");
	    } catch (Exception e) {
	        System.out.println("❌ Finish button not clickable: " + e.getMessage());
	    }
	}

	
//	public void ClickonFinish() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(finish)).click();
//
//
//	}
	
	public void Completepurchase() {
		ClickonFinish();
	}
}
