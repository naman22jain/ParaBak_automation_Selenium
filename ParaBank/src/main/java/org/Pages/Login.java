package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By usname = By.name("username");
    By pasword = By.name("password");
    By loginBtn= By.xpath("//input[@class='button']");
   public Login(WebDriver driver){
        this.driver=driver;
   }

public  void enterUsername(String name){
    driver.findElement(usname).sendKeys(name);
}
public void enterPass(String pass){
    driver.findElement(pasword).sendKeys(pass);
}
public void clickLoginButton(){
    driver.findElement(loginBtn).click();
}

}
