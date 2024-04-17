package org.amazonrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\gkr01\\OneDrive\\Desktop\\SM_code\\SocialMedia\\src\\test\\resources\\Amazon"
				, snippets=SnippetType.CAMELCASE
				, glue="org.amazostep"
				, dryRun=false
				)
public class AmazonRun {

}
