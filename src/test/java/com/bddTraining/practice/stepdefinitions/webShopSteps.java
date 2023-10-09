package com.bddTraining.practice.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webShopSteps {
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
}
