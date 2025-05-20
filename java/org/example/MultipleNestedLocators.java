package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleNestedLocators extends DriveTest{
/* Select multiple elements such as <a> under a div */
    @Test
    public  void Locator_two() throws InterruptedException {
        driver.get("https://www.google.com/");

        //maximize window browser
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Search
        WebElement searchArea;
        //searchArea = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[@class='pHiOh'][4]"));
        //searchArea = driver.findElement(By.xpath("//div[@class=\"XDyW0e\"]")); /* using selectorhub */
        //searchArea = driver.findElement(By.cssSelector("div[class='KxwPGc AghGtd']>a:nth-child(2)"));
        //searchArea = driver.findElement(By.cssSelector("div[class='KxwPGc AghGtd']>a:last-child"));
        searchArea = driver.findElement(By.cssSelector("a:nth-child(3)")); /* using selectorhub */
        searchArea.click();
        Thread.sleep(1000);

/** IT traingBd class No. 27
        //following siblings

        //preceding siblings

        // multiple attribute

        //parent

        //child
**/

    }
}
