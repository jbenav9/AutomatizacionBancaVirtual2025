package com.labdigbdbstgpb.virtual.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/TagAlfanumericoInexistente.feature",

        glue = "com.labdigbdbstgpb.virtual.TagAlfanumericoInexistente",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class TagAlfanumericoInexistenteRunner {
}
