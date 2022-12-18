package prueba.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(

        features = "src/test/resources/features/customers.feature",
        glue = "prueba.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class CustomersRunner {




}
