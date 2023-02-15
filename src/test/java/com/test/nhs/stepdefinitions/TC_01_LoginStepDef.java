package com.test.nhs.stepdefinitions;

import com.test.nhs.pages.LoginPage;
import com.test.nhs.utils.ConfigReader;
import com.test.nhs.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC_01_LoginStepDef {
WebDriver driver= DriverHelper.getDriver();
LoginPage loginPage=new LoginPage(driver);
    @Given("the user navigate to the NHS website")
    public void the_user_navigate_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("QA_nhs_url"));
    }
    @Given("user validates the url of the page")
    public void user_validates_the_url_of_the_page() {
        Assert.assertEquals(ConfigReader.readProperty("QA_nhs_url"), driver.getCurrentUrl());
    }
    @When("the user enters the valid username  and valid password")
    public void the_user_enters_the_valid_username_and_valid_password() {
loginPage.TC_01();
    }
    @When("the user clicks the SignIn button")
    public void the_user_clicks_the_sign_in_button() {
loginPage.signInButtonClick();
    }
    @Then("Then the user validates the title")
    public void then_the_user_validates_the_title() {
Assert.assertEquals("NHS patients",driver.getTitle().trim());
    }

}
