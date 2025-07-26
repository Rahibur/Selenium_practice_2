package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop extends DriveTest{
    @Test
    public void DragDrop() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://trytestingthis.netlify.app/");

        Actions scroll = new Actions(driver);
        //ScrollBy Amount
        scroll.scrollByAmount(0,700).build().perform();

        Thread.sleep(1000);


        Actions drop = new Actions(driver);
        WebElement cakeobj = driver.findElement(By.xpath("//img[@id='drag1']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='div1']"));
        Thread.sleep(1000);
        drop.dragAndDrop(cakeobj, target).build().perform();
        Thread.sleep(1000);
    }
}
