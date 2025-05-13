package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleBrowserRelatedTasks extends DriveTest {
    /* Easy Automation learn. Playing with browser */

   @Test
    public void testBrowser() throws InterruptedException {
        //Go to google.com
        driver.get("https://www.google.com/");

        //Get site url
       String url = driver.getCurrentUrl();
       System.out.println("Current Url :"+ url);

        // get site title
       String title = driver.getTitle();
       System.out.println("Title :"+title);
       Thread.sleep (3000); /* wait for 3 seconds */

        // Full screen the browser window
       driver.manage().window().fullscreen();
       Thread.sleep(1000); /* wait for 1 second */

        // minimize the browser window
       driver.manage().window().minimize();
       Thread.sleep(1000);

        // maximize the browser window
       driver.manage().window().maximize();
       Thread.sleep(1000);

        // Navigate to an url
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);

        // Browser back button
        driver.navigate().back();
        Thread.sleep(1000);

        // Browser forward button
        driver.navigate().forward();
        Thread.sleep(1000);

        //Browser refresh / reload
        driver.navigate().refresh();
        Thread.sleep(1000);

        // Switch to new Tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.whatsapp.com");
        Thread.sleep(1000);

        // Open new browser window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.instagram.com");
        Thread.sleep(3000);

        // get window handle
       String tabHandle = driver.getWindowHandle();
       System.out.println("Insta: " + tabHandle);

       List<String> handles = new ArrayList<>( driver.getWindowHandles());

       for (String handle: handles){
           System.out.println(handle);
       }

       System.out.println("Before Switching: " + driver.getCurrentUrl());

       driver.switchTo().window(handles.get(0));

       System.out.println("After Switching: " + driver.getCurrentUrl());


   }
}
