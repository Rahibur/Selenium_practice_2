package org.example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
public class FindElementsExample extends DriveTest{
    @Test
    public void handleMultipleElements() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Locate elements using XPath
        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));

        // Iterate through the list of elements
        if (elements.isEmpty()) {
            System.out.println("No elements found.");
        } else {
            for (WebElement element : elements) {
                System.out.println("Checkbox text: " + element.getAttribute("value"));
                // Example action: Click each checkbox
                element.click();
            }
        }
    }
}
