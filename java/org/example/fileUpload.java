package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fileUpload extends DriveTest{
    @Test
    public void file() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://trytestingthis.netlify.app/");
        Actions scroll = new Actions(driver);
        //ScrollBy Amount
        scroll.scrollByAmount(0,700).build().perform();

        Thread.sleep(3000);

        WebElement file = driver.findElement(By.xpath("//input[@id='myfile']"));
        file.sendKeys("C:\\Users\\COMPUTER WORLD\\Downloads\\Class 6 Math British Curriculumn Yearly.pdf");
        Thread.sleep(3000);
    }
}
