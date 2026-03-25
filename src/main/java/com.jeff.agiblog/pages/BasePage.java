package com.jeff.agiblog.pages;

import com.jeff.agiblog.driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }
}
