package AddToCart;

import Pages.AddToCart;
import Pages.Login;
import Pages.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class AddToCartTest {

    WebDriver driver;
    Utils utils= new Utils();
   @BeforeClass
    // @BeforeSuite
    public void invokeBrowser()
    {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(utils.url);

    }
    @Test
    public void addToCartTestCase()
    {   Login login = new Login(driver);
        AddToCart addtocart = new AddToCart(driver);
        login.clickLoginButton();
        login.enterEmailLogin("vaishali@ymail.com");
        login.enterPassword("123456");
        login.clickLoginButtonLoginPage();
        addtocart.clickViewButton();
        addtocart.clickAddToCartButton();
        addtocart.clickLogoButton();
    }
    @Test
    public void addToCartTestCase1() throws InterruptedException {   Login login = new Login(driver);
        AddToCart addtocart = new AddToCart(driver);
        /*login.clickLoginButton();
        login.enterEmailLogin("vaishali@ymail.com");
        login.enterPassword("123456");
        login.clickLoginButtonLoginPage();*/
        addtocart.clickViewButton();
        Thread.sleep(2000);
        addtocart.clickAddToCartButton();
        Thread.sleep(2000);
        addtocart.clickLogoButton();
        addtocart.clickViewButton2();
        Thread.sleep(3000);
        addtocart.clickAddToCartButton();

    }

    @AfterClass
    public void closebrowser()
    {
        driver.close();
    }

}
