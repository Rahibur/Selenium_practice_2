package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IncreaseDecreaseRange extends DriveTest{
    @Test
    public void clickHold() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://trytestingthis.netlify.app/");

        Actions scroll = new Actions(driver);
        //ScrollBy Amount
        scroll.scrollByAmount(0,700).build().perform();

        Thread.sleep(3000);

        Actions moveSlider = new Actions(driver);
        WebElement rangeSlider = driver.findElement(By.xpath("//input[@id='a']"));
        moveSlider.clickAndHold(rangeSlider)
                .moveByOffset(40, 0)// move right (positive X)
                .moveByOffset(-40, 0)
                .release()
                .perform();
        Thread.sleep(2000);
    }

}
