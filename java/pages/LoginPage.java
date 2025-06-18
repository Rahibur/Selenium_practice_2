package pages;

import org.openqa.selenium.By;

public class LoginPage extends Basepage {
    public String url = "https://auth.wikimedia.org/enwiki/wiki/Special:UserLogin";
    public String username = "Rahibur";
    public String password = "B450mPlus";

    public String email= "ttrahib00@gmail.com";

    public String error_text = "Incorrect username or password entered. Please try again.";
    public By username_input = By.xpath("//input[@id='wpName1']");
    public By password_input = By.xpath("//input[@id='wpPassword1']");
    public By remember_checkbox = By.xpath("//input[@id='wpRemember']");
    public By login_btn = By.xpath("//button[@id='wpLoginAttempt']");

    public By error_message = By.xpath("//div[@class='cdx-message__content']");
}
