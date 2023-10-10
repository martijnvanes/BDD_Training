package com.bddTraining.practice.stepdefinitions;

import io.cucumber.java.en.*;

public class WebShopSteps {
    @Given("I am a user in the webshop")
        public void iMAUserInTheWebshop() {
        System.out.println("Blabla");
    }

    @When("I add item <xyz> to my shopping cart")
    public void iAddItemXyzToMyShoppingCart() {
    }

    @Then("I should see a confirmation I've added item <xyz>")
    public void iShouldSeeAConfirmationIVeAddedItemXyz() {
    }

    @Given("I'm on the VGP Shop homepage")
    public void iMOnTheVGPShopHomepage() {
    }

    @When("I go to the SHOP")
    public void iGoToTheSHOP() {
    }

    @And("I go to the Hoodie with logo detail page")
    public void iGoToTheHoodieWithLogoDetailPage() {
    }

    @And("I add the Hoodie with logo to the cart")
    public void iAddTheHoodieWithLogoToTheCart() {
    }

    @Then("I should get a confirmation that the product is added to the shopping cart")
    public void iShouldGetAConfirmationThatTheProductIsAddedToTheShoppingCart() {
    }

    @But("I should not be taken directly to my shopping cart")
    public void iShouldNotBeTakenDirectlyToMyShoppingCart() {
    }
}
