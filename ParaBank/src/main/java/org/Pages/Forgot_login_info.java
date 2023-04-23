package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_login_info {
    WebDriver driver;
    @FindBy(linkText = "Forgot login info?") WebElement forgotloginbutton;
    @FindBy(id = "firstName") WebElement first_name;
    @FindBy(id = "lastName") WebElement lastname;
    @FindBy(id = "address.street") WebElement address;
    @FindBy(id = "address.city") WebElement city;
    @FindBy(id = "address.state") WebElement state;
    @FindBy(id = "address.zipCode") WebElement zipcode;
    @FindBy(id = "ssn") WebElement SSN;
    @FindBy(xpath = "(//input[@class='button'])[2]")
    WebElement findlogininfo;
    public Forgot_login_info(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickForgotloginbutton(){
        forgotloginbutton.click();
    }
    public void setFirstname(String firstname){
        first_name.sendKeys(firstname);
    }
    public void setLastname(String lastname){
        this.lastname.sendKeys(lastname);
    }
    public void setAddress(String address){
        this.address.sendKeys(address);
    }
    public void setCity(String city){
        this.city.sendKeys(city);
    }
    public  void setState(String state){
        this.state.sendKeys(state);
    }
    public void setZipcode(String zipcode){
        this.zipcode.sendKeys(zipcode);
    }
    public void setSSN(String SSN){
        this.SSN.sendKeys(SSN);
    }
    public void clickfindlogininfo(){
        findlogininfo.click();
    }

}
