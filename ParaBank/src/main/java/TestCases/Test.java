package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.DataProvider;

public class Test {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void destroy() {
        driver.quit();
    }

    @org.testng.annotations.Test (dataProvider = "getsheet",dataProviderClass = DataProvider.class ,priority = 0)
    public void login(String username,String Password) throws InterruptedException {
        Login login = new Login(driver);
        login.enterUsername(username);
        login.enterPass(Password);
        login.clickLoginButton();
      Thread.sleep(1000);
    }

    @org.testng.annotations.Test(priority = 1)
    public void register() throws InterruptedException {
        RegisterButton registerButton = new RegisterButton(driver);
        registerButton.clickRegister();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setFirstName("Naman");
        registerPage.setLastName("Jain");
        registerPage.setAddress("Sector 56");
        registerPage.setCity("Gurgaon");
        registerPage.setState("Haryana");
        registerPage.setZipcode("122022");
        registerPage.setPhone("9870780665");
        registerPage.setSSN("123456789101");
        registerPage.setUsername("Naman__22");
        registerPage.setPassword("Iamthepassword");
        registerPage.setConfirmpass("Iamthepassword");
        registerPage.Registering();
    }
    @org.testng.annotations.Test (priority = 2)
    public void forgot_login_info() throws InterruptedException {
        Forgot_login_info forgot_login_info= new Forgot_login_info(driver);
        forgot_login_info.clickForgotloginbutton();
        forgot_login_info.setFirstname("Naman");
        forgot_login_info.setLastname("jain");
        forgot_login_info.setCity("Gurgaon");
        forgot_login_info.setAddress("sector 33");
        forgot_login_info.setState("Haryana");
        forgot_login_info.setZipcode("122022");
        forgot_login_info.setSSN("123456789101");
        forgot_login_info.clickfindlogininfo();
        Thread.sleep(5000);
    }
}
