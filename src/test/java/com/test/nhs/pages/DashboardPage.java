package com.test.nhs.pages;

import com.test.nhs.utils.BrowserUtils;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage {

    @FindBy(id = "patientsInRooms")
    WebElement patientsWithRoomsBox;
    @FindBy(xpath = "//div/div[contains(text(),'Patients with rooms')]")
    WebElement headerOfBlueBox;
    @FindBy(id = "patients-waiting-live")
    WebElement patientsWaitingBox;
    @FindBy(xpath = "//div/div[contains(text(),'Patients waiting')]")
    WebElement headerOfRedBox;
    @FindBy(id = "free-rooms-live")
    WebElement freeRoomsBox;
    @FindBy(xpath = "//div/div[contains(text(),'Free rooms')]")
    WebElement headerOfOrangeBox;

    @FindBy(xpath = "//th[@aria-controls='patients-in-hospital' and contains(text(),'no.')]")
    WebElement NoHeaderTable1;
    @FindBy(xpath = "//th[contains(text(),'Patients with rooms')]")
    WebElement PatientsWithRoomsHeaderTable1;
    @FindBy(xpath = "//th[contains(text(),'Room')]")
    WebElement RoomHeaderTable1;
    @FindBy (xpath = "//th[contains(text(),'Room')]//following::th[1]")
    WebElement ScoreHeaderTable1;
    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void validationOfBlueBox() {
        Assert.assertTrue(patientsWithRoomsBox.isDisplayed());

    }

    public String validateHeaderOfBlueBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfBlueBox);
    }

    public void validationOfRedBox() {
        Assert.assertTrue(patientsWaitingBox.isDisplayed());


    }

    public String validateHeaderOfRedBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfRedBox);
    }

    public void validationOfOrangeBox() {
        Assert.assertTrue(freeRoomsBox.isDisplayed());

    }

    public String validateHeaderOfOrangeBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfOrangeBox);

    }
public void validationForHeaderPatientsWithRooms(String NoTable1, String PatientsWithRoomsTable1,
                                                 String RoomTable1, String ScoreTable1){
        Assert.assertEquals(NoTable1,BrowserUtils.getText(NoHeaderTable1));
        Assert.assertEquals(PatientsWithRoomsTable1,BrowserUtils.getText(PatientsWithRoomsHeaderTable1));
        Assert.assertEquals(RoomTable1,BrowserUtils.getText(RoomHeaderTable1));
        Assert.assertEquals(ScoreTable1,BrowserUtils.getText(ScoreHeaderTable1));
}
    }

