Feature: Receive confirmation when adding to cart

  As a user of the VGP webshop
  I want to see a confirmation when I add a product to my shopping cart
  So that I know I added the right product

  Scenario: Add item to shopping cart
    Given   I'm on the VGP Shop homepage
    When    I go to the SHOP
    And     I go to the Hoodie with logo detail page
    And     I add the Hoodie with logo to the cart
    Then    I should get a confirmation that the product is added to the shopping cart
    But     I should not be taken directly to my shopping cart