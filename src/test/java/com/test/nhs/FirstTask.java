package com.test.nhs;

import com.test.nhs.utils.BrowserUtils;
import com.test.nhs.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
    @Test
    public void NhsTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.readProperty("QA_nhs_url"));
       WebElement username = driver.findElement(By.id("inputEmail"));
username.sendKeys(ConfigReader.readProperty("QA_username"));
       WebElement password = driver.findElement(By.id("inputPassword"));
       password.sendKeys(ConfigReader.readProperty("QA_password"));
       WebElement signInButton=driver.findElement(By.xpath("//button[.='Sign in']"));
       signInButton.click();
       Assert.assertEquals("NHS patients", driver.getTitle());
    }
}