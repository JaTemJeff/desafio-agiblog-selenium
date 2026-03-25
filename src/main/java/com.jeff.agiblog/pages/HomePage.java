package com.jeff.agiblog.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage search(String article) {
        String baseUrl = driver.getCurrentUrl() + "?s=" + article;
        driver.get(baseUrl);
        return new ResultsPage(driver);
    }
}