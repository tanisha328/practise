package com.tanisha99;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature998"
		,glue={"step_definition99"}
		)

public class Test_runner99 {

}