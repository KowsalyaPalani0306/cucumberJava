package com.exection.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Kowsalya Palani\\eclipse-workspace_New\\CucumberJava\\Features", 
                 glue= {"com.exection.files"},
                 dryRun = false, strict = true)

public class FlipkartExecution {
	
	
	

}
