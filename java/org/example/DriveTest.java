package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriveTest {
    public WebDriver driver;
    // Start the browser
    @BeforeSuite
    public void startBrowser(){
        driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
    //Close the browser
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }

}
