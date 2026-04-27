package com.jeff.agiblog.tests;

import com.jeff.agiblog.config.ConfigReader;
import com.jeff.agiblog.driver.DriverContext;
import com.jeff.agiblog.driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = DriverFactory.createDriver();
        DriverContext.setDriver(driver);
        driver.manage().window().maximize();
        driver.get(ConfigReader.getBaseUrl());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
            DriverContext.removeDriver();
        }
    }
}
