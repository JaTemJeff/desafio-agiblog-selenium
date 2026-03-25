package com.jeff.agiblog.tests;

import com.jeff.agiblog.pages.HomePage;
import com.jeff.agiblog.pages.ResultsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    @Test
    void shouldSearchValidArticle() {
        String article = "cartão";

        HomePage homePage = new HomePage(driver);

        ResultsPage resultsPage = homePage.search(article);

        Assertions.assertTrue(resultsPage.hasResults());
        Assertions.assertTrue(resultsPage.hasResultContaining(article));
    }

    @Test
    void shouldSearchInValidArticle() {
        String article = "batatinha";

        HomePage homePage = new HomePage(driver);

        ResultsPage resultsPage = homePage.search(article);

        Assertions.assertTrue(resultsPage.hasNoResults());
    }
}
