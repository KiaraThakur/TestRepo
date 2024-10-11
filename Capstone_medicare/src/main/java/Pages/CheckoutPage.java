package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    public CheckoutPage(WebDriver driver)
    {
        this.driver = driver;

    }

    By checkoutbutton = By.xpath("//a[@class =\"btn btn-success btn-block\"]");
    By selectAddress = By.xpath("//a[contains(text(),'Select')]");
    By cardNumber = By.xpath("//input[@id =\"cardNumber\"]");
    By expirydate = By.xpath("//input[@id =\"expityMonth\"]");
    By expiryYear = By.xpath("//input[@id =\"expityYear\"]");
    By cvCode = By.xpath("//input[@id =\"cvCode\"]");
    By payButton = By.xpath("//a[@class =\"btn btn-success btn-lg btn-block\"]");

    public void clickCheckoutButton()
    { Duration duration = Duration.ofSeconds(60);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(checkoutbutton)));
        driver.findElement(checkoutbutton).click();
    }

    public void selectaddressButton()
    {
        Duration duration = Duration.ofSeconds(60);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectAddress)));
        driver.findElement(selectAddress).click();
    }

    public void addCardNumber(String crdnumber)
    {
        driver.findElement(cardNumber).sendKeys(crdnumber);
    }
    public void addExpiryDate(String expDate)
    {
        driver.findElement(expirydate).sendKeys(expDate);
    }
    public void addExpiryYear(String expYear)
    {
        driver.findElement(expiryYear).sendKeys(expYear);
    }
    public void addCVCode(String cvcode)
    {
        driver.findElement(cvCode).sendKeys(cvcode);
    }
    public void clickPayButton()
    {
        Duration duration = Duration.ofSeconds(60);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(payButton)));
        driver.findElement(payButton).click();
    }
}
