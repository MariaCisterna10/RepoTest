package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static TestAutomation.utils.AplicationLauncher.driver;
import static TestAutomation.utils.AplicationLauncher.properties;
import static TestAutomation.utils.Generic.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PageDataEmployee {

    public String name;

    @FindBy(className = "session-user")
    private WebElement lblUser;

    @FindBy(id = "bAdd")
    private WebElement btnCreate;

    @FindBy(id = "bEdit")
    private WebElement btnEdit;

    @FindBy(className = "bDelete")
    private WebElement btnDelete;

    @FindBy(id = "employee-list")
    private WebElement listEmployee;

    @FindBy(xpath = "//*[@id=\"employee-list\"]/li[1]")
    private WebElement employee;

    @FindBy(className = "bCancel")
    private WebElement btnCancel;

    @FindBy(xpath = "//*[text() = 'First name:']")
    private WebElement lblFirstName;

    @FindBy(className = "ng-valid-required")
    private List<WebElement> dataEmployee;

    @FindBy(className = "ng-invalid-required")
    private List<WebElement> dataEmptyEmployee;

    @FindBy(xpath = "//*[text() = 'Last name:']")
    private WebElement lblLastName;

    @FindBy(xpath = "//*[contains(text(), 'e-Mail:')]")
    private WebElement lblEmail;

    @FindBy(xpath = "//*[text() = 'Start date:']")
    private WebElement lblStartDate;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    public boolean validateUser() {
        assertTrue(isElementPresent(lblUser));
        textValidation(lblUser, "Maria");
        return true;
    }

    public List<WebElement> getWebElementList(By by) {
        return driver.findElements(by);
    }

    public boolean clickEmployee() throws InterruptedException {
        esperaElementoSegundos(driver, listEmployee, 5);
        assertTrue(isElementPresent(listEmployee));
        Actions act = new Actions(driver);

        List<WebElement> weList = getWebElementList(By.className("ng-binding"));
        int lista = weList.size();
        int i;
            for (i = 1; i < lista; i++) {
                Thread.sleep(5000);
                WebElement employee = driver.findElement(By.xpath("//*[@id=\"employee-list\"]/li["+i+"]"));
                act.doubleClick(employee).perform();
                validateForm();
                textValidation(btnCancel, "<< Cancel");
                textValidation(btnDelete, properties.getBtnDelete());
                //Validar campo
                name = dataEmployee.get(0).getAttribute("value");
                switch (name) {
                    case "Thomas":
                        assertEquals(name, "Thomas");
                        assertEquals(dataEmployee.get(1).getAttribute("value"), "Burleson");
                        assertEquals(dataEmployee.get(2).getAttribute("value"), "ThomasBurleson@gmail.com");
                        assertEquals(dataEmptyEmployee.get(0).getAttribute("value"), null);
                        btnCancel.click();
                        break;
                    case "Misko":
                        assertEquals(name, "Misko");
                        assertEquals(dataEmployee.get(1).getAttribute("value"), "Hevery");
                        assertEquals(dataEmployee.get(2).getAttribute("value"), "misko@hevery.com");
                        assertEquals(dataEmptyEmployee.get(0).getAttribute("value"), null);
                        btnCancel.click();
                        break;
                    case "Igor":
                        assertEquals(name, "Igor");
                        assertEquals(dataEmployee.get(1).getAttribute("value"), "Minar");
                        assertEquals(dataEmployee.get(2).getAttribute("value"), "igor.minar@gmail.com");
                        assertEquals(dataEmptyEmployee.get(0).getAttribute("value"), null);
                        btnCancel.click();
                        break;
                    case "Vojta":
                        assertEquals(name, "Vojta");
                        assertEquals(dataEmployee.get(1).getAttribute("value"), "Jina");
                        assertEquals(dataEmployee.get(2).getAttribute("value"), "vojta.jina@gmail.com");
                        assertEquals(dataEmptyEmployee.get(0).getAttribute("value"), null);
                        btnCancel.click();
                        break;
                    case "Dan":
                        assertEquals(name, "Dan");
                        assertEquals(dataEmployee.get(1).getAttribute("value"), "Doyan");
                        assertEquals(dataEmployee.get(2).getAttribute("value"), "dandoyon@yahoo.com");
                        assertEquals(dataEmptyEmployee.get(0).getAttribute("value"), null);
                        btnCancel.click();
                        break;

                }
            }
            return true;
    }

    public boolean validateForm() throws InterruptedException {
        Thread.sleep(2000);
        textValidation(lblFirstName, properties.getLblFirstName());
        textValidation(lblLastName, properties.getLblLastName());
        textValidation(lblEmail, properties.getLblEmail());
        textValidation(lblStartDate, properties.getLblStartDate());
        textValidation(btnSave, properties.getBtnSave());
        return true;
    }
}

