package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {

        WebDriver driver;
        public Signup(WebDriver driver)
        {
            this.driver = driver;
           

        }
        //Signup page
        By signupButton = By.xpath("//li[@id =\"signup\"]");
        By firstName = By.xpath("//input[@id =\"firstName\"]");
        By lastName = By.xpath("//input[@id =\"lastName\"]");
        By email = By.xpath("//input[@id =\"email\"]");
        By contact = By.xpath("//input[@id =\"contactNumber\"]");
        By pwd = By.xpath("//input[@id =\"password\"]");
        By confirmpwd =By.xpath("//input[@id =\"confirmPassword\"]");
        By userRadio = By.xpath("//input[@id =\"role1\"]");
        By button = By.xpath("//button[@name =\"_eventId_billing\"]");

        //Address Page
        By addressLine1 = By.xpath("//input[@id =\"addressLineOne\"]");
        By addressLine2 = By.xpath("//input[@id =\"addressLineTwo\"]");
        By city = By.xpath("//input[@id =\"city\"]");
        By postalcode = By.xpath("//input[@id =\"postalCode\"]");
        By state = By.xpath("//input[@id =\"state\"]");
        By country = By.xpath("//input[@id =\"country\"]");
        By addressConfirm = By.xpath("//button[@name =\"_eventId_confirm\"]");

        //Confirmation Window
        By signUpConfirm = By.xpath("//a[contains(text(),'Confirm')]");




        public void clickSignupButton()
        {
                driver.findElement(signupButton).click();
                
        }

        public void fillFirstName(String frstname)
        {
                driver.findElement(firstName).sendKeys(frstname);

        }

        public void fillLastName(String lstName)
        {
                driver.findElement(lastName).sendKeys(lstName);
        }

        public void fillEmail(String mail){
                driver.findElement(email).sendKeys(mail);
        }

        public void fillContact(String cnum){
                driver.findElement(contact).sendKeys(cnum);
        }

        public void fillpwd (String password)
        {
                driver.findElement(pwd).sendKeys(password);
        }

        public void fillConfirmPwd(String cPwd)
        {
                driver.findElement(confirmpwd).sendKeys(cPwd);
        }

        public void buttonBilling()
        {
                driver.findElement(button).click();
        }

        public void filladdressline1(String address1)
        {
                driver.findElement(addressLine1).sendKeys(address1);
        }
        public void filladdressline2(String address2)
        {
                driver.findElement(addressLine2).sendKeys(address2);
        }

        public void fillCity(String addCity)
        {
                driver.findElement(city).sendKeys(addCity);
        }

        public void fillPostalCode(String postcode)
        {
                driver.findElement(postalcode).sendKeys(postcode);
        }

        public void fillState(String addState)
        {
                driver.findElement(state).sendKeys(addState);
        }

        public void fillCountry(String addCountry){
                driver.findElement(country).sendKeys(addCountry);
        }
        public void clickButtonAddress()
        {
                driver.findElement(addressConfirm).click();
        }
        public void clickSignupConfirmlast()
        {
                driver.findElement(signUpConfirm).click();
        }




}








