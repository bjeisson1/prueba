package co.com.test;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/nombre.feature", 
				  tags = {"@tag2"},
				  glue = "co.com.test.definitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}
