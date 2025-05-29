package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollElement extends DriveTest
{
    @Test
    public void scrollelement() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);

        Actions scroll = new Actions(driver);
        //Scroll To the Element
//        WebElement sc = driver.findElement(By.xpath("//button[@id='mousehover']"));
//        scroll.scrollToElement(sc).build().perform();

        //ScrollBy Amount
       scroll.scrollByAmount(0,700).build().perform();

        Thread.sleep(1000);




    }
}
