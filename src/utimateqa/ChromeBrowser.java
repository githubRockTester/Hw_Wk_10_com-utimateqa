package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project-5 - Project Name: com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/users/sign_in
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";    //Declared String 'baseUrl' as reference variable to store URL address.
        WebDriver driver = new ChromeDriver();                          //To open the browser with jar file pre-build
        driver.get(baseUrl);                                            //To open the URL into Browser using Get method
        driver.manage().window().maximize();                            //To maximise the browser
        System.out.println("Title of the page: " + driver.getTitle());  //Get the Title of the page using getTitle method
        System.out.println("Current Url: " + driver.getCurrentUrl());   //Get the current URL by using getCurrentUrl method
        System.out.println("Page source: " + driver.getPageSource());   //Get the page source by using getPageSource method
        driver.findElement(By.id("user[email]")).sendKeys("Admin");    //Find the login link and enter user ID
        driver.findElement(By.name("user[password]")).sendKeys("admin123");   //Find the password link and enter password
        driver.close();
    }
}
