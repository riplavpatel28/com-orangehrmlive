package project2;
/** Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String browser="Edge";
    static String baseURL = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong browser name");
        }
            driver.get(baseURL);
            //maximise page
            driver.manage().window().maximize();
            //Get page title
            String title = driver.getTitle();
            System.out.println("Page title" + title);
            //Get Current url
            System.out.println("Current URl"+ driver.getCurrentUrl());
            //Get Page Resource
            System.out.println("page source"+driver.getPageSource());
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys("Admin");
            //Get the Password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("admin123");
            //close browser
            driver.close();


        }
    }

