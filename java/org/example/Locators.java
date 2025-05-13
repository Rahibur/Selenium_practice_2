package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends DriveTest{
    @Test
    public void locator() throws InterruptedException {
        driver.get("https://www.google.com/");
        //Search
        WebElement searchArea;
        //searchArea = driver.findElement(By.id("APjFqb"));
        //searchArea = driver.findElement(By.className("gLFyf"));
        //searchArea = driver.findElement(By.name("q"));
        searchArea = driver.findElement(By.tagName("textarea"));

        //Type
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(1000);

        //Clear
        searchArea.clear();
        Thread.sleep(1000);

        //maximize window browser
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //search by partial link and click
        driver.findElement(By.partialLinkText("কীভাবে কাজ করে")).click();
        Thread.sleep(3000);

        // Browser navigate back
        driver.navigate().back();
        Thread.sleep(1000);

        //Search by linktext and click
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(2000);


    }
}
