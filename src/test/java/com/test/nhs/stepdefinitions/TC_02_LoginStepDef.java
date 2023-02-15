package com.test.nhs.stepdefinitions;

import com.test.nhs.pages.LoginPage;
import com.test.nhs.utils.ConfigReader;
import com.test.nhs.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC_02_LoginStepDef {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);
    @Given("the user navigates to the nhs website")
    public void the_user_navigates_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("QA_nhs_url"));
    }
    @Given("user validatess the url of the page")
    public void user_validatess_the_url_of_the_page() {
        Assert.assertEquals(ConfigReader.readProperty("QA_nhs_url"), driver.getCurrentUrl());
    }
    @When("the user enter the valid username  and invalid password")
    public void the_user_enter_the_valid_username_and_invalid_password() {
        loginPage.TC_02();
    }
    @Then("the user clickss the SignIn button")
    public void the_user_clickss_the_sign_in_button() {
        loginPage.signInButtonClick();
    }



}
