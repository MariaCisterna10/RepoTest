package TestAutomation.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static TestAutomation.utils.AplicationLauncher.*;
import static org.junit.Assert.assertTrue;

public class DataEmployeeDefinition {

    @When("access to the TownSend cafe platform")
    public void access_to_the_town_send_cafe_platform() {
    }

    @Then("valid user entered")
    public void valid_user_entered() {
        assertTrue(pageEmployee.validateUser());
    }

    @Then("review employee data")
    public void review_employee_data() throws InterruptedException {
        pageEmployee.clickEmployee();
    }
}
