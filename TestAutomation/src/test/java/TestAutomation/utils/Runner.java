package TestAutomation.utils;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "TestAutomation",
        plugin = {"pretty", "html:target/cucumber",
                "json:target/cucumber.json"},
        tags = "@createEmployee")

public class Runner{

}
