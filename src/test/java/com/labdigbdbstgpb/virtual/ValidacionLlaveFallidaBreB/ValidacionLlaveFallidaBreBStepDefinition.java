package com.labdigbdbstgpb.virtual.ValidacionLlaveFallidaBreB;
import com.labdigbdbstgpb.virtual.question.ValidarLlaveBreBExitosa;
import com.labdigbdbstgpb.virtual.question.ValidarLlaveBreBFallida;
import com.labdigbdbstgpb.virtual.question.ValidarTagNumerico;
import com.labdigbdbstgpb.virtual.task.Login;
import com.labdigbdbstgpb.virtual.task.ValidacionTagExitosa;
import com.labdigbdbstgpb.virtual.task.ValidarLlaveExitosaBreB;
import com.labdigbdbstgpb.virtual.task.ValidarLlaveFallidaBreB;
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

public class ValidacionLlaveFallidaBreBStepDefinition {
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

    @When("ingrese a la opcion de BreB y el usuario ingresa la llave BreB {string}")
    public void ingreseALaOpcionDeBreBYElUsuarioIngresaLaLlaveBreB(String LlaveBreB) {
        BV.attemptsTo(ValidarLlaveFallidaBreB.conLlaveBreBFallida(LlaveBreB));
    }

    @Then("le da click en el boton continuar y vera que la consulta de la llave BreB fallida")
    public void leDaClickEnElBotonContinuarYVeraQueLaConsultaDelaLlaveBreBFallida() {
        BV.should(seeThat(
                "El usuario ve la consulta de la llave BreB fallida",
                ValidarLlaveBreBFallida.ValidarLlaveBreBFallida(), Matchers.equalTo(false)

        ));
    }
}
