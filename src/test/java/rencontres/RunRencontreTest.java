package rencontres;  

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;  
import org.junit.runner.RunWith;  

@RunWith(Cucumber.class)  
@CucumberOptions(features="src/test/resources/rencontres",strict = true)
public class RunRencontreTest { }