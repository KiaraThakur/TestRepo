package Signup;

import Pages.Signup;
import Pages.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignupTest {

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
       // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(utils.url);

    }

    @Test
     public void signupbuttontestcase()
    {
        Signup signup = new Signup(driver);
        signup.clickSignupButton();
    }
    @Test
    public void signupSuccessTestCase()
    {
        Signup signup = new Signup(driver);
        signup.clickSignupButton();
        signup.fillFirstName("Vaishali");
        signup.fillLastName("Thakur");
        signup.fillEmail("vaishali@ymail.com");
        signup.fillContact("9896522222");
        signup.fillpwd("123456");
        signup.fillConfirmPwd("123456");
        signup.buttonBilling();
        signup.filladdressline1("abc Colony");
        signup.filladdressline2("near abc");
        signup.fillCity("raipur");
        signup.fillPostalCode("492008");
        signup.fillState("Chhatisgarh");
        signup.fillCountry("India");
        signup.clickButtonAddress();
        signup.clickSignupConfirmlast();
    }





}



