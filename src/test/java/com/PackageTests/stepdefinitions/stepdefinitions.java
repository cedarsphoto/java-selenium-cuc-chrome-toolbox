package com.PackageTests.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitions
{

    @Given("I do something to begin")
    public static void GoToStartPage() throws Throwable
    {
        //stuff happens here
    }

    @When("I perform an action")
    public static void DoYourActions() throws Throwable
    {
        // more stuff happens
    }

    @Then("More stuff and some assertions")
    public static void FinalActions() throws Throwable
    {
        // more acctions
        // Assert
    }

    @And("If I need an And")
    public static void LinkingActions() throws Throwable
    {
        // same as above
    }

    // Example of multi-parameter Scenario outline
    @When("Multiple things happen such '(.*)' as '(.*)' this '(.*)'$")
    public static void multi_params(String a, String b, String c) throws Throwable
    {
        // MethodWithMultipleParameters(a,b,c);
    }

    @And("Singular parameter example '(.*)'$")
    public static void Singular() throws Throwable
    {
        // method
    }

}
