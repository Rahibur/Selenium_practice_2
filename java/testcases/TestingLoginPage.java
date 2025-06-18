package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Mainpage;
import utilities.Main;

public class TestingLoginPage extends Main {
    Mainpage mainPage = new Mainpage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TestUserCanLoginWithValidCredentials(){
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_btn);

        loginPage.writeOneElement(loginPage.username_input, loginPage.username);
        loginPage.writeOneElement(loginPage.password_input, loginPage.password);

        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertEquals(mainPage.getElementText(mainPage.username), loginPage.username);
        Assert.assertTrue(mainPage.waitForElementVisible(mainPage.user_icon).isDisplayed());


    }

}
