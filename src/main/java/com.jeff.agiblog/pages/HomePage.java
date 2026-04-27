package com.jeff.agiblog.pages;

import com.jeff.agiblog.config.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage search(String article) {
        String encoded = URLEncoder.encode(article, StandardCharsets.UTF_8);
        String searchUrl = ConfigReader.getBaseUrl() + "?s=" + encoded;
        driver.get(searchUrl);
        return new ResultsPage(driver);
    }
}
