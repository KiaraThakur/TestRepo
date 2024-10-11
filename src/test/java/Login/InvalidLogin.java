package Login;

import Pages.Login;
import Pages.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidLogin {
    WebDriver driver;
    Utils utils= new Utils();
    String currenturl;
    @BeforeClass
    // @BeforeSuite
    public void invokeBrowser()
    {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali\\Desktop\\SMC Document\\SetMyCartAdmin\\src\\main\\resources\\BroswerBinaries\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
       //driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(utils.url);

    }

    @Test
    public void invalidLoginTestCase()
    {
        Login loginPage = new Login(driver);
        loginPage.clickLoginButton();
        loginPage.enterEmailLogin("vaishali123@ymail.com");
        loginPage.enterPassword("12345");
        loginPage.clickLoginButtonLoginPage();
    }
    @AfterClass
    public void closebrowser()
    {
        driver.close();
    }
}
