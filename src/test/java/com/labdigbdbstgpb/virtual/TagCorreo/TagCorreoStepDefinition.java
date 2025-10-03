package com.labdigbdbstgpb.virtual.TagCorreo;

import com.labdigbdbstgpb.virtual.question.ValidarTagCorreo;
import com.labdigbdbstgpb.virtual.question.ValidarTagNumerico;
import com.labdigbdbstgpb.virtual.task.TagCorreo;
import com.labdigbdbstgpb.virtual.task.TagNumerico;
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

public class TagCorreoStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor BV = Actor.named("BV");

    @Before
    public void configuracion() {
        BV.can(BrowseTheWeb.with(navegador));

    }


    @Given("el usuario este en el DahsBoard")
    public void elUsuarioEsteEnElDahsBoard() {
        BV.wasAbleTo(Open.url("https://virtual.labdigbdbstgpb.com/"));
    }
    @When("ingrese a la opcion de enviar dinero por tag aval y el usuario ingresa el tag correo")
    public void ingreseALaOpcionDeEnviarDineroPorTagAvalYElUsuarioIngresaElTagAlfanumerico(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);
        String tipoIdentificacion = datos.get(0).get("TipoIdentificacion");
        String usuario = datos.get(0).get("Usuario");
        String clave = datos.get(0).get("Clave");
        BV.attemptsTo(TagCorreo.con(tipoIdentificacion,usuario,clave));
    }
    @Then("le da click en el boton continuar y vera que la consulta del tag exitosa")
    public void leDaClickEnElBotonContinuarYVeraQueLaConsultaDelTagExitosa() {
        BV.should(seeThat("El usuario ve la DashBoar de BV", ValidarTagCorreo.validarTagCorreoExitoso(), Matchers.equalTo(false)));

    }
}
