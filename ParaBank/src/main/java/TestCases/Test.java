package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.Pages.Login;
import org.Pages.RegisterButton;
import org.Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //Navigating to the Parabank webpage
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        driver.manage().window().maximize();
        Login login = new Login(driver);
        //Entering username and password
        login.enterUsername("john");
        login.enterPass("demo");
        //Clicking the login button
        login.clickLoginButton();
        //I have added sleep to verify the page after successful login
        Thread.sleep(5000);
        //navigating back to the homepage
        driver.navigate().back();
        //creating object of RegisterButton
        RegisterButton registerButton = new RegisterButton(driver);
        //added sleep so that we can verify that we have landed on the homepage
        Thread.sleep(2000);
        //clicking the register button
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
}
