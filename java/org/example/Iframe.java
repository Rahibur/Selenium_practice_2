/***
 * Playing with Iframe
 * Goto an iframe by using (Id,name,index or webelement)
 * Click or select any element
 * Get out of iframe
 ***/

package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends DriveTest{
    @Test
    public void interect() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
/**------------------Goto an iframe---------------------- **/
        //driver.switchTo().frame("courses-iframe");
        //driver.switchTo().frame("iframe-name");
        //driver.switchTo().frame(0);
        WebElement framei = driver.findElement(By.id("courses-iframe"));
        driver.switchTo().frame(framei);
        Thread.sleep(1000);

/**------------------Click or select any element---------------------- **/
        WebElement Reg=driver.findElement(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']"));
        System.out.println(Reg.getText());
        Thread.sleep(1000);

        WebElement drop = driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[normalize-space()='Courses']"));
        System.out.println(drop.getText());
        Thread.sleep(1000);

/**------------------get out of Iframe---------------------- **/
        driver.switchTo().defaultContent();
/**------------------checking if user is out of Iframe or Not---------------------- **/
        driver.findElement(By.cssSelector("input[value='radio1']")).click();
        Thread.sleep(1000);

    }
}
