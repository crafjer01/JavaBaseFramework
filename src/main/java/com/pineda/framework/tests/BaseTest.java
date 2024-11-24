package com.pineda.framework.tests;

import com.pineda.framework.config.ConfigReader;
import com.pineda.framework.driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        DriverManager.initializeDriver();
        driver = DriverManager.getDriver();
        driver.get(ConfigReader.getProperty("base.url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
