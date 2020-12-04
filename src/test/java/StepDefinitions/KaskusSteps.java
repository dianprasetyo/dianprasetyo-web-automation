package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

    public class KaskusSteps {

        @Given("user access kaskus page")
        public void userAccessKaskus(){

            System.out.println("Inside step - access kaskus web");
        }

        @When("user click login button")
        public void userClickLoginButton(){

            System.out.println("Inside step - user click login");
        }

        @Then("user is on login form")
        public void userIsOnLoginForm(){

            System.out.println("Inside step - user is on login form");
        }

    }
