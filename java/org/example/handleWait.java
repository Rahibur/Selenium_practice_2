/**
 * Performing Implicit and Explicit wait function
 */

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class handleWait extends DriveTest{
    @Test
    public void seleniumWait()  {
        driver.manage().window().maximize();

        driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.xpath("//input[@name='commit1']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicity wait (normal wait it can be use in main class)

        WebElement text_2=driver.findElement(By.xpath("//h2[@id='delay']"));
        System.out.println(text_2.getText());
        driver.findElement(By.xpath("//input[@id='loaderStart']")).click();
        WebElement text_3 = driver.findElement(By.xpath("//h2[@id='loaderdelay']"));
        System.out.println(text_3.getText());
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        WebElement h2 = driver.findElement(By.xpath("//h2[@id='two']"));

/*------------------- Explicity wait(consition based wait)------------------- */

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.textToBePresentInElement(h2,"I am here!"));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@id='two']"), "I am here!"));

        System.out.println("Text:" + h2.getText());


    }
}
