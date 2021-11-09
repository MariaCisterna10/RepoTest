package TestAutomation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static TestAutomation.utils.AplicationLauncher.driver;
import static TestAutomation.utils.AplicationLauncher.properties;
import static org.junit.Assert.assertEquals;

public class PageEmployeeRegistration {

    @FindBy(id = "bAdd")
    private WebElement btnCreate;

    @FindBy(id = "bEdit")
    private WebElement btnEdit;

    @FindBy(className = "bDelete")
    private WebElement btnDelete;

    @FindBy(className = "employee-edit")
    private WebElement inputRegiste;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    public boolean validarBtnCreate() throws InterruptedException {
        Thread.sleep(2000);
        assertEquals(btnCreate.getText(), properties.getBtnCreate());
        return true;
    }

    public void clickCreate() {
        btnCreate.click();
    }

    public void enterFirstName(String texto) throws InterruptedException {
        Thread.sleep(2000);
        inputRegiste.findElements(By.tagName("input")).get(0).sendKeys(texto);
    }

    public void enterLastName(String texto) {
        inputRegiste.findElements(By.tagName("input")).get(1).sendKeys(texto);
    }

    public void enterEmail(String texto) {
        inputRegiste.findElements(By.tagName("input")).get(2).sendKeys(texto);
    }

    public void enterStartDate(String texto) {
        inputRegiste.findElements(By.tagName("input")).get(3).clear();
        inputRegiste.findElements(By.tagName("input")).get(3).sendKeys(texto);
    }

    public void clickSave() {
        btnSave.click();
    }

    public List<WebElement> getWebElementList(By by) {
        return driver.findElements(by);
    }

    public void validateNewRegistration(String name, String lastName, String email, String fecha) {
        Actions act = new Actions(driver);
        List<WebElement> weList = getWebElementList(By.className("ng-binding"));
        int list = weList.size()-1;
        WebElement employee = driver.findElement(By.xpath("//*[@id=\"employee-list\"]/li["+list+"]"));
        act.doubleClick(employee).perform();
        assertEquals(name, inputRegiste.findElements(By.tagName("input")).get(0).getAttribute("value"));
        assertEquals(lastName, inputRegiste.findElements(By.tagName("input")).get(1).getAttribute("value"));
        assertEquals(email, inputRegiste.findElements(By.tagName("input")).get(2).getAttribute("value"));
        assertEquals(fecha, inputRegiste.findElements(By.tagName("input")).get(3).getAttribute("value"));
    }

}
