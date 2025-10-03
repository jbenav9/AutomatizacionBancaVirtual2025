package com.labdigbdbstgpb.virtual.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class NavegarAtrasSiPaginaEstaEnBlanco implements Task {

    public static NavegarAtrasSiPaginaEstaEnBlanco verificar() {
        return new NavegarAtrasSiPaginaEstaEnBlanco();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Verifica si el body está vacío o no tiene contenido visible
        String bodyText = driver.findElement(org.openqa.selenium.By.tagName("body")).getText();

        if (bodyText.trim().isEmpty()) {
            driver.navigate().back();
        }
    }


}
