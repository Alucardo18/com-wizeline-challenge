import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"pretty", "json:target/cucumber.json"},
        glue = {"com.wizeline.stepDefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CucumberRunner {
}
