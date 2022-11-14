package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
//Chrome

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Lanch the URL
        driver.get(baseUrl);

        // Maximise Window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " +title);

        // Get current URL
        System.out.println("Current URL: "+ driver.getCurrentUrl());

        // Get page Source
        System.out.println("Page Source: "+driver.getPageSource());

        //Find the email field element
        WebElement emailField = driver.findElement(By.id("user-name"));

        //type email to email field
        emailField.sendKeys("test123@gmail.com");

        // find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("test123");

        //close the browser
       driver.quit();

    }

}
