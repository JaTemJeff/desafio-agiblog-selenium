package com.jeff.agiblog.bdd.hooks;

import com.jeff.agiblog.driver.DriverContext;
import com.jeff.agiblog.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = DriverFactory.createDriver();
        driver.manage().window().maximize();
        driver.get("https://blog.agibank.com.br/");

        DriverContext.setDriver(driver);
    }

    @After
    public void tearDown() {
        if (DriverContext.getDriver() != null) {
            DriverContext.getDriver().quit();
        }
    }
}