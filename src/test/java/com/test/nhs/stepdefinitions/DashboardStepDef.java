package com.test.nhs.stepdefinitions;

import com.test.nhs.pages.DashboardPage;
import com.test.nhs.pages.LoginPage;
import com.test.nhs.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DashboardStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);

    @Given("the user navigate to the NHS website")
    public void the_user_navigate_to_the_nhs_website() {
        driver.get("http://www.techtorialacademy.link/");

    }

    @When("the user enter the credentials {string} and {string} and click the Sign In button")
    public void the_user_enter_the_credentials_and_and_click_the_sign_in_button(String username, String password) {
        loginPage.TC1(username, password);
    }

    @Then("User validates if the Patients with rooms box is visible")
    public void user_validates_if_the_patients_with_rooms_box_is_visible() {
        dashboardPage.validationOfBlueBox();
    }

    @Then("User validates the header of blue panel {string}")
    public void user_validates_the_header_of_blue_panel(String header1) throws InterruptedException {
        Assert.assertEquals(header1, dashboardPage.validateHeaderOfBlueBox());


    }

    @Then("User validates if the patients waiting box is visible")
    public void user_validates_if_the_patients_waiting_box_is_visible() {
        dashboardPage.validationOfRedBox();
    }

    @Then("User validates the header of red panel {string}")
    public void user_validates_the_header_of_red_panel(String header2) throws InterruptedException {
        Assert.assertEquals(header2, dashboardPage.validateHeaderOfRedBox());
    }

    @Then("User validates if the number of free rooms box is visible")
    public void user_validates_if_the_number_of_free_rooms_box_is_visible() {
        dashboardPage.validationOfOrangeBox();
    }

    @Then("User validates the header of orange panel {string}")
    public void user_validates_the_header_of_orange_panel(String header3) throws InterruptedException {
        Assert.assertEquals(header3, dashboardPage.validateHeaderOfOrangeBox());
    }
    @Then("user can see the headers: {string}, {string}, {string}, {string}.")
    public void user_can_see_the_headers(String NoHeaderTable1, String PatientsWithRoomsHeaderTable1, String RoomHeaderTable1, String ScoreHeaderTable1) {
dashboardPage.validationForHeaderPatientsWithRooms(NoHeaderTable1,PatientsWithRoomsHeaderTable1, RoomHeaderTable1, ScoreHeaderTable1 );
    }

}