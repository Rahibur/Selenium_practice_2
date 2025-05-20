/*
***Goto your portfolio click search button and search anything ,Then
open a new Tab navigate to "https://selectorshub.com/xpath-practice-page/ " this page
 enter password,company name,mobile  and click submit button.***
 ***Use selectorhub tool for xpath or css element selector***
 */

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class LocatorsUsingSelectorhub extends DriveTest{
    @Test
    public void Selectorhub() throws InterruptedException {
        //Goto portfolio
        driver.get("https://sites.google.com/view/rahibur-rahman/home");
        WebElement SearchArea;
        driver.manage().window().maximize();
        Thread.sleep(1000);

         //search icon click
         SearchArea = driver.findElement(By.xpath("//*[@class='vu8Pwe tCHXDc YSH9J']"));
         SearchArea.click();
         Thread.sleep(2000);

        //Enter anything to search
         SearchArea = driver.findElement(By.xpath("//input[@aria-label='Search this site']"));
         SearchArea.sendKeys("API");
         Thread.sleep(3000);
         SearchArea.sendKeys(Keys.ENTER);//clicked keyboard enter button by automation
         Thread.sleep(1000);

         SearchArea.clear();//clear data

        // Open a new Tab
         driver.switchTo().newWindow(WindowType.TAB);
         //navigate to a new link
         driver.navigate().to("https://selectorshub.com/xpath-practice-page/");

         //password
         SearchArea=driver.findElement(By.xpath("//input[@id='pass']"));
         SearchArea.sendKeys("123#$Ybgfj");
         Thread.sleep(1000);
         //company
          SearchArea=driver.findElement(By.xpath("//div[@class='element-companyId']//input[@placeholder='Enter your company']"));
          SearchArea.sendKeys("AOCTech");
          //Mobile
          SearchArea=driver.findElement(By.xpath("//div[@class='element-companyId']//input[@placeholder='Enter your mobile number']"));
          SearchArea.sendKeys("01752196455");
          Thread.sleep(1000);
          //submit button
          SearchArea=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
          SearchArea.click();

    }
}
