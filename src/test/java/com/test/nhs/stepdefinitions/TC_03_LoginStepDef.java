package com.test.nhs.stepdefinitions;

import com.test.nhs.pages.LoginPage;
import com.test.nhs.utils.ConfigReader;
import com.test.nhs.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC_03_LoginStepDef {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);

    @Given("the user navigates to the NHS website")
    public void the_user_navigates_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("QA_nhs_url"));
    }
    @Given("user validate the url of the page")
    public void user_validate_the_url_of_the_page() {
        Assert.assertEquals(ConfigReader.readProperty("QA_nhs_url"), driver.getCurrentUrl());
    }
    @When("the user enters the valid username  and a blank password")
    public void the_user_enters_the_valid_username_and_a_blank_password() {
        loginPage.TC_03();
    }
    @When("the user click the SignIn button")
    public void the_user_click_the_sign_in_button() {
       loginPage.signInButtonClick();
    }
//    @Then("user validates the error message")
//    public void user_validates_the_error_message() {
//       Assert.assertEquals();
//    }
}
