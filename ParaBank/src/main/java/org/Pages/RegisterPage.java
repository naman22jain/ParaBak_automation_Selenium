package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver){
       this.driver= driver;
    }
    By firstName= By.id("customer.firstName");
    By lastName =By.id("customer.lastName");
    By address= By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipcode = By.id("customer.address.zipCode");
    By Phone = By.id("customer.phoneNumber");
    By SSN = By.id("customer.ssn");
    By Username = By.id("customer.username");
    By Password = By.id("customer.password");
    By confirmpass = By.id("repeatedPassword");
    By registerbuttn= By.xpath("//input[@value='Register']");

    public void setFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void setLastName(String lastname) {
       driver.findElement(lastName).sendKeys(lastname);
    }

    public void setAddress(String adrs) {
   driver.findElement(address).sendKeys(adrs);
    }

    public void setCity(String cityname) {
        driver.findElement(city).sendKeys(cityname);
    }
    public void setState(String State) {
       driver.findElement(state).sendKeys(State);
    }

    public void setZipcode(String zipcodee) {
       driver.findElement(zipcode).sendKeys(zipcodee);
    }

    public void setPhone(String phonee) {
        driver.findElement(Phone).sendKeys(phonee);

    }

    public void setSSN(String ssn) {
        driver.findElement(SSN).sendKeys(ssn);
    }
    public void setUsername(String username) {
        driver.findElement(Username).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(Password).sendKeys(password);
    }

    public void setConfirmpass(String Confirmpass) {
        driver.findElement(confirmpass).sendKeys(Confirmpass);
    }
    public void Registering(){
        driver.findElement(registerbuttn).click();
    }
}
