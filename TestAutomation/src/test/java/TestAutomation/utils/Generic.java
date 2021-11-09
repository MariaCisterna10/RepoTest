package TestAutomation.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Generic {

    public static boolean isElementPresent(WebElement webElement) {
        boolean resp = false;
        try {
            resp = webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            resp = false;
        }
        return resp;
    }

    public static boolean esperaElementoSegundos(WebDriver driver, WebElement webElement,
                                                       int segundos) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        try {
            wait.until(ExpectedConditions.visibilityOf(webElement));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static boolean textValidation(WebElement element, String texto){
        assertTrue(isElementPresent(element));
        assertEquals(element.getText().trim(), texto);
        return true;
    }
}
