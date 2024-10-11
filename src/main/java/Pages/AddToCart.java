package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCart {
    WebDriver driver;
    public AddToCart(WebDriver driver)
    {
        this.driver = driver;

    }


    By viewButton = By.xpath("(//div[@class =\"caption\"]//a[contains(text(),'View')])[1]");
    By viewButton1 =By.xpath("(//div[@class =\"caption\"]/a[contains(text(),'View')])[2]");
    By addToCartButton = By.xpath("//a[@class =\"btn btn-success\"]");
    By logoclick = By.xpath("//a[contains(text(),'Medicare')]");


    public void clickViewButton()
    {
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(viewButton)));
        driver.findElement(viewButton).click();
    }
    public void clickViewButton2()
    {    Duration duration = Duration.ofSeconds(60);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(viewButton1)));
        driver.findElement(viewButton1).click();
    }
    public void clickAddToCartButton()
    {
        Duration duration = Duration.ofSeconds(90);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addToCartButton)));
        driver.findElement(addToCartButton).click();
    }
    public void clickLogoButton()
    {   Duration duration = Duration.ofSeconds(60);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(logoclick)));
        driver.findElement(logoclick).click();
    }
}
