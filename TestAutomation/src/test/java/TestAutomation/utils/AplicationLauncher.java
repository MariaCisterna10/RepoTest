package TestAutomation.utils;

import TestAutomation.pages.PageDataEmployee;
import TestAutomation.pages.PageLogin;
import TestAutomation.pages.PageEmployeeRegistration;
import TestAutomation.properties.PropertiesInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class AplicationLauncher {

    public static WebDriver driver;
    static String projectPath = System.getProperty("user.dir");
    public static PageLogin pageLogin;
    public static PageDataEmployee pageEmployee;
    public static PageEmployeeRegistration pageRegistration;
    public static PropertiesInit properties;

    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        initializePagesObjects();
        driver.manage().window().maximize();
        properties = new PropertiesInit();
    }

    private static void initializePagesObjects() {
        pageLogin = PageFactory.initElements(driver, PageLogin.class);
        pageEmployee = PageFactory.initElements(driver, PageDataEmployee.class);
        pageRegistration = PageFactory.initElements(driver, PageEmployeeRegistration.class);
    }

}
