package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;
    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    By login = By.xpath("//li[@id =\"login\"]");
    By emailLogin = By.xpath("//input[@id = \"username\"]");
    By pwdLogin = By.xpath("//input[@id = \"password\"]");
    By buttonLogin =By.xpath("//input[@value = \"Login\"]");


    public void clickLoginButton()
    {
        driver.findElement(login).click();
    }
    public void enterEmailLogin(String loginEmail){
        driver.findElement(emailLogin).sendKeys(loginEmail);
    }

    public void enterPassword( String passwrd)
    {
        driver.findElement(pwdLogin).sendKeys(passwrd);
    }

    public void clickLoginButtonLoginPage()
    {
        driver.findElement(buttonLogin).click();
    }


}
