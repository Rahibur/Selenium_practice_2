package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriveTest {
    public WebDriver driver;
    // Start the browser
    @BeforeSuite
    public void startBrowser(){
        driver=new ChromeDriver();
    }
    //Close the browser
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }

}
