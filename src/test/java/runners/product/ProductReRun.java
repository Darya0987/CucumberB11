package runners.product;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/uiFailedTests.txt", //location of the failedtests
        glue = "stepdefinitions/productsteps",
        dryRun = false,
        tags = "@productprojectOutline",
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class ProductReRun {
}
