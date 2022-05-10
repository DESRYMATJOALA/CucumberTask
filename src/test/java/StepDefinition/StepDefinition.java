package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


public class StepDefinition {


        @Given("^user is on landing page$")
        public void user_is_on_landing_page() {

        }

        @When("^user app runs$")
        public void user_app_runs() {

        }

        @Then("^print hello world$")
        public void print_hello_world() {
                System.out.println("hh");
        }

    }

