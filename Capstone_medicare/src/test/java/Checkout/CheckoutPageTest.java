package Checkout;

import Pages.AddToCart;
import Pages.CheckoutPage;
import Pages.Login;
import Pages.Utils;
import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class CheckoutPageTest {
    WebDriver driver;
    Utils utils = new Utils();

    @BeforeClass
    // @BeforeSuite
    public void invokeBrowser() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(utils.url);

    }

    @Test

    public void checkoutTestCase() {
        Login login = new Login(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        AddToCart addcart= new AddToCart(driver);
        login.clickLoginButton();
        login.enterEmailLogin("vaishali@ymail.com");
        login.enterPassword("123456");
        login.clickLoginButtonLoginPage();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addcart.clickViewButton();
        addcart.clickAddToCartButton();
        checkout.clickCheckoutButton();
        checkout.selectaddressButton();
        checkout.addCardNumber("8956895558993555");
        checkout.addExpiryDate("05");
        checkout.addExpiryYear("25");
        checkout.addCVCode("896");
        checkout.clickPayButton();
        addcart.clickLogoButton();
    }

    @Test
    public void checkoutTestCase1() {
        Login login = new Login(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        AddToCart addcart= new AddToCart(driver);
        addcart.clickViewButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addcart.clickAddToCartButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addcart.clickLogoButton();
        addcart.clickViewButton2();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addcart.clickAddToCartButton();
        checkout.clickCheckoutButton();
        checkout.selectaddressButton();
        checkout.addCardNumber("8956895558993555");
        checkout.addExpiryDate("05");
        checkout.addExpiryYear("25");
        checkout.addCVCode("896");
        checkout.clickPayButton();
    }

    @AfterClass
    public void closebrowser()
    {
        driver.close();
    }
}
