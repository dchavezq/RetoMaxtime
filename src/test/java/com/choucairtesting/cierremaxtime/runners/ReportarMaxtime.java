package com.choucairtesting.cierremaxtime.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/reportar_maxtime.feature",
		glue = "com.choucairtesting.cierremaxtime.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class ReportarMaxtime {

}
