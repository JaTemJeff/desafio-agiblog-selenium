@all
Feature: BDD - Busca de artigos no blog

  @search-valid-article
  Scenario: Buscar artigo com assunto válido
    Given que o usuário acessa o blog
    When ele realiza a busca por "cartão"
    Then devem ser exibidos resultados relevantes para "cartão"

  @search-invalid-article
  Scenario: Buscar artigo com assunto inválido
    Given que o usuário acessa o blog
    When ele realiza a busca por "batatinha"
    Then não devem existir resultados para a busca