package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/** Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTesting {
    public static void main(String[] args) {
    String baseURl = "https://opensource-demo.orangehrmlive.com/";
    // Launch the browser
        WebDriver driver = new ChromeDriver();
        //Get URL
        driver.get(baseURl);
        //Maximise window
        driver.manage().window().maximize();
        //Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get page title
        String title = driver.getTitle();
        System.out.println("Page title"+title);
        // Get Current URL
        System.out.println("Current URL"+driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source"+driver.getPageSource());
        //find elements on email field
        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.sendKeys("Admin");
        //Enter the password in to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //close object
        driver.close();




    }


}
