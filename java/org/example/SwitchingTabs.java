

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchingTabs extends DriveTest{
    @Test
    public void frameTest() throws InterruptedException {
//      maximize the window
        driver.manage().window().maximize();

//      tab_1
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);

//      Scroll to the Iframe
        Actions actions = new Actions(driver);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
        actions.scrollToElement(iframe).build().perform();
        Thread.sleep(1000);

//      Switch into the iframe
        driver.switchTo().frame("courses-iframe");

//      tab_2
        WebElement  url;
        url = driver.findElement(By.xpath("//a[contains(text(),'Career Focussed QA Meetup with Rahul Shetty @Pune')]"));
        url.click();
        Thread.sleep(3000);

//      tab_3
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://sites.google.com/view/rahibur-rahman/home");
        Thread.sleep(1000);

//      tab_4
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://sites.google.com/view/rahibs-notes/home");
        Thread.sleep(1000);



        // Get all open tabs
        Set<String> allWindows = driver.getWindowHandles();
        String desiredURL = "https://qasummit.org/";

        // Loop through each tab and switch to the one with the desired URL
        for (String windowHandle : allWindows) {
            driver.switchTo().window(windowHandle);
            if (driver.getCurrentUrl().equals(desiredURL)) {
                System.out.println("Switched to tab with URL: " + driver.getCurrentUrl());
                break;
            }
        }

        // Perform actions on the specific tab
        System.out.println("You are now in the desired tab: " + driver.getTitle());
        Thread.sleep(2000);

    }


}
