package RunCucks;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@AddTocart"
        ,features = "src/test/resources/FeatureFiles/"
        , glue = {"StepDefinations"}
        , plugin = {"pretty", "html:target/cucumber-reports"}
        ,monochrome = true
)
public class TestRunner {

}
