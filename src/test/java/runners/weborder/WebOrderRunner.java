package runners.weborder;
//THESE ARE INTERVIEW QUESTIONS:
//Runner class is a way to run your all feature files from here
//@RunWith annotation comes from Junit and it executes the feature file steps
//CucumberOptions is a special annotation that have some key words:
//features:this is the location of feature files (this one should content root)
//glue:this is the location of step definitions (this one should be source root and delete .java part to make it more general)
//dryRun:this is a way to get snips without executing the whole implementations.
//it means if you make it true, you will get immediately unimplemented snips.

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.weborder",//this is path for feature files
        glue = "stepdefinitions/webordersteps",//this is path for step definitions
        dryRun = false,
        tags = "@smokeLoginTest"
)
public class WebOrderRunner {
}





