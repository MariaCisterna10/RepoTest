package TestAutomation.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static TestAutomation.pages.PageLogin.closeBrowser;
import static TestAutomation.utils.AplicationLauncher.*;
import static org.junit.Assert.assertTrue;


public class LoginDefinition {

    @Given("Access to the TownSend cafe platform url")
    public void access_to_the_town_send_cafe_platform_url() {
        setUp();
        driver.get("http://thomasburleson.github.io/angularJS-CafeTownsend/#/login");
    }

    @When("valid entry to login screen")
    public void valid_entry_to_login_screen() {
        assertTrue(pageLogin.loginScreen());
    }

    @Then("valid username label")
    public void valid_username_label() {
        assertTrue(pageLogin.validaTextoUser());
    }

    @Then("valid username input")
    public void valid_username_input() {
        assertTrue(pageLogin.validaInputUser());
    }

    @Then("login username {string}")
    public void login_username(String string) {
        pageLogin.ingresoUser(string);
    }

    @Then("valid password label")
    public void valid_password_label() {
        assertTrue(pageLogin.validaTextoPassword());
    }

    @Then("valid password input")
    public void valid_password_input() {
       // assertTrue(pageLogin.valid());
    }

    @Then("login password {string}")
    public void login_password(String string) {
        pageLogin.ingresoPass(string);
    }

    @Then("valid password text")
    public void valid_password_text() {
        assertTrue(pageLogin.validaInfoPassword());
    }

    @Then("press login button")
    public void press_login_button() throws InterruptedException {
        pageLogin.presionarBtnLogin();
    }

    @Then("close browser")
    public void close_browser() {
        closeBrowser();
    }



}
