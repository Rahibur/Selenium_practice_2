package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.Main;

public class testingPetstore extends Main {
    @Test
    public void testingTitle() throws InterruptedException {
        getDriver().manage().window().maximize();
        getDriver().get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        Thread.sleep(2000);



        WebElement fill;
        fill = getDriver().findElement(By.xpath("//input[@name=\"username\"]"));
        fill.click();
        fill.sendKeys("admin");
        Thread.sleep(1000);

        fill= getDriver().findElement(By.xpath("//input[@name='password']"));
        fill.sendKeys("dff&&uu1944@tT");
        Thread.sleep(1000);

        fill= getDriver().findElement(By.xpath("//input[@name='repeatedPassword']"));
        fill.sendKeys("dff&&uu1944@tT");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.firstName']"));
        fill.sendKeys("Jhon");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.lastName']"));
        fill.sendKeys(" Doe");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.email']"));
        fill.sendKeys("jhon001@gmail.com");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.phone']"));
        fill.sendKeys("01723232345");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.address1']"));
        fill.sendKeys("27-East Jurkey,Bergumon");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.address2']"));
        fill.sendKeys("23-East Jurkey,Bergumon");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.city']"));
        fill.sendKeys("Bergumon");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.state']"));
        fill.sendKeys("USA");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.zip']"));
        fill.sendKeys("89893");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.country']"));
        fill.sendKeys("USA");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//select[@name='account.languagePreference']"));
        fill.click();
        Select dropdown= new Select(fill);
        Thread.sleep(1000);
        dropdown.selectByVisibleText("japanese");
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
        fill.click();
        Select dropdown_1= new Select(fill);
        Thread.sleep(1000);
        dropdown_1.selectByVisibleText("REPTILES");
        Thread.sleep(1000);


        fill = getDriver().findElement(By.xpath("//input[@name='account.listOption']"));
        fill.click();
        System.out.println("The selection is : " +fill.isSelected() );
        Thread.sleep(1000);

        fill = getDriver().findElement(By.xpath("//input[@name='account.bannerOption']"));
        fill.click();
        System.out.println("The selection is : " +fill.isSelected() );
        Thread.sleep(1000);


    }
}
