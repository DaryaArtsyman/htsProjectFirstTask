package com.test.nhs.pages;

import com.test.nhs.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(id = "inputEmail")
    WebElement username;

    @FindBy(id = "inputPassword")
    WebElement password;

    @FindBy(xpath= "//button[.='Sign in']")
    WebElement signInButton;

    public void login(){
        username.sendKeys(ConfigReader.readProperty("QA_username"));
        password.sendKeys(ConfigReader.readProperty("QA_password"));

    }
public void signInButtonClick(){
        signInButton.click();
}
}

