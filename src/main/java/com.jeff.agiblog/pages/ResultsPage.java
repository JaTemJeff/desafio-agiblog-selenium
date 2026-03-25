package com.jeff.agiblog.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultsPage extends BasePage {

    private WebDriverWait wait;

    private By results = By.cssSelector("article.post");
    private By titles = By.cssSelector("h2.entry-title a");
    private By pageTitle = By.cssSelector("h1.page-title");
    private By noResults = By.cssSelector(".no-results");

    public ResultsPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean hasResults() {
        wait.until(d -> d.getCurrentUrl().contains("?s="));
        wait.until(d -> !d.findElements(pageTitle).isEmpty());
        return wait.until(d -> !d.findElements(results).isEmpty());
    }

    public boolean hasNoResults() {
        return wait.until(d -> !d.findElements(noResults).isEmpty());
    }
}