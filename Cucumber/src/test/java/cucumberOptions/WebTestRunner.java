package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/UISearch.feature",glue="stepDefinations",stepNotifications=true,monochrome=true)
public class WebTestRunner {

}
