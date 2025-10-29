package com.labdigbdbstgpb.virtual.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ValidacionLlaveBreBFallida.feature",

        glue = "com.labdigbdbstgpb.virtual.ValidacionLlaveFallidaBreB",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class ValidacionLlaveFallidaBreBRunner {
}
