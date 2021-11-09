package TestAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static TestAutomation.utils.AplicationLauncher.driver;
import static TestAutomation.utils.Generic.*;
import static org.junit.Assert.assertTrue;

public class PageLogin {

    @FindBy(id = "login-form")
    private WebElement screenLogin;

    @FindBy(xpath = "//*[text() = 'Username *']")
    private WebElement lblUsername;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputUser;

    @FindBy(xpath = "//*[text() = 'Password *']")
    private WebElement lblPassword;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement inputPass;

    @FindBy(xpath = "//*[contains(text(), 'Password:')]")
    private WebElement lblPass;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;


    public boolean loginScreen(){
        esperaElementoSegundos(driver, screenLogin, 6);
        assertTrue(isElementPresent(screenLogin));
    return true;
    }

    public boolean validaTextoUser(){
        lblUsername.getText();
        textValidation(lblUsername, "Username *");
        return true;
    }

    public boolean validaInputUser(){
        textValidation(lblUsername, "Username *");
        return true;
    }

    public boolean validaTextoPassword(){
        textValidation(lblPassword, "Password *");
        return true;
    }

    public boolean validaInfoPassword(){
        textValidation(lblPass, "Password: \"angular\"");
        return true;
    }

    public void ingresoUser(String user){
        inputUser.clear();
        inputUser.sendKeys(user);
    }

    public void ingresoPass(String pass){
        inputPass.sendKeys(pass);
    }

    public void presionarBtnLogin() throws InterruptedException {
        Thread.sleep(3);
        btnLogin.click();
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
