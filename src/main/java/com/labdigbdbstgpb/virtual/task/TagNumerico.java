package com.labdigbdbstgpb.virtual.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.labdigbdbstgpb.virtual.utils.TipoIdentificacionUtil.obtenerTipoIdentificacion;
import static com.labdigbdbstgpb.virtual.userInterface.PaginaLoginUI.*;
import static com.labdigbdbstgpb.virtual.userInterface.TagAlfanumericoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TagNumerico implements Task {

    private final String tipoIdentificacion;
    private final String usuario;
    private final String clave;

    public TagNumerico(String tipoIdentificacion, String usuario, String clave) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.usuario = usuario;
        this.clave = clave;
    }

    public static TagNumerico con(String tipoIdentificacion, String usuario, String clave) {
        return Tasks.instrumented(TagNumerico.class, tipoIdentificacion, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Login.con(tipoIdentificacion, usuario, clave),
                WaitUntil.the(MSJ_INICIO, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BTN_PAGAR_TRANSFERIR),
                Click.on(OPC_ENV_DIN),
                Click.on(OPC_TAG),
                Enter.theValue("80802772").into(TXT_TAG),
                Click.on(BTN_CONTINUARTAG)

        );

    }
}
