package com.test.nhs;

import com.test.nhs.utils.BrowserUtils;
import com.test.nhs.utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class hook {
    public WebDriver driver;

    @Before
    public void setup() {
        driver = DriverHelper.getDriver();//utils
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() {
        BrowserUtils.getScreenShot(driver, "nhs");
        //driver.quit();
    }
}