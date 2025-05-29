package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends DriveTest{
    @Test
    public void hoverelement() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);

        Actions scroll = new Actions(driver);
        WebElement hover = driver.findElement(By.xpath("//button[@id='mousehover']"));
        scroll.scrollToElement(hover).build().perform();
        Thread.sleep(1000);

        //Hover the element
        scroll.moveToElement(hover).build().perform();
        Thread.sleep(2000);


    }
}
