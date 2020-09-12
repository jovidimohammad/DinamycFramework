package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefinitions {
    @Given("User in {string} home page")
    public void user_in_home_page(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @When("User searches an item")
    public void user_searches_an_item() {
    }

    @Then("Item should see item name in title")
    public void item_should_see_item_name_in_title() {
    }

}
