package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class interactingWithWebElement extends DriveTest{
    @Test
    public void WebElements() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);

        //Find  text from the page element
        WebElement find;
        find = driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));
        find.getText();
        System.out.println("The text is:"+find.getText());

        //get the placeholder from input box
        WebElement placeHolder;
        placeHolder = driver.findElement(By.cssSelector("#autocomplete"));
        String pp = placeHolder.getAttribute("placeholder");
        System.out.println(pp);

        //To get any css value
        WebElement css;
        css = driver.findElement(By.xpath("//button[@id='openwindow']"));
        String value_css = css.getCssValue("background-color");
        System.out.println(value_css);

        //Is Selected Command for radio button
        WebElement select,select_1;
        select = driver.findElement(By.cssSelector("input[value='radio2']"));
        Thread.sleep(1000);
        System.out.println("Before Click: " + select.isSelected());
        select_1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        Thread.sleep(1000);
        select_1.click();
        System.out.println("After Click: " + select_1.isSelected());

        //Is Enable Command for checkbox button
        WebElement enable,enable_1;
        enable= driver.findElement(By.cssSelector("#checkBoxOption1"));
        Thread.sleep(1000);
        System.out.println("Before Click: " + enable.isEnabled());
        System.out.println("Before click: " + enable.isSelected());
        enable_1 = driver.findElement(By.cssSelector("#checkBoxOption2"));
        Thread.sleep(1000);
        enable_1.click();
        System.out.println("After Click: " + enable_1.isEnabled());
        System.out.println("After click: " + enable_1.isSelected());

        // Checking Is Displayed Command
        WebElement displayed,not_displayed;
        not_displayed = driver.findElement(By.cssSelector("#displayed-text"));
        not_displayed.sendKeys("This is a demo typing");
        Thread.sleep(1000);
        System.out.println("Before Clicking Hide Button: " + not_displayed.isDisplayed());
        displayed = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        Thread.sleep(1000);
        displayed.click();
        Thread.sleep(2000);
        System.out.println("After Clicking Hide Button: " + not_displayed.isDisplayed());

        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.cssSelector("#dropdown-class-example"));
        dropdownElement.click();
        Thread.sleep(1000);
        Select dropdown = new Select(dropdownElement);
        Thread.sleep(1000);
        dropdown.selectByVisibleText("Option1");
        Thread.sleep(1000);

    }
}
