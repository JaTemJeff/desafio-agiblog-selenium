package com.jeff.agiblog.bdd.steps;

import com.jeff.agiblog.driver.DriverContext;
import com.jeff.agiblog.pages.HomePage;
import com.jeff.agiblog.pages.ResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SearchSteps {

    private HomePage homePage;
    private ResultsPage resultsPage;

    @Given("que o usuário acessa o blog")
    public void queOUsuarioAcessaOBlog() {
        homePage = new HomePage(DriverContext.getDriver());
    }

    @When("ele realiza a busca por {string}")
    public void eleRealizaABuscaPor(String article) {
        resultsPage = homePage.search(article);
    }

    @Then("devem ser exibidos resultados relevantes para {string}")
    public void devemSerExibidosResultadosRelevantesPara(String results) {
        Assertions.assertAll(
                () -> Assertions.assertTrue(resultsPage.hasResults()),
                () -> Assertions.assertTrue(resultsPage.hasResultContaining(results))
        );
    }

    @Then("não devem existir resultados para a busca")
    public void naoDevemExistirResultadosParaABusca() {
        Assertions.assertTrue(resultsPage.hasNoResults());
    }
}