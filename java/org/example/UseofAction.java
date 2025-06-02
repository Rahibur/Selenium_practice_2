package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UseofAction extends DriveTest {
    @Test
    public void actio() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Input Country Example
        WebElement country = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        country.sendKeys("Bangladesh");
        System.out.println(driver.findElement(By.xpath("//ul[@id='ui-id-1']")).isEnabled());

        // CopyPaste
        Actions copypaste = new Actions(driver);
        country.click();
        copypaste.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(1000);
        copypaste.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
        Thread.sleep(1000);

        WebElement hideShow = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        hideShow.click();
        Thread.sleep(2000);
        copypaste.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);

        WebElement show = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        show.click();
        Thread.sleep(2000);

        // Select a day
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://trytestingthis.netlify.app/");
        Thread.sleep(2000);

        // Scroll to date picker
        WebElement date = driver.findElement(By.xpath("//input[@id='day']"));
        Actions scroll = new Actions(driver);
        scroll.scrollByAmount(0,600);
        Thread.sleep(1000);
        date.sendKeys("01/04/2024");
        System.out.println("The date is : " + date.getAttribute("value"));
        Thread.sleep(3000);
    }
}
