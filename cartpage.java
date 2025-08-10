package Ecommercepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {
	WebDriver driver;
	By addtocart1 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By addtocart2 = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By shoppingcart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	public cartpage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addtocartitem1() {
		driver.findElement(addtocart1).click();
	}
	public void addtocartitem2() {
		driver.findElement(addtocart2).click();
	}
	
	public void shoppingcart() {
		driver.findElement(shoppingcart).click();
	}
	
	public void cart() {
		addtocartitem1();
		addtocartitem2();
		shoppingcart();
	}
	

}
