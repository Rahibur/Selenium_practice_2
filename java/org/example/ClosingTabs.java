package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

public class ClosingTabs extends DriveTest {
    @Test
    public void closeTab() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // tab1

        // Open additional tabs
        driver.switchTo().newWindow(WindowType.TAB).get("https://qasummit.org/"); // tab2
        driver.switchTo().newWindow(WindowType.TAB).get("https://sites.google.com/view/rahibur-rahman/home"); // tab3
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com/feed/"); // tab4
        Thread.sleep(2000);

        // Get all open tabs
        Set<String> allWindows = driver.getWindowHandles();
        String desiredHandle = "";
        String tab3Handle = "";
        String tab4Handle = "";

        // Identify handles for tab 3, tab 4, and the desired tab
        for (String windowHandle : allWindows) {
            driver.switchTo().window(windowHandle);
            String currentURL = driver.getCurrentUrl();
            if (currentURL.equals("https://sites.google.com/view/rahibur-rahman/home")) {
                tab3Handle = windowHandle;
            } else if (currentURL.equals("https://www.linkedin.com/feed/")) {
                tab4Handle = windowHandle;
            } else if (currentURL.equals("https://qasummit.org/")) {
                desiredHandle = windowHandle;
                System.out.println("Switched to tab with URL: " + currentURL);
            }
        }

        // Perform actions on the desired tab
        System.out.println("You are now in the desired tab: " + driver.getTitle());
        Thread.sleep(2000);

        // Close tab 3 and tab 4
        if (!tab3Handle.isEmpty()) {
            driver.switchTo().window(tab3Handle);
            driver.close();
        }
        if (!tab4Handle.isEmpty()) {
            driver.switchTo().window(tab4Handle);
            driver.close();
        }

        // Switch back to the desired tab using its handle
        if (!desiredHandle.isEmpty()) {
            driver.switchTo().window(desiredHandle);
            System.out.println("Switched back to the desired tab: " + driver.getCurrentUrl());
        } else {
            System.out.println("Desired tab handle not found!");
        }

        Thread.sleep(4000);
    }
}
