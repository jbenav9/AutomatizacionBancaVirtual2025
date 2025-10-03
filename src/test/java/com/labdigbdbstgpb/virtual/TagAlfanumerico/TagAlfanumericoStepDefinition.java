package com.labdigbdbstgpb.virtual.TagAlfanumerico;

import com.labdigbdbstgpb.virtual.question.ValidarLogin;
import com.labdigbdbstgpb.virtual.question.ValidarTagAlfanumerico;
import com.labdigbdbstgpb.virtual.task.Login;
import com.labdigbdbstgpb.virtual.task.TagAlfanumerico;
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

public class TagAlfanumericoStepDefinition {


    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor BV = Actor.named("BV");

    @Before
    public void configuracion() {
        BV.can(BrowseTheWeb.with(navegador));
    }

    @Given("que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        BV.wasAbleTo(Open.url("https://virtual.labdigbdbstgpb.com/"));
    }

    @Given("el usuario inicia sesión con los siguientes datos")
    public void elUsuarioIniciaSesionConLosSiguientesDatos(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);
        String tipoIdentificacion = datos.get(0).get("TipoIdentificacion");
        String usuario = datos.get(0).get("Usuario");
        String clave = datos.get(0).get("Clave");
        BV.attemptsTo(Login.con(tipoIdentificacion, usuario, clave));
    }

    @When("ingrese a la opcion de enviar dinero por tag aval y el usuario ingresa el tag alfanumerico")
    public void ingreseALaOpcionDeEnviarDineroPorTagAvalYElUsuarioIngresaElTagAlfanumerico() {
        BV.attemptsTo(TagAlfanumerico.con());
    }

    @Then("le da click en el boton continuar y vera que la consulta del tag exitosa")
    public void leDaClickEnElBotonContinuarYVeraQueLaConsultaDelTagExitosa() {
        BV.should(seeThat(
                "El usuario ve la DashBoar de BV",
                ValidarTagAlfanumerico.validarTagAlfanumericoExitoso(),
                Matchers.equalTo(false)
        ));
    }
}


