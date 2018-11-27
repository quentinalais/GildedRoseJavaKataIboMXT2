package edu.insightr.gildedrose;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,features="/Users/nathanamar/IdeaProjects/GildedRoseJavaKata/src/test/resources/conjured.feature")
public class RunCucumberTest {


}