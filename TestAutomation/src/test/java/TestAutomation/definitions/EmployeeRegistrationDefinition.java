package TestAutomation.definitions;

import io.cucumber.java.en.Then;

import static TestAutomation.utils.AplicationLauncher.*;

public class EmployeeRegistrationDefinition {

    @Then("press create button")
    public void press_create_button() throws InterruptedException {
        pageRegistration.validarBtnCreate();
        pageRegistration.clickCreate();
    }

    @Then("validate form labels")
    public void validate_form_labels() throws InterruptedException {
        pageEmployee.validateForm();
    }

    @Then("enter first name {string}")
    public void enter_first_name(String string) throws InterruptedException {
        pageRegistration.enterFirstName(string);
    }

    @Then("enter last name {string}")
    public void enter_last_name(String string) {
        pageRegistration.enterLastName(string);
    }

    @Then("enter e-Mail {string}")
    public void enter_e_mail(String string) {
        pageRegistration.enterEmail(string);
    }

    @Then("enter date {string}")
    public void enter_date(String string) {
        pageRegistration.enterStartDate(string);
    }

    @Then("press save button")
    public void press_save_button() {
        pageRegistration.clickSave();
    }

    @Then("validate new record created {string}{string}{string}{string}")
    public void validate_new_record_created(String string, String string2, String string3, String string4) {
        pageRegistration.validateNewRegistration(string, string2, string3, string4);
    }
}
