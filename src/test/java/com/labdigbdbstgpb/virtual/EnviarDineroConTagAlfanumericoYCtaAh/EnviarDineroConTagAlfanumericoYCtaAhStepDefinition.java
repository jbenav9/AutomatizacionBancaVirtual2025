package com.labdigbdbstgpb.virtual.EnviarDineroConTagAlfanumericoYCtaAh;

import com.labdigbdbstgpb.virtual.question.ValidarTagAlfanumerico;
import com.labdigbdbstgpb.virtual.task.EnviarDineroTagAlafanumericoYCtaAh;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EnviarDineroConTagAlfanumericoYCtaAhStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor BV = Actor.named("BV");

    @Before
    public void configuracion() {
        BV.can(BrowseTheWeb.with(navegador));

    }


    @Given("el usuario haya validado el tag alfanumerico y esta en la opcion de seleccionar cuenta")
    public void elusuariohayavalidadoeltagalfanumericoyestaenlaopciondeseleccionarcuenta() {
        BV.wasAbleTo(Open.url("https://virtual.labdigbdbstgpb.com/"));
    }
    @When("ingrese el valor a enviar seleccione la cuenta de ahs y le de click en el boton continuar")
    public void ingreseelvaloraenviarseleccionelacuentadeahsyledeclickenelbotoncontinuar(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);
        String tipoIdentificacion = datos.get(0).get("TipoIdentificacion");
        String usuario = datos.get(0).get("Usuario");
        String clave = datos.get(0).get("Clave");
        BV.attemptsTo(EnviarDineroTagAlafanumericoYCtaAh.con(tipoIdentificacion,usuario,clave));
    }
    @Then("Valide la informacion y le de click en enviar dinero vera exitosa la trx")
    public void Validelainformacionyledeclickenenviardineroveraexitosalatrx() {
        BV.should(seeThat("El usuario ve la DashBoar de BV", ValidarTagAlfanumerico.validarTagAlfanumericoExitoso(), Matchers.equalTo(false)));

    }
}
