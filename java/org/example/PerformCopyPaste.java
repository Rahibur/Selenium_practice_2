package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PerformCopyPaste extends  DriveTest{
    @Test
    public void copyPaste() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);

        WebElement autocomplete = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        autocomplete.sendKeys("Bangladesh");
        Thread.sleep(1000);

        Actions actions = new Actions(driver);

        // Select text
        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(2000);

        //copy text
        actions.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
        WebElement paste = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        paste.click();

        // paste text
        actions.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(1000);


    }
}
