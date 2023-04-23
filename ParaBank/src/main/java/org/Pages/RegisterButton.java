package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegisterButton {
WebDriver driver;

public  RegisterButton(WebDriver driver){
    this.driver=driver;
}
By Register = By.linkText("Register");
public void clickRegister(){
    driver.findElement(Register).click();
}

}
