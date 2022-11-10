package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/login/login.feature",glue= {"definition1"},tags="@NegativeTesting")

public class test_runner {

}
