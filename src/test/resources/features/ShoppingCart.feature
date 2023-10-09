Feature: Add items to shopping cart in Polteq webshop
  Scenario: Add item <xyz> to the shopping cart
    Given I am a user in the webshop
    When I add item <xyz> to my shopping cart
    Then I should see a confirmation I've added item <xyz>