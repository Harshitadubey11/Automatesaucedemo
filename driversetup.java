package Ecommerceutils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driversetup {

    public static WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();

        // Disable Chrome's built-in password manager
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking"); // Optional extra safety
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        return driver;
    }
}









//package Ecommerceutils;
//Think of a package as a folder that organizes related classes (in this case, utility/helper classes).

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//public class driversetup {
//	public static WebDriver getDriver() {	
//		 This defines a public static method named getDriver() that:
//			 Can be called without creating an object of driversetup
//			 Returns a WebDriver instance
//			 💡 This method is the "browser starter" — your test code will call driversetup.getDriver() to launch Chrome and open the site.
 //       WebDriver driver = new ChromeDriver();
//WebDriver: The interface that all browser drivers implement.        
//ChromeDriver: A specific class to control the Google Chrome browser.
// You're saying: "Hey Java, I want to use Selenium’s WebDriver and ChromeDriver classes."
 //       driver.manage().window().maximize(); // Optional but useful
//		driver.get("https://www.saucedemo.com/");
 //       return driver;
//	}

//}
