package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

public class ClosingTabs extends DriveTest {

    /*
    Close all the tabs only first tab remains
     */
@Test
public void closeTab() throws InterruptedException {
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // tab1

    String tab1Handle = driver.getWindowHandle(); // Save the handle of Tab 1

    // Open additional tabs
    driver.switchTo().newWindow(WindowType.TAB).get("https://qasummit.org/"); // tab2
    driver.switchTo().newWindow(WindowType.TAB).get("https://sites.google.com/view/rahibur-rahman/home"); // tab3
    driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com/feed/"); // tab4
    Thread.sleep(2000);

    // Get all open tabs
    Set<String> allTabs = driver.getWindowHandles();

    // Close all tabs except Tab 1
    for (String handle : allTabs) {
        if (!handle.equals(tab1Handle)) {
            driver.switchTo().window(handle);
            driver.close();
        }
    }

    // Switch back to Tab 1
    driver.switchTo().window(tab1Handle);
    System.out.println("Remaining on Tab 1: " + driver.getCurrentUrl());

    Thread.sleep(4000); // Optional, for observation
}


    /*
     Close any Two tabs such as tab 2 and 3
    */
    @Test
    public void CloseTab() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // tab1

        String tab1Handle = driver.getWindowHandle(); // Save tab1 handle

        // Open Tab 2
        driver.switchTo().newWindow(WindowType.TAB).get("https://qasummit.org/");
        String tab2Handle = driver.getWindowHandle();

        // Open Tab 3
        driver.switchTo().newWindow(WindowType.TAB).get("https://sites.google.com/view/rahibur-rahman/home");
        String tab3Handle = driver.getWindowHandle();

        // Open Tab 4
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com/feed/");
        String tab4Handle = driver.getWindowHandle();

        Thread.sleep(2000); // Optional delay for loading

        // Close only Tab 2 and Tab 3
        driver.switchTo().window(tab2Handle);
        driver.close();

        driver.switchTo().window(tab3Handle);
        driver.close();

        // Switch back to Tab 1 or Tab 4 (up to your need)
        driver.switchTo().window(tab4Handle); // Or tab1Handle
        System.out.println("Now on: " + driver.getCurrentUrl());

        Thread.sleep(4000); // Optional delay for observation
    }

}
