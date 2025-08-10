package Ecommercetest;

import org.openqa.selenium.WebDriver;

import Ecommercepages.cartpage;
import Ecommercepages.checkoutpage;
import Ecommercepages.finishpage;
import Ecommercepages.loginpage;
import Ecommercepages.productpage;
import Ecommerceutils.driversetup;

public class LoginTest {
    public static void main(String[] args) {
        
        // Step 1: Launch browser using the driver setup class
        WebDriver driver = driversetup.getDriver();
        
        // Step 2: Create object of LoginPage and pass the driver
        loginpage loginPage = new loginpage(driver);

        // Step 3: Call login method
        loginPage.login("standard_user", "secret_sauce");
     
        // Optional: Add wait or validation here
cartpage cart = new cartpage(driver);
cart.addtocartitem1();
cart.addtocartitem2();
cart.shoppingcart();

checkoutpage checkout = new checkoutpage(driver);
checkout.checkout();

productpage product = new productpage(driver);
//product.productpage1();
System.out.println("Page Title before entering user details: " + driver.getTitle());
System.out.println("Current URL: " + driver.getCurrentUrl());
product.firstname();
product.lastname();
product.postalCode();
product.Continue();


finishpage finish = new finishpage(driver);
finish.Completepurchase();
//finish.ClickonFinish();
        // Step 4: Close the browser (optional for now)
        driver.quit();
    
    }
    
}
