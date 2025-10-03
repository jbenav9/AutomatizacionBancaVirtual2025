package com.labdigbdbstgpb.virtual.loginStepDefinition;

import com.labdigbdbstgpb.virtual.question.ValidarLogin;
import com.labdigbdbstgpb.virtual.task.Login;
import com.labdigbdbstgpb.virtual.task.LoginFallido;
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

public class LoginStepDefinition {

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

    @When("ingrese el usuario con la clave y tipo de identificación")
    public void ingreseElUsuarioConLaClaveYTipoDeIdentificación(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);
        String tipoIdentificacion = datos.get(0).get("TipoIdentificacion");
        String usuario = datos.get(0).get("Usuario");
        String clave = datos.get(0).get("Clave");
        BV.attemptsTo(Login.con(tipoIdentificacion, usuario, clave));

    }

    @Then("el usuario visualizara un mensaje de login exitoso")
    public void elUsuarioVisualizaraUnMensajeDeLoginExitoso() {
        BV.should(seeThat("El usuario ve la DashBoar de BV", ValidarLogin.validarLoginExitoso(), Matchers.equalTo(true)));


    }

    @When("ingrese el usuario con la clave")
    public void ingreseElUsuarioConLaClave(io.cucumber.datatable.DataTable dataTable){
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);
        String tipoIdentificacion = datos.get(0).get("TipoIdentificacion");
        String usuario = datos.get(0).get("Usuario");
        String clave = datos.get(0).get("Clave");
        BV.attemptsTo(LoginFallido.con(tipoIdentificacion, usuario, clave));
    }

    @Then("el usuario visualizara un mensaje de credenciales incorrectas")
    public void elUsuarioVisualizaraUnMensajeDeCredencialesIncorrectas(){
        BV.should(seeThat("El usuario ve el mensaje de volver al inicio", ValidarLogin.validarLoginFallido(), Matchers.equalTo(true)));
    }

    @When("ingrese el usuario con la clave incorrecta")
    public void ingreseelusuarioconlaclaveincorrecta(io.cucumber.datatable.DataTable dataTable){
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);
        String tipoIdentificacion = datos.get(0).get("TipoIdentificacion");
        String usuario = datos.get(0).get("Usuario");
        String clave = datos.get(0).get("Clave");
        BV.attemptsTo(LoginFallido.con(tipoIdentificacion, usuario, clave));
    }

    @Then("el usuario que ingreso la contraseña incorrecta visualizara un mensaje de credenciales incorrectas")
    public void elusuarioqueingresolacontraseñaincorrectavisualizaraunmensajedecredencialesincorrectas(){
        BV.should(seeThat("El usuario ve el mensaje de volver al inicio", ValidarLogin.validarLoginFallido(), Matchers.equalTo(true)));
    }


















}
