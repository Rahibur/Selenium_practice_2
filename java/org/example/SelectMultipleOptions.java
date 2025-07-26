package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMultipleOptions extends DriveTest{
    @Test
    public void options() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://trytestingthis.netlify.app/");
        Actions scroll = new Actions(driver);
        //ScrollBy Amount
        scroll.scrollByAmount(0,700).build().perform();

        Thread.sleep(3000);

        WebElement multioptions = driver.findElement(By.xpath("//select[@id='owc']"));
        Select select = new Select(multioptions);

        select.selectByVisibleText("Option 1");
        select.selectByVisibleText("Option 2");
        select.selectByValue("option 3");

        Thread.sleep(3000);

    }
}
