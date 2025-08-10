package Ecommercepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {
	WebDriver driver;
	By checkout = By.id("checkout");
	public checkoutpage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkout1() {
		driver.findElement(checkout).click();
	}
	
	public void checkout() {
		checkout1();
	}

}
