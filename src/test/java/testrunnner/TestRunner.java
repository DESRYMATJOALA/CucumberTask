package testrunnner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Precision 7510\\Documents\\desry\\src\\test\\java\\features\\app.feature",
        glue = "StepDefinition"
)
public class TestRunner {
}
