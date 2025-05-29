/***
 * Playing with alert
 */

package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class alert extends DriveTest{
    @Test
    public void alert() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//      alert system 1
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        Thread.sleep(1000);

//        alert system 2
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        Thread.sleep(1000);
        Alert alert_1 = driver.switchTo().alert();
        Thread.sleep(1000);
        String alertText_1 = alert_1.getText();
        System.out.println(alertText_1);
        alert_1.dismiss();
        Thread.sleep(1000);

//      alert system 3
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        Thread.sleep(1000);
        Alert alert_2 = driver.switchTo().alert();
        Thread.sleep(1000);
        String alertText_2 = alert_2.getText();
        System.out.println(alertText_2);
        alert_2.sendKeys("Hello");
        Thread.sleep(1000);

    }
}































































































































































