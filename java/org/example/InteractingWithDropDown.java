package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InteractingWithDropDown extends DriveTest{
    @Test
    public void dropdown() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        WebElement fill;

        fill = driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
        fill.click();
        Select dropdown= new Select(fill);
        Thread.sleep(1000);

        //dropdown.selectByVisibleText("japanese");
        //dropdown.selectByIndex(1);
        dropdown.selectByValue("english");

/*****------------------ Use of getOptions() Fetching and printing all selected options ---------------------*****/

        List<WebElement> selectedOptions = dropdown.getOptions();
        for (WebElement option : selectedOptions) {
            System.out.println("All language Options: " + option.getText());
        }
/***------------------ Use of getFirstSelectedOption() Fetching and printing the selected option---------------***/

        String selected = dropdown.getFirstSelectedOption().getText();
        System.out.println("Selected language is : " + selected);
        Thread.sleep(1000);

//        List<WebElement> selectedOption = dropdown.getAllSelectedOptions();
//        for (WebElement option : selectedOption) {
//            System.out.println("Selected language (getAllSelectedOptions): " + option.getText());
//        }


        fill = driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
        fill.click();
        Select dropdown_1= new Select(fill);

        Thread.sleep(1000);

        //dropdown_1.selectByVisibleText("REPTILES");
        //dropdown_1.selectByIndex(3);
        dropdown_1.selectByValue("REPTILES");
        String selected_1 = dropdown_1.getFirstSelectedOption().getText();
        System.out.println("Selected catagory: " + selected_1);

        Thread.sleep(1000);


    }
}






























