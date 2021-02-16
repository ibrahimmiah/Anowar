package test.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features ="./src/test/resources/Features",
				//features="/Users/ibrahimmiah/Cucumber/com.crmPro/src/test/resources/Features/LoginSenarioOutline.feature",
		glue ="com.stepsDefination",
			//plugin = {"pretty","html:cucumber-reports/report.html","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"}
		//plugin= {"pretty","junit:cucumber-reports/report.xml"}
				plugin = {"json:target/cucumber.json"}
		)





public class LogInRunner {
	
	
	

}
