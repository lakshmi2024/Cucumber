package case1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="kavi\\case1.feature",plugin="json:target\\Jsonreport.json")
public class case1Runner {

}
